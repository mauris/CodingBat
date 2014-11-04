public String noX(String str) {
  String result = "";
  if (str.length() > 0) {
    if (str.charAt(0) == 'x') {
      return noX(str.substring(1));
    } else {
      return str.substring(0, 1) + noX(str.substring(1));
    }
  }
  return result;
}

