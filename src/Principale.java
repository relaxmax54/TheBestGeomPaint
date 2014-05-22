import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;


public class Principale {
	public static void main(String[] args){
		Disque d=new Disque();
		
		VueTexte vt=new VueTexte();
		VueGraph vg=new VueGraph();
		
		d.addObserver(vt);
		d.addObserver(vg);
		
		Controleur c=new Controleur(d);
		
		JFrame frame=new JFrame();
		frame.setLayout(new BorderLayout());
		c.setPreferredSize(new Dimension(100,50));
		vg.setPreferredSize(new Dimension(200,200));
		
		frame.getContentPane().add(vg,BorderLayout.NORTH);
		frame.getContentPane().add(c,BorderLayout.SOUTH);
		
		frame.pack();
		frame.setSize(new Dimension(300,300));
		frame.setVisible(true);
		c.setValue(10);
	}
}
