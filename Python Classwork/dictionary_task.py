Spaning={'hello':'hola','my':'mi','name':'llamo','house':"casa",'car':'coche','pen':'boligrapho','black':'negro','white':'blanca','green':'verde','pink':'rosa','is':'es','am':'soy'}
ingspan={'hola':'hello','mi':'my','llamo':'name','casa':"house",'coche':'car','boligrapho':'pen','negro':'black','blanca':'white','verde':'green','rosa':'pink','es':'is','soy':'am'}

a=int(input("ENTER 1 FOR SPANISH TO ENGLISH. ENTER 2 FOR ENGLISH TO SPANISH=="))
b=input("ENTER STRING==")

b=b.split()

if a==1:
    for i in range(len(b)):
        for j in ingspan.items():
            j=list(j)
            if b[i]==j[0]:
                b[i]=j[1]
                print(b)
    b=" ".join(b)
    print(b)

elif a==2:
    for i in range(len(b)): 
        for j in Spaning.items():
            j=list(j)
            if b[i]==j[0]:
                b[i]=j[1]
                print(b)
    b=" ".join(b)
    print(b)


else:
    print("ENTER CORRECT NAME")