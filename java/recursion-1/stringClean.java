public String stringClean(String str) {
  if (str.length() > 1) {
    if (str.charAt(0) == str.charAt(1)) {
      return stringClean(str.substring(1));
    } else {
      return str.substring(0, 1) + stringClean(str.substring(1));
    }
  }
  return str;
}

