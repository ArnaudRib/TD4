public class Espace {
	//Attributs
	double xMax;
	double yMax;
	double g;
	double xMin;
	double yMin;
	double temps;
	
	//MŽthodes
	
	public Espace(){
		g=10;
		temps=0.01;
		xMin=0;
		yMin=0;
		xMax=65;
		yMax=65;


	}
	
	public double getxMin() {
		return xMin;
	}

	public void setxMin(double xMin) {
		this.xMin = xMin;
	}

	public double getyMin() {
		return yMin;
	}

	public void setyMin(double yMin) {
		this.yMin = yMin;
	}


	public double getxMax() {
		return xMax;
	}

	public double getyMax() {
		return yMax;
	}

	public void setyMax(double yMax) {
		this.yMax = yMax;
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getTemps() {
		return temps;
	}

	public void setTemps(double temps) {
		this.temps = temps;
	}

	public void setxMax(double xMax) {
		this.xMax = xMax;
	}
	
}