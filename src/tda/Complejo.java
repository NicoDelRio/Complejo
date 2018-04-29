package tda;

import static java.lang.Math.*;

public class Complejo {
	private double real;
	private double img;
	
	public Complejo(){
		this.real=0.0;
		this.img=0.0;
	}
	
	public Complejo(double real, double img){
		this.real=real;
		this.img=img;
	}
	
	public Complejo(double real){
		this.real=real;
		this.img=0.0;
	}
	
	public Complejo(Complejo oompl){
		this.real=oompl.real;
		this.img=oompl.img;		
	}
	
	public String toString(){
		return (this.real + "," + this.img);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(img) != Double.doubleToLongBits(other.img))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}	
	public Complejo sumar(Complejo compl2){
		Complejo aux = new Complejo();
		aux.real=this.real+compl2.real;
		aux.img=this.img+compl2.img;
		return aux;
	}
	
	public Complejo restar(Complejo compl2){
		Complejo aux = new Complejo();
		aux.real=this.real-compl2.real;
		aux.img=this.img-compl2.img;
		return aux;
	}
	
	public Complejo multiplicar(Complejo compl2){
		Complejo aux = new Complejo();
		aux.real = this.real * compl2.real - this.img * compl2.img;
		aux.img = this.real * compl2.img + this.img * compl2.real;
		return aux;
	}
	
	public Complejo incrementarPost () {
		Complejo aux = new Complejo (this.real++, this.img++);
		return aux;
	}

	public Complejo incrementarPre () {
		return new Complejo (this.real+1, this.img+1);
	}
	
	public Object clone() {
		return new Complejo(this.real,this.img);
	}
	
	public Complejo division (Complejo compl2) {
		Complejo aux = new Complejo ();
		double a = this.real;
		double b = this.img;
		double c = compl2.real;
		double d = compl2.img;
		aux.real = (a * c + b * d) / (c * c + d * d);
		aux.img = (b * c - a * d) / (c * c + d * d);
		return aux;
	}
	
	public double modulo () {
		return sqrt(this.real * this.real + this.img * this.img);
	}
}
