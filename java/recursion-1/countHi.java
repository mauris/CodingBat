public int countHi(String str) {
  int result = 0;
  if (str.length() >= 2) {
    if (str.substring(0, 2).equals("hi")) {
      result++;
      result += countHi(str.substring(2));
    } else {
      result += countHi(str.substring(1));
    }
    
  }
  return result;
}

