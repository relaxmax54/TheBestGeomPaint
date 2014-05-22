import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class ControleurGraph extends JPanel implements MouseListener, MouseMotionListener{
	int lastX,lastY;
	
	public ControleurGraph(){
		addMouseListener(this);
    	addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent arg0) {
		/*System.out.println(menu.getCursor());
		boolean dep = menu.getDeplace();
		System.out.println(dep);
		boolean siz = menu.getRedim();
		System.out.println(siz);
		if(dep == true){
			setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
		}
		if(siz == true){
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}
		if((dep == false)&&(siz == false)){
			setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		}*/
	}
	public void mouseClicked(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {
		if (SwingUtilities.isLeftMouseButton(e)) {		
			this.lastX=e.getX();
			this.lastY=e.getY();
		}
		else if (SwingUtilities.isMiddleMouseButton(e)) {
	    	repaint();
		}
	}
	public void mouseReleased(MouseEvent e) {
		/*if (SwingUtilities.isLeftMouseButton(e)) {
			this.x=e.getX();
			this.y=e.getY();
			System.out.println("mouse released Plateau");
			Graphics g=getGraphics();
	    	g.setColor(couleur);
	    	switch(menu.getChoix()){
	    	case 2:
	    		if(lastX<x){
		    		//l = x-lastX;
		    		deuxX = x;
		    		oriX = lastX;
		    	}
		    	else{
		    		//l = lastX-x;
		    		deuxX = lastX;
		    		oriX = x;
		    	}
		    	if(lastY<y){
		    		//h = y-lastY;
		    		deuxY = y;
		    		oriY = lastY;
		    	}
		    	else{
		    		//h = lastY-y;
		    		deuxY = lastY;
		    		oriY = y;
		    	}
		    	dessin.add(new Rectangle(new Point(oriX, oriY), new Point(deuxX, deuxY)));
		    	//g.fillRect(oriX,oriY,l,h);
		    	repaint();
		    	break;
	    	/*case 3:
	    		if(lastX<x){
		    		l = x-lastX;
		    		oriX = lastX;
		    	}
		    	else{
		    		l = lastX-x;
		    		oriX = x;
		    	}
		    	if(lastY<y){
		    		h = y-lastY;
		    		oriY = lastY;
		    	}
		    	else{
		    		h = lastY-y;
		    		oriY = y;
		    	}
	    		g.fillOval(oriX, oriY, l, h);
	    		break;
	    	
	    	}*/
	}
	public void mouseDragged(MouseEvent e) {
			Graphics g=getGraphics();
			lastX=e.getX();
			lastY=e.getY();
			System.out.println(lastX+" "+lastY);
	}
	public void mouseMoved(MouseEvent e){
		
	}
}