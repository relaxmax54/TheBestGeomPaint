import javax.swing.JPanel;

public class Dessin extends JPanel {
	public static FormesGeo modele;
	public static VueTexte texte;
	public static VueGraph graph;
	
	public Dessin(){
		modele=new FormesGeo();
	}
	
	public static void setModele(FormesGeo m){
		modele=m;
		modele.addObserver(texte);
		modele.addObserver(graph);
		System.out.println("setModele" );
	}
	public static void addModele(Cercle c){
		c.addObserver(texte);
		c.addObserver(graph);
	}
}
