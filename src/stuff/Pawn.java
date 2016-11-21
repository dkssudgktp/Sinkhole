package stuff;

public class Pawn extends Pair {
  public Pawn() {
    byte flag = (1 << 1);
    byte[] dx = new byte[] { 0 };
    byte[] dy = new byte[] { 1 };

    byte[] adx = new byte[] { 1, -1 };
    byte[] ady = new byte[] { 1,  1 };

    super("Pawn", flag, dx, dy, adx, ady);
  }
}
