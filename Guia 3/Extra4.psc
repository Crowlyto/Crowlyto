//Los empleados de una fábrica trabajan en dos turnos: Diurno y Nocturno. Se desea calcular el
//jornal diario de acuerdo con las siguientes reglas:
//	a) La tarifa de las horas diurnas es de $ 90
//	b) La tarifa de las horas nocturnas es de $ 125
//	c) En caso de ser feriado, la tarifa se incrementa en un 10% si el turno es diurno y en
//	un 15% si el turno es nocturno.
//	El programa debe solicitar la siguiente información al usuario: el nombre del trabajador, el día
//	de la semana, el turno (diurno o nocturno) y la cantidad de horas trabajadas. Además,
//	debemos preguntarle al usuario si el día de la semana (lunes, martes, miércoles, etc.) era
//	festivo o no, para poder calcular el jornal diario. Utilice una función para realizar el cálculo.
funcion calculo<-jornal_diario(turnito, festivo, horitas)
	Definir calculo Como Real
	si turnito="D"
		si festivo="S"
			calculo=horitas*90*1.10
		SiNo
			calculo=horitas*90
		FinSi
	SiNo
		si festivo="S"
			calculo=horitas*125*1.15
		SiNo
			calculo=horitas*125
		FinSi
	FinSi
FinFuncion
Algoritmo sin_titulo
	Definir nom, dia, turno, festi Como Caracter
	Definir horas Como Real
	Escribir "Ingrese Nombre"
	Leer nom
	Escribir "Ingrese el dia de la semana"
	Leer dia
	Escribir "Ingrese turno D(diurno)/N(nocturno)"
	Leer turno
	Escribir "Fue Dia Festivo S/N"
	Leer festi
	Escribir "Ingrese la cantidad de horas"
	Leer horas
	turno=Mayusculas(turno)
	festi=Mayusculas(festi)
	Escribir "El jornal diario del dia ", dia , " de ", nom, " es de $ " ,jornal_diario(turno, festi, horas)
FinAlgoritmo
