# Insertion Sort

Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. It works by comparing each element in the unsorted list to its neighboring elements and inserting it in its correct position in the sorted list.

## Here is how the algorithm works step by step:

1. Start with an unsorted list of n elements.
2. Take the first element and consider it as a sorted list of one element.
3. Move to the second element and compare it with the first element. If it is smaller, swap them to get the correct order. Otherwise, leave them as they are.
4. Move to the third element and compare it with the second element. If it is smaller than the second element, swap them to get the correct order. Then compare the new second element with the first element and swap if necessary.
5. Continue this process of comparing and swapping the current element with the previous elements until you reach the end of the list.
6. Repeat steps 3-5 for each element in the list until the entire list is sorted.

Insertion sort is an in-place sorting algorithm, meaning that it does not require any additional memory to store the sorted list. However, it can be slow for larger lists since it requires multiple comparisons and swaps for each element in the list.
