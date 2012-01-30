package myeasyhome.javabean;

public class Etage {

	private int num_Etage;
	
	private Maison m = new Maison();

	public Etage() {
		// TODO Auto-generated constructor stub
	}

	public Etage(int num_Etage) {
		super();
		this.num_Etage = num_Etage;
	}

	public int getNum_Etage() {
		return num_Etage;
	}

	public void setNum_Etage(int num_Etage) {
		this.num_Etage = num_Etage;
	}

	public Maison getM() {
		return m;
	}

	public void setM(Maison m) {
		this.m = m;
	}
	
	
}
