with open("project-data.txt",'r') as pr:
    data=pr.readlines()

for i in range(len(data)):
    data[i]=data[i].strip()
    data[i]=data[i].replace(',',';')

for i in data:
    if i=="":
        data.remove(i)

topic=[]
word=[]
meaning=[]
example=[]
m=''

for i in range(len(data)):
    if data[i].split('.')[0].isdigit():
        if data[i].split('.')[1]=="":
            topic.append(data[i+1])
        else:
            topic.append(data[i].split('.')[1])
    if '=' in data[i]:
        word.append(data[i].split('=')[0])
        meaning.append(data[i].split('=')[1])

    if ':' in data[i]:
        if '=' in data[i+1]:
            m=data[i].split(":")[1]
        else:
            m+=data[i+1]
        example.append(m)

    

print(example)



