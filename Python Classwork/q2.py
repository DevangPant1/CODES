key=[]
org=27
for i in range(97,123,1):
    org-=1
    key.append([chr(i),org])

org=[676,27,256,125]
dig=[]
for i in range(len(org)):
    if org[i]**(1/2)>=10:
        dig.append(org[i]**(1/2))
    else:
        dig.append(org[i]**(1/3))

ans=[]

for i in range(len(dig)):
    for j in range(len(key)):
        if dig[i]==key[j][1]:
            ans.append(key[j][0])

print(ans)
        