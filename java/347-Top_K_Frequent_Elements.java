package com.company;

import java.util.*;

public class Main {

    public static int[] topKFrequent(int[] nums, int k) {

        int [] result = new int [k];

        HashMap<Integer, Integer> store = new HashMap<>();
        List<Integer> valueList = new ArrayList<>();

        for (int i=0; i<nums.length; i++){
            if(store.containsKey(nums[i])){
                store.put(Integer.valueOf(nums[i]), store.get(nums[i]) + 1);
            } else {
                store.put(Integer.valueOf(nums[i]), 1);
            }
        }
        valueList.addAll(store.values());
        Collections.sort(valueList);

        for (int i=0; i<k; i++){
            result[i] = valueList.get(valueList.size()-1);
            valueList.remove(valueList.size()-1);
        }

        int i=0;
        while (i<k){
            for (Integer key : store.keySet()){
                if (store.get(key).equals(Integer.valueOf(result[i]))){
                    result[i] = (int) key;
                    i++;
                    if(i>=k)
                        return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int [] nums = new int [] {1,1,2,2,3,4,4,4,7,7,6,6,5,5,5,8,8,8,8,9,9,9,0,0,0,0,2,2,2,};
        int k = 6;

        int [] result;
        result = topKFrequent(nums, k);

        System.out.print("Output: [");
        for (int i=0; i<result.length; i++){
            System.out.print(result[i] + ",");
        }
        System.out.print("]");
    }
}
