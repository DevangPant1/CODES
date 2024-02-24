def selection(n):
    for i in range(0,len(n)):
        min_index=i
        for j in range(i+1,len(n)):
            if n[min_index]<n[j]:
                min_index=j
        n[i],n[min_index]=n[min_index],n[i]
    return n

print(selection([99,10,3,45,5]))      
