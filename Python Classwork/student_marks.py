a=int(input("ENTER NUMBER OF STUDENTS="))
i=1
database=[]
v=str(i)
while i<=a:
    b=input("ENTER NAME OF STUDENT=")
    c=int(input("ENTER MARKS="))
    database.append([b,c])
    b=0
    c=0
    i+=1

low=0
sec_low=0
mult=[]
cnt=0
marks=[]

for i in range(len(database)):
    marks.append(database[i][1])

low=marks[0]
for i in range(len(marks)):
    if low>marks[i]:
        low=marks[i]

marks.remove(low)
sec_low=marks[0]

for i in range(len(marks)):
    if sec_low>marks[i]:
        sec_low=marks[i]

for i in range(len(database)):
    if sec_low==database[i][1]:
        mult.append(database[i][0])
        
mult.sort()
for i in mult:
    print(i)