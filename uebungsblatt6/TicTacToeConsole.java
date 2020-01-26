package prog1.uebungsblatt6;

import java.util.Scanner;

import prog1.uebungsblatt6.TicTacToe.Status;

/**
 * The <code>TicTacToeConsole</code> Klasse implementiert die Darstellung des
 * TicTacToe Spiels auf der Console. Dazu stellt Sie Hilfsmethoden zur Ausgabe
 * des Boards sowie des Status (also z.B. welcher Spieler an der Reihe ist oder
 * ob ein Spieler gewonnen) hat zur Verfügung. Um das Spiel zu starten, wird die
 * play Methode aufgerufen.
 * 
 * 
 */
public class TicTacToeConsole {

	private TicTacToe theGame;

	public TicTacToeConsole() {
		this.theGame = new TicTacToe();
	}

	/**
	 * Die play Methode startet ein Spiel und liest permanent die Eingaben der
	 * beiden Spieler abwechselnd ein, gibt den aktuellen Brettzustand und
	 * Status nach einem Spielzug auf Console aus. Wenn ein Spieler gewonnen hat
	 * oder das Spiel geht unentschieden aus, ist die play Methode beendet.
	 * Schauen Sie direkt in die Beispielausgabe des Übungsblatts!!
	 * 
	 */
	public void play() {

		Scanner input = new Scanner(System.in);
		
		int row;
		int column;
		
		System.out.println("Player X's turn.");
		
		while(!theGame.isGameOver()) {
			char player = theGame.getTokenOfCurrentPlayer();
			
			do {
				System.out.println("Player " + player + ": Enter row(0,1 or 2) :");
				row = input.nextInt();
				
				System.out.println("Player " + player + ": Enter column(0,1 or 2) :");
				column = input.nextInt();
				
			}while(!theGame.isValidMove(row, column));
				
			theGame.playMove(row, column);
			
			theGame.setFirstPlayer(theGame.isFirstPlayer());
			
			printBoardWithStatus();
			
		}

	} // end method play

	/**
	 * Gibt das Spielbrett mit der aktuellen Belegung und dem aktuellen Status
	 * auf Console aus.
	 * 
	 */
	public void printBoardWithStatus() {
		printBoard();
		printStatus();
	}

	/**
	 * Gibt das Spielbrett mit der aktuellen Belegung auf Console aus. DIESE
	 * METHODE ÜBERNEHMEN SIE UNVERÄNDERT!
	 * 
	 */
	public void printBoard() {
		System.out.println(" _______________________ ");

		for (int row = 0; row < theGame.getBoardSize(); row++) {
			System.out.println("|       |       |       |");

			for (int column = 0; column < theGame.getBoardSize(); column++)
				printPlayerToken(column, theGame.getPlayerTokenAt(row, column));

			System.out.println("|_______|_______|_______|");
		} // end for
	} // end method printBoard

	/**
	 * Gibt den aktuellen Spielstatus auf Console aus. DIESE METHODE ÜBERNEHMEN
	 * SIE UNVERÄNDERT!
	 */
	public void printStatus() {
		Status status = theGame.checkAndSetGameStatus();
		char player = theGame.getTokenOfCurrentPlayer();

		// print game status
		switch (status) {
		case WIN:
			System.out.printf("Player %c wins.", player);

			break;
		case DRAW:
			System.out.println("Game is a draw.");

			break;
		case CONTINUE:
			System.out.println("Player " + player + "'s turn.");
			break;
		} // end switch
	} // end method printStatus

	/**
	 * Gibt einen einzelnen Spielstein in einem Feld auf Console aus. DIESE
	 * METHODE ÜBERNEHMEN SIE UNVERÄNDERT!
	 */
	private void printPlayerToken(int column, char value) {
		System.out.printf("|   %c   ", value);

		if (column == 2)
			System.out.println("|");
	} // end method printPlayerToken
}
