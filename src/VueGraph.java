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
			g.setColor(modele.getCouleur());
			g.drawRect(modele.getTaille()/2-2, modele.getTaille()/2-2, 4,4);//dessine le centre
			g.drawRect(modele.getTaille()-2, modele.getTaille()/2-2, 4,4);//dessine le point du rayon
			g.drawOval(0, 0, modele.getTaille(), modele.getTaille());
	}

}
