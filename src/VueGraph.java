import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;


public class VueGraph extends JPanel implements Observer{
	Disque modele;
	
	public void update(Observable o,Object arg1){
		modele=(Disque)o;
		repaint();
	}
	public void paint(Graphics g){
		super.paint(g);
		if(modele!=null)
			g.drawOval(0, 0, modele.getTaille(), modele.getTaille());
	}

}
