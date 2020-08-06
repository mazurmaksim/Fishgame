
package FishDom;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Worm {
    private BufferedImage worm;
    public int count=0;
    private int x = 0;
    private int y = 0;
    public final int WI = 800-50, HE = 400-50; 
    
    Worm() throws IOException{
        
        this.x = ((int) (Math.random() * WI));
        this.y = ((int) (Math.random() * HE));
        this.worm = ImageIO.read(Worm.class.getResource("/worm_red.png"));
    
    }
     
    public void setWorm(BufferedImage worm){
    
        this.worm = worm;
    
    }

    public int getHeight(){
    
        return worm.getHeight();
    }
    
    public int getWidth(){
    
        return worm.getWidth();
    }
    
    public BufferedImage getWorm(){
    
        return worm;
    }
    
    
    
    public void setX(int x){
    
        this.x = x;
    
    }

    public void setY(int y){
    
        this.y = y;
    
    }
    
    public int getX(){
    
        return x;
    }

      public int getY(){
    
        return y;
    }
      
  
      
     
}
