package ai.joc_ai;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import ai.AI;
import chess.Chessboard;
import chess.Game;
import chess.Square;
import moves.Move;
import pieces.Piece;
import pieces.implementation.Pawn;
import pieces.implementation.Queen;
import players.Player;
















public class Level1
  implements AI
{
  public Level1() {}
  
  public Move getMove(Game game, Move lastMove)
  {
    Chessboard chessboard = game.getChessboard();
    List<Piece> pieces = chessboard.getAllPieces(game.getActivePlayer().getColor());
    List<Piece> moveAblePieces = new ArrayList();
    
    for (Piece piece : pieces)
    {
      if (0 < piece.getAllMoves().size())
      {
        moveAblePieces.add(piece);
      }
    }
    
    int size = moveAblePieces.size();
    Random rand = new Random();
    int random = rand.nextInt(size);
    
    Piece piece = (Piece)moveAblePieces.get(random);
    Piece promotedPiece = null;
    size = piece.getAllMoves().size();
    random = rand.nextInt(size);
    
    List<Square> squares = new ArrayList(piece.getAllMoves());
    Square sq = (Square)squares.get(random);
    if ((piece instanceof Pawn))
    {
      if (Pawn.canBePromoted(sq))
      {
        promotedPiece = new Queen(chessboard, game.getActivePlayer());
      }
    }
    return new Move(piece.getSquare(), sq, piece, sq.getPiece(), promotedPiece);
  }
}
