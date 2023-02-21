Algoritmo ejercicio_11
	definir torn, def Como Entero
	Escribir "Ingrese cantidad de tornillos fabricados sin defectos"
	Leer torn
	Escribir "Ingrese la cantidad de tornillos defectuosos"
	Leer def
	Si def >=200 y torn<=10000 Entonces
		Escribir "Tiene un grado de Eficiencia 5"
	FinSi
	si torn>10000 y def<200 Entonces
		Escribir "Tiene un grado de Eficiencia Grado 8"
	sino 
		si def<200  Entonces
			Escribir "Tiene un grado de Eficiencia Grado 6"
		FinSi
		si torn>10000 Entonces
			Escribir "Tiene un grado de Eficiendia Grado 7"
		FinSi
	FinSi
FinAlgoritmo
