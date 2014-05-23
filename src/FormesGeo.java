
import java.util.Observable;

public class FormesGeo extends Observable{//MODELE

	private boolean selected;
	private int couleurRemplissage; //Couleur des bordures
	private int couleurContour; //Couleur de remplissage
	
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
	
	public void setCouleurRemplissage(int rgba){
		couleurRemplissage = rgba;
		setChanged();
		notifyObservers();
	}
	
	public void setCouleurContour(int rgba)
	{
		couleurContour = rgba;
		setChanged();
		notifyObservers();
	}
	
	public int getCouleurRemplissage()
	{
		return couleurRemplissage;
	}
	
	public int getCouleurContour()
	{
		return couleurContour;
	}
}
