Algoritmo Extra_2
	Definir importe como real
	Definir mes Como Caracter
	Escribir "Ingrese el valor de la compra realizada"
	Leer importe
	Escribir "Ingrese el mes de la compra"
	Leer mes
	mes=Mayusculas(mes)
	si mes="SEPTIEMBRE" Y mes="OCTUBRE" Y mes="NOVIEMBRE" Entonces
		Escribir "El monto a abonar es de $ ", (importe*90/100)
	SiNo
		escribir "El monto a abonar es de $ ", importe
	FinSi
	
	
	
FinAlgoritmo
