import java.util.Observable;


public class Disque extends Observable {
	int taille;
	
	public Disque(){
		taille=10;
	}
	public int getTaille(){
		return taille;
	}
	public void setTaille(int t){
		if(t>0)
		taille=t;
		setChanged();
		notifyObservers();
	}
}
