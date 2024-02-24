class quadrilateral:
    def __init__(self,a,b,c,d):
        self.a=a
        self.b=b
        self.c=c
        self.d=d
    def perimeter(self):
        perimeter=self.a+self.b+self.c+self.d
        return perimeter

obj=quadrilateral(3,4,5,6)

class rectangle(quadrilateral):
    def __init__(self,a,b):
        super().__init__(a,b,a,b)

    def area(self):
        return self.a*self.b

class square(rectangle):
    def __init__(self,a):
        super().__init__(a,a)

sq=square(2)
print(sq.area())
print(sq.perimeter())