def has_duplicates(n):
   m=n.copy()
   i=0
   while i<len(n):
     j=0
     cnt=0
     while j<len(m):
       if n[i]==m[j]:
         cnt+=1
     if cnt>1:
      return True
    
      
  

print(has_duplicates([1,2,3,4,5]))