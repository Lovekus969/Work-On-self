Fastest Path Finder using Dijkstra’s Algorithm

30 may 
 ---------------------------------------------          Array Mastery in 5 Lines (FAANG Focus)               -----------------------------------------
Use int[] arr = new int[n] – auto-fills with 0; same rule applies to other types (e.g., false for boolean, '\u0000' for char).

Arrays are fixed-size – prefer ArrayList if dynamic resizing is needed.

Loop with care – always use arr.length to avoid ArrayIndexOutOfBoundsException.

Use prefix sums, sliding window, and hash maps with arrays for optimized problems.

Master patterns: reverse, rotate, two-pointer, binary search on sorted arrays.


-----------------------------------------------------        Two - Pointer        ----------------------------------------------------------------------
# 📌 Two Pointer Technique - FAANG Level Notes

The **Two Pointer Technique** is a powerful and efficient approach to solve problems involving **sorted arrays** (or strings) where you need to find pairs or partitions with specific properties (like sum = target).

1. **Sorted Array** – Make sure the array is sorted first. If not, sort it (`O(n log n)`).
2. **Two Indices** – Use two indices, usually `left = 0` and `right = n - 1`.
3. **Move Pointers** – Based on condition:
   - If `sum < target`, do `left++` to increase the sum.
   - If `sum > target`, do `right--` to reduce the sum.
   - If `sum == target`, you found the answer!

---

## ❗ WHY IT’S NOT O(log n)

- Even though we "cut" the search space from both ends, we are not dividing it like binary search.
- **Binary Search** → Cuts search space in half → `O(log n)`
- **Two Pointer** → Checks each element at most once → `O(n)`

So, two-pointer runs in:

```text
Best case: O(1)     → found pair early  
Worst case: O(n)    → full linear scan

