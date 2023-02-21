//// SubProceso para calculo de Muro

subproceso calcularmuro()
	definir respuesta Como Caracter
	definir largo, ancho, espesor, resultado como real
	resultado=0
	repetir
		borrar pantalla
		repetir
			escribir "Calculos muro a construir"
			escribir "-------------------------"
			escribir " "
			escribir "Ingrese el espesor del muro a construir, (20 o 30) cm. : "
			leer espesor
		mientras que (espesor<>20) y (espesor<>30)
		escribir "Ingrese la altura del muro a construir, en mts.: "
		leer largo
		escribir "Ingrese el ancho del muro a construir, en mts.: "
		leer ancho
		calcularsuperficie(largo,ancho,resultado)
		si espesor=30
			escribir ""
			escribir "Se necesitaran para, ",resultado " m² de muro: "
			escribir ""
			escribir " Cemento: ",resultado*15.2 " kg. "
			escribir " Arena: ",resultado*0.115 " m³ "
			escribir " Ladrillos: ",resultado*120 " Ladrillos "
		SiNo
			escribir ""
			escribir "Se necesitaran para, ",resultado " m² de muro: "
			escribir ""
			escribir " Cemento: ",resultado*10.0 " kg. "
			escribir " Arena: ",resultado*0.09 " m³ "
			escribir " Ladrillos: ",resultado*90 " Ladrillos "
		FinSi
		escribir ""
		escribir "Desea hacer los calculos del muro a construir, de nuevo ? (S/N) "
		leer respuesta
		si minusculas(respuesta)="n"
			menu
		FinSi
	mientras que minusculas(respuesta)="s"
	
FinSubProceso

//// SubProceso calculos viga

subproceso calcularviga()
	definir respuesta como caracter
	definir viga como real
	Repetir
		Borrar Pantalla
		escribir "Calculos viga a construir"
		escribir "-------------------------"
		escribir " "
		escribir "Ingrese el largo de la viga a construir: (mts.) "
		leer viga
		escribir ""
		escribir "Se necesitaran, para ",viga " metros de viga: "
		escribir ""
		escribir " Cemento: ",viga*9 " kg. "
		escribir " Arena: ",viga*0.02 " m³ "
		escribir " Piedra: ",viga*0.02 " m³ "
		escribir " Hierro del 8: ",viga*4 " mtrs. "
		escribir " Hierro del 4: ",viga*3 " mtrs. "
		escribir ""
		escribir ""
		escribir "Desea hacer los calculos de la viga a construir, de nuevo ? (S/N) "
		leer respuesta
		si minusculas(respuesta)="n"
			menu
		FinSi
	Mientras Que minusculas(respuesta)="s"
finSubProceso

//// SubProceso Calculos columna

subproceso calcularcolumna()
	definir respuesta como caracter
	definir columna como real
	Repetir
		Borrar Pantalla
		escribir "Calculos columna a construir"
		escribir "----------------------------"
		escribir " "
		escribir "Ingrese el largo de la columna a construir: (mts.) "
		leer columna
		escribir ""
		escribir "Se necesitaran, para ",columna " metros de columna: "
		escribir ""
		escribir " Cemento: ",columna*7.5 " kg. "
		escribir " Arena: ",columna*0.016 " m³ "
		escribir " Piedra: ",columna*0.016 " m³ "
		escribir " Hierro del 10: ",columna*6 " mtrs. "
		escribir " Hierro del 4: ",columna*3 " mtrs. "
		escribir ""
		escribir ""
		escribir "Desea hacer los calculos de la columna a construir, de nuevo ? (S/N) "
		leer respuesta
		si minusculas(respuesta)="n"
			menu
		FinSi
	Mientras Que minusculas(respuesta)="s"	
	
FinSubProceso

//// SubProceso Calculos contrapiso

subproceso calcularcontrapiso()
	definir respuesta como caracter
	Repetir
		Borrar Pantalla
		definir espesor, largo, ancho, resultado Como Real
		resultado=0
		escribir "Calculo contrapiso a construir"
		escribir "------------------------------"
		escribir " "
		Escribir "Ingrese el espesor del contrapiso a construir, en cms.: "
		leer espesor
		espesor=(espesor/100)
		escribir "Ingrese el largo del contrapiso a construir, en mts.: "
		leer largo
		escribir "Ingrese el ancho del contrapiso a construir, en mts: "
		leer ancho
		calcularvolumen(largo,ancho,espesor,resultado)
		escribir ""
		escribir "Se necesitaran, para ",resultado " m³ de contrapiso: "
		escribir ""
		escribir " Cemento: ",resultado*105 " kg. "
		escribir " Arena: ",resultado*0.45 " m³ "
		escribir " Piedra: ",resultado*0.9 " m³ "
		escribir ""
		escribir "Desea hacer los calculos del contrapiso a construir, de nuevo ? (S/N) "
		leer respuesta
		si minusculas(respuesta)="n"
			menu
		FinSi
	Mientras Que minusculas(respuesta)="s"	
FinSubProceso

//// SubProceso Calculos techo 

subproceso calculartecho()
	definir respuesta como caracter
	Repetir
		Borrar Pantalla		
		definir largo, ancho, espesor, resultado Como Real
		resultado=0
		escribir "Calculo techo a construir"
		escribir "-------------------------"
		escribir " "
		Escribir "Ingrese el espesor del techo a construir en cms.: "
		leer espesor
		espesor=espesor/100
		escribir "Ingrese el largo del techo a construir en mts.: "
		leer largo
		escribir "Ingrese el ancho del techo a construir en mts.: "
		leer ancho
		calcularvolumen(largo,ancho,espesor,resultado)
		escribir ""
		escribir "Se necesitaran, para ",resultado " m³ de techo: "
		escribir ""
		escribir " Cemento: ",resultado*33 " kg. "
		escribir " Arena: ",resultado*0.072 " m³ "
		escribir " Piedra: ",resulatdo*0.072 " m³ "
		escribir " Hierro del 8: ",resultado*7 " mtrs. "
		escribir " Hierro del 6: ",resultado*4 " mtrs. "
		escribir ""
		escribir "Desea hacer los calculos del techo a construir, de nuevo ? (S/N) "
		leer respuesta
		si minusculas(respuesta)="n"
			menu
		FinSi
	Mientras Que minusculas(respuesta)="s"
	
FinSubProceso

//// SubProceso Calculos pisos

subproceso calcularpisos()
	definir respuesta como caracter
	Repetir
		Borrar Pantalla		
		definir largo, ancho, resultado Como Real
		resultado=0
		escribir "Calculo piso a construir"
		escribir "------------------------"
		escribir " "
		escribir "Ingrese el largo del piso a construir, en mts.: "
		leer largo
		escribir "Ingrese el ancho del piso a construir, en mts: "
		leer ancho
		calcularsuperficie(largo,ancho,resultado)
		escribir ""
		escribir "Se necesitaran, para ",resultado " m², de piso: ",(resultado*0.10)+(resultado) " m² de material."
		escribir ""
		escribir "Desea hacer los calculos del piso, de nuevo ? (S/N) "
		leer respuesta
		si minusculas(respuesta)="n"
			menu
		FinSi
	Mientras Que minusculas(respuesta)="s"
	
FinSubProceso

//// SubProceso Calculos pintura 

subproceso calcularpintura()
	definir respuesta como caracter
	Repetir
		Borrar Pantalla
		definir largo, ancho, resultado Como Real
		resultado=0
		escribir "Calculo pintura a utilizar"
		escribir "--------------------------"
		escribir " "
		escribir "Ingrese el largo del muro a pintar, en mts.: "
		leer largo
		escribir "Ingrese el ancho del muro a pintar, en mts.: "
		leer ancho
		calcularsuperficie(largo,ancho,resultado)
		escribir ""
		escribir "Se necesitaran, para ",resultado " m² de muro: ",redon(resultado/6) " litros de pintura, aprox. " 
		escribir ""
		escribir "Desea hacer los calculos de la pintura, de nuevo ? (S/N) "
		leer respuesta
		si minusculas(respuesta)="n"
			menu
		FinSi
	Mientras Que minusculas(respuesta)="s"
FinSubProceso

//// SubProceso Calculo iluminacion

subproceso calculariluminacion()
	definir respuesta como caracter
	definir largo, ancho, resultado como real
	Repetir
		Borrar Pantalla
		escribir "Calculo iluminacion a utilizar"
		escribir "------------------------------"
		escribir " "
		escribir "Ingrese la altura a iluminar: "
		leer largo
		escribir "Ingrese el ancho a iluminar: "
		leer ancho
		resultado=0
		calcularsuperficie(largo,ancho,resultado)
		escribir ""
		escribir "Se necesitaran, para ",resultado " m² de superficie: ",resultado*0.20 " lumens en total. "
		escribir ""
		escribir "Desea hacer los calculos de la iluminacion, de nuevo ? (S/N) "
		leer respuesta
		si minusculas(respuesta)="n"
			menu
		FinSi
	Mientras Que minusculas(respuesta)="s"
FinSubProceso

//// SubProceso Calculo superficie

subproceso calcularsuperficie(largo por valor,ancho por valor,resultado por referencia)
	resultado=largo*ancho
FinSubProceso

 //// SubProceso Calculo volumen ³ ²

subproceso calcularvolumen(largo por valor, ancho por valor, espesor por valor, resultado por referencia)
	resultado=largo*ancho*espesor	
FinSubProceso

//// SubProceso menu

subproceso menu()	
	definir eleccion Como Entero	
	repetir
		Borrar Pantalla
		escribir " "
		escribir "Menu de Calculos de Materiales: "
		escribir " "
		escribir "1 - Calcular muro de ladrillo "
		escribir "2 - Calcular viga de hormigón "
		escribir "3 - Calcular columnas de hormigón "
		escribir "4 - Calcular contrapisos "
		escribir "5 - Calcular techo "
		escribir "6 - Calcular pisos "
		escribir "7 - Calcular pintura "
		escribir "8 - Calcular iluminación "
		escribir "9 - Salir "
		escribir ""
		escribir sin saltar " Ingrese su eleccion: (1-9): "
		leer eleccion
		si eleccion>9 o eleccion<1
			borrar pantalla
			escribir " "
			escribir "No ha ingresado una opcion valida, vuelva a intentar"
			esperar 2 segundos
			borrar pantalla
		FinSi
	mientras que eleccion>9 o eleccion<1
	
	borrar pantalla
	segun eleccion
		1: esperar 1 segundos
			calcularmuro
		2: esperar 1 segundos
			calcularviga
		3: esperar 1 segundos
			calcularcolumna
		4: esperar 1 segundos
			calcularcontrapiso
		5: esperar 1 Segundos
			calculartecho
		6: esperar 1 Segundos
			calcularpisos
		7: esperar 1 segundos
			calcularpintura
		8: esperar 1 segundos
			calculariluminacion
		9: esperar 1 segundos
			escribir " "
			Escribir "Hasta luego, muchas gracias..."
			escribir " "
	FinSegun
finsubproceso	

//// Algoritmo

Algoritmo sin_titulo
	menu
finalgoritmo	