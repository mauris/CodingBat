public int countPairs(String str) {
  int result = 0;
  if (str.length() > 2) {
    if (str.charAt(0) == str.charAt(2)) {
      ++result;
    }
    result += countPairs(str.substring(1));
  }
  return result;
}

