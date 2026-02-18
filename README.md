# ai-code-exercises

## Overview

**ai-code-exercises** is an educational platform containing starter code examples and exercises designed to teach AI course concepts to software engineers. The repository provides hands-on learning materials across multiple programming languages (Java, JavaScript, Python, TypeScript) covering real-world software engineering practices.

This is an intentionally imperfect codebase - the code is designed with deliberate issues (bugs, inefficiencies, poor documentation) that you'll improve as part of the learning exercises.

---

## 📋 Project Philosophy

This codebase teaches AI-assisted development by providing:
- **Pre-intentional bugs** to diagnose and fix
- **Undocumented code** to document and explain
- **Inefficient implementations** to optimize
- **Untested functions** to write tests for
- **Poorly structured code** to refactor

Each exercise focuses on a specific skill: code comprehension, debugging, testing, documentation, and refactoring.

---

## 🗂️ Directory Structure

```
ai-code-exercises/
├── README.md                          (This file)
├── ERROR_AND_IMPROVEMENTS_LOG.md      (Code quality findings & fixes applied)
└── use-cases/
    ├── code-comprehension-001/        (Code Exploration Challenge)
    ├── code-algorithms/               (Algorithm Deconstruction Challenge)
    ├── code-reviews-001/              (Code Review Exercise)
    ├── debug-errors-001/              (Error Diagnosis Challenge)
    ├── debug-limitations/             (AI Solution Verification)
    ├── debug-performance/             (Performance Optimization)
    ├── refactor-functions/            (Function Decomposition)
    ├── refactor-patterns/             (Design Pattern Refactoring)
    ├── task-manager/                  (Core application - multi-language)
    └── testing-001/                   (Testing with AI)
```

Each `use-case/` folder contains implementations in multiple languages:
- **Java** (Gradle-based projects)
- **JavaScript** (Node.js/npm)
- **Python** (pip/requirements.txt)
- **TypeScript** (Node.js/npm)

---

## 🚀 Core Applications

### **Task Manager** (Primary Teaching Application)
A task management system implemented in Java, JavaScript, and Python to teach consistent architecture across languages.

**Features:**
- Create, read, update, delete tasks
- Task priorities (LOW, MEDIUM, HIGH, URGENT)
- Task statuses (TODO, IN_PROGRESS, REVIEW, DONE)
- Due dates with validation
- Tagging and filtering
- Statistics and reporting
- File-based persistence

**Location:** `use-cases/task-manager/` and within individual exercises

**Architecture:**
```
├── app/          → Core business logic & TaskManager class
├── cli/          → Command-line interface & entry point
├── model/        → Data objects (Task, TaskStatus, TaskPriority)
└── storage/      → Persistence layer
```

---

## 📚 Exercise Categories

### **1. Code Comprehension** 
Learn to understand unfamiliar code quickly.
- **Code Explore Challenge** - Trace execution flow of Task Manager
- **Algorithm Deconstruction** - Break down complex algorithms
- **Location:** `use-cases/code-comprehension-001/`, `use-cases/code-algorithms/`

### **2. Code Reviews**
Practice reviewing code for quality and giving constructive feedback.
- **Location:** `use-cases/code-reviews-001/`
- Includes examples: FileManager.java, user_auth.js, sales_dashboard.py

### **3. Debugging**
Find and fix bugs in intentionally broken code.
- **Error Diagnosis** - Fix compilation and logic errors (✅ All tests passing)
  - FactorialCalculator with infinite recursion (FIXED)
  - ShoppingCart duplicate class definition (FIXED)
- **Performance Optimization** - Identify bottlenecks in image processing
- **AI Solution Verification** - Test limitations of AI-generated code
- **Location:** `use-cases/debug-errors-001/`, `debug-performance/`, `debug-limitations/`

### **4. Testing**
Write comprehensive tests for untested code.
- **Location:** `use-cases/testing-001/`
- Learn to use JUnit, Jest, pytest

### **5. Refactoring**
Improve code structure and maintainability.
- **Function Decomposition** - Break down complex functions
- **Design Pattern Refactoring** - Apply design patterns
- **Location:** `use-cases/refactor-functions/`, `refactor-patterns/`

---

## 🔧 Technology Stack

### **Java Projects**
| Technology | Purpose | Version |
|-----------|---------|---------|
| **Gradle** | Build automation & dependency management | Latest |
| **JUnit 5** | Unit testing framework | 5.10.0 |
| **Mockito** | Mocking and testing | 5.8.0 |
| **AssertJ** | Fluent assertions | 3.24.2 |
| **Apache Commons CLI** | Command-line argument parsing | 1.9.0 |
| **GSON** | JSON serialization | 2.11.0 |

### **JavaScript/TypeScript Projects**
| Technology | Purpose |
|-----------|---------|
| **Node.js** | Runtime environment |
| **npm** | Package manager |
| **Jest** | Testing framework |
| **Jest/Babel** | JavaScript transpilation & testing |

### **Python Projects**
| Technology | Purpose |
|-----------|---------|
| **Python 3.8+** | Core language |
| **pytest** | Testing framework |
| **pip** | Package manager |

---

## 🏗️ Code Quality Status

### ✅ **Recent Improvements (February 18, 2026)**

A comprehensive code quality audit has been completed. See [ERROR_AND_IMPROVEMENTS_LOG.md](ERROR_AND_IMPROVEMENTS_LOG.md) for details.

**Issues Fixed: 7**
- 🔴 3 Critical: Infinite recursion, duplicate classes
- 🟡 2 Major: Unused imports
- 🔵 2 Low: Unused variables

**Build Status: ALL PASSING ✅**
```
✅ TaskManager (code-algorithms):           BUILD SUCCESSFUL
✅ FactorialCalculator (debug-errors):      BUILD SUCCESSFUL - All 5 tests PASS
✅ ImageProcessor (debug-performance):      BUILD SUCCESSFUL
```

---

## 🚀 Getting Started

### **Prerequisites**
- Java 11+ (JDK 19 recommended)
- Gradle 7.0+ (included via wrapper)
- Node.js 14+ (for JavaScript exercises)
- Python 3.8+ (for Python exercises)

### **Quick Start - Java Project**

1. **Navigate to a Java project:**
   ```bash
   cd use-cases/code-comprehension-001/java/TaskManager
   ```

2. **Build the project:**
   ```bash
   ./gradlew build
   ```

3. **Run the application:**
   ```bash
   ./gradlew run --args="create 'My Task' 'Description' 1 2025-12-31 tag1"
   ./gradlew run --args="list"
   ```

4. **Run tests:**
   ```bash
   ./gradlew test
   ```

### **Available Commands (Task Manager)**
```bash
./gradlew run --args="create <title> [description] [priority] [due_date] [tags]"
./gradlew run --args="list [-s <status>] [-p <priority>] [-o]"
./gradlew run --args="show <task_id>"
./gradlew run --args="status <task_id> <new_status>"
./gradlew run --args="priority <task_id> <new_priority>"
./gradlew run --args="delete <task_id>"
./gradlew run --args="stats"
```

---

## 📖 Exercise Flow

### **Recommended Learning Path**

1. **Start with Code Comprehension** (recommended first)
   - Understand the Task Manager architecture
   - Trace execution flow
   - Learn how to read unfamiliar code

2. **Move to Code Reviews**
   - Practice critique and feedback
   - Identify design issues

3. **Debug the Broken Code**
   - Fix intentional bugs
   - Understand root causes
   - See [ERROR_AND_IMPROVEMENTS_LOG.md](ERROR_AND_IMPROVEMENTS_LOG.md) for completed fixes

4. **Write Tests**
   - Create comprehensive test suites
   - Learn testing best practices

5. **Refactor for Improvement**
   - Apply design patterns
   - Improve code structure
   - Optimize performance

---

## 📝 Key Files to Know

| File | Purpose |
|------|---------|
| `build.gradle.kts` | Gradle build configuration (Java) |
| `package.json` | Node.js project config (JavaScript) |
| `requirements.txt` | Python dependencies |
| `tsconfig.json` | TypeScript configuration |
| `ERROR_AND_IMPROVEMENTS_LOG.md` | Code quality audit results |
| `README.md` | This documentation |

---

## 🐛 Known Issues & Status

### **Recently Fixed** ✅
- ✅ Infinite recursion in FactorialCalculator (Added base cases)
- ✅ Duplicate ShoppingCart class definition (Removed duplicate)
- ✅ Unused imports (Cleaned up)
- ✅ Unused test variables (Removed)

### **Intentional Issues** (Part of Learning)
- ⚠️ Type safety warnings in TaskManagerTest (Use of `Map<String, Object>`)
  - *These are intentional to teach students about generics and unchecked casts*
  - Suppressed with `@SuppressWarnings("unchecked")`
- ⚠️ Poorly optimized image processing code
  - Available in `debug-performance/` for optimization exercises

---

## 📚 Exercise-Specific README Files

Each exercise has its own detailed README:

| Exercise | README |
|----------|--------|
| Code Comprehension | [code-comprehension-001/README.md](use-cases/code-comprehension-001/README.md) |
| Code Algorithms | [code-algorithms/README.md](use-cases/code-algorithms/README.md) |
| Code Reviews | [code-reviews-001/README.md](use-cases/code-reviews-001/README.md) |
| Debug Errors | [debug-errors-001/README.md](use-cases/debug-errors-001/README.md) |
| Debug Performance | [debug-performance/README.md](use-cases/debug-performance/README.md) |
| Refactor Functions | [refactor-functions/README.md](use-cases/refactor-functions/README.md) |

---

## 🔍 Code Organization by Language

### **Java Projects**
- Gradle-based with standard Maven directory structure
- `src/main/java/` - Source code
- `src/test/java/` - Unit tests
- Package structure: `com.example.*` or `za.co.wethinkcode.*`

### **JavaScript/TypeScript Projects**
- `package.json` for dependencies
- Typically in project root or `src/` directory
- `.test.js` or `.spec.js` for test files

### **Python Projects**
- `requirements.txt` for dependencies
- Standard Python module structure
- `test_*.py` for test files

---

## 💡 Tips for Success

1. **Read the exercise README first** - Each has specific instructions
2. **Start with the build** - Ensure the environment is set up
3. **Study the code structure** - Understand the architecture before changing
4. **Run tests first** - Baseline understanding of what should work
5. **Use AI tools strategically** - Try to understand before asking for help
6. **Document as you learn** - Take notes on discoveries
7. **Review the error log** - Learn from previously fixed issues

---

## 🤝 Contributing

When working with this codebase:
1. Follow the existing code style
2. Add tests before fixing bugs
3. Document any significant changes
4. Update relevant README files
5. Check the ERROR_AND_IMPROVEMENTS_LOG for known issues

---

## 📞 Support Resources

- **Course Instructions:** https://ai.wethinkco.de/ai-software/ai-use-cases/exercises/
- **Code Quality Report:** See [ERROR_AND_IMPROVEMENTS_LOG.md](ERROR_AND_IMPROVEMENTS_LOG.md)
- **Build Issues:** Check Gradle/npm/pip version compatibility
- **Test Failures:** Review test output in `build/reports/tests/test/index.html` (Java)

---

## 📄 Document History

| Date | Change |
|------|--------|
| Feb 18, 2026 | Added comprehensive README; fixed critical bugs (FactorialCalculator, ShoppingCart) |
| Feb 18, 2026 | Created ERROR_AND_IMPROVEMENTS_LOG.md with full code quality audit |
| Initial | Basic exercise index |

---

## ❓ FAQ

**Q: Which language should I start with?**  
A: Java is recommended - the code is more explicit and easier to understand initially. Then apply learnings to JavaScript/Python.

**Q: Why is some code intentionally broken?**  
A: That's the point! You'll diagnose and fix these bugs as part of learning debugging skills.

**Q: How do I know when I've completed an exercise?**  
A: All tests should pass, code should be documented, and you should understand the architecture.

**Q: Can I use AI tools on these exercises?**  
A: Yes! That's the entire point of the course. The exercises teach you how to use AI effectively.

**Q: My build is failing - what should I do?**  
A: 1) Check [ERROR_AND_IMPROVEMENTS_LOG.md](ERROR_AND_IMPROVEMENTS_LOG.md), 2) Verify Java/Node version, 3) Run `./gradlew clean build`

---

**Happy Learning! 🚀**
