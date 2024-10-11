package Collections;

public class Solution {

    public static boolean found(int mid, int[] nums) {
        int ok = 0;
        int l = 0;
        int r = mid;
        while (r < nums.length && l < r) {
            if (nums[l] <= nums[r])
                return true;
            l++;
            r++;
        }
        return false;
    }


    public int maxWidthRamp(int[] nums) {

        int l = 0;
        int r = nums.length-1;
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;

            if (found(mid, nums)) {
                ans = Math.max(ans,mid);
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxWidthRamp(new int[]{2,4,1,3}));
    }
}
