Algoritmo Extra5
	Definir frase,vector,nuevocaracter Como Caracter
	Definir i,posicion,distancia,espacioizq,espacioder,posicion1,posicion2 Como Entero
	Dimension vector(20)
	distancia=19
	Escribir  "Ingrese por favor una frase "
	Leer frase
	Para i<-0 Hasta Longitud(frase)-1 Hacer
		vector(i)=Subcadena(frase,i,i)
		Fin Para
		Para i=Longitud(frase) Hasta 19 Hacer
		vector(i)=" "
		FinPara
	Escribir "Ingrese un caracter "
	Leer nuevocaracter
	Escribir " Ingrese la posicion donde desea ubicar el caracter " 
	Leer posicion
	Si vector(posicion)=" " Entonces
			vector(posicion)=nuevocaracter
		Sino 
			Para i<-posicion-1 Hasta 0 con paso -1 Hacer
				Si vector(i)=" " Entonces
					posicion1=(i)
					FinSi
				FinPara		
				Para i<-posicion-1 Hasta Longitud(frase)-1 con paso 1 Hacer
						Si vector(i)=" " Entonces
							posicion2=(i)
						FinSi
					FinPara
					espacioizq=(posicion)-posicion1
						espacioder=posicion2-(posicion)
						si espacioizq<=espacioder Entonces
							Para i<-posicion1 Hasta posicion con paso 1 Hacer
								vector(i)=vector(i+1)
							Fin Para
						SiNo
							Para i<-posicion2 Hasta posicion con paso -1 Hacer
								vector(i)=vector(i-1)
							Fin Para
						FinSi
						vector(posicion)=nuevocaracter
						escribir "La frase con la nueva letra es"
						para i=0 hasta 19 Hacer
							escribir vector(i) sin saltar
						FinPara 
					FinSi	
FinAlgoritmo
