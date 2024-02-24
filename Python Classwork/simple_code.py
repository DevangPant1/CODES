while True:
    try:
        a=int(input("ENTER A NUMBER:"))
        ans=a*10
    except Exception as e:
        print("ERROR ENTER AN INTEGER")
        print(e)
    else:
        print(ans)
        break  