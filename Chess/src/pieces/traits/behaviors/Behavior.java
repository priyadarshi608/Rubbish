package pieces.traits.behaviors;

import java.util.HashSet;
import java.util.Set;

import chess.Chessboard;
import chess.Colors;
import chess.Square;
import pieces.Piece;
import pieces.implementation.King;
import players.Player;
















public abstract class Behavior
{
  protected Piece piece;
  
  public Behavior(Piece piece)
  {
    this.piece = piece;
  }
  







  public abstract Set<Square> getSquaresInRange();
  







  public Set<Square> getLegalMoves()
  {
    King ourKing = piece.getPlayer().getColor() == Colors.WHITE ? piece.getChessboard().getKingWhite() : piece.getChessboard().getKingBlack();
    

    King oponentsKing = piece.getPlayer().getColor() == Colors.WHITE ? piece.getChessboard().getKingBlack() : piece.getChessboard().getKingWhite();
    
    Set<Square> result = new HashSet();
    for (Square sq : getSquaresInRange())
    {
      if (canMove(piece, sq, ourKing, oponentsKing))
      {
        result.add(sq);
      }
    }
    return result;
  }
  


  private boolean canMove(Piece piece, Square sq, King ourKing, King oponentsKing)
  {
    return (ourKing.willBeSafeAfterMove(piece.getSquare(), sq)) && ((null == sq.getPiece()) || (piece.getPlayer() != sq.getPiece().getPlayer())) && (sq.getPiece() != oponentsKing);
  }
}