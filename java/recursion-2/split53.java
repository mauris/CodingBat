public boolean split53(int[] nums)
{
  return recursive(nums, 0, 0, 0);
}

private boolean recursive(int[] nums, int start, int leftsum, int rightsum)
{
  if (start < nums.length) {
    if (nums[start] % 5 == 0) {
      return recursive(nums, start + 1, leftsum + nums[start], rightsum);
    } else if (nums[start] % 3 == 0 && nums[start] % 5 != 0){
      return recursive(nums, start + 1, leftsum, rightsum + nums[start]);
    } else {
      // all other numbers
      return recursive(nums, start + 1, leftsum + nums[start], rightsum)
          || recursive(nums, start + 1, leftsum, rightsum + nums[start]);
    }
  }

  return leftsum == rightsum;
}
