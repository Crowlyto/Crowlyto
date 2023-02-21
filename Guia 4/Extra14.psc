//Realizar un programa que permita visualizar el resultado del producto de una matriz de
//enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden
//inicializarse evitando así el ingreso de datos por teclado.
Algoritmo Extra14
	Definir matriz, vector,vector1, i, j, k, resultado Como Entero
	Dimension matriz(3,3), vector(3), vector1(3)//Tiene que ser una matriz de 3x1 la resultante
	resultado=0
	para i=0 hasta 2 Hacer
		vector(i)=Aleatorio(0,5)
		para j=0 Hasta 2 Hacer
			matriz(i,j)=Aleatorio(0,5)
		FinPara
	FinPara
	Para i=0 hasta 2 Hacer
		resultado=0
		para j=0 hasta 2 Hacer
			resultado=resultado+vector(j)*matriz(i,j)
		FinPara
		vector1(i)=resultado
		
	FinPara
	para i=0 hasta 2 Hacer
		Escribir vector(i) Sin Saltar " "
	FinPara
	Escribir ""
	Escribir ""
	para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			Escribir matriz(i,j) Sin Saltar " "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	para i=0 hasta 2 Hacer
		para k=0 hasta 0 hacer
			Escribir vector1(i)
		FinPara
	FinPara
FinAlgoritmo
