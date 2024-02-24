for i in range(1,18,1):
    print("*",end="")
print()

for j in range(1,9,1):
    print(" "*j,"*",end="")
    print(" "*(17-(2+2*j)),end="")
    print("*",end="")
    print(' '*j,end="")
    print()