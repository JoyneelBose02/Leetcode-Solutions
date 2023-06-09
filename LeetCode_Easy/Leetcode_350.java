//Leetcode 350
//Interesection of two arrays II
import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();

        for (int num : nums1) {
            list.add(num);
        }

        for (int num : nums2) {
            if (list.contains(num)) {
                intersection.add(num);
                int x = list.indexOf(num);
                list.remove(x);
                
            }
        }

        int[] ans = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            ans[i] = intersection.get(i);
        }

        return ans;
    }
}
