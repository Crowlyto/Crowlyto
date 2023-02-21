//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//sus estudiantes:
//	1- Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//	reprueba el curso si tiene una nota final inferior a 6.5
//	2- Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//	3- La mayor nota obtenida en las exposiciones.
//	4- Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//	El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//	las 3 notas y calculará todos informes claves que requiere el docente.
Algoritmo Ejercicio_8
	Definir alum, totalum, nottpi, notex, notparc, notfin, sumafin, notexm Como Real
	Definir cont, cont1, cont2  Como Entero
	sumafin=0
	cont=0
	cont1=0
	cont2=0
	notexm=0
	Escribir "Ingrese la cantida de alumnos"
	Leer totalum
	para alum=1 hasta totalum con paso 1 Hacer
		Escribir "Ingrese la nota del Trabajo Practico Integrador"
		Leer nottpi
		Escribir "Ingrese la nota de la Exposicion"
		leer notex
		Escribir "Ingrese la nota del Parcial"
		Leer notparc
		notfin=(nottpi*0.35)+notex*0.25+(notparc*0.40)
		Si	notfin<6.5  Entonces
			cont=cont+1
			sumafin=sumafin+notfin
		FinSi
		Si nottpi>7.5 Entonces
			cont1=cont1+1
		FinSi
		Si notex>notexm Entonces
			notexm=notex
		FinSi
		Si notparc<=7.5 y notparc>=4 Entonces
			cont2=cont2+1
		FinSi
	FinPara
	si cont<>0 Entonces
		Escribir "La nota promedio de lo alumnos que reprobaron es de: ", sumafin/cont
	SiNo
		Escribir "No hay alumnos reprobados"
	FinSi
	Escribir "El porcentaje de alumnos con un Integrador mayor a 7.5 es de: ", cont1/totalum*100 "%"
	Escribir "La nota mayor en las Exposiciones es de: ", notexm
	Escribir "Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 es de: ", cont2
FinAlgoritmo
