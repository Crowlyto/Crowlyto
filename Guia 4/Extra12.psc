//Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.

Algoritmo Extra12
	Definir matriz, matriz1,matriz2, i, j, k, l Como Entero
	Dimension matriz(3,3)
	Dimension matriz1(3,3)
	Dimension matriz2(3,3)
	Para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			matriz(i,j)=Aleatorio(0,5)
			matriz1(i,j)=Aleatorio(0,5)
		FinPara
	FinPara
	Para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			Escribir matriz(i,j) sin saltar " " 
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	Para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			Escribir matriz1(i,j) sin saltar " " 
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			matriz2(i,j)=0
			para k=0 hasta 2 Hacer
				matriz2(i,j)=matriz2(i,j)+matriz(i,k)*matriz1(k,j)
			FinPara
		FinPara
	FinPara
	para i=0 hasta 2 Hacer
		para j=0 Hasta 2 Hacer
			Escribir matriz2(i,j) sin saltar " "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
