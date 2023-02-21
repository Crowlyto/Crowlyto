Algoritmo Ejercicio_8
	definir frase Como Caracter
	definir long Como Entero
	Escribir "Ingrese una frase o palabra"
	Leer frase
	frase=Mayusculas(frase)
	long=longitud(frase)
	Si SubCadena(frase,0,0)== SubCadena(frase,long-1,long-1) Entonces
		Escribir "Correcto"
	SiNo
		Escribir "incorrecto"
	FinSi
FinAlgoritmo
