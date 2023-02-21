//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.
Algoritmo Ejercicio8
	Definir i,j, num, matriz como entero
	Dimension matriz(3,3)
	Escribir "Ingrese 9 valores para la matriz"
	para i=0 hasta 2
		para j=0 hasta 2
			leer num
			matriz(i,j)=num
		FinPara
	FinPara
	para i=0 hasta 2
		para j=0 hasta 2
			Escribir matriz(i,j) " "sin saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
