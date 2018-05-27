package players.implementation;

import chess.Chessboard;
import chess.Colors;
import pieces.Piece;
import pieces.PieceFactory;
import players.PlayerType;

public class HumanPlayer extends ComputerPlayer {
	public HumanPlayer() {
		playerType = PlayerType.LOCAL_USER;
	}

	public HumanPlayer(String name, String color) {
		super(name, Colors.valueOf(color.toUpperCase()));
		playerType = PlayerType.LOCAL_USER;
	}

	public HumanPlayer(String name, Colors color) {
		super(name, color);
		playerType = PlayerType.LOCAL_USER;
	}

//	public Piece getPromotionPiece(Chessboard chessboard) {
//		String colorSymbol = color.getSymbolAsString().toUpperCase();
//		String newPiece = JChessApp.getJavaChessView().showPawnPromotionBox(colorSymbol);
//		return PieceFactory.getPiece(chessboard, colorSymbol, newPiece, this);
//	}
	
}
