public class Balle {

	//attributs
	double px, py;
	double vx, vy;
	double rayon;
	double frottement;
	double rebond;
	
	//Constructeur balle
	public Balle(double px, double py, double vx, double vy, double rayon, double rebond){
		this.px=px;
		this.py=py;
		this.vx=vx;
		this.vy=vy;
		this.rayon=rayon;
		this.rebond=rebond;
	}
	
	//Gre les collisions entre deux balles.
	public void collision(Balle b1, Balle b2){
		if (b1.px+b1.rayon==b2.px+b2.rayon || b1.py+b1.rayon==b2.py+b2.rayon){
			b1.vx=-b1.vx;
			b2.vx=-b2.vx;
		}			
	}
	
	public void frottements(Espace esp, Balle b1){ // Calculs des frottements de l'air
		vx = vx - 6*3.14*b1.rayon*vx*0.000018; //Loi de Strokes dans l'air ˆ 20¡C.
		vy = vy - 6*3.14*b1.rayon*vx*0.000018;
	}
	
	public void updatepsn(Espace esp){ // Calculs des changements de vitesse.
		vy = vy + esp.getG()*esp.getTemps();
		py = py -vy *esp.getTemps()-0.5*esp.getG()*esp.getTemps();
		px = px + vx*esp.getTemps();

	
		// Si la balle arrive sur les bords : 
		if(px>esp.getxMax()){
			px=esp.getxMax();
			vx= -vx*rebond;
		}
	
		if(px<esp.getxMin()){
			px=esp.getxMin() ;
			vx= -vx*rebond;
		}
	
		if(py>esp.getyMax()){
			py=esp.getyMax();
			vy= -vy*rebond;
		}
	
		if(py<esp.getyMin()){
			py=esp.getyMin();
			vy= -vy*rebond;
		}
	}
	
	
	// get set part.
	public double getPx() {
		return px;
	}

	public void setPx(double px) {
		this.px = px;
	}

	public double getPy() {
		return py;
	}

	public void setPy(double py) {
		this.py = py;
	}

	public double getVx() {
		return vx;
	}

	public void setVx(double vx) {
		this.vx = vx;
	}

	public double getVy() {
		return vy;
	}

	public void setVy(double vy) {
		this.vy = vy;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}


}