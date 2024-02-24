import matplotlib.pyplot as plt
import numpy as np
x=np.array([1,2,3,4,5])
y=np.array([2,4,6,8,10])
plt.plot(x,y)
plt.title("GRAPH")
plt.xlabel("NO OF PEOPLE")
plt.ylabel("AGE")
plt.show()
b=np.array([10,20,30,40,50])
a=np.array([1,2,3,4,5])


plt.plot(a,b,'-.')
plt.title("TABLE OF TEN")
plt.xlabel("MULTIPLE")
plt.ylabel("VALUE")
plt.show()
print()
c=np.array([66,89,23,11,67,54])
d=np.array([33,22,77,54,11,9])
plt.plot(c,d,marker='o',color='green',markersize=12)
plt.show()