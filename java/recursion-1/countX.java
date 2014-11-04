public int countX(String str) {
  int result = 0;
  if (str.length() > 0) {
    if (str.charAt(0) == 'x') {
      ++result;
    }
    result += countX(str.substring(1));
  }
  return result;
}

