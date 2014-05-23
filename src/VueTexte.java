import java.util.Observable;
import java.util.Observer;


public class VueTexte implements Observer{
	public void update(Observable o,Object arg){
		if(o instanceof Cercle)
			System.out.println("vue texte : "+((Cercle)o).getTaille());
	}
}
