public class LaunchBalle {

	private static void Distance(Balle b1, Balle b2) {
		if (Math.sqrt(Math.pow((double)(b2.px-b1.px),2) + Math.pow((double)(b2.py-b1.py),2))<(b1.rayon+b2.rayon)){
			b1.vx=-b1.vx;
			b2.vx=-b2.vx;

		}
	}
	
	public static void main(String[] args) {
		
		//Initialisation Ê
		Espace esp = new Espace();
		Balle b1= new Balle(15, 55, 82, 23, 2, 0.9);
		Balle b2= new Balle(10, 45, -53, -30, 2, 0.9);
		Balle b3= new Balle(1, 32, -43, -15, 2, 0.9);

		
		//dessin 
		StdDraw.setXscale(esp.getxMin(), esp.getxMax());
		StdDraw.setYscale(esp.getyMin(), esp.getyMax());		
		double time=1000, t=0;
		
		while (t<time){
			StdDraw.clear();
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.square((esp.getxMax()/2), (esp.getyMax()/2), (esp.getyMax()/2+b1.getRayon()));
			StdDraw.setPenColor(StdDraw.RED);
			StdDraw.filledCircle(b1.px, b1.py, b1.rayon);
			StdDraw.setPenColor(StdDraw.YELLOW);
			StdDraw.filledCircle(b2.px, b2.py, b2.rayon);
			StdDraw.setPenColor(StdDraw.GREEN);
			StdDraw.filledCircle(b3.px, b3.py, b3.rayon);
			//System.out.print("X:"+b1.px+" Y: "+b1.py);
			
			b1.updatepsn(esp);
			b1.frottements(esp,b1);
			b2.updatepsn(esp);
			b2.frottements(esp,b2);
			b3.updatepsn(esp);
			b3.frottements(esp,b3);

			
			Distance(b1,b2);
			Distance(b1,b3);
			Distance(b2,b3);
			
			StdDraw.show((int)(esp.getTemps()*1000));
			t+=esp.getTemps();
			StdDraw.clear();
			}
		}
	}
