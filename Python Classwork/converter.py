with open('project-data.txt','r') as dt:
    data=dt.readlines()

for i in range(len(data)):
    data[i]=data[i].strip()
    data[i]=data[i].replace(',',';')

#datacopy=data.copy()
for i in data:
    if i=="":
        data.remove(i)


topic=[]
word=[]
meaning=[]
example=[]
lines=""

for line in range(len(data)):
    if data[line][0].isdigit():
        if "=" in data[line+1]:
            t=data[line].split(".")[1].strip()
        
        else:
            t=data[line+1]
        count=1
        while not data[line+count][0].isdigit() and line+count<len(data)-1:
            if "=" in data[line+count]:
                topic.append(t)
            count+=1
    if "=" in data[line]:
        word.append(data[line].split("=")[0])
        m=data[line].split("=")[1].strip()
        if not ":" in data[line+1] and line<len(data):
            m+=data[line+1]
        meaning.append(m)
    if ":" in data[line]:
        p=data[line].split(":")[1].strip()
        if  line<len(data)-1 :
            if not "=" in data[line+1] and data[line+1][0].isdigit():
                p+=data[line+1]
        example.append(p)

print(len(word))


with open("RESULT.csv",'w') as res:
    for i in range(len(topic)):
        res.write(topic[i]+','+word[i]+','+meaning[i]+','+example[i]+'\n')
        
