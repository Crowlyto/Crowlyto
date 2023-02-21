//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//subproceso para imprimir la matriz.
SubProceso rellenar_matriz(matriz1, p, p)
	Definir i, j como entero
	para i=0 hasta p-1
		para j=0 Hasta p-1
			si i=j Entonces
				matriz1(i,j)=0
			SiNo
				matriz1(i,j)=Aleatorio(1,9)
			FinSi
		FinPara
	FinPara
FinSubProceso
SubProceso muestra_matriz(matriz2, k, k)
	Definir i, j como entero
	para i=0 hasta k-1
		para j=0 hasta k-1
			Escribir matriz2(i,j) " " Sin Saltar 
		FinPara
		Escribir ""
	FinPara
FinSubProceso
Algoritmo Ejercicio11
	Definir matriz,n Como Entero
	Escribir "Ingrese un valor para el tamaño de la matriz cuadrada"
	leer n
	Dimension matriz(n,n)
	rellenar_matriz(matriz, n,n)
	muestra_matriz(matriz, n,n)
FinAlgoritmo
