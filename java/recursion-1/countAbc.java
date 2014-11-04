public int countAbc(String str) {
  int result = 0;
  if (str.length() > 2) {
    if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) {
      result += 1;
    }
    result += countAbc(str.substring(1));
  }
  return result;
}

