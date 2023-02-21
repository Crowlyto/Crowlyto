//Escribir una función recursiva que devuelva la suma de los primeros N enteros.
Funcion suma<-sumas_sucesivas(numerito)
	Definir suma Como Entero
	suma=0
	si numerito=0 o numerito=1 Entonces
		suma=numerito
	SiNo
		suma=sumas_sucesivas(numerito-1)+numerito
	FinSi
FinFuncion
Algoritmo Ejercicio10
	Definir num Como Entero
	Escribir "Ingrese la cantidad de numeros a sumar"
	Leer num
	Escribir "El resultado es: ", sumas_sucesivas(num)
FinAlgoritmo
