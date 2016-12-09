import java.awt.*;
import java.util.*;
import java.util.List;
public class Color
{
    public static void main(String[]args)
    {
    Picture pic = new Picture("bookClasses\\images\\beach.jpg");
    pic.explore();
    
    Picture pic1 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray=pic1.getPixels();
    for(Pixel spot : pixelArray)
    {
        spot.setBlue(255);
    }
    pic1.explore();
    Picture pic2 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray2=pic2.getPixels();
    for(Pixel spot : pixelArray2)
    {
        spot.setGreen(255);
    }
    pic2.explore();
    Picture pic3 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray3=pic3.getPixels();
    for(Pixel spot : pixelArray3)
    {
        spot.setRed(255);
    }   
    pic3.explore();
    Picture pic4 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray4=pic4.getPixels();
    int red,blue,green;
    for(Pixel spot : pixelArray4)
    {
        red=spot.getRed();
        
        blue=spot.getBlue();
        
        green=spot.getGreen();
        
        red=255-red;
        blue=255-blue;
        green=255-green;
        spot.setRed(red);
        spot.setBlue(blue);
        spot.setGreen(green);
    }
    pic4.explore();
    
    Picture pic5 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray5=pic5.getPixels(); 
    int red2,blue2,green2;
    final double FACTOR =5.;
    final double FACTOR2=.25;
    final double FACTOR3=1.5;
    for(Pixel spot : pixelArray5)
    {
        red2=spot.getRed();
        red2=(int)(red2*FACTOR);
        spot.setRed(red2);
        
    }
    pic5.explore();
    
    Picture pic6 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray6=pic6.getPixels(); 
    for(Pixel spot : pixelArray6)
    {
        blue2=spot.getBlue();
        blue2=(int)(blue2*FACTOR);
        spot.setBlue(blue2);
    }
    pic6.explore();
    
    Picture pic7 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray7=pic7.getPixels(); 
    for(Pixel spot : pixelArray7)
    {
        green2=spot.getGreen();
        green2=(int)(green2*FACTOR);
        spot.setGreen(green2);
    }
    pic7.explore();
    
    Picture pic8 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray8=pic8.getPixels();
    int red3, green3, blue3;
    for(Pixel spot : pixelArray8)
    {
        green3=spot.getRed();                  
        spot.setBlue(green3);  
        spot.setGreen(green3);
        spot.setRed(green3);
    }
    pic8.explore();
    
    Picture pic9 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray9=pic9.getPixels(); 
    int red4, green4, blue4;
    for(Pixel spot : pixelArray9)
    {
        red4=spot.getRed();
        green4=spot.getGreen();
        blue4=spot.getBlue();
        
        red4=red4*2;
        green4=green4*2;
        blue4=blue4*2;
        
        spot.setRed(red4);
        spot.setGreen(green4);
        spot.setBlue(blue4);
    }
    pic9.explore();
    
    Picture pic10 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray10=pic10.getPixels();
    int red5, green5, blue5;
    for(Pixel spot : pixelArray10)
    {
        int valuered=0,valuegreen=0,valueblue=255;
        red5=spot.getRed();
        if(red5<105&&red5>95)
            spot.setRed(valuered);
        green5=spot.getGreen();
        if(green5<155&&green5>145)
            spot.setGreen(valuegreen);
        blue5=spot.getBlue();
        if(blue5<15&&blue5>145)
            spot.setBlue(valueblue) ;       
        
    }
    pic10.explore();
    
    Picture pic11 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray11=pic11.getPixels();
    int red6,green6;
    for(Pixel spot : pixelArray11)
    {
        green6=spot.getGreen();
        red6=spot.getRed();
        
        green6=red6;
        spot.setGreen(green6);
    }
    pic11.explore();
    
        
    Picture pic12 = new Picture("bookClasses\\images\\beach.jpg");
    Pixel [] pixelArray12=pic12.getPixels();
    int red7,green7,blue7,red8;
    for(Pixel spot : pixelArray12)
    {
        red7=spot.getRed();
        //red8=spot.getRed();
        green7=spot.getGreen();
        blue7=spot.getBlue();
        
        spot.setGreen(red7);
        spot.setBlue(green7);
        spot.setRed(blue7);
    }
    pic12.explore();
   
    
    }//end of main
}//end of class