import math
a=int(input("ENTER AB LENGTH="))
b=int(input("ENTER BC LENGTH="))

sm=a**2+b**2
c=math.sqrt(sm)

ans=math.asin(a/c)
print(round(math.degrees(ans)))