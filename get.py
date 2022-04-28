import requests 
  
response = requests.get('http://www.boredapi.com/api/activity?type=recreational&#39') 
  
body = response.json()
print(body) 
print(response.headers) 

cuerpo = open("cuerpo.txt", "w")
cuerpo.write(str(body))
cuerpo.close()

encabezado = open("encabezado.txt", "w")
encabezado.write(str(response.headers))
encabezado.close()