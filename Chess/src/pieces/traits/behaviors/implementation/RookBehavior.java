package pieces.traits.behaviors.implementation;

import java.util.HashSet;
import java.util.Set;

import chess.Square;
import pieces.Piece;



















public class RookBehavior
  extends LongRangePieceBehavior
{
  public RookBehavior(Piece piece)
  {
    super(piece);
  }
  





  public Set<Square> getSquaresInRange()
  {
    Set<Square> list = new HashSet();
    
    list.addAll(getMovesForDirection(0, -1));
    list.addAll(getMovesForDirection(-1, 0));
    list.addAll(getMovesForDirection(1, 0));
    list.addAll(getMovesForDirection(0, 1));
    
    return list;
  }
}
