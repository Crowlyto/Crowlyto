Algoritmo Cooperativo
	Definir pass, user, sn Como Caracter
	Definir login Como Logico
	Definir cont, opc, bot, cbot, sumbot, pesobot, saldo, saldoto Como Entero
	login=Falso
	cont=0
	sumbot=0
	saldo=0
	saldoto=0
	hacer
		Escribir "Ingrese el Usuario"
		Leer user
	Mientras Que user<>"Albus_D"
	Hacer
		Escribir "Ingrese Contraseña"
		Leer pass
		cont=cont+1
		Si pass="carameloDeLimon" Entonces
			login=Verdadero
		FinSi
	Mientras Que cont<3 y login=Falso
	Si login Entonces
		Hacer
			Escribir "1- Ingresar Botellas"
			Escribir "2- Consulta de Saldo"
			Escribir "3- Salir"
			Leer opc
			segun opc
				1: Escribir "Cuantas botellas va a ingresar"
					Leer bot
					para cbot=1 Hasta bot Hacer
						pesobot<-aleatorio(100,3000)
						sumbot=sumbot+pesobot
					FinPara
					si sumbot<=500 entonces
						saldo=50
					SiNo
						si sumbot>500 y sumbot<=1500 Entonces
							saldo=125
						SiNo
							si sumbot>1500 Entonces
								saldo=200
							FinSi
						FinSi
					FinSi
					Escribir "El saldo a abonar es $", saldo
					hacer
						Escribir "Acepta el valor S/N"
						Leer sn
						sn=Mayusculas(sn)
					Mientras Que sn<>"S" y sn<>"N"
					si sn="N" Entonces
						Escribir "Devolviendo material"
					SiNo
						Escribir "Saldo Cargado"
						saldoto=saldoto+saldo
					FinSi
				2: Escribir "Su saldo es de $", saldoto	
				3: 	login=falso
			FinSegun
		Mientras Que login
	SiNo
		Escribir "Ingreso Incorrecto"
	FinSi
	
	
FinAlgoritmo
