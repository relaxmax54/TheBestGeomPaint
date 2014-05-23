import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;


public class Principale {
	public static void main(String[] args){
		Dessin d=new Dessin();
		//création des vues
		VueTexte vt=new VueTexte();
		VueGraph vg=new VueGraph();
		
		Dessin.texte=vt;
		Dessin.graph=vg;
			
		//création des contrôleurs
		VueMenu vm=new VueMenu(null);		
		Controleur c=new Controleur(null);
		
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
	}
}
