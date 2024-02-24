class complexnumer:
    def __init__(self,real,imag):
        self.real=real
        self.imag=imag
    def __add__(self,other):
        r=self.real+other.real
        i=self.imag+other.imag
        return complexnumer(r,i)
        
    def __str__(self):
        if self.imag<0:
            return (f"{self.real}i{self.imag}")
        elif self.imag==0:
            (f"{self.real}")
        elif self.imag>0:
            return(f"{self.real} + i{self.imag}")
        elif self.real==0:
            (f"i{self.imag}")

    def __sub__(self,other):
        r=self.real-other.real
        i=self.imag-other.imag
        return(complexnumer(r,i))

    def __abs__(self):
        m=((self.real)**2+(self.imag)**2)**0.5
        return m


    def __mul__(self,other):
        product_real=((self.real*other.real)-(self.imag*other.imag)) 
        product_imag=(self.real*other.imag)+(self.imag*other.real) 
        return(complexnumer(product_real,product_imag))

    def __eq__(self,other):
        m1=abs(self)
        m2=abs(other)
        return m1==m2

    def __ge__(self,other):
        m1=abs(self)
        m2=abs(other)
        return m1>=m2


s=complexnumer(3,4)
c=complexnumer(4,5)
print(s>=c)



"""
operator overloadling

__add__
__sub__
__mul__
__truediv__
__floordiv__
__mod__
__pow__


==  __eq__
<   __lt__
<=  __le__
>   __gt__
>=  __ge__
!=  _ne_


"""