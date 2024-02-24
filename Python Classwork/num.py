import numpy as np
a=np.array([1,2,3,4,5])
print(a)

arr=np.array([[1,2,3],[4,5,6]])
print(arr,arr.ndim) #gives dimension
print(arr.shape) #gives shape
print(arr.itemsize,arr.dtype)
print(arr[0:2:1])


arr2=np.array([['a','b','c'],['x','y','z']])
print(arr2[0,0:2])
print(arr2[1,1:2])
print(arr2[:,0:3:2])
arr3=np.array([1,2,3,4],dtype='S')
print(arr3.dtype)

""""
i
b
unsigned integer
f
complex float

"""

