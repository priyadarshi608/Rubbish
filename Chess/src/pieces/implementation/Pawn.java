package pieces.implementation;

import java.util.Set;

import chess.Chessboard;
import chess.Square;
import pieces.Piece;
import pieces.traits.behaviors.implementation.PawnBehavior;
import players.Player;






















































public class Pawn
  extends Piece
{
  protected boolean down;
  
  public Pawn(Chessboard chessboard, Player player)
  {
    super(chessboard, player);
    value = 1;
    symbol = "";
    behaviors.add(new PawnBehavior(this));
  }
  
  @Deprecated
  void promote(Piece newPiece)
  {
    throw new UnsupportedOperationException("Not supported yet.");
  }
  



  public boolean isDown()
  {
    return down;
  }
  
  public static boolean wasEnPassant(Square from, Square to)
  {
    return (from.getPozX() != to.getPozX()) && (from.getPozY() != to.getPozY()) && (null == to.getPiece());
  }
  
  public static boolean wasTwoFieldsMove(Square from, Square to)
  {
    return Math.abs(from.getPozY() - to.getPozY()) == 2;
  }
  
  public static boolean canBePromoted(Square end)
  {
    return (end.getPozY() == 0) || (end.getPozY() == 7);
  }
}
