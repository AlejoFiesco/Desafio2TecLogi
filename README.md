Documentación del endpoint

https://documenter.getpostman.com/view/27902729/2s9Ykrbfg8

Ejercicio

Eres un ladrón profesional que planea robar casas a lo largo de una calle. Cada
casa tiene una cierta cantidad de dinero escondido, la única restricción que te
impide robar en cada una de ellas es que las casas adyacentes tienen sistemas de
seguridad conectados y automáticamente contactará a la policía si dos casas
adyacentes fueron asaltadas en la misma noche.
Dada una matriz de números enteros que representa la cantidad de dinero de
cada casa, devuelve la cantidad máxima de dinero que puedes robar esta noche
sin alertar a la policía.

Ejemplo 1:
Entrada: números = [1,2,3,1]
Salida: 4
Explicación: Roba la casa 1 (dinero = 1) y luego roba la casa 3 (dinero = 3).
Monto total que puedes robar = 1 + 3 = 4.

Ejemplo 2:
Entrada: números = [2,7,9,3,1]
Salida: 12
Explicación: robar casa 1 (dinero = 2), robar casa 3 (dinero = 9) y robar casa 5
(dinero = 1).
Monto total que puedes robar = 2 + 9 + 1 = 12.


Nivel 1
Crear un programa con las siguientes firmas:
// input: Arreglo con cantidad de dinero escondido.
// output: Monto total que puedes robar
public int rob(int[] nums)


Nivel 2
Crear una API REST, hostear esa API en un cloud computing libre (Google App Engine,
Amazon AWS, etc), crear el servicio /rob/ en donde se pueda obtener la cantidad
robada.

El servicio recibirá la información del dinero escondido a través de un HTTP POST con
un payload con el siguiente formato:
POST
/tracking/
{
"money": [2,7,9,3,1]
}

La respuesta, por otro lado, deberá tener la siguiente forma:
RESPONSE CODE: 200
{
"moneyStolen":12
}



