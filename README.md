# SelectionSortDemo

A concise, generic Java implementation of Selection Sort with built‑in demo and tests.

## Files

* SelectionSortDemo.java - Contains the generic selection sort method and main() demo.

* SelectionSortAdditionalTests.java — JUnit 5 tests covering negative numbers and string sorting.

## Req

* Java 8 or higher

* JUnit 5 for running unit tests


## Analysis

** Time Complexity (O(n²))
Selection Sort uses two nested loops: the outer loop runs n times, 
    and for each i, the inner loop scans the remaining elements to find the minimum. 
    Total comparisons ≈ n(n–1)/2, which is O(n²).

** Space Complexity (O(1), In‑Place)

All swaps occur within the original array, 
    and only a few index and temporary variables are used. 
    No auxiliary arrays are allocated, so auxiliary space remains constant.


## Stability - Not Stable by Default

A swap can reorder equal elements. For example, [A₁(=5), 3, A₂(=5), 1] first swaps 1 to front, yielding [1, 3, A2, A1], which reverses A1/A2’s order.