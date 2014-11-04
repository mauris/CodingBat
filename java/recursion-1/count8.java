public int count8(int n) {
  int result = 0;
  
  if (n % 10 == 8) {
    if (n / 10 % 10 == 8) {
      result += 2;
    } else {
      result += 1;
    }
  }
  
  if(n > 9) {
    result += count8(n / 10);
  }
  
  return result;
}

