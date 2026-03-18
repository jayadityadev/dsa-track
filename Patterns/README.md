# DSA Patterns - Comprehensive Guide

A collection of **23 essential pattern problems** in Data Structures and Algorithms, focusing on nested loops, logic building, and output formatting techniques. These patterns are fundamental for improving problem-solving skills and are commonly used in coding interviews and competitive programming.

---

## 📚 Table of Contents

1. [Overview](#overview)
2. [Pattern Categories](#pattern-categories)
3. [How to Use This Repository](#how-to-use-this-repository)
4. [Detailed Pattern List](#detailed-pattern-list)
5. [Learning Tips](#learning-tips)
6. [Complexity Analysis](#complexity-analysis)

---

## Overview

This repository contains **23 pattern programs** written in **Java**, each demonstrating different loop structures and algorithmic thinking. These patterns serve as building blocks for:

- **Logic Development**: Understanding nested loops and conditionals
- **Problem-Solving**: Breaking down complex problems into manageable parts
- **Interview Preparation**: Common pattern questions in DSA rounds
- **Algorithm Optimization**: Learning different approaches to solve similar problems

### Key Features

✅ Well-commented code with visual outputs  
✅ Organized by difficulty and type  
✅ Time and space complexity analysis  
✅ Progressive difficulty levels  

---

## Pattern Categories

### Category 1: Star Patterns (Basic 2D Output)
- **Patterns**: 1, 2, 5, 7, 8, 9, 10, 20, 21, 22
- **Focus**: Nested loops, spacing, and repetition logic

### Category 2: Numeric Patterns
- **Patterns**: 3, 4, 6, 11, 12, 13, 23
- **Focus**: Number manipulation, counting, and arithmetic

### Category 3: Character/Alphabetic Patterns
- **Patterns**: 14, 15, 16, 17, 18, 19
- **Focus**: ASCII manipulation, character sequences

### Category 4: Complex Patterns (Combination)
- **Patterns**: 20, 21, 22, 23
- **Focus**: Combining multiple techniques and advanced logic

---

## How to Use This Repository

### Running a Pattern

```bash
# Navigate to the Patterns directory
cd /home/jayaditya/DSA/Patterns

# Compile a pattern
javac pattern1.java

# Run the pattern
java pattern1
```

### Modifying Pattern Output

Each pattern has a `printPattern(int n)` method. You can modify the input:

```java
printPattern(5);    // Default: 5 rows
printPattern(10);   // Change to 10 rows
```

---

## Detailed Pattern List

### ⭐ Pattern 1: Square (n×n stars)
**Output** (n=5):
```
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
```
**Description**: A simple square of `n×n` stars.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Introduction to nested loops

---

### ⭐ Pattern 2: Right Triangle (Stars)
**Output** (n=5):
```
* 
* * 
* * * 
* * * * 
* * * * * 
```
**Description**: Right-angled triangle with increasing stars.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Understanding loop increments and patterns

---

### ⭐ Pattern 3: Right Triangle (Numbers)
**Output** (n=5):
```
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```
**Description**: Right triangle with sequential numbers (1 to i).  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Number sequencing in patterns

---

### ⭐ Pattern 4: Right Triangle (Repeated Number)
**Output** (n=5):
```
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
```
**Description**: Each row prints the row number repeated row times.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Understanding row-based repetition logic

---

### ⭐ Pattern 5: Inverted Triangle (Stars)
**Output** (n=5):
```
* * * * * 
* * * * 
* * * 
* * 
* 
```
**Description**: Decreasing triangle of stars.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Decrement loop patterns

---

### ⭐ Pattern 6: Inverted Triangle (Numbers)
**Output** (n=5):
```
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
```
**Description**: Decreasing triangle with numbers 1 to n-i.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Combining increment and decrement logic

---

### 🔺 Pattern 7: Pyramid (Stars, Centered)
**Output** (n=5):
```
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
```
**Description**: Centered pyramid with increasing stars (2i+1).  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Spacing and centering logic

---

### 🔺 Pattern 8: Inverted Pyramid (Stars, Centered)
**Output** (n=5):
```
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
```
**Description**: Inverted centered pyramid.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Inverse of pyramid pattern

---

### 🔺 Pattern 9: Diamond (Stars)
**Output** (n=5):
```
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
```
**Description**: Diamond shape (pyramid + inverted pyramid).  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Combining multiple patterns

---

### 🔺 Pattern 10: Triangle Peak (Stars)
**Output** (n=5):
```
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
```
**Description**: Triangle that increases then decreases.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Loop control with multiple phases

---

### 🔢 Pattern 11: Binary Triangle
**Output** (n=5):
```
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
```
**Description**: Alternating 0-1 pattern based on (i+j) % 2.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Modulo arithmetic and alternating patterns

---

### 🔢 Pattern 12: Symmetric Number Triangle
**Output** (n=5):
```
1                 1 
1 2             2 1 
1 2 3         3 2 1 
1 2 3 4     4 3 2 1 
1 2 3 4 5 5 4 3 2 1 
```
**Description**: Numbers ascending then descending (mirror pattern).  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Symmetric pattern generation

---

### 🔢 Pattern 13: Continuous Number Triangle
**Output** (n=5):
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```
**Description**: Continuous counting across rows (counter variable).  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: State management with counter variable

---

### 🔤 Pattern 14: Continuous Character Triangle
**Output** (n=5):
```
A 
B C 
D E F 
G H I J 
K L M N O 
```
**Description**: ASCII characters in continuous sequence.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: ASCII manipulation and character sequencing

---

### 🔤 Pattern 15: Alphabet Triangle
**Output** (n=5):
```
A
A B
A B C
A B C D
A B C D E 
```
**Description**: Alphabet sequence within each row.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Character range and formatting

---

### 🔤 Pattern 16: Reverse Alphabet Triangle
**Output** (n=5):
```
A B C D E 
A B C D 
A B C 
A B 
A 
```
**Description**: Alphabet sequence that decreases per row.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Decreasing character ranges

---

### 🔤 Pattern 17: Repeated Character Triangle
**Output** (n=5):
```
A 
B B 
C C C 
D D D D 
E E E E E 
```
**Description**: Each character repeated based on row number.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Character repetition logic

---

### 🔤 Pattern 18: Character Diamond
**Output** (n=5):
```
        A 
      A B A 
    A B C B A 
  A B C D C B A 
A B C D E D C B A 
```
**Description**: Centered diamond with ascending then descending characters.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Complex character manipulation

---

### 🔤 Pattern 19: Reverse Character Triangle
**Output** (n=5):
```
E 
D E 
C D E 
B C D E 
A B C D E 
```
**Description**: Reverse alphabet sequence (decreasing start point).  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Dynamic ASCII range manipulation

---

### 🔷 Pattern 20: Hollow Diamond
**Output** (n=5):
```
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
```
**Description**: Hollow diamond with empty interior.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Advanced spacing and hollow patterns

---

### 🔷 Pattern 21: Symmetric Hollow Diamond
**Output** (n=7):
```
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
```
**Description**: Diamond with outer and inner symmetry.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Complex symmetry patterns

---

### 🔲 Pattern 22: Hollow Rectangle
**Output** (n=5):
```
* * * * *
*       *
*       *
*       *
* * * * *
```
**Description**: Border-only rectangle (hollow).  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Conditional boundary checking

---

### 📊 Pattern 23: Nested Square Numbers
**Output** (n=5):
```
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
```
**Description**: Decreasing numbers from edge to center.  
**Time Complexity**: O(n²)  
**Space Complexity**: O(1)  
**Use Case**: Distance calculation and min() function usage

---

## Learning Tips

### Progressive Learning Path

1. **Start with Basics** (Patterns 1-6):
   - Master simple nested loops
   - Understand loop increments/decrements
   - Practice basic output formatting

2. **Learn Spacing** (Patterns 7-10):
   - Master centering and alignment
   - Work with multiple nested loops
   - Understand mathematical relationships (2i+1, etc.)

3. **Explore Numbers** (Patterns 11-13):
   - Practice state management with counters
   - Work with modulo operations
   - Understand continuous sequences

4. **Master Characters** (Patterns 14-19):
   - Learn ASCII manipulation
   - Practice character ranges
   - Build complex character logic

5. **Challenge Yourself** (Patterns 20-23):
   - Combine multiple techniques
   - Work with hollow patterns
   - Apply distance calculations

### Problem-Solving Approach

For each pattern, follow this approach:

```
1. Understand the output pattern
2. Identify the number of rows (outer loop)
3. Identify what prints per row (inner loop)
4. Identify spacing requirements
5. Handle special cases (first/last row, borders, etc.)
6. Write the code
7. Test with different values of n
```

### Common Techniques

| Technique | Pattern Examples | Description |
|-----------|-----------------|-------------|
| **Spacing** | 7, 8, 9, 18 | Use leading spaces for centering |
| **Counting** | 13 | Maintain counter across rows |
| **Modulo** | 11 | Use (i+j) % 2 for alternating |
| **ASCII** | 14-19 | Cast int to char: (char)(value + 65) |
| **Symmetry** | 12, 18, 21 | Print ascending then descending |
| **Hollow** | 20, 21, 22 | Check boundary conditions |
| **Distance** | 23 | Find minimum distance to edges |

---

## Complexity Analysis

### Time Complexity Summary

| Pattern | Time Complexity | Notes |
|---------|-----------------|-------|
| 1-22 | O(n²) | All require nested loops |
| 23 | O(n²) | Uses (2n-1) × (2n-1) grid |

**Key Insight**: Nested loops that iterate through each element result in quadratic time complexity. The constant factors vary based on the number of operations per iteration.

### Space Complexity Summary

| All Patterns | O(1) | No additional data structures used |

**Key Insight**: These patterns use only print statements and local variables, so space complexity remains constant regardless of input size.

### Output Analysis

| Pattern | Output Grid | Output Characters |
|---------|-------------|-------------------|
| 1-22 | n × (some multiple of n) | ~O(n²) |
| 23 | (2n-1) × (2n-1) | ~O(n²) |

---

## Additional Resources

### Key Concepts to Master

- **Nested Loops**: Foundation of all patterns
- **Mathematical Formulas**: Understanding series and sequences
- **ASCII Table**: Characters and their numeric values
- **Modulo Operator**: Creating alternating patterns
- **Conditional Logic**: Handling edge cases and special rows

### Interview Tips

✅ Start by explaining the pattern to the interviewer  
✅ Identify the row and column relationship  
✅ Think about edge cases (n=1, large n)  
✅ Optimize if possible (usually already optimal)  
✅ Test your code with multiple values  

---

## Quick Reference

### Problem-solving Template

```java
public static void printPattern(int n) {
    // Outer loop for rows
    for (int i = 0; i < n; i++) {
        
        // Print leading spaces (if centered)
        for (int spaces = 0; spaces < n - i - 1; spaces++) {
            System.out.print("  ");
        }
        
        // Print pattern elements
        for (int j = 0; j < i + 1; j++) {
            System.out.print("* ");
        }
        
        // New line after each row
        System.out.println();
    }
}
```

### Compile and Run Commands

```bash
# Compile all patterns
javac pattern*.java

# Run specific pattern
java pattern7

# Or use a loop to test all
for i in {1..23}; do echo "Pattern $i:"; java pattern$i; echo ""; done
```

---

## Summary

This collection of **23 patterns** provides a comprehensive foundation for:

- 🎯 **Interview Preparation**: Common DSA pattern questions
- 📚 **Algorithm Learning**: Understanding fundamental loop structures
- 💡 **Logic Building**: Developing systematic problem-solving skills
- 🚀 **Performance**: All patterns are optimal with O(n²) time complexity

**Start with Pattern 1 and progress gradually. Master each pattern before moving to the next level!**

---

**Last Updated**: March 2026  
**Language**: Java  
**Difficulty**: Beginner to Intermediate  
**Prerequisites**: Basic Java knowledge (loops, conditionals, print statements)
