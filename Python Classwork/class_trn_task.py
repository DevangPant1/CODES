class DOG:
    
    
    
    def __init__(self,nm,bd):
        self.name=nm
        self.breed=bd
        self.tricks=[]

    def add_tricks(self,new_tricks):
        
        self.tricks.extend(new_tricks)

    def show_tricks(self):
        print("I AM ",self.name," of ",self.breed," breed")
        print('I CAN',end=" ")
        for i in self.tricks:
            print(i,end=",")
        print("tricks.")

a=DOG("GUnner","Beegle")
a.add_tricks(["Rollover","Jump","Talk"])
a.show_tricks()

"""
Make a Bankaccount class which has two instance attribute name and balance
It has showbalance , deposit, withdraw methods.
"""