import java.awt.Point;

public class Cercle extends FormesGeo {
	private int taille;
	private Point centre;
	
	public Cercle(){
		taille=10;
		centre=new Point();
	}
	public int getX(){
		return this.centre.x;
	}
	public int getY(){
		return this.centre.y;
	}
	public int getTaille(){
		return taille;
	}
	public void setCentre(int x, int y){
		this.centre.move(x,y);
		setChanged();
		notifyObservers();
	}
	public void setTaille(int t){
		if(t>0)
		taille=t;
		setChanged();
		notifyObservers();
	}
	public boolean testCurseurCentre(int x, int y){
		if(x>centre.getX()-carre && x<centre.getX()+carre//test le curseur du centre
		&& y>centre.getY()-carre && y<centre.getY()+carre)
			return true;
		else
			return false;
	}
	public boolean testCurseurRayon(int x, int y){
		if(x>centre.getX()+this.getTaille()/2-carre && x<centre.getX()+this.getTaille()/2+carre//test le curseur du centre
		&& y>centre.getY()-carre && y<centre.getY()+carre)
			return true;
		else
			return false;
	}
}
