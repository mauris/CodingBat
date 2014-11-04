public int sumDigits(int n) {
  if (n > 9) {
    return n % 10 + sumDigits (n / 10);
  } else {
    return n;
  }
}

