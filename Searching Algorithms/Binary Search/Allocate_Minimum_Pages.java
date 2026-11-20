/*
Geeks for Geeks

Given an array arr[] of integers, where each element arr[i] represents the number of pages in the i-th book. You also have an integer k representing the number of students. The task is to allocate books to each student such that:

Each student receives atleast one book.
Each student is assigned a contiguous sequence of books.
No book is assigned to more than one student.
All books must be allocated.
The objective is to minimize the maximum number of pages assigned to any student. In other words, out of all possible allocations, find the arrangement where the student who receives the most pages still has the smallest possible maximum. If it is not possible to allocate books to all students, return -1;

Input: arr[] = [12, 34, 67, 90], k = 2
Output: 113
Explanation: Allocation can be done in following ways:
=> [12] and [34, 67, 90] Maximum Pages = 191
=> [12, 34] and [67, 90] Maximum Pages = 157
=> [12, 34, 67] and [90] Maximum Pages = 113.
The third combination has the minimum pages assigned to a student which is 113.


*/

public class Allocate_Minimum_Pages {

    static boolean isValidAnswer(int arr[], int k, long maxPages) {
        // check wheather mid is a valid answer or not
        int studentCount = 1;
        long pages = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pages + arr[i] <= maxPages) {
                pages = pages + arr[i];
            } else {
                studentCount++;
                if (studentCount > k || arr[i] > maxPages) {
                    return false;
                } else {
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;

    }

    public int findPages(int[] arr, int k) {

        if (arr.length < k) {
            return -1;
        }

        int n = arr.length;
        long s = 1;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        long e = sum;

        long ans = -1;

        while (s <= e) {

            long mid = s + (e - s) / 2;

            if (isValidAnswer(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }
        return (int) ans;
    }

}
