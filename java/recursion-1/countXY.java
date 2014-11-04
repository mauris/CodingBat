public String changeXY(String str) {
  String result = "";
  if (str.length() > 0) {
    char compare = str.charAt(0);
    if (compare  == 'x') {
      result = "y";
    } else {
      result = str.substring(0, 1);
    }
    if (str.length() > 1) {
      result += changeXY(str.substring(1));
    }
  }
  return result;
}

