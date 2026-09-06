//https://leetcode.com/problems/subarray-sum-equals-k/
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0,sum=0;
        for(int n:nums){
            sum+=n;
            count+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
/*
1️⃣ Create Map
   map.put(0, 1);
2️⃣ Calculate Prefix Sum
   sum += n;
3️⃣ Find required previous sum
   count += map.getOrDefault(sum-k, 0);
4️⃣ Store current sum
   map.put(sum, map.getOrDefault(sum,0)+1);
*/
