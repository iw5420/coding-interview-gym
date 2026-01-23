# Coding Interview Gym 🥋

專注於 Java 高效能演算法實作與系統設計思維的進修專案。  
A dedicated Java repository for mastering high-performance algorithms and system design, built with a production-grade mindset.

---

## 🎯 專案目標 (Project Goals)
本專案旨在磨練符合頂尖技術公司標準的底層功力：
- **代碼質量 (Code Quality)**: 遵循 Clean Code 原則，拒絕冗餘邏輯與麵條代碼。
- **測試驅動 (TDD)**: 每一道題皆具備完整的 JUnit 5 與 AssertJ 單元測試。
- **效能極限 (Efficiency)**: 嚴格執行時間與空間複雜度分析，追求最優解。
- **架構組織 (Organization)**: 採用嚴謹的 Package 層級，模擬真實大型企業級專案。
- 
- **Code Quality**: Adhere to Clean Code principles, strictly eliminating redundant logic and spaghetti code.
- **Test-Driven Development (TDD)**: Every implementation is backed by a comprehensive suite of JUnit 5 and AssertJ unit tests.
- **Performance Optimization**: Rigorous Time and Space Complexity analysis is conducted for every solution to ensure peak efficiency and the pursuit of the optimal solution.
- **Architectural Organization**: Employ a disciplined Package hierarchy to simulate the structure and scalability of authentic, large-scale enterprise projects.

---

## 🛠 技術堆疊 (Tech Stack)
- **Language**: Java 21 (LTS)
- **Build Tool**: Maven
- **Test Framework**: JUnit 5 (Jupiter), AssertJ
- **Environment**: IntelliJ IDEA

---

## 📂 專案結構 (Directory Structure)
目前結構已細分至平台與題目序號區間，確保專案具備良好的擴充性與組織感：

```text
src/main/java/com/coding/gym/
└── leetcode/
    └── problems_001_100/
        └── q1_two_sum/
            └── Solution.java

```

---

## 📝 實作範例 (Implementation Style)

每一題實作皆包含中英文分段的複雜度分析，這是我對邏輯嚴密性的堅持：

```java
/**
 * [Complexity Analysis - 中文詳細解釋]
 * * Time Complexity: O(n)
 * - 我們僅需遍歷陣列一次 (One-pass)。
 * - 計算公式：n 個元素 * O(1) 操作 = O(n)。
 *
 * [Complexity Analysis - Detailed English]
 * * Time Complexity: O(n)
 * - The algorithm performs a "One-pass" traversal.
 * - Calculation: n elements * O(1) operation = O(n).
 */

```

---

## 🚀 學習路徑 (Roadmap - Sprint 1)

* [x] **#1 Two Sum**: Arrays & Hashing (Optimal O(n) Solution)
* [ ] **#1114 Print in Order**: Concurrency (Semaphore/Lock Implementation)
* [ ] **Data Structures**: Deep dive into HashMap Internal (Java 21)

---

