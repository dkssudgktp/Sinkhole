package stuff;

public class Queen extends Pair {
  private static byte flag = 1;
  private static byte[] dy = new byte[] { 1, 1,  1,  0, -1, -1, -1, 0 };
  private static byte[] dx = new byte[] { 1, 0, -1, -1, -1,  0,  1, 1 };

  private int[][] rating = new int[][] {
    {-20,-10,-10, -5, -5,-10,-10,-20 },
    {-10,  0,  0,  0,  0,  0,  0,-10 },
    {-10,  0,  5,  5,  5,  5,  0,-10 },
    { -5,  0,  5,  5,  5,  5,  0, -5 },
    {  0,  0,  5,  5,  5,  5,  0, -5 },
    {-10,  5,  5,  5,  5,  5,  0,-10 },
    {-10,  0,  5,  0,  0,  0,  0,-10 },
    {-20,-10,-10, -5, -5,-10,-10,-20 }
  };

  public Queen() {
    super("Queen", flag, dx, dy);
  }

  public int posRate(int ratex, int ratey) {
    return rating[ratex][ratey];
  }

  public int matRate() {
    return 900;
  }
}
