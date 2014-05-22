import java.awt.Color;
import java.util.Observable;

public class Disque extends Observable {
	int taille;
	Color couleur;
	
	public Disque(){
		taille=10;
	}
	public int getTaille(){
		return taille;
	}
	public Color getCouleur(){
		return this.couleur;
	}
	public void setTaille(int t){
		if(t>0)
		taille=t;
		setChanged();
		notifyObservers();
	}
	public void setCouleur(Color c){
		this.couleur=c;
		setChanged();
		notifyObservers();
	}
}
