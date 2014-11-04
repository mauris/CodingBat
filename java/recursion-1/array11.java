public int array11(int[] nums, int index) {
  int count = 0;
  if (index < nums.length) {
    if (nums[index] == 11) {
      ++count;
    }
    count += array11(nums, index + 1);
  }
  return count;
}

