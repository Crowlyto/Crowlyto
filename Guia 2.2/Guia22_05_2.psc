Algoritmo Ejercicio5Guia2B
	//Escribir un programa que lea n�meros enteros hasta teclear 0 (cero). Al finalizar el
	//programa se debe mostrar el m�ximo n�mero ingresado, el m�nimo, y el promedio de
	//todos ellos.

	Definir num, mayor, menor, suma, i como Entero
	suma = 0
	i = 0
	
	Escribir "Ingrese un n�mero (0 para cortar el ingreso): "
	Leer num	
	menor = num
	mayor = num
	
	Si num <> 0
			Hacer
				i = i + 1		
				suma = suma + num		
				Si num > mayor y num<> 0 Entonces
					mayor = num
				FinSi
				Si num < menor y num<> 0 Entonces
					menor = num
				FinSi
				Escribir "Ingrese un n�mero (0 para cortar el ingreso): "
				Leer num
			Mientras que num <> 0
			Escribir "El n�mero mayor es: " mayor
			Escribir "El n�mero menor es: " menor
			Escribir "El Promedio es: " suma/i
		FinSi
		
	FinAlgoritmo
