s={'a','b','c','c'}
print(s)
if 'a' in s:
    print(True)

for i in s:
    print(i)

s.add("COOL")
print(s)

#or

s.update("Nice")
print(s)

s.remove("COOL")
print(s)

s.discard("i")
print(s)

b={'y','m','x','c'}
print(b.union(s))
print(b.intersection(s))

b.symmetric_difference_update(s)
print(b)

print(b.difference(s))

x={1,2,3}
y={1,2,3,4}

if y.issuperset(x):
    print(True)


