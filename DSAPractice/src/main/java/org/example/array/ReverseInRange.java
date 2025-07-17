package org.example.array;
/*Problem Description

Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].


Problem Constraints

1 <= N <= 105
1 <= A[i] <= 109
0 <= B <= C <= N - 1


Input Format

The first argument A is an array of integer.
The second and third arguments are integers B and C


Output Format

Return the array A after reversing in the given range.


Example Input

Input 1:

A = [1, 2, 3, 4]
B = 2
C = 3
Input 2:

A = [2, 5, 6]
B = 0
C = 2


Example Output

Output 1:

[1, 2, 4, 3]
Output 2:

[6, 5, 2]


Example Explanation

Explanation 1:

We reverse the subarray [3, 4].
Explanation 2:

We reverse the entire array [2, 5, 6].*/
public class ReverseInRange {
    public static void main(String[] args) {
        int A[] = {1,2,3,4};
        int responseArr[] = solve(A, 2,3);
        for(int  res: responseArr) {
            System.out.print(res);
        }

    }

    public static int[] solve(int[] A, int B, int C) {
        reverse(A, B,C);
        return A;
    }

    public static void reverse(int[] A, int start, int end) {
        int i,j;
        for( i=start, j= end; i< j; i++,j--) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
}
