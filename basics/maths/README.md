# Basic Maths (DSA) - Java

This workspace contains beginner-friendly basic maths problems in Java, commonly asked in Data Structures and Algorithms practice.
Each file focuses on one classic number-based problem and demonstrates one or more approaches.

## Workspace Structure

- `countDigits.java` - Count digits in an integer (loop, log, and string conversion methods)
- `reverseNum.java` - Reverse digits of a number
- `checkPalindrome.java` - Check if a number is palindrome
- `checkPrime.java` - Check if a number is prime and print primes in a range
- `checkArmstrong.java` - Check if a number is an Armstrong number
- `Divisors.java` - Find and return all divisors of a number in sorted order
- `GCD.java` - Compute GCD using brute force and Euclidean algorithm

## Prerequisites

- Java JDK installed (`javac`, `java` available in terminal)

## How to Compile and Run

Compile and run any file with:

```bash
javac countDigits.java
java countDigits
```

Replace `countDigits` with the class/file you want to execute.

## Problem-Wise Documentation

### 1) Count Digits (`countDigits.java`)

Problem:
Given an integer, return how many digits it contains.

Implemented approaches:
- `count_digits_via_loop(int num)`:
	- Handles `0` explicitly (returns `1`)
	- Uses repeated division by `10`
- `count_digits_via_log(int num)`:
	- Uses formula: `floor(log10(num)) + 1`
- `count_digits_via_type_conversion(int num)`:
	- Converts number to string and returns length

Time complexity:
- Loop: `O(D)` where `D` = number of digits
- Log: `O(1)`
- String conversion: `O(D)`

Space complexity:
- Loop: `O(1)`
- Log: `O(1)`
- String conversion: `O(D)` due to string creation

Example (`12345`):

```text
5
5
5
```

---

### 2) Reverse Number (`reverseNum.java`)

Problem:
Reverse the digits of an integer.

Core idea:
- Extract last digit using `% 10`
- Build reverse using `rev = rev * 10 + last_digit`
- Remove last digit using `/ 10`
- Preserve sign for negative numbers

Time complexity: `O(D)`
Space complexity: `O(1)`

Example (`12`):

```text
21
```

---

### 3) Check Palindrome Number (`checkPalindrome.java`)

Problem:
Check whether a number reads the same forwards and backwards.

Core idea:
- Reverse the number
- Compare original and reversed values

Time complexity: `O(D)`
Space complexity: `O(1)`

Example output in current file:

```text
true
```

Note:
- Current loop condition is `while (temp > 0)`, so negative values are not handled as palindrome.

---

### 4) Check Prime (`checkPrime.java`)

Problem:
Determine whether a number is prime.

Core idea:
- Reject numbers `< 2`
- Handle `2` directly
- Reject even numbers
- Check odd divisors from `3` to `sqrt(num)`

Time complexity: `O(sqrt(N) / 2)` which is `O(sqrt(N))`
Space complexity: `O(1)`

Main method behavior:
- Prints all prime numbers from `1` to `100`

---

### 5) Check Armstrong Number (`checkArmstrong.java`)

Problem:
A number is Armstrong if the sum of each digit raised to the power of total digits equals the number itself.

Core idea:
- Count digits using `floor(log10(num)) + 1`
- For each digit, add `digit^digits` to accumulator
- Compare final sum with original number

Time complexity: `O(D)`
Space complexity: `O(1)`

Example output in current file (`0`):

```text
true
```

---

### 6) Print Divisors (`Divisors.java`)

Problem:
Find all divisors of a number.

Core idea:
- Iterate from `1` to `sqrt(num)`
- If `i` divides `num`, add both `i` and `num / i`
- Avoid duplicate for perfect square
- Sort before returning

Time complexity:
- Divisor scan: `O(sqrt(N))`
- Sorting collected divisors: `O(K log K)`, where `K` is number of divisors

Space complexity: `O(K)`

Example (`36`):

```text
[1, 2, 3, 4, 6, 9, 12, 18, 36]
```

---

### 7) GCD (`GCD.java`)

Problem:
Compute greatest common divisor of two integers.

Implemented approaches:
- `greatest_common_divisor(int num1, int num2)` (brute force):
	- Checks from `min(num1, num2)` down to `1`
	- Returns first common divisor found
- `euclidean_gcd(int num1, int num2)` (recursive Euclidean algorithm):
	- Uses relation: `gcd(a, b) = gcd(b, a % b)`
	- Stops when `b == 0`

Time complexity:
- Brute force: `O(min(a, b))`
- Euclidean: `O(log(min(a, b)))` on average

Space complexity:
- Brute force: `O(1)`
- Euclidean recursion: `O(log(min(a, b)))`

Example output in current file:

```text
1
```

## Learning Notes

- Many basic maths problems are built from `% 10` and `/ 10` digit operations.
- `sqrt(N)` optimization is key for divisors and primality checks.
- Euclidean GCD is significantly faster than brute force for large numbers.
- Multiple approaches in one file are useful for understanding trade-offs.
- Edge-case handling (`0`, negatives, overflow, invalid log input) should be validated before production use.
