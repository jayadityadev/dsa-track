# Basic Recursion (DSA) - Java

This workspace contains beginner-friendly recursion problems implemented in Java.
Each file focuses on one classic pattern used in Data Structures and Algorithms.

## Workspace Structure

- `recursion1.java` - Print a name `N` times
- `recursion2.java` - Print numbers from `1` to `N`
- `recursion3.java` - Print numbers from `N` to `1`
- `recursion4.java` - Sum of first `N` natural numbers
- `recursion5.java` - Factorial of a number
- `recursion6.java` - Reverse an array (multiple approaches, including recursion)
- `recursion7.java` - Check palindrome string (iterative + recursive)
- `recursion8.java` - Fibonacci series up to `N`th term

## Prerequisites

- Java JDK installed (`javac`, `java` available in terminal)

## How to Compile and Run

Compile and run any file with:

```bash
javac recursion1.java
java recursion1
```

Replace `recursion1` with the class/file you want to execute.

## Problem-Wise Documentation

### 1) Print Name N Times (`recursion1.java`)

Problem:
Given an integer `N`, print your name `N` times.

Core recursion idea:
- Base case: stop when `n == 0`
- Recursive case: print once, then call for `n - 1`

Time complexity: `O(N)`  
Space complexity (recursion stack): `O(N)`

Example output for `N = 3`:

```text
Jayaditya Jayaditya Jayaditya
```

---

### 2) Print 1 to N (`recursion2.java`)

Problem:
Given `N`, print numbers from `1` to `N`.

Core recursion idea:
- First recurse to `n - 1`
- Print `n` while returning from recursion

Time complexity: `O(N)`  
Space complexity: `O(N)`

Example for `N = 5`:

```text
1
2
3
4
5
```

---

### 3) Print N to 1 (`recursion3.java`)

Problem:
Given `N`, print numbers from `N` down to `1`.

Core recursion idea:
- Print `n` first
- Recurse with `n - 1`

Time complexity: `O(N)`  
Space complexity: `O(N)`

Example for `N = 5`:

```text
5
4
3
2
1
```

---

### 4) Sum of First N Natural Numbers (`recursion4.java`)

Problem:
Find `1 + 2 + ... + N`.

Implemented approaches:
- Recursive: `sum(n) = n + sum(n-1)`
- Formula: `n * (n + 1) / 2`

Time complexity:
- Recursive: `O(N)`
- Formula: `O(1)`

Space complexity:
- Recursive: `O(N)`
- Formula: `O(1)`

Example for `N = 5`:

```text
15
```

---

### 5) Factorial (`recursion5.java`)

Problem:
Given `X`, print `X!`.

Core recursion idea:
- Base: `0! = 1`
- Recursive: `n! = n * (n-1)!`

Time complexity: `O(N)`  
Space complexity: `O(N)`

Example for `N = 5`:

```text
120
```

---

### 6) Reverse Array (`recursion6.java`)

Problem:
Reverse an array and print it.

Implemented approaches:
- New array (extra memory)
- In-place iterative swap
- Recursive in-place swap (`left`, `right` pointers)

Core recursion idea (approach 4):
- Swap `arr[left]` and `arr[right]`
- Recurse inward (`left + 1`, `right - 1`)
- Stop when `left >= right`

Time complexity: `O(N)`  
Space complexity:
- Iterative in-place: `O(1)`
- New array: `O(N)`
- Recursive in-place: `O(N)` stack

Example:

```text
Input:  [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
```

---

### 7) Palindrome Check (`recursion7.java`)

Problem:
Check whether a string is palindrome.

Implemented approaches:
- Iterative two-pointer
- Recursive two-pointer

Core recursion idea:
- If `left >= right`, palindrome is true
- If characters at `left` and `right` differ, false
- Else recurse inward

Time complexity: `O(N)`  
Space complexity:
- Iterative: `O(1)`
- Recursive: `O(N)` stack

Example:

```text
Input:  "madam"
Output: true
```

---

### 8) Fibonacci Series (`recursion8.java`)

Problem:
Print Fibonacci numbers up to `N`th term.

Core recursion idea:
- `F(0) = 0`, `F(1) = 1`
- `F(n) = F(n-1) + F(n-2)`

Current implementation note:
- Uses plain recursion per term, which is simple but expensive.

Time complexity:
- Per call to `F(n)`: `O(2^N)` (approximately)
- Printing up to `N` terms with repeated calls is costlier overall.

Space complexity: `O(N)` recursion depth

Example for `N = 5`:

```text
0 1 1 2 3 5
```

## Learning Notes

- Every recursive solution needs:
	- A base case (termination condition)
	- A recursive step that moves toward the base case
- For printing problems, whether you print before or after recursion changes output order.
- Recursion uses call stack memory, so depth matters for large inputs.
- For Fibonacci in interviews/contests, prefer memoization or iterative DP for better performance.
