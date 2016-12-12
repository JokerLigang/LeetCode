package TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by joker on 2016/12/12.
 * <p>
 * <p>
 * <p>
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;

    }


}
