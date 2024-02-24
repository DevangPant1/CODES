import pyttsx3
import speech_recognition as sr
import pyaudio
engine=pyttsx3.init()
def listen():
    r=sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening.....")
        r.pause_threshold=1
        r.adjust_for_ambient_noise(source)
        audio=r.listen(source)
    try:
        print("Recognising..")
        text=r.recognize_google(audio,language="en-in")
        print('User said:',text)
    except:
        print("Unable to recognise text")
        text=None
    return text


def speak(n):
    engine.say(n)
    engine.runAndWait()

listen()
