//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con
//	decimales
Funcion conver<-carac_numer(cadenita)
	definir conver Como Entero
	conver=ConvertirANumero(cadenita)
FinFuncion
Algoritmo Extra2
	Definir caden Como Caracter
	Definir long Como Entero
	Hacer
		Escribir "Ingrese un numero de hasta 3 cifras"
		Leer caden
		long=Longitud(caden) 
	Mientras Que  long>3
	Escribir carac_numer(caden)
	FinAlgoritmo
