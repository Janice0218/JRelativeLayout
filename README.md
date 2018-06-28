# JRelativeLayout
A Relative layout for JFrame just like the one you have in Android  
Since this is the first version , expect improvements soon
Feedbacks are appreciated...
## Usage
1)download the java file and import it to your project
2)create its constructor in your file
## Documentation:
public class JRelativeLayout {
    
    public JRelativeLayout(JFrame n ,int width,int height) {
     // n=current frame
     // size of n = width*height
     
    }

    public JRelativeLayout(JFrame n, int padd, int margin, int width, int height) {
        // n=current frame
     // size of n = width*height
     // marging of components=margin
     // padding of frame =frame
     }
    
    public void toRight(JComponent o1,JComponent o2,int w,int h)
    {
        //set o2 to the right of o1
        // size of o2= w*h
    }
     public void toLeft(JComponent o1,JComponent o2,int w,int h)
    {
          //set o2 to the left of o1
        // size of o2= w*h
    }
      public void above(JComponent o1,JComponent o2,int w,int h)
    {
          //set o2 above o1
        // size of o2= w*h
    }
       public void below(JComponent o1,JComponent o2,int w,int h)
    {
          //set o2 below o1
        // size of o2= w*h
    }
       public void ParentCentre(JComponent o1,int w,int h)
       {
            //set o1 at frame centre
        // size of o1= w*h
       }
       public void VerticalCentre(JComponent o1,int w,int h)
       {
           //set o1 at vertical centre of frame
        // size of o1= w*h
           
       }
       public void HorizontalCentre(JComponent o1,int w,int h)
       {
         //set o1 at horizontal centre of frame
        // size of o1= w*h
        }
      }
