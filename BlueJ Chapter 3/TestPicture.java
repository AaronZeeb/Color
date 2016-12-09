
/**
 * Kevin Hayes
 * Test Picture Classes
 * 
 * @author (Kevin Hayes) 
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List;

public class TestPicture
{

    /**
     * main method, to test the picture
     *  
     */
  public static void main(String[] args)
  {
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
     
     Picture apic = new Picture("images\\beach.jpg");
     Picture baby = new Picture("images/tcatfourmonths.jpg");
     apic.explore();
     baby.explore();
     
     Picture apic=new Picture("images/tcatfourmonths.jpg");
     Picture apic=new Picture("images/tcatfourmonths.jpg");
     Picture apic=new Picture("images/tcatfourmonths.jpg");
     Picture apic=new Picture("images/tcatfourmonths.jpg");
     Picture apic=new Picture("images/tcatfourmonths.jpg");
     Picture apic=new Picture("images/tcatfourmonths.jpg");
     
     
     int[] numbers = new int[10];
     System.out.println(numbers[5]+"-1");
     Pixel [] pixels;
     //gets all of the pixels in the picture and assigns to pixels array 
     pixels = baby.getPixels();
     System.out.println(pixels.length);
     
     
     
     System.out.println(pixels[17]);
     System.out.println(pixels[17].getColor());
     
     pixels[17].setColor(Color.blue);
     
     
     
     for(Pixel Spot : pixels)
     {
        System.out.println(spot);
    }
     /** 
      * Method to clear red from picture
      * @param none
      * @return none 
      */
    for(Pixel pixelObj : pixels)
        {
            pixelObj.SetGreen(0);
        }
     baby.explore();
     
     /**
      * Method tp reduce red from picture
      */
     int value;
     final double FACTOR = .5;
        for(Pixel pixelObj : pixels)
        {
            //gets the red value
            value=pixelObj.getRed();
            //System.out.println(value);
            
            //decrease the red value by 50%
            value=(int)(value *FACTOR);
            
            //set the red value of the current pixel  
        
        }
     
     
     pixels=baby2.getPixels();
     Color color;
     for(Pixel pixelObj : pixels)
        //pixelObj is the current pixel/spot
        
        //gets the current color
        color= pixelObj.getColor();
        
        //gets the lighter color
        color=color.brighter();
        
        //set the pixel color to the lighter color 
        
        pixelObj.setColor(color);

     /**
      * Method to simulate a sunset by decreasing the green and blue
      */   
     Picture beach=new Pictures("images//beach.jpg");
     Pixel[] pixelArray = beach.getPixels();
     apic2.explore;
     value=0;
     
     
     int value;
     final double FACTOR = .7;
     for(Pixel spot : pixelArray)
     {//spot is the current pixel
         value=pixelObj.getBlue();
         value=(int)(value *FACTOR);
         
         value=pixelObj.getGreen();
         value=(int)(value *FACTOR);
         
        }
     beach.explore();
     
     
     Pixel[]pixelArray = apic.getPixels();
     int intensity=0;
     
     for()
     {
        //get the current color
        
        //compute the intensity of the pixel (average value)
        intensity=(int) ((pixel.getRed()+pixel.getGreen()+pixel.getBlue())/3;
        
        //set the pixel color to the new color
        pixel.setColor(new Color(intensity,intensity,intensity));
        
        
        pixel.setColor();
        
        }
     /**/
  }
}
