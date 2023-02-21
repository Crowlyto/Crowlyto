//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
Algoritmo Ejercicio9
	definir matriz, i,j, num, cont Como Entero
	Dimension matriz(5,5)
	cont=0
	para i=0 hasta 4
		para j=0 hasta 4
			matriz(i,j)=Aleatorio(0,25)
			Escribir sin saltar matriz(i,j) " "
		FinPara
		Escribir ""
	FinPara
	Escribir "Ingrese el valor a buscar en la matriz"
	leer num
	para i=0 hasta 4
		para j=0 hasta 4
			si num=matriz(i,j) Entonces
				Escribir "El numero esta en la fila ",i+1 " columna ",j+1
				cont=cont+1
			FinSi
		FinPara
	FinPara
	si cont=0 Entonces
		Escribir "No se encontro el valor dentro de la matriz"
	FinSi
FinAlgoritmo
