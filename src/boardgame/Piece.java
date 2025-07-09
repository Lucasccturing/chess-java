package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	

	public Piece(Board board) {
		this.board = board;
	}
	
	protected Board getBoard() {
		return board;
	}

	
	public boolean[][] possibleMoves() {

		// Implementar possibilidades de movimentacao
		
		return null;
	}
	
	public boolean possibleMoves(Position position) {
		
		// Implementar possibilidade baseado na posicao
		
		return true;
	}
	
	public boolean isThereAnyPossibleMoves() {
		
		// Implementar se 
		
		return true;
	}
	
}
