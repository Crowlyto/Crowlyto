//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
//ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
//ceros.
//Por ejemplo, nuestro matriz final debería verse así:
//	111111111111111
//	100000000000001
//	100000000000001
//	100000000000001
//	111111111111111
Algoritmo Extra11
	Definir matriz, i, j Como Entero
	Dimension matriz(5,15)
	Para i=0 hasta 4
		Para j=0 hasta 14
			si i<>0 y i<>4 Entonces
				si j>0 y j<14 entonces
					matriz(i,j)=0
				SiNo
					matriz(i,j)=1
				FinSi
			SiNo
				matriz(i,j)=1
			FinSi
		FinPara
	FinPara
	para i=0 hasta 4 Hacer
		para j=0 hasta 14 Hacer
			Escribir matriz(i,j) sin saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
