//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el valor
//más grande del vector.Algoritmo Ejercicio5
funcion mayor<-busca_may(maxi)
	Definir mayor Como Entero
	mayor=0
	si maxi>mayor Entonces
		mayor=maxi
	FinSi
FinFuncion
Algoritmo Ejercicio5
	Definir i, vector, n, num, may como entero
	Escribir "Ingrese el largo del Vector"
	Leer n
	may=0
	DImension vector(n)
	para i=0 hasta n-1 Hacer
		Escribir "Ingrese un valor"
		leer num
		may=busca_may(num)
	FinPara
	Escribir may
FinAlgoritmo
