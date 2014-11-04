public String pairStar(String str) {
  if (str.length() > 1) {
    if(str.charAt(0) == str.charAt(1)) {
      return str.substring(0, 1) + "*" + pairStar(str.substring(1));
    } else {
      return str.substring(0, 1) + pairStar(str.substring(1));
    }
  }
  return str;
}

