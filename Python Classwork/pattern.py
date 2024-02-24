for i in range(4,-1,-1):
    for j in range(0,7,2):
        print(j)
        print(" "*int((j/2))+str(i)*(7-j)+" "*int((j/2)))
        