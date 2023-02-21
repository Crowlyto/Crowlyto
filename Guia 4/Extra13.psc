//Crear una matriz que contenga 3 columnas y la cantidad  de filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:
Algoritmo Extra13
	Definir matriz,i, j, n Como Entero
	Escribir "Ingrese la cantidad de Filas que desea para la matriz"
	Leer n
	Dimension matriz(n,3)
	para i=0 hasta n-1 hacer
		para j=0 hasta 1 Hacer
			Escribir "Ingrese un valor para " ,i ",", j
			leer matriz(i,j)
		FinPara
	FinPara
	para i=0 hasta n-1 Hacer
		matriz(i,2)=matriz(i,0)+matriz(i,1)
	FinPara
	Para i=0 hasta n-1 Hacer
		para j=0 hasta 2 Hacer
			Escribir matriz(i,j) sin saltar " "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
