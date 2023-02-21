Algoritmo ejercicio_6
	Definir not, not1, not2 Como Entero
	Definir log, log1, log2 Como Logico
	Escribir "Ingrese la primera nota"
	Leer not
	Escribir "Ingrese la segunda nota"
	Leer not1
	Escribir "Ingrese la tercer nota"
	Leer not2
	si not >= 1 y not <= 10 Entonces
		log=Verdadero	
	SiNo
		log=Falso
		Escribir "La nota no es valida"
	FinSi
	si not1 >= 1 y not1 <= 10 Entonces
		log1=Verdadero	
	SiNo
		lo1g=Falso
		Escribir "La nota no es valida"
	FinSi
	si not2 >= 1 y not2 <= 10 Entonces
		log2=Verdadero	
	SiNo
		log2=Falso
		Escribir "La nota no es valida"
	FinSi
	Si log=Verdadero y log1=Verdadero y log2=Verdadero
		escribir "Las Notas son validas"
	FinSi
FinAlgoritmo
