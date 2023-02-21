Algoritmo Ejercicio13nuevo
	Definir matriz, vector, i, j, c como entero
	definir log Como Logico
	Dimension matriz(3,3)
	Dimension vector(8)
	log=Verdadero
	c=0
	para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			matriz(i,j)=Aleatorio(1,9)
			Escribir matriz(i,J) " "Sin Saltar
		FinPara
		Escribir ""
	FinPara
	para i=0 hasta 7 Hacer
		vector(i)=0
	FinPara
	para i=0 hasta 2 Hacer
		c=c+1
		para j=0 hasta 2 Hacer
			vector(c)=vector(c)+matriz(i,j)
			vector(c+3)=vector(c+3)+matriz(j,i)
		FinPara
	FinPara
	para i=0 hasta 2 Hacer
		vector(6)=vector(6)+matriz(i,i)
		vector(7)=vector(7)+matriz(i,2-i)
	FinPara
	i=0
	mientras log=Verdadero y i<7 Hacer
		si vector(i)<>vector(i+1) Entonces
			log=falso
		FinSi
		i=i+1
	FinMientras
	Si log=Verdadero Entonces
		Escribir "La matriz es magica"
	SiNo
		Escribir "La matriz no es magica"
	FinSi
FinAlgoritmo
