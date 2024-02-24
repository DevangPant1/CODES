def binary(lst,num):
    low=0
    high=len(lst)-1
    mid=(low+high)//2
    while(low<=high):
        if(lst[mid]==num):
            return mid
        elif lst[mid]<num:
            low=mid+1
        elif lst[mid]>num:
            high=mid-1
    return -1

print(binary([1,2,3,4,5,6,7,8],7))
    

    

        
    