package players.implementation;

import chess.Chessboard;
import chess.Colors;
import pieces.Piece;
import players.PlayerType;

public class NetworkPlayer extends ComputerPlayer {
  public NetworkPlayer() {
    playerType = PlayerType.NETWORK_USER;
  }

  public NetworkPlayer(String name, String color) {
    super(name, color);
    playerType = PlayerType.NETWORK_USER;
  }
  
  public NetworkPlayer(String name, Colors color) {
    super(name, color);
    playerType = PlayerType.NETWORK_USER;
  }

  public Piece getPromotionPiece(Chessboard chessboard) {
    return null;
  }
  
}
