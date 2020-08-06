/*

 */
package FishDom;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class TFish extends JPanel implements KeyListener{
    
    public final int WI = 600, HE = 300; 
    private Fish fish;
    private Worm worm;
    private BufferedImage back;
    private static int count;
    
    TFish(){
         try {
            fish = new Fish();
            worm = new Worm();
            back = ImageIO.read(TFish.class.getResource("/fishback.png"));
            
        } catch (IOException ex) {
           
    }
        
}
    
        @Override 
    public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(back,0,0,null);
            g.setFont(new Font("Arial",Font.BOLD,40));
            g.setColor(Color.red);
            g.drawString("SCORE: ", 530, 40);
            g.drawString(String.valueOf(count), 700, 40);
        try {
            g.drawImage(newWorm().getWorm(), worm.getX(), worm.getY(), null);
            g.drawImage(fish.setFish(fish.direction(fish, fish.getDirection())),fish.getX(),fish.getY(),null);
        } catch (IOException ex) {
        } catch (InterruptedException ex) {
            
              }
         
            repaint(); 
           
         }
    
    public Worm newWorm() throws IOException{
        for (int i = fish.getX(); i < fish.getWidth()+fish.getX(); i++) {
            for (int j = worm.getX(); j < worm.getWidth()+worm.getX(); j++) {
               
                        for (int l = fish.getY(); l < fish.getHeight()+fish.getY(); l++) {
                            for (int k = worm.getY(); k < worm.getHeight()+worm.getY(); k++) {
                                 if (i == j && l == k) {
                    
            count++;
            worm.setX(((int) (Math.random() * 600)));
            worm.setY(((int) (Math.random() * 300)));
            return new Worm();
                   }
                }
            }
        }
    }
        return worm;
    }
  
    
      @Override
    public void keyTyped(KeyEvent e) {
       
    }

    @Override
    public void keyPressed(KeyEvent e)  {
       
        if (e.getKeyCode()==KeyEvent.VK_LEFT) {
            if (fish.getX()>0) {
                // встановлюю значення ліво
                fish.setDirection(true);
           
            fish.setX(fish.getX()-3);    
            }
            
        }
        if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
           
            if (fish.getX() < 800 - fish.getFish().getWidth()) {
                // встановлюю значення право
                fish.setDirection(false);
                fish.setX(fish.getX()+3);
            }
            
            
        }
        if (e.getKeyCode()==KeyEvent.VK_UP) {
            if (fish.getY()>0) {
               fish.setY(fish.getY()-3);
             
            }
            
        }
        if (e.getKeyCode()==KeyEvent.VK_DOWN) {
            if (fish.getY() < 400 - fish.getFish().getHeight()) {
                fish.setY(fish.getY()+3);
            }
            
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
     
        }
 
    }
