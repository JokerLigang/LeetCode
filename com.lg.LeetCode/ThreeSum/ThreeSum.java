package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by joker on 2016/12/12.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);


        int first = 0;
        int end = nums.length - 1;

        while (end > 0 && nums[end] >= 0) {

            while (first < end && nums[first] <= 0) {

                int sum = nums[end] + nums[first];

                for (int i = first + 1; i < end; i++) {
                    if (sum + nums[i] == 0) {
                        result.add(Arrays.asList(nums[first], nums[i], nums[end]));
                        break;
                    }
                }

                int old = nums[first];

                while (first < end && nums[first] == old) first++;


            }
            first = 0;
            int old = nums[end];
            while (end > 0 && nums[end] == old) end--;

        }

        return result;


    }


    public static void main(String[] args) {

        List<List<Integer>> lists = new ThreeSum().threeSum(new int[]{0,0,0,0});
        for (Object o : lists.toArray()) {
            System.out.println(o);
        }
    }


}

