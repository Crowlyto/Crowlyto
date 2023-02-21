//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//función Subcadena().
Algoritmo Ejercicio4
	Definir frase, letra Como Caracter
	Escribir "Ingrese una frase"
	Leer frase
	Escribir "Ingrese letra a buscar"
	leer letra
	Escribir busqueda(frase,letra)
FinAlgoritmo
Funcion cantidad<-busqueda(frasecita, letrita)
	Definir cantidad, largo, aux Como Entero
	cantidad=0
	largo= Longitud(frasecita)
	Para aux= 0 Hasta largo Hacer
		Si letrita ==Subcadena(frasecita,aux,aux) Entonces
			cantidad=cantidad+1
		FinSi
	FinPara
FinFuncion
	