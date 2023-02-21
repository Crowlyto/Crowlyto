Algoritmo Ejercicio13
	Definir matriz, i, j, n, suma, cont, cont1,cont2, cont3 Como Entero
	cont=0
	cont1=0
	cont2=0
	cont3=0
	Escribir "Ingrese el tamaño de la matriz cuadrada no mayor a 10"
	Leer n
	Dimension matriz(n,n)
	si n<=10 Entonces
		para i=0 hasta n-1 Hacer
			para j=0 hasta n-1 Hacer
				Escribir "Ingrese un valor de 1 a 9"
				leer matriz(i,j)
				si matriz(i,j)>=1 y matriz(i,j)<=9 Entonces
					Escribir "Dato correcto"
				sino 
					Escribir "Dato incorrecto"
				FinSi
			FinPara
		FinPara
		para i=0 hasta n-1 hacer
			para j=0 hasta n-1 Hacer
				Escribir matriz(i,j) sin saltar 
			FinPara
			Escribir ""
		FinPara
		para i=0 hasta n-1 hacer
			para j=0 hasta n-1 Hacer
				cont=cont+matriz(i,j)
			FinPara
		FinPara
		para j=0 hasta n-1 hacer
			para i=0 hasta n-1 Hacer
				cont1=cont1+matriz(i,j)
			FinPara
		FinPara
		para i=0 hasta n-1 hacer
			cont2=cont2+matriz(i,i)
		FinPara
		para i=0 hasta n-1 hacer
			cont3=cont3+matriz(i,n-1-i)
		FinPara
		para i=0 hasta n-1 Hacer
			si cont=cont1 y cont/n=cont2 y cont2=cont3 Entonces
				Escribir "La suma de fila ", i " es igual a ", cont/n
				Escribir "La suma de colunma ", j " es igual a ", cont1/n
			FinSi
		FinPara
		si cont=cont1 y cont/n=cont2 y cont2=cont3 Entonces
			escribir "La suma de la diagonal principal es ", cont2
			Escribir "La suma de la diagonal secundaria es ", cont3
		SiNo
			Escribir "La matriz no es magica"
		fin si
	SiNo
		
		Escribir "El tamñano de la matriz no es el correcto"
	FinSi
	
FinAlgoritmo
