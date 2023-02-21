Algoritmo Extra1
	definir num Como Entero
	Escribir "Ingrese numero a averiguar los divisores"
	Leer num
	Escribir "la suma de los divisores es de: " retorno_sumas(num)
FinAlgoritmo
Funcion suma<-retorno_sumas(numerito)
	Definir suma, i como entero
	suma=0
	para i=1 hasta numerito Hacer
		si numerito mod i=0 Entonces
			suma=suma+i
		FinSi
	FinPara
FinFuncion
