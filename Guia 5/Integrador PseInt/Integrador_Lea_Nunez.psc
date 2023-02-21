SubProceso deteccionGen(Gen,q,q)
	Definir fila, columna, i, j Como Entero
	i=1
	j=1
	para fila=0 hasta q-1 
		Para columna=0 hasta q-1
			si fila=columna Entonces
				si Gen(fila, columna) <> Gen(0,0) Entonces
					i=0
				FinSi
			FinSi
			Si fila+columna =q-1 Entonces
				si Gen(fila, columna)<>Gen(0,q-1) Entonces
					j=0
				FinSi
			FinSi
		FinPara
	FinPara
	Escribir "_-_-_-_Analizando Muestra_-_-_-_"
	Esperar 3 Segundos
	si i=1 y j=1 Entonces
		Escribir "-->Gen Z Detectado<--"
	SiNo
		Escribir "-->Gen Z No Encontrado<--"
	FinSi
FinSubProceso
SubProceso imprimeGen(GenY,p,p)
	Definir i, j Como Entero
	Para i=0 hasta p-1
		Para j=0 hasta p-1
			Escribir GenY(i,j) Sin Saltar " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso
SubProceso ingresoGen(muestrita, GenX Por Referencia,n,n)
	Definir i, j, cont Como Entero
	cont=0
	para i=0 hasta n-1
		para j=0 hasta n-1
			GenX(i,j)=Subcadena(muestrita, cont, cont)
			cont=cont+1
		FinPara
	FinPara
FinSubProceso
Funcion valido<- validarGen(muestrita1)
	Definir valido Como Logico
	Definir i, char, char1, char2, char3, long1, largo Como Entero
	Definir letra Como Caracter
	largo=Longitud(muestrita1)
	char=0
	char1=0
	char2=0
	char3=0
	long1=0
	valido=Falso
	Para i=0 hasta largo-1
		letra=Subcadena(muestrita1,i,i)	
		si letra="A" o letra ="B" o letra ="C" o letra="D" Entonces
			si letra="A" Entonces
				char=char+1
			SiNo
				si letra="B" Entonces					
					char1=char1+1
				sino
					si letra="C" Entonces						
						char2=char2+1
					sino
						si letra="D" Entonces
							char3=char3+1								
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi	
		si (char+char1+char2+char3)=largo Entonces
			valido=Verdadero
		SiNo
			valido=Falso
		FinSi
	FinPara
FinFuncion
Algoritmo Integrador_Lea_Nunez
	Definir Genz, muestra Como Caracter
	Definir m, long Como Entero
	Hacer
		Escribir "Ingrese el  Gen a analizar"
		Leer muestra
		muestra=Mayusculas(muestra)
		long=Longitud(muestra)
		m=0
		si validarGen(muestra)=Verdadero entonces
			si long=9 Entonces
				m=3
			sino 
				si long=16 Entonces
					m=4
				sino
					si long=1369 Entonces
						m=37
					SiNo
						Escribir "La cadena de ADN no es valida"
						Escribir "Presione una tecla para continuar"
						Esperar Tecla
						m=0
					FinSi
				FinSi
			FinSi
		SiNo
			Escribir "La cadena de ADN no es valida"
			Escribir "Presione una tecla para continuar"
			Esperar Tecla
			m=0
		FinSi
	Mientras Que m=0
	Escribir "Cadena de ADN correcta"
	Escribir "Presione un tecla para continuar"
	Esperar Tecla
	Dimension Genz(m,m)
	ingresoGen(muestra,Genz,m,m)
	imprimeGen(GenZ,m,m)
	deteccionGen(Genz,m,m)
FinAlgoritmo
