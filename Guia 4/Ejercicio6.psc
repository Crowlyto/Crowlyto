//Disponemos de un vector unidimensional de 20 elementos de tipo car�cter. Se pide
//desarrollar un programa que:
//a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
//Ayuda: utilizar la funci�n Subcadena de PSeInt.
//b) Una vez completado lo anterior, pedirle al usuario un car�cter cualquiera y una
//posici�n dentro del arreglo, y el programa debe intentar ingresar el car�cter en la
//posici�n indicada, si es que hay lugar (es decir la posici�n est� vac�a o es un espacio
//en blanco). De ser posible debe mostrar el vector con la frase y el car�cter ingresado,
//de lo contrario debe darle un mensaje al usuario de que esa posici�n estaba ocupada.
Algoritmo Ejercicio6
	Definir frase, vector, letra como caracter
	Definir i, reem como entero
	Dimension vector(20)
	Escribir "Ingrese una frase de 20 caracteres de largo"
	leer frase
	para i=0 hasta 19 Hacer
		si Subcadena(frase,i,i)="" Entonces
			vector(i)=" "
		SiNo
			vector(i)=Subcadena(frase,i,i)
		FinSi
	FinPara
	Escribir "Ingrese el caracter a agregar en la frase"
	leer letra
	Escribir "Ingrese la posicion donde desea colocarlo"
	Leer reem
	si vector(reem)=" " Entonces
		vector(reem)=letra
	sino 
		Escribir "La posicion solicitada esta ocupada"
	FinSi
	para i=0 hasta 19 Hacer
		Escribir sin saltar vector(i)
	FinPara
FinAlgoritmo
