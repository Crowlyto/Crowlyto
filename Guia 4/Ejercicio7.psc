//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//	hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//	función debe devolver el resultado de está validación, para mostrar el mensaje en el algoritmo.
//	Nota: recordar el uso de las variables de tipo lógico.
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
