dt=[]
"""with open("DATABASE.csv",'w') as data:
    data.write("NAME,SCIENCE,MATH,ENGLISH\n")"""

def add():
    b=input("ENTER STUDENT NAME=")
    c=input("ENTER SCIENCE MARKS=")
    d=input("ENTER MATH MARKS=")
    e=input("ENTER ENGLISH MARKS=")
    with open("DATABASE.csv",'a') as dat:
        dat.write(b+","+c+","+d+","+e+"\n")

def all():
    with open("DATABASE.csv",'r') as data:
        dt=data.readlines()
        for i in dt:
            i.replace("\n","")
            w,x,y,z=i.split(",")
            print(w+","+x+","+y+","+z)

def name():
    h=input("ENTER STUDENT NAME=")
    with open("DATABASE.csv",'r') as data:
        dt=data.readlines()
        for i in dt:
            i.replace("\n","")
            w,x,y,z=i.split(",")
            if(h==w):
                print(w+","+x+","+y+","+z)

while True:
    print(
    "ENTER 1 FOR ADDING USER\nENTER 2 FOR KNOWING ALL MARKS\nENTER 3 FOR SEARCHING BY NAME\nENTER 4 TO QUIT\n"
    )
    a=int(input("ENTER CHOICE="))
    if a==1:
        add()
    elif a==2:
        all()
    elif a==3:
        name()
    elif a==4:
        break 