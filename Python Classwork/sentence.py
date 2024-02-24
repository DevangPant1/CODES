alpha=list("abcdefghijklmnopqrstuvwxyz")
c=1
key=[]
for i in range(len(alpha)):
    key.append([alpha[i],c])
    c+=1
print(key)
a=input("ENTER STRING=")
a=a.split()
sub=[]
for i in a:
    sub.append(list(i))


power=[]
m1=0
for i in range(len(sub)):
    for j in range(len(sub[i])):
        for p in range(len(key)):
            if sub[i][j]==key[p][0]:
                m1+=key[p][1]
    m1+=len(sub[i])



b=input("ENTER STRING=")
b=b.split()
sub2=[]
for i in b:
    sub2.append(list(i))




power=[]
m2=0
for i in range(len(sub2)):
    for j in range(len(sub2[i])):
        for p in range(len(key)):
            if sub2[i][j]==key[p][0]:
                m2+=key[p][1]
    m2+=len(sub2[i])

if m1>m2:
    print(str(a))
else:
    print(str(b))


