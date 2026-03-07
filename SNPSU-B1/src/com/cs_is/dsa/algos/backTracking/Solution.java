package com.cs_is.dsa.algos.backTracking;
import java.util.ArrayList;
import java.util.List;
public class Solution {
    private void solve(int[] nums, List<Integer> output,
                       int index, List<List<Integer>> ans){
        // Base case
        if(index >= nums.length){
            ans.add(new ArrayList<>(output)); // Add a copy of the subset
            return;
        }
        // Exclude case
        solve(nums, output, index+1, ans);
        // Include case
        output.add(nums[index]); // Store that value & move to next index
        solve(nums, output, index+1, ans);
        // Backtrack & remove the last answer from the output to go to next
        output.remove(output.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,2,3};
        List<List<Integer>> result = solution.subsets(nums);
        for (List<Integer> subset : result){
            System.out.println(subset);
        }
    }
}
