//Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios. Despu�s,
//	hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//	funci�n debe devolver el resultado de est� validaci�n, para mostrar el mensaje en el algoritmo.
//	Nota: recordar el uso de las variables de tipo l�gico.
Funcion lore<-comparacio_vector(vectorA, vectorB, m)
	definir lore Como Logico
	definir i Como Entero
	i=0
	Hacer
		si vectorA(i)==vectorB(i) Entonces
			lore=Verdadero
		SiNo
			lore=Falso
		FinSi
		i=i+1
	Mientras Que lore=Verdadero y i=m-1
FinFuncion
Algoritmo Ejercicio7
	Definir n, Avector, Bvector, i Como Entero
	Escribir "Ingrese el largo de los vectores"
	leer n
	Dimension Avector(n),Bvector(n)
	para i=0 hasta n-1 Hacer
		Avector(i)=Aleatorio(0,20)
		Bvector(i)=Aleatorio(0,20)
		Escribir Avector(i)
		Escribir Bvector(i)
	FinPara
	Escribir comparacio_vector(Avector,Bvector,n)
FinAlgoritmo
