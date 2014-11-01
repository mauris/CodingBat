public boolean splitOdd10(int[] nums)
{
  return recursive2(nums, 0, 0, 0);
}

private boolean recursive2(int[] nums, int start, int leftsum, int rightsum)
{
  if (start < nums.length) {
    return recursive2(nums, start + 1, leftsum + nums[start], rightsum)
        || recursive2(nums, start + 1, leftsum, rightsum + nums[start]);
  }

  return (leftsum % 10 == 0 && rightsum % 2 == 1)
      || (leftsum % 2 == 1 && rightsum % 10 == 0);
}