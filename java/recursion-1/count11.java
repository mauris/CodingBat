public int count11(String str) {
  int result = 0;
  if (str.length() > 1) {
    if(str.substring(0, 2).equals("11")){
      result += 1 + count11(str.substring(2));
    } else {
      result += count11(str.substring(1));
    }
  }
  return result;
}

