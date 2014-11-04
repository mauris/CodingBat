public int count7(int n) {
  int result = 0;
  
  if (n % 10 == 7) {
    result = 1;
  }
  if (n > 9) {
    result += count7(n / 10);
  }
  return result;
}

