public String endX(String str) {
  if (str.length() > 1) {
    if (str.charAt(0) == 'x') {
      return endX(str.substring(1)) + "x";
    } else {
      return str.substring(0, 1) + endX(str.substring(1));
    }
  }
  return str;
}

