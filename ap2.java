import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ap2 extends Applet {
	
	public void paint(Graphics g) {
		
		g.setColor(Color.YELLOW);
		g.fillOval(50, 50, 200, 200);
		
		g.setColor(Color.BLACK);
		g.fillOval(90, 100, 30, 30);
		g.fillOval(180, 100, 30, 30);
		
		g.drawArc(100, 120, 100, 60, 180, -180);
	}
}

/*<applet code="ap2.class" width="300" height="300" ></applet>*/