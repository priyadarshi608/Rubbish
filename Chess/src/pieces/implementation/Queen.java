package pieces.implementation;

import chess.Chessboard;
import pieces.Piece;
import pieces.traits.behaviors.implementation.BishopBehavior;
import pieces.traits.behaviors.implementation.RookBehavior;
import players.Player;

































public class Queen
  extends Piece
{
  public Queen(Chessboard chessboard, Player player)
  {
    super(chessboard, player);
    value = 9;
    symbol = "Q";
    addBehavior(new RookBehavior(this));
    addBehavior(new BishopBehavior(this));
  }
}
