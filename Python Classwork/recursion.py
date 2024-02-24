#recursion is where a function call itself

num=100

def factorial(a):
    if a==1:
        return(1)
    else:
        return a*factorial(a-1)

def fibonacci(num):
    if num<=1 :
        return num
    else:
        return (fibonacci(num-1)+fibonacci(num-2))




def fact(num):
    if num==1:
        return 1
    else:
        return(num*factorial(num-1))

print(fact(52))
