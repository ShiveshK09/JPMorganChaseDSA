//https://leetcode.com/problems/merge-intervals/
class Solution {
    public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    List<int[]> res=new ArrayList<>();
    res.add(intervals[0]);
    for(int i=1;i<intervals.length;i++){
        int[] cur=intervals[i];
        int[] last=res.get(res.size()-1);
        if(last[1]<cur[0]) res.add(cur);
        else last[1]=Math.max(last[1],cur[1]);
    }
    return res.toArray(new int[res.size()][]);
    }
}
/*
Sort → Take Last → Compare Start with End → Add or Merge
SORT
 ↓
FIRST → result
 ↓
CURRENT + LAST
 ↓
last.end < current.start ?
       /              \
     YES              NO
      ↓                ↓
    ADD              MERGE
                       ↓
              max(last.end,current.end)
*/
