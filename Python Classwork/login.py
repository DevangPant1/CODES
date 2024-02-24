def register():
    a=input("ENTER NAME=")
    while True:    
        b=input("ENTER PASSCODE=")
        c=input("CONFIRM PASSCODE=")
        if b==c:
            break
        else:
            print("PASSWORDS DO NOT MATCH")
    with open("registration",'a') as rgs:
        rgs.write(a+','+b+'\n')

def login():
    print("LOGIN VERIFICATION")
    d=input("ENTER NAME=")
    e=input('ENTER PASSCODE=')
    data=[]
    with open('registration','r') as lg:
        data=lg.readlines()
        
    for i in data:
        q=i.replace("\n","")
        u,p=q.split(",")
        if u==d:
            if e==p:
                print("LOGIN SUCCESSFUL")
                break
            else:
                print("incorrecct password")
                break
    
    else:
        print("user doesnt exist ")

        




login()