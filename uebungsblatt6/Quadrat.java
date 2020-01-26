package prog1.uebungsblatt6;

public class Quadrat {
	 // Quadrat mit verschiedenen Werten
	int[][] quad;
	
	// Klassenmethode zum Erzeugen von magischen Quadraten für ungerade n
	// falls n gerade liefern Sie null zurück
	
	public static Quadrat erzeugeMagicQuadrat(int n) {
		
		int[][] quad = new int[n][n];
		
		int zeile = n / 2;
		int spalte = n / 2 + 1;
		int m = 0;
		
		do {
			m++;
			quad[zeile][spalte] = m;
			zeile--;
			spalte++;
			
			if(zeile == -1) zeile = n-1;
			
			if(spalte == n) spalte = 0;
			
			if(quad[zeile][spalte] != 0) {
				zeile++;
				spalte++;
				
				if(zeile == n) zeile = 0;
				if(spalte == n) spalte = 0;
			}
		}while(m < n*n);		
		return new Quadrat(quad);
	}
	
	// Konstruktor erzeugt eine quadratische Matrix, die alle Elemente mit 0 initialisiert
	public Quadrat(int n) {
		this.quad = new int[n][n];
		
		for(int i=0; i < quad.length; i++) {
			for(int j=0; j < quad[i].length; j++) {
				this.quad[i][j] = 0;
			}
		}
	}
	
	// Konstruktor erzeugt eine quadratische Matrix und initialisiert die Matrix mit den Werten q
	public Quadrat(int [][] q) {
		this.quad = new int[q.length][q.length];
		
		for(int i=0; i < q.length; i++) {
			for(int j=0; j < q[i].length; j++) {
				this.quad[i][j] = q[i][j];
			}
		}
	}
	
	// Liefert die arithmetische Summe für eine Zeile zurück; die zeilennr gibt die Zeile an
	public int zeilenSumme(int zeilennr) {
		int summe = 0;
		
		for(int i = 0; i < quad.length; i++) {
			summe += this.quad[zeilennr][i];
		}
		
		return summe;
	}
	
	// Liefert die arithmetische Summe für eine Spalte zurück; spaltennr gibt die Spalte an
	public int spaltenSumme(int spaltennr) {
		int summe = 0;
		
		for(int i = 0; i < quad.length; i++) {
			summe += this.quad[i][spaltennr];
		}
		
		return summe;
	}	
	// Liefert die artihmetische Summe der Diagonalen von LinksOben nach RechtsUnten zurück
	public int diagonalSummeOToU() {
		int summe = 0;
		
		int znr=0;
		int spnr=0;
		
		for(int i=0; i < quad.length; i++) {
			summe += this.quad[znr++][spnr++];
		}		
		return summe;
	}	
	// Liefert die arithmetische Summe der Diagonalen von LinksUnten nach RechtsOben zurück
	public int diagonalSummeUToO() {
		int summe = 0;
		
		int znr = quad.length;
		int spnr = 0;
		
		for(int i = 0; i < quad.length; i++) {
			summe += this.quad[--znr][spnr++];
		}
		return summe;
	}	
	// gibt true zurück falls Quadrat ein magisches Quadrat; ansonsten false
	public boolean isMagic() {
		int summe = zeilenSumme(0);
		
		for(int i=1;i < quad.length; i++) {
			if(summe != zeilenSumme(i)) return false;
		}
		
		for(int i=0; i < quad.length; i++) {
			if(summe != spaltenSumme(i)) return false;
		}
		
		if(diagonalSummeOToU() != summe || diagonalSummeUToO() != summe) return false;
		
		boolean[] gefunden = new boolean[quad.length*quad.length];
		
		for(int j=0; j < gefunden.length; j++) {
			gefunden[j] = false;
		}
		for(int i=0; i < quad.length; i++) {
			for(int j=0; j < quad[i].length; j++) {
				int wert =  this.quad[i][j];
				
				if(wert > 0 && wert <= quad.length*quad.length) {
					if(!gefunden[quad[i][j]-1]) {
						gefunden[quad[i][j]-1] = true;
					}else {
						return false;
					}
				}else {
					return false;
				}
			}
		}
		
		for(int i=0; i < gefunden.length; i++ ) {
			if(!gefunden[i]) return false;
		}
		return true;
	}
	// gibt alle aktuellen Werte des Quadrats mit System.out.println aus
	public void print() {
		
		for(int i=0; i < quad.length; i++) {
			for(int j=0; j < quad.length; j++) {
				System.out.print(this.quad[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
