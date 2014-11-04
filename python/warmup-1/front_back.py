def front_back(str):
  if len(str) > 1:
    return str[-1:] + str[1:-1] + str[:1]
  else:
    return str

