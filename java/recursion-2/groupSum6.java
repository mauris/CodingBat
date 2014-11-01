public boolean groupSum6(int start, int[] nums, int target)
{
  if (start < nums.length) {
    if (nums[start] == 6) {
      return groupSum6(start + 1, nums, target - nums[start]);
    } else {
      return groupSum6(start + 1, nums, target) || groupSum6(start + 1, nums, target - nums[start]);
    }
  }

  return target == 0;
}
