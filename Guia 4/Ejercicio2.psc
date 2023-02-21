Algoritmo Ejercicio2
	Dimension calculos(10)
	Definir i, calculos, suma, resta, multi Como Real
	para i=0 hasta 9 hacer
		Escribir "Ingrese un numero para la posicion ", i
		leer calculos(i)
	FinPara
	suma=calculos(0)
	resta=calculos(0)
	multi=calculos(0)
	para i=1 hasta 9 Hacer
		suma=suma+calculos(i)
		resta=resta-calculos(i)
		multi=multi*calculos(i)
	FinPara
	Escribir "La suma es ", suma
	Escribir "La resta es ", resta
	Escribir "la multiplicacion es ", multi
FinAlgoritmo
