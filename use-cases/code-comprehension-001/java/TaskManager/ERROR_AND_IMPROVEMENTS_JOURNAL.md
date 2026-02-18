# TaskManager Project - Error and Improvements Journal

**Date**: February 16, 2026  
**Project**: Task Manager CLI Application  
**Status**: All errors resolved ✓

---

## Summary
Successfully identified and fixed **8 type safety issues** and **2 unused variable warnings** across the TaskManager codebase.

---

## Errors Found and Fixed

### File: TaskManagerCli.java

#### Error 1: Unchecked Cast on Line 249
- **Type**: Type safety warning
- **Issue**: `Map<String, Integer> statusCounts = (Map<String, Integer>) stats.get("byStatus");`
- **Root Cause**: The `getStatistics()` method returns `Map<String, Object>`, requiring an unchecked cast to `Map<String, Integer>`
- **Solution**: Added `@SuppressWarnings("unchecked")` annotation to the `handleStatsCommand()` method
- **Status**: ✓ Fixed

#### Error 2: Unchecked Cast on Line 255
- **Type**: Type safety warning
- **Issue**: `Map<Integer, Integer> priorityCounts = (Map<Integer, Integer>) stats.get("byPriority");`
- **Root Cause**: Same as Error 1 - unchecked cast from Object type
- **Solution**: Resolved by the same `@SuppressWarnings("unchecked")` annotation applied to `handleStatsCommand()`
- **Status**: ✓ Fixed

---

### File: TaskManagerTest.java

#### Error 3: Unchecked Cast on Line 52
- **Type**: Type safety warning
- **Issue**: `Map<String, Integer> statusCounts = (Map<String, Integer>) stats.get("byStatus");`
- **Location**: Method `testGetStatisticsWithEmptyTaskList()`
- **Root Cause**: Unchecked cast in test method accessing statistics
- **Solution**: Added `@SuppressWarnings("unchecked")` annotation to the test method
- **Status**: ✓ Fixed

#### Error 4: Unchecked Cast on Line 57
- **Type**: Type safety warning
- **Issue**: `Map<Integer, Integer> priorityCounts = (Map<Integer, Integer>) stats.get("byPriority");`
- **Location**: Method `testGetStatisticsWithEmptyTaskList()`
- **Root Cause**: Unchecked cast in same test method
- **Solution**: Resolved by the `@SuppressWarnings("unchecked")` annotation on the method
- **Status**: ✓ Fixed

#### Error 5: Unchecked Cast on Line 223
- **Type**: Type safety warning
- **Issue**: `Map<String, Integer> statusCounts = (Map<String, Integer>) stats.get("byStatus");`
- **Location**: Method `test_getStatistics_returnsCorrectStatistics()`
- **Root Cause**: Unchecked cast when retrieving status statistics
- **Solution**: Added `@SuppressWarnings("unchecked")` annotation to the test method
- **Status**: ✓ Fixed

#### Error 6: Unchecked Cast on Line 229
- **Type**: Type safety warning
- **Issue**: `Map<Integer, Integer> priorityCounts = (Map<Integer, Integer>) stats.get("byPriority");`
- **Location**: Method `test_getStatistics_returnsCorrectStatistics()`
- **Root Cause**: Unchecked cast for priority statistics
- **Solution**: Resolved by the `@SuppressWarnings("unchecked")` annotation on the method
- **Status**: ✓ Fixed

#### Error 7: Unchecked Conversion on Line 359
- **Type**: Type safety warning
- **Issue**: `List<Task> overdueTasks = mock(List.class);`
- **Location**: Method `test_listTasks_returnsOverdueTasks()`
- **Root Cause**: Mocking a generic List without type parameter causes unchecked conversion
- **Solution**: Added `@SuppressWarnings("unchecked")` annotation to the test method
- **Status**: ✓ Fixed

#### Error 8: Unused Variable on Line 504
- **Type**: Compiler warning - unused variable
- **Issue**: `TaskStorage mockStorage = new TaskStorage(test_storage_file);` (not used)
- **Location**: Method `test_removeTagFromTask_whenTaskIsNullOrTagCannotBeRemoved()`
- **Root Cause**: Variable was created but never referenced in the test logic
- **Solution**: Removed the unused line - the test only needs the TaskManager instance
- **Status**: ✓ Fixed

#### Error 9: Unused Variable on Line 586
- **Type**: Compiler warning - unused variable
- **Issue**: `TaskStorage mockStorage = new TaskStorage(test_storage_file);` (not used)
- **Location**: Method `test_updateTaskStatus_nonExistentTaskToDone()`
- **Root Cause**: Variable was created but never referenced in the test logic
- **Solution**: Removed the unused line - the test only needs the TaskManager instance
- **Status**: ✓ Fixed

---

## Improvements Made

### Code Quality Improvements
1. **Type Safety**: Applied appropriate suppression annotations where unchecked casts are necessary and intentional
2. **Code Cleanliness**: Removed unused variable declarations that added unnecessary clutter
3. **Test Reliability**: Fixed test methods to properly declare their type requirements

### Best Practices Applied
- Used `@SuppressWarnings("unchecked")` at method level rather than inline for better readability
- Removed dead code (unused variables) to improve code maintainability
- Maintained consistency across similar error handling patterns

---

## Compilation Status

**Before Fixes**: 8 errors found
- 5 unchecked cast warnings in TaskManagerCli.java and TaskManagerTest.java
- 2 unchecked conversion warnings
- 2 unused variable warnings

**After Fixes**: ✓ No errors

All files now compile cleanly without warnings.

---

## Files Modified

1. **src/main/java/za/co/wethinkcode/taskmanager/cli/TaskManagerCli.java**
   - Added `@SuppressWarnings("unchecked")` to `handleStatsCommand()` method

2. **src/test/java/za/co/wethinkcode/taskmanager/app/TaskManagerTest.java**
   - Added `@SuppressWarnings("unchecked")` to `testGetStatisticsWithEmptyTaskList()` method
   - Added `@SuppressWarnings("unchecked")` to `test_getStatistics_returnsCorrectStatistics()` method
   - Added `@SuppressWarnings("unchecked")` to `test_listTasks_returnsOverdueTasks()` method
   - Removed unused `mockStorage` variable from `test_removeTagFromTask_whenTaskIsNullOrTagCannotBeRemoved()` method
   - Removed unused `mockStorage` variable from `test_updateTaskStatus_nonExistentTaskToDone()` method

---

## Notes

- All fixes were conservative and focused on maintaining existing functionality
- No changes were made to logic or algorithm implementation
- All type safety issues were resolved through appropriate Java annotations
- Tests remain functional and comprehensive

---

## Future Recommendations

1. **Consider refactoring `getStatistics()` return type** - Instead of returning `Map<String, Object>`, consider creating a dedicated `Statistics` class to eliminate the need for unchecked casts entirely.

2. **Code Review** - These fixes could serve as examples for a team-wide code review to ensure consistent patterns throughout the codebase.

3. **Static Analysis** - Consider integrating static analysis tools (like SpotBugs or Checkstyle) into the build process to catch these issues earlier.

