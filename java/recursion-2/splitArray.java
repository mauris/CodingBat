public boolean splitArray(int[] nums)
{
  return recursive(nums, 0, 0, 0);
}

private boolean recursive(int[] nums, int start, int leftsum, int rightsum)
{
  if (start < nums.length) {
    return recursive(nums, start + 1, leftsum + nums[start], rightsum)
        || recursive(nums, start + 1, leftsum, rightsum + nums[start]);
  }
  return leftsum == rightsum;
}