Algoritmo Ejercicio7
	Definir frase Como Caracter
	Definir cant, log Como Entero
	Escribir "Ingrese una frase"
	Leer frase
	log = Longitud(frase)
	Para cant = 0 Hasta (log -1) Con Paso 1 Hacer
		Escribir sin saltar " " Subcadena(frase,cant, cant)
	FinPara
FinAlgoritmo
