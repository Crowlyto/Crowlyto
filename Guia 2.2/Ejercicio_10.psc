//Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. 
//1- El gerente de la compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y 
//2- por otro lado, cu�nto deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). 
//Para cada vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.
Algoritmo Ejercicio_10
	Definir vend, cantv, vent, cantventas, totalven, sbase, comis, cont Como Real
	Escribir "Ingrese cantidad de vendedores: "
	leer cantv
	para vend=1 hasta cantv Hacer
		Escribir "Vendedor: ", vend
		Escribir "Ingrese el sueldo base: "
		Leer sbase
		Escribir "Ingrese la cantidad de ventas: "
		leer cantventas
		totalven=0
			para cont=1 hasta cantventas con paso 1 hacer
				Escribir "Ingrese el monto de la venta"
				leer vent
				totalven=totalven+vent
			FinPara
		comis=totalven*0.1
		escribir "La comision del vendedor ", vend, " es de: ", comis
		Escribir "El sueldo total es de: ", sbase+comis
	FinPara
FinAlgoritmo
