package com.clases;

public class Director extends Gerente{
	private double acciones;
	
	// constructor
	public Director(String nombre, String identificador, double salarioBase, double bono, double acciones) {
		super(nombre, identificador, salarioBase, bono);
		this.acciones = acciones;
		
	}
	
	@Override
	public double calcularSalarioTotal(){
		double salarioTotal = super.calcularSalarioTotal() + this.acciones;
		return salarioTotal;
	}
	
	@Override
	public void muestraInformacionEmpleado() {
		super.muestraInformacionEmpleado();
		System.out.println(" Nota: Este salario total incluye un bono de: "+ this.acciones);
	}
	

}
