#single inheritance
class a:
    def __init__(self):
        self.var1=0
        self.var2=3
    def printobject(self):
        print(self.var1,self.var2)
class b(a):
    def __init__(self):
        super().__init__()
        self.v1=0
        self.v2=0
    def printobject(self):
        print(self.v1,self.v2)
        super().printobject()

obj=a()
obj1=b()
obj.printobject()
obj1.printobject()