
package FishDom;

//import static com.sun.javafx.scene.control.skin.Utils.getResource;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Fish {
    private BufferedImage fish;
    private boolean direction= false;
    private  int x = 200;
    private  int y = 200;
    
    Fish() throws IOException{
         this.fish = ImageIO.read(Fish.class.getResource("/shark.png"));
    }
    
    public int getX(){
    
    return x;
    
    }
    
    public int getY(){
    
    return y;
    
    }
    
    public void setX(int x){
    
        this.x = x;
    
    }
    
     public void setY(int y){
    
        this.y = y;
    
    }
   
     public boolean getDirection(){
        return direction;
    
    }
   
     public void setDirection(boolean direction){
     
         this.direction = direction;
     
     }
     
    public int getHeight(){
        return fish.getHeight();
    
    }
    
    public int getWidth(){
    
        return fish.getWidth();
    }
    
    public BufferedImage getFish(){
    
    return fish;
    
    }
     public BufferedImage setFish(BufferedImage fish){
    
    return fish;
    
    }
     
     //Метод обертання риби
    public BufferedImage direction(Fish fish, boolean direction) throws IOException, InterruptedException{
        if (direction){
        return  fish.rotateFish(fish.getFish());
        }
        else{
            return fish.getFish();
        }
        
    }
    public BufferedImage rotateFish(BufferedImage fish) throws IOException,InterruptedException{
        
        AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
        tx.translate(-fish.getWidth(null), 0);
        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
        fish = op.filter(fish, null);
        return fish;
    }
   
   
    
}
