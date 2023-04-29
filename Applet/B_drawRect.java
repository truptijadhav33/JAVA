import java.applet.*;
import java.awt.*;
public class B_drawRect extends Applet{
    /*
     <applet code="B_Hello" width=500 height=500></applet>
     */
    public void paint(Graphics g){
        // g.drawString("Hii , Good Morning", 200, 100);
        g.drawRect(100, 100,50,20);
    }
}
