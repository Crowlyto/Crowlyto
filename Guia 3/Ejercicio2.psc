Algoritmo Ejercicio2
	Definir num Como Entero
	Escribir "PROGRAMA PAR/IMPAR"
	Escribir "Ingrese un numero"
	leer num
	Escribir "Es ", par_impar(num)
FinAlgoritmo
Funcion par <- par_impar(numerito)
	Definir par Como logico
	si numerito mod 2=0 Entonces
		par=Falso
	SiNo
		par=Verdadero
	FinSi
FinFuncion
	