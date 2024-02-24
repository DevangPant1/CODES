try:
    a=int(input("ENTER A NUMBER"))
except:
    print("PLS ENTER VALID INTEGER")
else:
    print(a*5)




a=[1,2,3,4,45,6]
try:
    print(f"THE SECOND VALUE:{a[1]}")
    print(f"THE THIRD VALUE:{a[8]}")
except IndexError:
    print("LIST INDEX OUT OR RANGE")
except Exception as e:
    print(e)
else:
    print("DONE")


