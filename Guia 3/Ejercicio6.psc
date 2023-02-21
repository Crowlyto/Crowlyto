SubProceso intercambio(num1 Por Referencia, num2 Por Referencia)
	Definir aux Como Real
	
	aux = num1
	num1 = num2
	num2 = aux
FinSubProceso

Algoritmo g3e06
	Definir num1, num2 Como Real
	
	Escribir "Ingrese 2 números para intercambiar: "
	Leer num1, num2
	
	intercambio(num1, num2)
	Escribir "Los número intercambiados: " num1 " " num2
FinAlgoritmo
