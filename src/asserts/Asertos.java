package asserts;

import java.util.Date;

public class Asertos {
	
	private Object object;
	private int[] vector = new int[3];
	private int obtenido=0;
	private boolean booleano;
	private Date date;
	
	public Asertos() {
		booleano=false;
		
	}
	
	public boolean getBooleano() {
		return booleano;
	}
	
	public void setBooleano(boolean booleano) {
		if(booleano) {
			this.booleano = true;
		}
	}
	
	public int getObtenido() {
		return obtenido;
	}
	
	public void setObtenido(int num) {
		obtenido = num;
	}
	
	public int[] getVector() {
		return vector;
	}
	
	public void setVector(int numPos0, int numPos1, int numPos2) {
		vector[0] = numPos0;
		vector[1] = numPos1;
		vector[2] = numPos2;
	}
	
	public Object getObject() {
		return object;
	}

	public void setObjectNotNull() {
		object = 1;
	}

	public void setDateActual() {
		date = new Date();
	}
	
	public Date getDate() {
		return date;
	}
	
	

}
