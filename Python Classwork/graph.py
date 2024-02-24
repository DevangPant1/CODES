import numpy as np
import matplotlib.pyplot as plt
a=np.array([1,2,3,4,5])
b=np.array([1,2,3,4,5])
y=np.array([1,2,3,4,5])
x=np.array([2,4,6,8,10])
plt.plot(a,b,marker="o",color='red',linestyle='dashed')
plt.plot(x,y,marker="*",color='blue')
plt.title("Y=X EQUATION")
plt.xlabel("X AXIS")
plt.ylabel("Y AXIS")
plt.show()
