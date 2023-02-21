Algoritmo sin_titulo
	
	Definir tablero como Cadena
	Dimension tablero[9, 12]
	inicializarMatriz(tablero, 9, 12)


	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)

	
	acomodarPalabra(tablero)

	imprimirMatriz(tablero, 9, 12)
	
FinAlgoritmo

//subprograma inicializarMatriz:
//	Debe recibir como parámetros la matriz a inicializar, la cantidad de filas y la cantidad de
//	columnas.
//	En primera instancia inicializaremos la matriz con un "*" (asterisco) en cada lugar para que
//		la misma no esté vacía y no tengamos problemas.


SubProceso inicializarMatriz(matriz, f, c)

	Definir i, j Como Entero
	
	Para i=0 Hasta f-1 
		Para j=0 hasta c-1
			matriz[i,j]="*"
		FinPara
	FinPara
	
FinSubProceso

	
	
//subprograma imprimirMatriz:
//	Debe recibir como parámetros la matriz a imprimir, la cantidad de filas y la cantidad de
//	columnas.
//	Para que veamos la matriz en la consola cuando lo necesitemos.
//		Tengamos en cuenta que para que no queden pegadas las letras vamos a imprimir un
//			espacio, la letra y otro espacio. Lo hacemos en imprimir para no modificar el contenido de la
	//				matriz.
	
SubProceso imprimirMatriz(matriz, f, c)
	
	Definir i, j Como Entero
	
	Para i=0 Hasta f-1
		Para j=0 hasta c-1
			Escribir Sin Saltar matriz[i,j], " " 
		FinPara
		Escribir""
	FinPara
		
FinSubProceso


//subprograma agregarPalabra:
//	Se le debe indicar en los parámetros la matriz donde se va a agregar la palabra, la fila en la
//	que se agregará y la propia palabra. Una vez el subprograma reciba eso debe descomponer
//	la palabra y agregarla a la matriz en la posición deseada.

SubProceso agregarPalabra(matriz, palabra, f)
	
	Definir i, j Como Entero
	
	Para i=f hasta f
		Para j=0 Hasta Longitud(palabra)-1
			matriz[i,j]=subcadena(palabra, j, j)
		FinPara
	FinPara
	
FinSubProceso

//subprograma buscarR:
//	Se le debe indicar la matriz donde se buscará la letra R y el número de fila en el que
//	buscaremos.
//	Debe comparar cada letra de la fila indicada hasta que encuentre la primera letra ?R?. Ahí
//	debe devolvernos la posición de ?R?.
//Nota: cuidado! debe devolver la posición de la primera R solamente.


Funcion retorno <- buscarR(matriz, f)
	
	Definir i, j, retorno Como Entero
	
	Para i=f hasta f
		Para j=0 Hasta 11
			Si matriz[i,j]="r"
				retorno=j
				j=11
			FinSi
			
		FinPara
	FinPara
	
FinSubProceso

//subprograma acomodarPalabra:
//	Se le debe indicar sólo la matriz en donde se acomodarán las palabras.
//	Ahora debemos crear una lógica que nos permita mover las palabras de las filas. Recordar
//	que podemos llamar a buscarR para saber cuántos espacios hay que mover las palabras.
//		Una vez que las palabras se muevan hay que llenar los espacios con asteriscos
//	nuevamente: es decir, si la palabra se mueve dos posiciones a la derecha hay que agregar
//			dos asteriscos a la izquierda de la fila.
//		Nota: ¡recuerden que la primera letra ?R? debe quedar en la posición 5 de la matriz!


SubProceso acomodarPalabra(matriz)
	Definir i, j, correr Como Entero
	
	
	
	Para i=0 Hasta 8
		correr=5-buscarR(matriz, i)
		
		Para j=11 Hasta correr
			matriz[i,j]=matriz[i,j-correr]
		FinPara
		
		Si correr>0
			Para j=0 Hasta correr-1
			matriz[i,j]="*"
			FinPara
		FinSi
		
	FinPara

	

	
	
	
	
FinSubProceso

	