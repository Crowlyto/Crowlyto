//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.
Algoritmo Extra2
	Definir vector, n, i, suma como entero
	suma=0
	Escribir "Ingrese el tamaño del vector"
	leer n
	Dimension vector(n)
	Para i=0 hasta n-1 Hacer
		Escribir "Ingrese un valor"
		leer vector(i)
		suma=suma+vector(i)
	FinPara
	Escribir "El promedio de la suma de los valores es de ",suma/n
FinAlgoritmo
