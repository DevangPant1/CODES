def bubble_sort(a):
    for i in range(0,len(a)):
        for j in range(i+1,len(a)):
            if a[j]<a[i]:
                a[i],a[j]=a[j],a[i]
    return a

print(bubble_sort([4,3,2,1]))
