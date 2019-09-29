# Array Partition I

## [Problem Statement](https://leetcode.com/problems/array-partition-i/) :

Given an array of 2n integers, your task is to group these integers into n pairs of integer, say <img src="https://latex.codecogs.com/gif.latex?(a_1,&space;b_1)" title="(a_1, b_1)" />, <img src="https://latex.codecogs.com/gif.latex?(a_2,&space;b_2)" title="(a_2, b_2)" />, ..., <img src="https://latex.codecogs.com/gif.latex?(a_n,&space;b_n)" title="(a_n, b_n)" /> which makes sum of <img src="https://latex.codecogs.com/gif.latex?min(a_i,&space;b_i)" title="min(a_i, b_i)" /> for all i from 1 to n as large as possible.

## Example 1:

#### Input: [1,4,3,2]

#### Output: 4

##### Explanation: 
n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).

###### Note:

n is a positive integer, which is in the range of [1, 10000].

All the integers in the array will be in the range of [-10000, 10000].