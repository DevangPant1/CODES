from collections import deque
list=[1,2,2,3,4,5,6,7,8]
d=deque(list)
d.append("a")
d.appendleft("b")
print(d)
d.pop()
d.popleft()
print(d)
print(d.count(2))