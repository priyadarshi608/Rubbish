package players;

import java.io.Serializable;

import chess.Chessboard;
import chess.Colors;
import pieces.Piece;

public abstract interface Player
  extends Serializable
{
  public static final String CPU_NAME = "CPU";
  
  public abstract Colors getColor();
  
  public abstract String getName();
  
  public abstract PlayerType getPlayerType();
  
  public abstract boolean isGoDown();
  
  public abstract void setGoDown(boolean paramBoolean);
  
  public abstract void setName(String paramString);
  
  public abstract void setType(PlayerType paramPlayerType);
  
  public abstract Piece getPromotionPiece(Chessboard paramChessboard);
}
