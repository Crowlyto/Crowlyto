Algoritmo Extra2
	Definir num, num1, may, men, i, suma Como Entero
	suma=0
	Hacer
		Escribir "Ingrese 2 numero Diferentes"
		leer num,num1
	Mientras Que num=num1
	si num>num1 Entonces
		may=num
		men=num1
	SiNo
		may=num1
		men=num
	FinSi
	para i<-men Hasta may con paso 1
		suma=suma+i
	FinPara
	Escribir "La suma entres los numeros que estan entre ",num " y ", num1 " es de ", suma
	
	
	
	
	
FinAlgoritmo
