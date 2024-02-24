a={1,2,3,4,5,6}
b={4,5,6,7,8,9}
c=len(a.intersection(b))
print("CHILDREN WHO TOOK 2 SUBJECTS=",c)
print("ROLl NUMBERS->")
for i in a.intersection(b):
    print(i)
print("CHILDREN WHO TOOK AT LEAST 1 SUBJECT=",len(a.union(b)))
print("ROLL NUMBERS->")
for g in a.union(b):
    print(g)
print("ROLL NUMBERS OF STUDENTS WHO TOOK 1 SUBJECT")
for w in a.symmetric_difference(b):
    print(w)