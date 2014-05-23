
import java.awt.Color;
import java.util.Observable;

public class FormesGeo extends Observable{//MODELE
	protected final static int carre=4;//largeur des petits carrés de sélection
	public static int choix=0;
	private boolean selected;
	private Color couleurRemplissage; //Couleur des bordures
	private Color couleurContour; //Couleur de remplissage
	
	public FormesGeo(){
		selected = true;
	}
	public void selected(){
		selected = true;
		setChanged();//une forme géométrique sélectionnée doit être différentiable des autres formes
		notifyObservers();
	}
	public void unSelected(){
		selected = false;
		setChanged();//les formes non sélectionnées doivent être différentiable des autres formes
		notifyObservers();
	}
	public boolean isSelected()	{
		return selected;
	}
	public Color getCouleurContour()
	{
		return couleurContour;
	}
	public void setCouleurContour(Color c)
	{
		this.couleurContour = c;
		setChanged();
		notifyObservers();
	}
	public Color getCouleurRemplissage()
	{
		return couleurRemplissage;
	}
	public void setCouleurRemplissage(Color c){
		couleurRemplissage = c;
		setChanged();
		notifyObservers();
	}
}
