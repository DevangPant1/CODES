import random
s=[]
j=[]
for i in range(1,11,1):
    a=str(random.randint(1,100))
    s.append(a)
    a=""


with open("Alphabets.txt","w") as file:
    for i in s:
        file.write(i+"\n")


with open("Alphabets.txt","r") as sqr:
    for q in range(1,11,1):
        b=sqr.readline()
        b=int(b)
        b*=b
        j.append(b)
        b=0
        print(j)

with open("sqrt.txt",'w') as d:
    for g in j:
        d.write(str(g)+"\n")

