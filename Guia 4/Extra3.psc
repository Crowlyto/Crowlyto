//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.
Algoritmo Extra3
	Definir vector Como Caracter
	Definir vector1, i, n Como Entero
	Escribir "Ingrese el tamaño del vector"
	Leer n
	Dimension vector(n), vector1(n)
	para i=0 hasta n-1 Hacer
		Escribir "Ingrese un nombre"
		leer vector(i)
		vector1(i)=Longitud(vector(i))
	FinPara
	para i=0 hasta n-1 Hacer
		Escribir vector(i) " tiene ",vector1(i) " caracteres"
	FinPara
FinAlgoritmo
