#special functions are those which start with __ and end with __
class student:
    name="DEVANG"
    age=14
    def __eq__(self, __o: object):
        pass
    def __init__(self,name,age):
        self.name=name
        self.age=age

    def increase_age(self):
        self.age+=5

d=student("DEVANG",19)
g=student("gg",9)

print(g.age)
g.increase_age()
print(g.age)

