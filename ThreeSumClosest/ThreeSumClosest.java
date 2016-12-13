import java.util.Arrays;

/**
 * Created by joker on 2016/12/13.
 */
public class ThreeSumClosest {


    public int threeSumClosest(int[] nums, int target) {

        if(nums.length<3) return 0;

        Arrays.sort(nums);

        int closest = nums[0]+nums[1]+nums[2];

        int first =0;int end = nums.length-1;

        while (end>0){

            while (first<end){
                int sum = nums[first]+nums[end];

                for (int i = first+1;i<end;i++){

                    if(Math.abs(target-nums[i]-sum)< Math.abs(target-closest)){
                        closest = sum+nums[i];
                    }
                }

                int old= nums[first];

                while (first<end&&nums[first]==old) first++;


            }

            first=0;

            int old =nums[end];
            while (end>0&&nums[end]==old) end--;
        }


        return closest;

    }


    public static void main(String[] args) {
        System.out.println(new ThreeSumClosest().threeSumClosest(new int[]{1,1,1,0},100));
    }

}
