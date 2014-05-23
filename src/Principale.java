import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;


public class Principale {
	public static void main(String[] args){
		
		//création des modèles
		Cercle d=new Cercle();
		
		//création des vues
		VueTexte vt=new VueTexte();
		VueGraph vg=new VueGraph();
		
		d.addObserver(vt);
		d.addObserver(vg);
		
		//création des contrôleurs
		VueMenu vm=new VueMenu(d);		
		Controleur c=new Controleur(d);
		
		JFrame frame=new JFrame();
		frame.setLayout(new BorderLayout());
		c.setPreferredSize(new Dimension(700,55));
		vg.setPreferredSize(new Dimension(700,400));
		
		frame.getContentPane().add(vm,BorderLayout.NORTH);
		frame.getContentPane().add(vg,BorderLayout.CENTER);
		frame.getContentPane().add(c,BorderLayout.SOUTH);
		
		frame.pack();
		frame.setSize(new Dimension(700,490));
		frame.setVisible(true);
		c.setValue(40);
	}
}
