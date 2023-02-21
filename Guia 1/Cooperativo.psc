Proceso sin_titulo
	definir num, cen, dec, uni Como Entero
	escribir "Ingrese un numero de tres cifras"
	leer num
	uni= num mod 10
	num= trunc(num/10)
	dec= num mod 10
	num= trunc(num/10)
	cen= num mod 10
	escribir "El numero consta de"
	Escribir "Centenas: ", cen
	Escribir "Decenas: ", dec
	Escribir "Unidades: ", uni
FinProceso
