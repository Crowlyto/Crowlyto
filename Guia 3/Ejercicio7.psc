SubProceso tem_media(min,max, media Por Referencia)
	media=(min+max)/2
FinSubProceso
Algoritmo Ejerciocio7
	Definir i, dias como entero
	Definir tempmin, tempmax, medianita como real
	Escribir "Ingrese la cantidad de dias"
	Leer dias
	para i=1 hasta dias Hacer
		Escribir "Ingrese la temperatura minima"
		Leer tempmin
		Escribir "Ingrese la temperatura maxima"
		Leer tempmax
		tem_media(tempmin,tempmax, medianita)
		Escribir "La temperatura media del dia " i " es de ", medianita
		
	FinPara
FinAlgoritmo
