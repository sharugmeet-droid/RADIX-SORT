fun radixSort(arr: IntArray) {
    if (arr.isEmpty()) return

    val maxNumber = arr.maxOrNull() ?: return
    var exp = 1 // Exponent: 1, 10, 100, ...

    val output = IntArray(arr.size)

    while (maxNumber / exp > 0) {
        val count = IntArray(10) // Digits 0-9

        // Count occurrences of digits
        for (i in arr.indices) {
            val digit = (arr[i] / exp) % 10
            count[digit]++
        }

        // Update count[i] to position in output
        for (i in 1..9) {
            count[i] += count[i - 1]
        }

        // Build output array (stable sort)
        for (i in arr.size - 1 downTo 0) {
            val digit = (arr[i] / exp) % 10
            output[count[digit] - 1] = arr[i]
            count[digit]--
        }

        // Copy to original array
        for (i in arr.indices) {
            arr[i] = output[i]
        }

        exp *= 10
    }
}

fun main() {
    val arr = intArrayOf(170, 45, 75, 90, 802, 24, 2, 66)
    println("Original array: ${arr.joinToString()}")
    radixSort(arr)
    println("Sorted array:   ${arr.joinToString()}")
}
