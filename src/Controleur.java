import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Controleur extends JSlider {
	FormesGeo modele;
	
	public Controleur(FormesGeo d){
		super();
		modele=d;
		setValue(0);
		
		setMaximum(100);
		setMinimum(1);
		
		addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent arg0){
				if(modele!=null)
				((Cercle)modele).setTaille(getValue());
			}
		});
		
	}
}
