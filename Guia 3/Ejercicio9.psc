SubProceso cambia_letra(frasecita Por Referencia)
	Definir cont como entero
	Definir letra, frasecita2 Como Caracter
	frasecita2=""
	para cont=0 Hasta Longitud(frasecita) Hacer
		letra=Subcadena(frasecita,cont,cont)
		Segun letra hacer
			"A" o "a":
				letra="@"
			"E" o "e":
				letra="#"
			"I" o "i":
				letra="$"
			"O" o "o":
				letra="%"
			"U" o "u":
				letra="*"
		FinSegun
		frasecita2=concatenar(frasecita2,letra)
	FinPara
	frasecita=frasecita2
FinSubProceso
Algoritmo Ejercicio9
	Definir frase Como Caracter
	Definir long Como Entero
	Escribir "Ingrese la frase"
	Leer frase
	long=Longitud(frase)
	mientras Subcadena(frase,long-1,long-1)<>"."
		Escribir "La frase no termina en punto"
		Escribir "Reingrese la frase"
		leer frase
		long=Longitud(frase)
	FinMientras
	cambia_letra(frase)
	Escribir frase
	FinAlgoritmo
