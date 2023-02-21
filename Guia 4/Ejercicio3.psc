Algoritmo Ejercicio3
	Definir N, i, busqueda, num como enteros
	Definir log como logico
	log=Falso
	Escribir "Ingrese el tamaño del arreglo"
	leer N
	Dimension busqueda(N)
	Para i=0 hasta N-1 Hacer
		Escribir "Ingrese un numero"
		leer busqueda(i)
	FinPara
	Escribir "Ingrese el valor a buscar"
	leer num
	para i=0 hasta N-1 Hacer
		si busqueda(i)=num Entonces
			Escribir "EL numero se encuentra en la posicion ", i
			log=Verdadero
		FinSi
	FinPara
	si log=Falso Entonces
		Escribir "No se encuentra el valor"
	FinSi
FinAlgoritmo
