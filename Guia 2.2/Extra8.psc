Algoritmo Extra8
	Definir num, par, imp, cont, suma_par, suma_imp Como Entero
	cont=1
	suma_par=0
	suma_imp=0
	par=0
	imp=0
	
	Hacer
		escribir "Ingrese un numero"
		leer num
		si num mod 2=0 
			suma_par=suma_par+num
			par=par+1
		SiNo
			suma_imp=suma_imp+num
			imp=imp+1
		FinSi
		cont=cont+1
	Mientras Que cont<=10
	Escribir "La media de los numeros pares es de: ", suma_par/par
	Escribir "La media de los numeros impares es de: ", suma_imp/imp
FinAlgoritmo
