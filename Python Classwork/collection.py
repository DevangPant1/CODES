from collections import Counter
list=[1,2,3,4,5,5,4,3,2,1,4,5]
a=Counter(list)
print(a)
print(a[1])
s="hello hello"
x=Counter(s)
print(Counter(s))
print(x.most_common())
v=x.most_common()
print(v[0][0])
