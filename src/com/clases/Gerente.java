package com.clases;


public class Gerente extends Empleado {
	private double bono; 
	
	public Gerente(String nombre, String identificador, double salarioBase, double bono) {
		super(nombre, identificador, salarioBase);
		this.bono = bono;
	}
	
	@Override
	public double calcularSalarioTotal() {
		double salarioTotal = super.calcularSalarioTotal() + this.bono;
		return salarioTotal;
	}
	
	@Override
	public void muestraInformacionEmpleado() {
		super.muestraInformacionEmpleado(); 
		System.out.println(" Nota: Este salario total incluye un bono de: "+ this.bono);
	}

	
}
