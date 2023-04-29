import java.applet.*;
import java.awt.*;
/*
<applet code="C_apple.class" height=600 width=450>
</applet>
*/
public class C_apple extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(10,10,50,50);
        g.setColor(Color.CYAN);
        g.fillRect(50,50,100,100);
        g.setColor(Color.GREEN);
        g.drawRoundRect(100,100,150,150,50,50);
        g.setColor(Color.magenta);
        g.fillRoundRect(150,150,200,200,15,15);
    }
}