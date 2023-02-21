//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
//recibe un sueldo base más un 10% extra por comisiones de sus ventas. 
//1- El gerente de la compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y 
//2- por otro lado, cuánto deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). 
//Para cada vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
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
