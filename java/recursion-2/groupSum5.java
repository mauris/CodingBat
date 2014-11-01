public boolean groupSum5(int start, int[] nums, int target)
{
  if (start < nums.length) {
    if (nums[start] % 5 == 0) {
      if (start < nums.length - 1 && nums[start + 1] == 1) {
        return groupSum5(start + 2, nums, target - nums[start]);
      } else {
        return groupSum5(start + 1, nums, target - nums[start]);
      }
    } else {
      return groupSum5(start + 1, nums, target) || groupSum5(start + 1, nums, target - nums[start]);
    }
  }

  return target == 0;
}
