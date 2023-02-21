//Calcular muro
SubProceso calcularmuro
	definir espesor, alto, largo, superficie, cemento, arena, ladrillo Como Real
	Escribir "Elegir el espesor del muro (20/30cm)"
	leer espesor
	Escribir "Ingrese el alto del muro"
	leer alto
	Escribir "Ingrese el ancho del muro"
	leer largo
	calcular_superficie(largo, alto, superficie)
	Escribir "La superficie del muro es de: " superficie
	Si espesor=30 Entonces
		cemento=15.2*superficie
		arena=0.115*superficie
		ladrillo=120*superficie
	SiNo
		cemento=10.9*superficie
		arena=0.09*superficie
		ladrillo=90*superficie
	FinSi
	Escribir "La cantidad de cemento necesaria es ", cemento
	Escribir "La cantidad de arena necesaria es ", arena
	Escribir "Se necesitan ",ladrillo " ladrillos"
FinSubProceso
SubProceso calcular_superficie(larg, height, super Por Referencia)
	super=larg*height
FinSubProceso
//Calcular Viga
SubProceso calcularviga
	Definir long, cementoV, arenaV, piedraV, hierro8, hierro4 Como Real
	Escribir "Ingrese el largo de la viga"
	Leer long 
	cementoV=long*9
	arenaV=long*0.02
	piedraV=long*0.02
	hierro8=long*4
	hierro4=long*3
	Escribir "La cantidad de cemento necesaria es ", cementoV
	Escribir "La cantidad de arena necesaria es ", arenaV
	Escribir "La cantidad de piedra necesaria es ", piedraV
	Escribir "La cantidad de hierro 8 necesaria es ", hierro8
	Escribir "La cantidad de hierro 4 necesaria es ", hierro4
FinSubProceso
SubProceso calcularcolumna
	Definir long, cementoC, arenaC, piedraC, hierro10, hierro4 Como Real
	Escribir "Ingrese el largo de la viga"
	Leer long 
	cementoC=long*7.5
	arenaC=long*0.016
	piedraC=long*0.016
	hierro10=long*6
	hierro4=long*3
	Escribir "La cantidad de cemento necesaria es ", cementoC
	Escribir "La cantidad de arena necesaria es ", arenaC
	Escribir "La cantidad de piedra necesaria es ", piedraC
	Escribir "La cantidad de hierro 8 necesaria es ", hierro10
	Escribir "La cantidad de hierro 4 necesaria es ", hierro4
FinSubProceso
SubProceso calcularcontrapiso
	Definir volumenCP, espesor, ancho, largo, cementoCP, arenaCP, piedraCP Como Real
	Escribir "Ingrese el espesor del contrapiso"
	Leer espesor
	Escribir "Ingrese el ancho del contrapiso"
	Leer ancho
	Escribir "Ingrese el largo del contrapiso"
	Leer largo
	volumenCP=espesor*ancho*largo
	cementoCP=volumenCP*105
	arenaCP=volumenCP*0.45
	piedraCP=volumenCP*0.9
	Escribir "La cantidad de cemento necesaria es ", cementoCP
	Escribir "La cantidad de arena necesaria es ", arenaCP
	Escribir "La cantidad de piedra necesaria es ", piedraCP
FinSubProceso
SubProceso calculartecho
	Definir volumenT, espesor, ancho, largo, cementoT, arenaT, piedraT, hierro8, hierro6 Como Real
	Escribir "Ingrese el espesor del contrapiso"
	Leer espesor
	Escribir "Ingrese el ancho del contrapiso"
	Leer ancho
	Escribir "Ingrese el largo del contrapiso"
	Leer largo
	volumenT=espesor*ancho*largo
	cementoT=volumenT*105
	arenaT=volumenT*0.45
	piedraT=volumenT*0.9
	hierro8=volumenT*7
	hierro6=volumenT*4
	Escribir "La cantidad de cemento necesaria es ", cementoT
	Escribir "La cantidad de arena necesaria es ", arenaT
	Escribir "La cantidad de piedra necesaria es ", piedraT
	Escribir "La cantidad de hierro 8 necesaria es ", hierro8
	Escribir "La cantidad de hierro 6 necesaria es ", hierro6
FinSubProceso
SubProceso calcularpisos
	Definir superPiso, ancho, largo Como Real
	Escribir "Ingrese el ancho del piso"
	Leer ancho
	Escribir "Ingrese el largo del piso"
	Leer largo
	superPiso=largo*ancho*1.10
	Escribir "El piso tiene ", superPiso " m2"
FinSubProceso
SubProceso calcularpintura
	Definir superPared, ancho, largo, pintura Como Real
	Escribir "Ingrese el ancho de la pared"
	leer ancho
	Escribir "Ingrese el largo de la pared"
	leer largo
	superPared=ancho*largo
	pintura=superPared/6
	Escribir "La cantidad necesaria de pintura es de ", pintura
FinSubProceso
SubProceso calculariluminacion
	Definir iluminacion,superIlu, ancho, largo Como Real
	Escribir "Ingrese ancho de la habitacion"
	Leer ancho
	Escribir "Ingrese el largo de la habitacion"
	Leer largo
	superIlu=ancho*largo
	iluminacion=superIlu*0.20
	Escribir "La superficie de iluminacion de la habitacion es de ", iluminacion
FinSubProceso
SubProceso menu()
	Definir x Como Entero
	x=0
	Mientras x<>9 Hacer
		Escribir "Elija un opcion"
		Escribir "1 - Calcular muro de ladrillo"
		Escribir"2 - Calcular viga de hormigón"
		Escribir"3 - Calcular columnas de hormigón"
		Escribir"4 - Calcular contrapisos"
		Escribir"5 - Calcular techo"
		Escribir"6 - Calcular pisos"
		Escribir"7 - Calcular pintura"
		Escribir"8 - Calcular iluminación"
		Escribir"9 - Salir"
		Leer x
		Segun x hacer
			1: 
				calcularmuro
			2: 
				calcularviga
			3:
				calcularcolumna
			4:
				calcularcontrapiso
			5: 
				calculartecho
			6 :
				calcularpisos
			7:
				calcularpintura
			8:
				calculariluminacion
			De Otro Modo:
				x=9
		FinSegun
	FinMientras
FinSubProceso
Algoritmo Coperativo
	menu()
FinAlgoritmo