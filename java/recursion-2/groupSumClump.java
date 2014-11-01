public boolean groupSumClump(int start, int[] nums, int target)
{
  if (start < nums.length) {
    if (start < nums.length - 1 && nums[start] == nums[start + 1]) {
        return groupSumClump(start + 2, nums, target) || groupSumClump(start + 2, nums, target - nums[start] - nums[start + 1]);
    } else {
      return groupSumClump(start + 1, nums, target) || groupSumClump(start + 1, nums, target - nums[start]);
    }
  }

  return target == 0;
}
