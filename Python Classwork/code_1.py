def inputs():
    global a,b,c,choice
    a=int(input("ENTER ROWS:"))
    b=int(input("ENTER COLUMN:"))
    c=int(input("ENTER NUMBER OF INPUTS:"))
    choice=[]
    for i in range(c):
        choice.append(input("CHOICE:"))

def create():
    global checkered, inner
    checkered=[]
    inner=[]
    for i in range(a):
        for j in range(b):
            inner.append('B')
        checkered.append(inner)
        inner=[]

def edit_row(n):
    for i in range(len(checkered[n-1])):
        if checkered[n-1][i]=='B':
                checkered[n-1][i]='G'
        elif checkered[n-1][i]=='G':
                checkered[n-1][i]='B'

def edit_column(m):
    for i in range(len(checkered)):
        if checkered[i][m-1]=='B':
            checkered[i][m-1]='G'
        elif checkered[i][m-1]=='G':
            checkered[i][m-1]='B'

def refine():
    for i in range(len(choice)):
        a,b=choice[i].split(" ")
        if a=='R':
            b=int(b)
            edit_row(b)
        elif a=='C':
            b=int(b)
            edit_column(b)

def display():
    for i in range(len(checkered)):
        for j in range(len(checkered[i])):
            print(checkered[i][j],end='')
        print()


inputs()
create()
refine()
display()