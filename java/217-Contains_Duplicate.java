package com.company;

public class Main {

    /**
     * Brute force.
     * Time complexity O(n^2)
     */

    // Take each element and search the rest of the array
    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i <nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums [j])
                    return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
	int [] myArray = new int[]{1,2, 3};

        if (containsDuplicate(myArray))
            System.out.println("True");
        else
            System.out.println("False");

    }
}

/************************************************************************/

/**
 * Efficient solution
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();
        for (int num : nums) {
            if (numbers.contains(num)) return true;
            numbers.add(num);
        }

        return false;
    }
}