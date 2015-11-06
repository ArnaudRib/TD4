
public class Affichagesansv0 {

	public static double Temps(){
		double ymax=64;
		double g=9.81;
		double positionx;
		double positiony;
		double temps=0,vitesse=0;
		positiony=ymax;
		while (positiony>0){
			vitesse=vitesse+g*temps;
			positiony=positiony-vitesse*temps;
			temps=temps+0.001;
			System.out.println("temps "+temps);
			System.out.println("position "+positiony);
		}
		return temps;
	}

public static void main(String[] args) {
	Temps();
}
}