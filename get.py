import requests

url="http://www.boredapi.com/api/activity?type=recreational&#39"

r = requests.get(url)
data = r.text
print(data)

import os
file = open("filename.txt", "w")
file.write({"activity":"Learn and play a new card game","type":"recreational","participants":1,"price":0,"link":"https://www.pagat.com","key":"9660022","accessibility":0} + os.linesep)
file.write("Segunda línea")
file.close()