
import java.awt.Color;
import java.util.Observable;

public class FormesGeo extends Observable{//MODELE
	protected final static int carre=4;//largeur des petits carrés de sélection
	public static int choix=0;
	protected boolean selection;
	private Color couleurRemplissage; //Couleur des bordures
	private Color couleurContour; //Couleur de remplissage
	
	public FormesGeo(){
		selection = true;
	}
	public void select(){
		selection = true;
		setChanged();//une forme géométrique sélectionnée doit être différentiable des autres formes
		notifyObservers();
	}
	public void unSelect(){
		selection = false;
		setChanged();//les formes non sélectionnées doivent être différentiable des autres formes
		notifyObservers();
	}
	public boolean isSelected()	{
		return selection;
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
