package array_string_problem;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElement {

    /*
 You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.
Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
     */
    public int sumOfUnique(int[] nums) {
             // using hashmap to save num element and frequency of them
             // sum of nums  occurs once
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1 );
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> item : map.entrySet()){
             if(item.getValue() == 1){
                 sum += item.getKey();
             }
        }
        return sum;
    }
}
