Algoritmo Extra_4
	Definir hs, lts Como Real
	Escribir "Ingrese la cantidad de HS que utilizo el vehiculo"
	Leer hs
	si hs<=2 Entonces
		Escribir "El valor a abonar es de $400"
	SiNo
		si hs>2 Entonces
			
				Escribir "Ingrese la cantidad de litros gastados"
		Leer lts
		Escribir " El monto a abonar es de $ ",(hs*320)+(lts*40)
		FinSi
	FinSi
	
FinAlgoritmo
