public boolean groupNoAdj(int start, int[] nums, int target)
{
  if (start < nums.length) {
    return groupNoAdj(start + 1, nums, target) || groupNoAdj(start + 2, nums, target - nums[start]);
  }

  return target == 0;
}
