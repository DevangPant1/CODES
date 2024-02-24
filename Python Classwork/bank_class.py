class bankaccount:
    def __init__(self,n,b):
        self.name=n
        self.balance=b
    def withdraw(self):
        a=int(input("HOW MUCH MONEY DO YOU WANT TO WITHDRAW:"))
        self.balance-=a
    def deposit(self):
        a=int(input("HOW MUCH MONEY DO YOU WANT TO DEPOSIT:"))
        self.balance+=a


b=input("HELLO! PLS ENTER NAME TO CONTINUE:")
c=int(input("PLS ENTER BANK BALANCE:"))
user=bankaccount()