# Kotlin map function bug

This repository demonstrates a potential bug in Kotlin's `map` function where it might unexpectedly return an empty list. This usually occurs when dealing with an empty list or a null list as input.

## Bug Description
The `map` function in the provided code snippet should transform a list of integers into a list containing the double of each integer.  However, it fails when the input list is empty or null. This bug can be problematic when working with data sources that might return empty collections.

## Solution
The solution involves adding null checks and handling the case where the input list is empty, ensuring the function returns a sensible result even under these conditions.

## How to reproduce
1. Clone this repository.
2. Open `bug.kt`
3. Run the `main` function. Observe the unexpected empty list output. 
4. Open `bugSolution.kt`. This version includes a null and empty check and returns an empty list in that case. Run to see correct behavior.
