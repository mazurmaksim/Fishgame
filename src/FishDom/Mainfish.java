/*

 */
package FishDom;

import javax.swing.JFrame;

public class Mainfish {
 public static final int WIDTH = 800, HEIGHT = 400; 
    private JFrame window;
    private TFish board;
   
    public Mainfish(){
    window = new JFrame("Fish game");
    window.setSize(WIDTH,HEIGHT);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setResizable(false);
    window.setLocationRelativeTo(null);
    board = new TFish();
    window.add(board);
    window.addKeyListener(board);
    window.setVisible(true);
   }
    public static void main(String[] args) {
        new Mainfish();
    }
    
}
