Algoritmo Ejercicio7

//	Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//	N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//	Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//	sus estudiantes:
//	§ Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//	reprueba el curso si tiene una nota final inferior a 6.5
//	§ Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//	§ La mayor nota obtenida en las exposiciones.
//	§ Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//	El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//	las 3 notas y calculará todos informes claves que requiere el docente.
	
	definir alu,talu, contNFRep, contTPIM, ContParc Como Entero
	Definir not1, not2, nto3, notf, NFRep, MExp Como Real
		
	Escribir "Ingresar cantidad de alumnos:"
	leer talu
	alu=1
	contNFRep=0
	NFRep=0
	contTPIM=0
	MExp=0
	ContParc=0
	para alu<-1 Hasta talu Con Paso 1
		Escribir "Alumno ",alu
		Escribir "Nota TP Integrador: "
		leer not1
		Escribir "Nota Exposición:"
		Leer not2
		Escribir "Nota Parcial: "
		leer not3
		// 1
		notf=not1*0.35+not2*0.25+not3*0.4
		si nof<6.5 Entonces
			NFRep=NFRep+notf
			contNFRep=contNFRep+1
		finsi
		// 2
		si not1>7.5 Entonces
			contTPIM=contTPIM+1
		FinSi
		// 3
		si Not2>MExp Entonces
			MExp=not2
		FinSi
		// 4
		si not3>=4.0 y not3<=7.5 Entonces
			ContParc=ContParc+1
		FinSi
	FinPara
	
	Escribir "1. La nota promedio final de los alumnos que reprobaron es de ",NFRep/contNFRep
	Escribir "2. El porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 es del ",contTPIM/talu*100," %"
	Escribir "3. La mayor nota obtenida en las exposiciones es un ", MExp
	Escribir "4. Los estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 son ", ContParc
	
FinAlgoritmo