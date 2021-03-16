package impl.list;

//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例:
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
// 说明:
//
//
// 必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
//
// Related Topics 数组 双指针
// 👍 981 👎 0

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j;i < nums.length;i++) {
            nums[i] = 0;
        }
    }

    public void moveZerosBak1(int[] nums) {
        int j = 0;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = j;i < nums.length;i++) {
            nums[i] = 0;
        }
    }

    public void moveZerosV2(int[] nums) {
        int j = 0;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    public void moveZerosV2Bak(int[] nums) {
        int j = 0;
        for (int i = 0;i < nums.length;i++) {
            if (nums[i] != 0) {
                if (i > j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

}
