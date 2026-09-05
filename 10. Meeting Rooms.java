//https://www.geeksforgeeks.org/problems/attend-all-meetings/1
class Solution {
    static boolean canAttend(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
               for (int i = 1; i < arr.length; i++) {
                   if (arr[i][0] < arr[i - 1][1])
                       return false;
               }
               return true;
    }
}
/*
Sort by START time
        ↓
current start < previous end ?
        ↓
      YES → false
      NO  → continue
        ↓
     return true
  */
