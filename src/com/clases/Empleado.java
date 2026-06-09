package com.clases;

public class Empleado {
	private String nombre;
	private String identificador;
	private double salarioBase;
	public Empleado(String nombre, String identificador, double salarioBase) {
		this.nombre = nombre;
		this.identificador = identificador;
		this.salarioBase = salarioBase;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalarioTotal() {
		double salarioTotal = this.salarioBase * 160;
		return salarioTotal;
	}
			
	public void muestraInformacionEmpleado() {
		System.out.println("Identificador: "+ this.getIdentificador() + " | Nombre Empleado: " + this.getNombre() + " | Salario total: " + this.calcularSalarioTotal());
	}
		
	}