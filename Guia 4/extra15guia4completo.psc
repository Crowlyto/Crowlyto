//// Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//// realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//// productos en los 5 días hábiles de la semana. Se desea conocer:
////	a) Total de ventas por cada día de la semana.
////	b) Total de ventas de cada producto a lo largo de la semana.
////	c) El producto más vendido en cada semana.
////	d) El nombre, el día de la semana y la cantidad del producto más vendido.
//// El informe final tendrá un formato como el que se muestra a continuación:
////	             Lunes    Martes   Miércoles   Jueves    Viernes     Total producto
////	Producto 1
////	Producto 2
////	Producto 3
////	Producto 4
////	Producto 5
////	Total semana
////	Producto más vendido


Algoritmo sin_titulo
	definir matriz, i, l, lunes, martes, miercoles, jueves, viernes como entero
	definir pro1, pro2, pro3, pro4, pro5 como entero
	dimension matriz(5,5)
	lunes=0
	martes=0
	miercoles=0
	jueves=0
	viernes=0
	pro1=0
	pro2=0
	pro3=0
	pro4=0
	pro5=0
	llenado(matriz)
	sumadias(matriz,lunes,martes,miercoles,jueves,viernes)
	sumaproducto(matriz,pro1,pro2,pro3,pro4,pro5)
	
	escribir " "
	escribir "          ---------------------------------------- "
	escribir "          | Lun | Mar | Mie | Jue | Vie | T.Prod |"
	escribir " ---------|-----|-----|-----|-----|-----|--------|"
	escribir " | Prod.1 |  ",matriz(0,0) "  |  ",matriz(0,1) "  |  ",matriz(0,2) "  |  ", matriz(0,3) "  |  ", matriz(0,4) "  |   ",pro1 "   |"
	escribir " |--------|-----|-----|-----|-----|-----|--------|"
	escribir " | Prod.2 |  ",matriz(1,0) "  |  ",matriz(1,1) "  |  ",matriz(1,2) "  |  ", matriz(1,3) "  |  ", matriz(1,4) "  |   ",pro2 "   |"
	escribir " |--------|-----|-----|-----|-----|-----|--------|"
	escribir " | Prod.3 |  ",matriz(2,0) "  |  ",matriz(2,1) "  |  ",matriz(2,2) "  |  ", matriz(2,3) "  |  ", matriz(2,4) "  |   ",pro3 "   |"
	escribir " |--------|-----|-----|-----|-----|-----|--------|"
	escribir " | Prod.4 |  ",matriz(3,0) "  |  ",matriz(3,1) "  |  ",matriz(3,2) "  |  ", matriz(3,3) "  |  ", matriz(3,4) "  |   ",pro4 "   |"
	escribir " |--------|-----|-----|-----|-----|-----|--------|"
	escribir " | Prod.5 |  ",matriz(4,0) "  |  ",matriz(4,1) "  |  ",matriz(4,2) "  |  ", matriz(4,3) "  |  ", matriz(4,4) "  |   ",pro5 "   |"
	escribir " |--------|-----|-----|-----|-----|-----|---------"
	escribir " | T.Sem. | ",lunes "  | ",martes "  | ",miercoles "  | ",jueves "  | ",viernes "  |"
	escribir " ----------------------------------------"
	producto(pro1,pro2,pro3,pro4,pro5)
	escribir ""
	promedio(matriz)
	escribir ""
FinAlgoritmo



subproceso sumadias(matriz,lunes Por Referencia,martes Por Referencia, miercoles Por Referencia, jueves Por Referencia, viernes Por Referencia)
	definir i,l Como Entero
	
	para i=0 hasta 5-1 con paso 1
		para l=0 hasta 5-1 con paso 1
			si l==0
				lunes=lunes+matriz(i,l)
			FinSi
			si l==1
				martes=martes+matriz(i,l)
			FinSi
			si l==2
				miercoles=miercoles+matriz(i,l)
			FinSi
			si l==3
				jueves=jueves+matriz(i,l)
			FinSi
			si l==4
				viernes=viernes+matriz(i,l)
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso sumaproducto(matriz,pro1 Por Referencia,pro2 Por Referencia, pro3 Por Referencia, pro4 Por Referencia, pro5 Por Referencia)
	definir i,l Como Entero
	
	para i=0 hasta 5-1 con paso 1
		para l=0 hasta 5-1 con paso 1
			si i==0
				pro1=pro1+matriz(i,l)
			FinSi
			si i==1
				pro2=pro2+matriz(i,l)
			FinSi
			si i==2
				pro3=pro3+matriz(i,l)
			FinSi
			si i==3
				pro4=pro4+matriz(i,l)
			FinSi
			si i==4
				pro5=pro5+matriz(i,l)
			FinSi
		FinPara
	FinPara
FinSubProceso

subproceso producto(pro1,pro2,pro3,pro4,pro5)
	
	si (pro1>pro2) y (pro1>pro3) y (pro1>pro4) y (pro1>pro5)
		escribir "El producto 1 es el mas vendido de toda la semana con: ",pro1 " unidades."
	FinSi
	si (pro2>pro1) y (pro2>pro3) y (pro2>pro4) y (pro2>pro5)
		escribir "El producto 2 es el mas vendido de toda la semana con: ",pro2 " unidades."
	FinSi
	si (pro3>pro1) y (pro3>pro2) y (pro3>pro4) y (pro3>pro5)
		escribir "El producto 3 es el mas vendido de toda la semana con: ",pro3 " unidades."
	FinSi
	si (pro4>pro1) y (pro4>pro2) y (pro4>pro3) y (pro4>pro5)
		escribir "El producto 4 es el mas vendido de toda la semana con: ",pro4 " unidades."
	FinSi
	si (pro5>pro1) y (pro5>pro2) y (pro5>pro3) y (pro5>pro4)
		escribir "El producto 5 es el mas vendido de toda la semana con: ",pro5 " unidades."
	FinSi
	
FinSubProceso

subproceso llenado(matriz)
	
	escribir "Llenado de la Matriz(5,5) Aleatorio"
	escribir ""
	definir i, l como entero
	para i=0 hasta 5-1 con paso 1
		para l=0 hasta 5-1 con paso 1
			matriz(i,l)=aleatorio(0,9)
		FinPara
	FinPara
	
	para i=0 hasta 5-1 con paso 1
		para l=0 hasta 5-1 con paso 1
			escribir sin saltar " ", matriz(i,l), " "
		FinPara
		escribir ""
	finpara
	escribir ""
	escribir "Presione una tecla para continuar..."
	esperar tecla
	borrar pantalla
FinSubProceso

subproceso promedio(matriz)
	
	definir i, l, maximo, minimo como entero
	maximo=0
	para i=0 hasta 5-1 con paso 1
		para l=0 hasta 5-1 con paso 1
			minimo=matriz(i,l)
		FinPara
	FinPara
	maximo=minimo
	
	para i=0 hasta 5-1 con paso 1
		para l=0 hasta 5-1 con paso 1
			si minimo>matriz(i,l)
				minimo=matriz(i,l)
			FinSi
			si maximo<matriz(i,l)
				maximo=matriz(i,l)
			FinSi
		finpara
	FinPara
	
	para i=0 hasta 5-1 con paso 1
		para l=0 hasta 5-1 con paso 1	
			si matriz(i,l)=maximo
				segun l
					0: escribir "El producto ",i+1 " del dia Lunes es el mas vendido de la semana, con ",maximo " unidades."
					1: escribir "El producto ",i+1 " del dia Martes es el mas vendido de la semana, con ",maximo " unidades."
					2: escribir "El producto ",i+1 " del dia Miercoles es el mas vendido de la semana, con ",maximo " unidades."
					3: escribir "El producto ",i+1 " del dia Jueves es el mas vendido de la semana, con ",maximo " unidades."
					4: escribir "El producto ",i+1 " del dia Viernes es el mas vendido de la semana, con ",maximo " unidades."
				finsegun
			FinSi
		FinPara
	FinPara
FinSubProceso
