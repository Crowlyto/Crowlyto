Algoritmo Ejercicio3
	Definir num, num1 Como Entero
	Escribir "MULTIPLOS"
	Escribir "Ingrese el Primer Numero"
	Leer num
	Escribir "Ingrese el Segundo Numero"
	Leer num1
	Escribir Es_multiplo(num, num1)
FinAlgoritmo
Funcion multiplo <- Es_Multiplo(uno, dos)
	Definir multiplo Como Logico
	multiplo=(uno mod dos ==0)
FinFuncion
	