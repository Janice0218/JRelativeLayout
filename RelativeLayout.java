import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author Mohit Agarwal
 */
public class JRelativeLayout {
     JFrame n;
     int padd;
     int margin;
     int width,height;

    public JRelativeLayout(JFrame n ,int width,int height) {
      this.n=n;
     padd=20;
     margin=20;
    this.width=width;
    this.height=height;
    n.setLayout(null);
    n.setVisible(true);
    n.setResizable(false);
    n.setSize(width, height);
    n.addWindowListener(new WindowAdapter() {

           @Override
           public void windowClosing(WindowEvent e) {
              System.exit(0);
           }

          @Override
          public void windowIconified(WindowEvent e) {
              super.windowIconified(e); //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void windowStateChanged(WindowEvent e) {
              super.windowStateChanged(e); //To change body of generated methods, choose Tools | Templates.
          }
           
        });
    }

    public JRelativeLayout(JFrame n, int padd, int margin, int width, int height) {
        this.n = n;
        this.padd = padd;
        this.margin = margin;
        this.height = height;
        this.width=width;
    n.setLayout(null);
    n.setVisible(true);
    n.setSize(width, height);
    n.setResizable(false);
    n.addWindowListener(new WindowAdapter() {

           @Override
           public void windowClosing(WindowEvent e) {
              System.exit(0);
           }
           
           
           
          @Override
          public void windowIconified(WindowEvent e) {
              super.windowIconified(e); //To change body of generated methods, choose Tools | Templates.
          }

          @Override
          public void windowStateChanged(WindowEvent e) {
              super.windowStateChanged(e); //To change body of generated methods, choose Tools | Templates.
          }
           
           
        });
    }
    
    
    public void initPos(JComponent o1,int w,int h)
    {
        o1.setBounds(padd,padd,w,h);
        n.add(o1);
        
     }
    
    public void toRight(JComponent o1,JComponent o2,int w,int h)
    {
        int x=o1.getX()+o1.getWidth()+50;
        int y=o1.getY();
        n.add(o2);
        o2.setBounds(x, y, w, h);
    }
     public void toLeft(JComponent o1,JComponent o2,int w,int h)
    {
        int x=o1.getX()-50-w;
        if(x<0)
            x=0;
        int y=o1.getY();
        n.add(o2);
        o2.setBounds(x, y, w, h);
    }
      public void above(JComponent o1,JComponent o2,int w,int h)
    {
        int x=(o2.getX()==0?o1.getX():o2.getX());
        int y=o1.getY()-h-20;
        n.add(o2);
        o2.setBounds(x, y, w, h);
    }
       public void below(JComponent o1,JComponent o2,int w,int h)
    {
        int x=(o2.getX()==0?o1.getX():o2.getX());
        int y=o1.getY()+o1.getHeight()+20;
        n.add(o2);
        o2.setBounds(x, y, w, h);
    }
       public void ParentCentre(JComponent o2,int w,int h)
       {
           o2.setBounds((width/2)-(w/2),(height/2)-(h/2), w, h);
           n.add(o2);
       }
       public void VerticalCentre(JComponent o1,int w,int h)
       {
           o1.setBounds(padd,(height/2)-(h/2),w, h);
           n.add(o1);
           
       }
       public void HorizontalCentre(JComponent o1,int w,int h)
       {
           o1.setBounds((width/2)-(w/2), padd, w, h);
           n.add(o1);
       }
      
       public void Top(JComponent o1,int x,int w,int h)
       {
           o1.setBounds(x, padd, w, h);
           n.add(o1);
       }
}
