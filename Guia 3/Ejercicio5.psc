//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
Algoritmo Ejercicio5
	Definir num Como Entero
	Escribir "Ingrese un Numero"
	leer num
FinAlgoritmo
funcion numerito<-es_primo(chancla)
	Definir aux Como Entero
	Definir numerito Como caracter
	numerito="Es Primo"
	para aux=2 hasta chancla-1 Hacer
		si chancla mod aux=0 Entonces
			numerito="No es Primo"
		FinSi
	FinPara
FinFuncion
	