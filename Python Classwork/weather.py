import requests 
from bs4 import BeautifulSoup
import html5lib
rsp=requests.get('https://weather.com/en-IN/weather/today/l/28.62,77.22?par=apple_widget')
soup=BeautifulSoup(rsp.content,'html5lib')
center_name=soup.find('h1',attrs={'class':'CurrentConditions--location--kyTeL'}).text
time=soup.find('span',attrs={'class':'CurrentConditions--timestamp--23dfw'}).text
air_quality=soup.find('text',attrs={'class','DonutChart--innerValue--2rO41 AirQuality--innerValueLowerTextSize--aU9mh'}).text
comment=soup.find('span',attrs={'class':'AirQualityText--severity--1fu5k'}).text
detail=soup.find('p',attrs={'class','AirQualityText--severityText--1wT_O'}).text
pollen=soup.find('p',attrs={'class':'HealthActivitiesListItem--description--Y22Rw'}).text
wind=soup.find('span',attrs={'class','Wind--windWrapper--3aqXJ undefined'}).text
with open('weather.csv','w') as wt:
  wt.write(center_name)
  wt.write(time)