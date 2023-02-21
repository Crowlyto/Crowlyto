Algoritmo Ejercicio3
	Definir num, prom, cont Como Real
	Escribir "Ingrese un numero"
	Leer num
	cont=0
	prom=0
	Mientras num>-1 Hacer
		prom=prom+num
		cont=cont+1
		Escribir "Ingrese un numero"
		leer num
		
	FinMientras
	prom=prom/cont
	Escribir "El promedio de los numeros ingresado es de: " prom
	
FinAlgoritmo
