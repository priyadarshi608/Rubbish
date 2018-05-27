package pieces.implementation;

import chess.Chessboard;
import pieces.Piece;
import pieces.traits.behaviors.implementation.KnightBehavior;
import players.Player;




















public class Knight
  extends Piece
{
  public Knight(Chessboard chessboard, Player player)
  {
    super(chessboard, player);
    value = 3;
    symbol = "N";
    addBehavior(new KnightBehavior(this));
  }
}
