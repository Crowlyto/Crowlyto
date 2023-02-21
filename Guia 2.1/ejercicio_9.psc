Algoritmo ejercicio_9
	definir num, num1 Como Entero
	definir oper Como Caracter
	Escribir "Ingrese el primer Numero"
	Leer num
	Escribir "Ingrese sel segundo numero"
	Leer num1
	Escribir "¿Que operacion desea realizar?"
	leer oper
	oper=Mayusculas(oper)
	
	Segun oper hacer
		"S":
			Escribir "La suma entre los numero es de ",num+num1
		"R":
			Escribir "La resta entre los numero es de ",num-num1
		"M":
			Escribir "La multiplicacion entre los numero es de ",num*num1
		"D":
			Escribir "La division entre los numero es de ",num/num1
	FinSegun
	
	
FinAlgoritmo
