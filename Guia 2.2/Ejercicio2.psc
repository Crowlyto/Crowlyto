//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
Algoritmo Ejercicio2
	Definir num, limite, sum Como Entero
	Escribir "Ingrese el limite deseado"
	Leer limite
	Escribir "Ingrese numero a sumar"
	Leer num
	sum=num
	Mientras limite>sum Hacer
		Escribir "Ingrese otro valor"
		Leer num	
		sum=sum+num
	FinMientras
	Escribir "Se supero el limite del numero inicial"
	
	
FinAlgoritmo
