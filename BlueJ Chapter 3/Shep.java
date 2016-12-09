public class Shep
{
    public static void main(String[]args)
    {
        Picture pic = new Picture("bookClasses\\images\\beach.jpg");
        pic.explore();
        
        Picture pic1 = new Picture("bookClasses\\images\\beach.jpg");
        Pixel [] pixelArray=pic1.getPixels();
        int green,min=255,max=0;
        for(Pixel spot : pixelArray)
        {
            
            green=spot.getRed();                  
            spot.setBlue(green);  
            spot.setGreen(green);
            spot.setRed(green);
            if (green>max)
                max=green;
            else if(green<min)
                min=green;
            int range=(max-min)/4;
            if(green>=min&&green<=(range+min))
            {
                spot.setRed(57);
                spot.setGreen(56);
                spot.setBlue(121);
            }
            else if(green>=(min+range)&&green<=min+(range*2))
            {
                spot.setRed();
                spot.setGreen();
                spot.setBlue();
            }
            else if(green>=min(range*2)&&green<=min+(range*3))
            {
                spot.setRed();
                spot.setGreen();
                spot.setBlue();                
            }
            else if(green>=min(range*3)&&green<=max)
            {
                spot.setRed();
                spot.setGreen();
                spot.setBlue();            
            }
            
        }
        pic1.explore();
        
    }
}
