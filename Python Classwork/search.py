def linearsearch(lst,num):
    for i in range(len(lst)):
        if num==lst[i]:
            return i
    return -1

print(linearsearch([1,2,3,4],9))

            
        
