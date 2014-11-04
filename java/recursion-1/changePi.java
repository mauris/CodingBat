public String changePi(String str) {
  String result = "";
  if (str.length() >= 2 && str.substring(0, 2).equals("pi")) {
    result = "3.14" + changePi(str.substring(2));
  } else if (str.length() > 0) {
    result = str.substring(0, 1) + changePi(str.substring(1));
  }
  return result;
}

