public int strCount(String str, String sub) {
  if (str.length() >= sub.length()) {
     int result = 0;
     if (str.substring(0, sub.length()).equals(sub)) {
       result++;
       result += strCount(str.substring(sub.length()), sub);
     } else {
       result += strCount(str.substring(1), sub);
     }
     return result;
  }
  return 0;
}

