public class TronGame {
    private static final int WIDTH = 12;
    private static final int HEIGHT = 12;
  
    public static void main(String[] args) {
      MhScreen screen = new MhScreen(WIDTH, HEIGHT);
    }
  
    static class MhScreen {
      private int width;
      private int height;
  
      public MhScreen(int width, int height) {
        this.width = width;
        this.height = height;
  
        for (int x = 0; x < width; x++) {
          for (int y = 0; y < height; y++) {
            drawPoint(x, y, '*');
          }
        }
      }
  
     // Draws a point on the screen at position (x, y).
      private void drawPoint(int x, int y, char symbol) {
        // Code to draw a point goes here..
      }
    }
  }