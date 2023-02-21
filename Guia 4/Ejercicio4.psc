Algoritmo Ejercicio4
	Definir menu Como caracter
	Definir login como logico
	Definir A,B, C, i, num, Avector, Bvector, Cvector, vect como entero
	login=falso
	Hacer
		Escribir "Elija un opcion"
		Escribir "A- Llenar Vector A"
		Escribir "B- Llenar Vector B"
		Escribir "C- Llenar Vector C con la Suma de A+B"
		Escribir "D- Llenar Vector C con la Resta de A-B"
		Escribir "E- ¿Qué Vector desea Mostrar?"
		Escribir "F"
		Leer menu
		menu=Mayusculas(menu)
		Si menu<>"F"
		SiNo
			login=Verdadero
		FinSi
		segun menu Hacer
			"A":
				Escribir "Ingrese el largo del Vector A"
				Leer A
				Dimension Avector(A)
				para i=0 hasta A-1 Hacer
					Avector(i)=Aleatorio(-100, 100)
					Escribir Avector(i)
				FinPara
			"B":
				Dimension Bvector(A)
				para i=0 hasta A-1 Hacer
					Bvector(i)=Aleatorio(-100, 100)
					Escribir Bvector(i)
				FinPara
			"C":
				Dimension Cvector(A)
				para i=0 hasta A-1 Hacer
					Cvector(i)=Avector(i)+Bvector(i)
				FinPara
			"D":
				Dimension Cvector(A)
				para i=0 hasta A-1 hacer
					Cvector(i)=Avector(i)-Bvector(i)
				FinPara
			"E":
				Escribir "Que Vector desea Mostrar"
				Escribir "1-> A"
				Escribir "2-> B"
				Escribir "3-> C"
				Leer vect
				Si vect=1 Entonces
					para i=0 hasta A-1 Hacer
						Escribir Avector(i)
					FinPara
				sino
					si vect=2 entonces
						para i=0 hasta A-1 Hacer
							Escribir Bvector(i)
							
						FinPara
					SiNo
						Para i =0 hasta A-1 Hacer
							Escribir Cvector(i)
						FinPara
					FinSi
				FinSi
		FinSegun
	Mientras Que menu<>"F" y login=falso
FinAlgoritmo

