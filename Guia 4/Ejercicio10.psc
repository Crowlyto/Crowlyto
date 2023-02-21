//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//los resultados por pantalla.
SubProceso asignacion_valores(matriz2 Por Referencia,k,l)
	Definir i, j Como Entero
	para i=0 hasta k-1
		para j=0 hasta l-1
			matriz2(i,j)=Aleatorio(0,20)
			Escribir sin saltar matriz2(i,j) " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
Funcion suma<-suma_matriz(matriz1,p,q)
	Definir suma Como Entero
	Definir i,j Como Entero
	suma=0
	para i=0 hasta p-1
		para j=0 hasta q-1
			suma=suma+matriz1(i,j)
		FinPara
	FinPara
FinFuncion
Algoritmo Ejercicio10
	Definir i, j, matriz, n, m Como Entero
	Escribir "Ingrese el tamaño de la matriz"
	leer n, m
	Dimension matriz(n,m)
	asignacion_valores(matriz,n,m)
	Escribir "La suma de lops valores de la matriz es de " suma_matriz(matriz,n,m)
FinAlgoritmo
