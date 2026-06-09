package com;
import com.clases.*;

public class Aplicacion {
	public static void main(String[] args) {
		
		Empleado patricio = new Empleado("Patricio Parra", "12345", 1500000.0);
		Gerente fernanda = new Gerente("fernanda Ruiz","67895", 2500000.0, 500000.0);
		Director oscar = new Director("Oscar Madrid", "11223", 3000000.0, 600000.0, 100000.0);
		
		patricio.muestraInformacionEmpleado();
		fernanda.muestraInformacionEmpleado();
		oscar.muestraInformacionEmpleado();
	}

}
