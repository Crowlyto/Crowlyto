//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.
Algoritmo Ejercicio12
	Definir matriz, palabra Como Caracter
	definir i, j, cont Como Entero
	Dimension matriz(3,3)
	cont=0
	Hacer
		Escribir "Ingrese una palabra de 9 letras"
		leer palabra
	Mientras Que Longitud(palabra)<8
	para i=0 hasta 2
		para j=0 hasta 2
			matriz(i,j)=subcadena(palabra,cont,cont)
			cont=cont+1
			Escribir sin saltar matriz(i,j) " "
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
