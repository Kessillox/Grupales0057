//Grupal 1
//Grupo ADA: Pablo Aliaga, Juan David Lucio, Nelson Carvajal, Michel Echavarria
Algoritmo AccidenteACH
	
	DEFINIR nombres COMO CADENA;
	ESCRIBIR "Nombres del Trabajador";
	LEER nombres;
	DEFINIR apellidos COMO CADENA;
	ESCRIBIR "Apellidos del Trabajador";
	LEER apellidos;
	DEFINIR cargo COMO CADENA;
	ESCRIBIR "Cargo del trabajador";
	LEER cargo;
	DEFINIR tipoAccidente COMO ENTERO;
	DEFINIR tiempoDenuncia1 COMO ENTERO;
	
    ESCRIBIR "�Donde ha ocurrido el accidente del trabajo? Responde con: 1 si ocurri� trabajo o cualquier otro numero si ocurri� en el trayecto";
    LEER tipoAccidente;
	
	ESCRIBIR "�Cuanto tiempo paso del accidente? Responde con: 1 para menos de 24 horas, o cualquier otro numero para m�s de 24 horas.";
	Leer tiempoDenuncia1;
	
	ESCRIBIR "*********** I N S T R U C C I O N  E S    A    S E G U I R ***********";
    
	Si tipoAccidente = 1 Entonces
		ESCRIBIR "Avisar a su jefeo supervisor directo. El empleador prestara auxilios y dara aviso al IST";
		Si tiempoDenuncia1=1 Entonces
			ESCRIBIR "El empleador dar� aviso al IST, a trav�s del formulario de Denuncia Individual de Accidente de Trabaj (DIAT), Guardar copia de la DIAT recepcionada y entregar una copia al trabajador";
		SiNo
			ESCRIBIR "La denuncia debe ser presentada inmediatamente por el trabajador o por sus familiares o por el Comit� Paritario de Higiene y Seguridad (CPHS) de la empresa o el m�dico que lo atendi� o cualquier persona que haya tenido conocimiento de los hechos. En este caso o si las circunstancias en que ocurro el accidente impiden que tome conocimiento del mismo, el trabajador debe concurrir por sus propios medios, debiendo ser atendido de inmediato";
		Fin Si
	SiNo
		ESCRIBIR "Acudir al centro de atenci�n del IST (en el caso de no requerir ambulancia), donde debe explicar que se trata de un accidente de trayecto e informar al empleador/a apenas sea posible";
		Si tiempoDenuncia1=1 Entonces
			ESCRIBIR "empleador dar� aviso al IST, a trav�s del formulario de Denuncia Individual de Accidente de Trabaj (DIAT), Guardar copia de la DIAT recepcionada y entregar una copia al trabajador";
		SiNo
			ESCRIBIR "Si el empleador no presenta la DIAT o las circunstancias en que ocurri� el accidente impiden que tome conocimiento de este, el trabajador debe concurrir por sus propios medios, debiendo ser atendido de inmediato.";
		Fin Si
	Fin si	
FinAlgoritmo