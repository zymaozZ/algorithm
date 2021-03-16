package impl.list;

//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。
//
// 注意：答案中不可以包含重复的三元组。
//
//
//
// 示例 1：
//
//
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
//
//
// 示例 2：
//
//
//输入：nums = []
//输出：[]
//
//
// 示例 3：
//
//
//输入：nums = [0]
//输出：[]
//
//
//
//
// 提示：
//
//
// 0 <= nums.length <= 3000
// -105 <= nums[i] <= 105
//
// Related Topics 数组 双指针
// 👍 3077 👎 0

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> result = new LinkedHashSet<>();
        for (int i  = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length ; k++) {
                    if ((nums[i] + nums[k] + nums[j]) == 0) {
                        List<Integer> v = Arrays.asList(nums[i], nums[j], nums[k]);
                        result.add(v);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public List<List<Integer>> threeSumV2(int[] nums) {
        if (nums == null || nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0;i < nums.length - 2;i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int x = i + 1;
            int y = nums.length - 1;
            while (x < y) {
                int sum = nums[x] + nums[y] + nums[i];
                if (sum < 0) {
                    while ((x < y) && nums[x] == nums[++x]);
                } else if (sum > 0) {
                    while ((x < y) && nums[y] == nums[--y]);
                } else {
                    result.add(Arrays.asList(nums[i], nums[x], nums[y]));
                    while ((x < y) && nums[x] == nums[++x]);
                    while ((x < y) && nums[y] == nums[--y]);
                }
            }
        }
        return result;
    }

}
