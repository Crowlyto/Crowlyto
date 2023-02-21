//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que
//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd".
//	Además, la función calculara el número de intentos que se ha usado para loguearse, tenemos
//		solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso.
Funcion control<- validar_pass(user1, pass1)
	definir control Como Logico
	si user1="usuario1" y pass1="asdasd"
		control=Verdadero
	SiNo
		control=falso
	FinSi
FinFuncion
Algoritmo Extra3
	Definir user, pass Como Caracter
	Definir cont Como Entero
	cont=0
	hacer
	Escribir "Ingrese el usuario"
	Leer user
	Escribir "Ingrese la contraseña"
	Leer pass
	cont=cont+1
	mientras que cont<3 y validar_pass(user, pass)<>Verdadero
	Escribir validar_pass(user, pass)
FinAlgoritmo
