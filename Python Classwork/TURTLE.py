import turtle
import time 
screen=turtle.Screen()
screen.bgcolor("black")
screen.title("GAME")
screen.setup(600,600)

sprite=turtle.Turtle()
sprite.shape("square")
sprite.color("red")
sprite.speed(0)
sprite.goto(0,0)
sprite.penup()
sprite.direction="up"

def move():
    if sprite.direction=="up":
        sprite.sety(sprite.ycor()+20)
    if sprite.direction=="down":
        sprite.sety(sprite.ycor()+20)
    if sprite.direction=="left":
        sprite.setx(sprite.xcor()-20)
    if sprite.direction=="right":
        sprite.setx(sprite.xcor()+20)

while True:
    move()
    

turtle.done()