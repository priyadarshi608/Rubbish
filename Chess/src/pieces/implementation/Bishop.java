package pieces.implementation;

import chess.Chessboard;
import pieces.Piece;
import pieces.traits.behaviors.implementation.BishopBehavior;
import players.Player;



































public class Bishop
  extends Piece
{
  public Bishop(Chessboard chessboard, Player player)
  {
    super(chessboard, player);
    value = 3;
    symbol = "B";
    addBehavior(new BishopBehavior(this));
  }
}
