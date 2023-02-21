//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.
Algoritmo Ejercicio5
	Definir num, prom, min, max, cont Como Real
	cont=0
	prom=0
	max=0
	min=0
	hacer 
		Escribir "Ingrese un numero"
		Leer num
		si num<>0 Entonces
			cont=cont+1
		FinSi
		prom=prom+num
		si num>max Entonces
			max=num
			
		FinSi
		si min=0 Entonces
			min=num
		SiNo
			si num<min y num<>0 Entonces
				min=num
			FinSi
		FinSi
					
	Mientras Que num<>0
	Escribir "El numero máximo es " max, " El número mínimo es " min, " El promedio es " (prom/cont)

	
FinAlgoritmo
