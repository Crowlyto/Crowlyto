//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la funci�n azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cu�ntos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20
Algoritmo Extra4
	Definir vector, i, a, b, c, d Como Entero
	Dimension vector(100)
	a=0
	b=0
	c=0
	d=0
	para i=0 hasta 99 Hacer
		vector(i)=Aleatorio(0,20)
	FinPara
	para i=0 hasta 99 hacer
		si vector(i)<=5 Entonces
			a=a+1
		SiNo
			si vector(i)<=10
				b=b+1
			sino
				si vector(i)<=15
					c=c+1
				SiNo
					d=d+1
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir "La cantidad de alumnos Deficientes es de ",a
	Escribir "La cantidad de alumnos Regulares es de ",b
	Escribir "La cantidad de alumnos Bueno es de ",c
	Escribir "La cantidad de alumnos Excelentes es de ",d
FinAlgoritmo
