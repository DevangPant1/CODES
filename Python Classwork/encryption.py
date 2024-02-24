
alphabets=list("abcdefghijklmnopqrstuvwxyz")
key=[]
index=26
for i in range(len(alphabets)):
    key.append([alphabets[i],index])
    index-=1


code=input("PLEASE ENTER ENCRYPTED KEY EACH VALUE SEPERATED BY A SPACE=")
code=code.split()
for v in range(len(code)):
    code[v]=int(code[v])

for i in range(len(key)):
    if key[i][1]>=10:
        key[i][1]=key[i][1]**2
    elif key[i][1]<10:
        key[i][1]=key[i][1]**3
ans=[]
for j in code:
    for i in range(len(key)):
        if j==key[i][1]:
            ans.append(key[i][0])

for i in ans:
    print(i.upper(),end=" ")
