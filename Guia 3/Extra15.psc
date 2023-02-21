Funcion retorno<-suma_par(numerito)
Definir retorno Como Entero
retorno=0
Si numerito=2 Entonces
	retorno=2
SiNo
	retorno=suma_par(numerito-2)+numerito
FinSi
FinFuncion
Algoritmo Extra15
	Definir num Como Entero
	Escribir "Ingrese un numero par positivo"
	Leer num
	si (num mod 2 <>0) o num<=0 Entonces
		Escribir "EL numero ingresado no cumple con las condiciones"
	SiNo
		Escribir "El resultado de la operacion es ", suma_par(num)
	FinSi
FinAlgoritmo