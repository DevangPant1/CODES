lyrics="""First things first
I'mma say all the words inside my head
I'm fired up and tired of the way that things have been, oh ooh
The way that things have been, oh ooh

Second things second
Don't you tell me what you think that I could be
I'm the one at the sail, I'm the master of my sea, oh ooh
The master of my sea, oh ooh

I was broken from a young age
Taking my sulking to the masses
Writing my poems for the few
That look at me, took to me, shook to me, feeling me
Singing from heartache from the pain
Taking my message from the veins
Speaking my lesson from the brain
Seeing the beauty through the...

Pain!
You made me a, you made me a believer, believer
Pain!
You break me down, you build me up, believer, believer
Pain!
Oh let the bullets fly, oh let them rain
My life, my love, my drive, it came from...
Pain!
You made me a, you made me a believer, believer

Third things third
Send a prayer to the ones up above
All the hate that you've heard has turned your spirit to a dove, oh ooh
Your spirit up above, oh ooh

I was choking in the crowd
Building my rain up in the cloud
Falling like ashes to the ground
Hoping my feelings, they would drown
But they never did, ever lived, ebbing and flowing
Inhibited, limited
Till it broke open and rained down
It rained down, like...

Pain!
You made me a, you made me a believer, believer
Pain!
You break me down, you build me up, believer, believer
Pain!
Oh let the bullets fly, oh let them rain
My life, my love, my drive, it came from...
Pain!
You made me a, you made me a believer, believer

Last things last
By the grace of the fire and the flames
You're the face of the future, the blood in my veins, oh ooh
The blood in my veins, oh ooh
But they never did, ever lived, ebbing and flowing
Inhibited, limited
Till it broke open and rained down
It rained down, like...

Pain!
You made me a, you made me a believer, believer
Pain!
You break me down, you build me up, believer, believer
Pain!
Oh let the bullets fly, oh let them rain
My life, my love, my drive, it came from...
Pain!
You made me a, you made me a believer, believer

"""



new_lyrics=""
punc=",.!"
for char in lyrics:
  if not char in punc:
    new_lyrics+=char
  else:
    new_lyrics+=" "

lyrics_l=new_lyrics.lower().split()
freq=dict.fromkeys(lyrics_l,0)
print(freq)

for i in lyrics_l:
  freq[i]+=1
print(freq)