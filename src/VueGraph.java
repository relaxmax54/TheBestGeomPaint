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
		modele=(Cercle)o;
		System.out.println("update");
		repaint();
	}
	public void paint(Graphics g){
		super.paint(g);
		if(modele instanceof Cercle){
			g.setColor(modele.getCouleurContour());
			g.drawOval(((Cercle)modele).getX()-((Cercle)modele).getTaille()/2,((Cercle)modele).getY()-((Cercle)modele).getTaille()/2,((Cercle)modele).getTaille(),((Cercle)modele).getTaille());
			if(modele.isSelected()){
				g.drawRect(((Cercle)modele).getX()-2, ((Cercle)modele).getY()-2, 4,4);//dessine le centre
				g.drawRect(((Cercle)modele).getX()+((Cercle)modele).getTaille()/2-2, ((Cercle)modele).getY()-2, 4,4);//dessine le point du rayon
			}
		}
	}
}
