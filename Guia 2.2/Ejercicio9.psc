//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree un
//cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:

Algoritmo Ejercicio9
	Definir aster, lado, espacio Como Entero
	Escribir "Ingrese el tama�o de lado: "
	leer aster
	lado=aster
	Para aster <-1 Hasta lado-1 con paso 1
		escribir "* " Sin Saltar
	FinPara
	Escribir "*"
	Para aster <-1 hasta lado-2 Con Paso 1
		Escribir "*  " Sin Saltar
		para espacio<-1 Hasta lado-2 Con Paso 1
			Escribir " " sin saltar
		FinPara
		Escribir " *" 
	FinPara
	para aster<-1 Hasta lado-1 Con Paso 1
		Escribir "* " Sin Saltar
	FinPara
	Escribir "*"
FinAlgoritmo
