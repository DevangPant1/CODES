a=int(input("ENTER NUMBER OF SHOES="))
b=list(input("ENTER SIZE OF EACH SHOE SEPERATED BY A SPACE="))
o=" "
for i in b:
    if o in b[i]:
        l=b.pop(i)

print(b)

