package ai;

import chess.Game;
import moves.Move;

public abstract interface AI
{
  public abstract Move getMove(Game paramGame, Move paramMove);
}
