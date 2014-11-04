public int countHi2(String str) {
  int result = 0;
  if (str.length() > 1) {
    if(str.substring(0, 2).equals("hi")) {
      ++result;
      result += countHi2(str.substring(2));
    } else if (str.charAt(0) == 'x' && str.charAt(1) == 'h') {
      result += countHi2(str.substring(2));
    } else {
      result += countHi2(str.substring(1));
    }
  }
  return result;
}

