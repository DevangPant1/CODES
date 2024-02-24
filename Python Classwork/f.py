import math

def subtract(list1,list2):
  i = 0
  j = 0
  ct = 0
  r = []
  while (i < len(list1)):
    j=0
    while (j < len(list2)):
      if list1[i] == list2[j]:
        ct+=1
      j=j+1
    if ct==0:
      r.append(list1[i])
    i = i + 1
  return r

print(subtract([3,4,90,590],[67,580,90,3]))