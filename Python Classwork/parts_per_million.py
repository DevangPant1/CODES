import math

def converter(num):
    num=num*math.pow(10,6)
    return num
while True:

    try:
        print(converter(int(input("ENTER MG VALUE="))))
        break
    
    except Exception as r:
        print("PLEASE ENTER VALID VALUE")