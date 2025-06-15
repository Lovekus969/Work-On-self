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
-------------------------------------------------------         Using Hashmap      ----------------------------------------------------------------------
# 🔍 Why Do We Use `complement = target - num` in Two Sum?

In the **Two Sum** problem, we are given:
- An array of integers `nums[]`
- A target integer `target`

Our goal: **Find two numbers in the array whose sum is equal to the target.**

---

## ✅ Key Insight: Use Complements

At each index `i`, we have:

int num = nums[i];
int complement = target - num;
 What is a Linked List?
A Linked List is a linear data structure where each element (node) points to the next one. Unlike arrays, elements are not stored in contiguous memory.

Each node has:

data — the value

next — reference to the next node

🔍 Types of Linked Lists:
Type	Description
Singly Linked List	Nodes point only to the next node
Doubly Linked List	Nodes point to both next and previous nodes
Circular Linked List	Last node points to the first, forming a loop

🧱 Structure of a Singly Linked List Node:
java
Copy
Edit
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
🔁 Basic Operations:
1. Insertion
At beginning

At end

At a given position

2. Deletion
From beginning

From end

From a given position

3. Traversal
Go node by node using .next

✅ Example: Basic Linked List Creation & Traversa
This week target June 12 
Array , string , sliding window and the two pointer appproch adn more ok 

Two sum 
