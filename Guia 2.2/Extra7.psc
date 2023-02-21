Algoritmo Extra7
	Definir num, suma como entero
	Definir opc Como Caracter
	suma=0
	Hacer
		Escribir "Ingrese un numero"
		Leer num
		suma=suma+num
		Escribir "Desea continuar ingresando numeros S/N"
		leer opc
		opc=Mayusculas(opc)
		
	Mientras Que opc="S"
	Escribir "La suma de los numero ingresado es de: ", suma
	
FinAlgoritmo
