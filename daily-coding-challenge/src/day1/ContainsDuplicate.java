package day1;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 5, 1, 36, 2, 4, 56, 3,};
        int[] nums2 = new int[]{1, 3, 5, 33, 36, 2, 4, 56, 0,};
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        for(int num : nums) {
            if (seenNumbers.contains(num) ) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}
