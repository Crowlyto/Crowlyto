//Realizar un procedimiento que permita realizar la división entre dos números y muestre el
//cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//	50 ? 13 = 37 una resta realizada
//	37 ? 13 = 24 dos restas realizadas
//	24 ? 13 = 11 tres restas realizadas
//	
SubProceso resta_sucesiva(uno Por Referencia,dos Por Referencia)
	Definir cont Como Entero
	cont=0
	Si uno>dos
	Hacer 
		uno=uno-dos
		cont=cont+1
	Mientras Que uno>=dos
	dos=cont
	SiNo
		dos=0
		uno=uno
	finsi
FinSubProceso
Algoritmo Ejercicio8
	Definir num, num1 Como Entero
	Escribir "Ingrese numero a dividir"
	Leer num
	Escribir "Ingrese el divisor"
	leer num1
	resta_sucesiva(num,num1)
	Escribir "El cociente es " ,num1 " y el residuo es ", num
FinAlgoritmo
