# Radix Sort – Kotlin

This Kotlin program implements **Radix Sort**, an efficient non-comparative sorting algorithm for **positive integers**.

---

## How It Works

1. Find the **maximum number** in the array to determine the number of digits.
2. Sort the array **digit by digit**, starting from the **least significant digit** (LSD) to the **most significant digit** (MSD).
3. Use **counting sort** as a stable subroutine for each digit.
4. Repeat until all digits are processed.

Radix Sort ensures **stable and linear time sorting** for integers with a limited number of digits.

---

## Implementation

```kotlin
fun radixSort(arr: IntArray) { ... } // See full implementation in RadixSort.kt
