import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class VueGraph extends ControleurGraph implements Observer{
	
	public VueGraph(){
		setBackground(new Color(255, 255, 255));
	}
	public void update(Observable o,Object arg1){
		modele=(Disque)o;
		repaint();
	}
	public void paint(Graphics g){
		super.paint(g);
		if(modele!=null)
			g.setColor(modele.getCouleur());
			g.drawRect(modele.getX()-2, modele.getY()-2, 4,4);//dessine le centre
			g.drawRect(modele.getX()+modele.getTaille()/2-2, modele.getY()-2, 4,4);//dessine le point du rayon
			g.drawOval(modele.getX()-modele.getTaille()/2,modele.getY()-modele.getTaille()/2,modele.getTaille(),modele.getTaille());
	}
}
