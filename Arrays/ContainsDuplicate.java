// 217. Contains Duplicate
// Easy
// Topics: Array HashTable Sorting
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Explanation:
// The element 1 occurs at the indices 0 and 3.

package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicateHashMap(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            if (freq.getOrDefault(i, 0) != 0) return true;
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        return false;
        // for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
        //     System.out.println(entry.getKey() + " " + entry.getValue());
        // }
    }
    public static boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicateHashSet(nums));
    }
}
