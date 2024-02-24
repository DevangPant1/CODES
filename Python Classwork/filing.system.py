#file path and file name is required
#file extension
#file mode----- read(r),write(w),append(a),create(c)



#steps to write file
# opening, manipulating,closing
"""
new=open("check.txt","w")
new.write("ELLO ")
new.close()


new=open("check.txt","a")
new.write("bye"+"\n")
new.write("Hello")
new.close()"""

"""f=open("check.txt","r")
# read mode uses a system of cursor
#d=f.read()  # when read functions reads the file cursor reaches at the end of file.
#print(d)
d=f.read(5)
print(d)
d=f.read(5)
print(d)
f.close()"""

"""with open("check.txt","r") as f:
    data=f.readline()
    print(data)
    data=f.readline()
    print(data)"""

with open("check.txt","r") as f:
    data=f.readlines()
    print(data)

for i in data:
    print(i)
