import random
class card:
    def __init__(self,value,suit):
        self.suit=suit
        self.value=value
    def __str__(self):
        if self.value==1:
            val="ace"
        elif self.value==11:
            val="jack"
        elif self.value==12:
            val="queen"
        elif self.value==13:
            val="king"
        else:
            val=self.value
        return (f"{val} of {self.suit}")

    
class deck:
    def __init__(self):
        self.cards=[]
    def build(self):
        for suit in ["Hearts","Clubs","Diamond","Spades"]:
            for val in range(1,14):
                self.cards.append(card(val,suit))
    def shuffle(self):
        random.shuffle(self.cards)
    def deal(self):
        return(self.cards.pop())
    def __str__(self):
        s=""
        for card in self.cards:
            s+=str(card)+"\n"
        return(s)

class player:
    def __init__(self,name):
        self.hands=[]
        self.name=name
    def info(self):
        print("HELLO! MY NAME IS ",self.name)
    def request(self,n,i):
        for j in range(i):
            self.hands.append(n.deal())
        
    def showcards(self):
        for i in self.hands:
            print(str(i))



cd=deck()
cd.build()
cd.shuffle()
pl1=player("devang")
pl1.request(cd,3)
pl1.showcards()
