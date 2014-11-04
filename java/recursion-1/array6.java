public boolean array6(int[] nums, int index) {
  if (index < nums.length) {
    if (nums[index] == 6) {
      return true;
    } else {
      return array6(nums, index + 1);
    }
  }
  return false;
}

