Algoritmo sin_titulo
	Definir num, cont Como Entero
	Escribir "ingrese un NUmero"
	Leer num
	cont=0
	Mientras num<>trunc(num) o num<>abs(num) Hacer
		Escribir "Numero invalio, Ingrese otro numero"
		leer num
	FinMientras
	Si num=0 Entonces
		Escribir "Numero tiene 1 digito"
	SiNo
		
		MIentras num>=1 Hacer
		num=trunc(num/10)
		cont=cont+1
		FinMientras
    Escribir "Numero tiene ", cont " digitos"
	FinSi

FinAlgoritmo
