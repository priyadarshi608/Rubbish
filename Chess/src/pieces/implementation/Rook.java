package pieces.implementation;

import chess.Chessboard;
import pieces.Piece;
import pieces.traits.behaviors.implementation.RookBehavior;
import players.Player;

































public class Rook
  extends Piece
{
  protected boolean wasMotioned = false;
  
  public Rook(Chessboard chessboard, Player player)
  {
    super(chessboard, player);
    value = 5;
    symbol = "R";
    addBehavior(new RookBehavior(this));
  }
  



  public boolean getWasMotioned()
  {
    return wasMotioned;
  }
  



  public void setWasMotioned(boolean wasMotioned)
  {
    this.wasMotioned = wasMotioned;
  }
}
