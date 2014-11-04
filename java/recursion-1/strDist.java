public int strDist(String str, String sub) {
  if (str.length() > 0) {
    boolean opening = str.startsWith(sub);
    boolean closing = str.endsWith(sub);
    if (opening && closing) {
      return str.length();
    } else if (opening) {
      return strDist(str.substring(0, str.length() - 1), sub);
    } else {
      return strDist(str.substring(1), sub);
    }
  }
  return 0;
}

