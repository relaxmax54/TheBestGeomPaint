import java.awt.Dimension;
import java.util.Scanner;
import javax.swing.JFrame;


public class ControlText{
	public static void main(String[] args){
		Disque d=new Disque();
		VueTexte vt=new VueTexte();
		VueGraph vg=new VueGraph();
		vg.setPreferredSize(new Dimension(100,100));
		JFrame f=new JFrame();
		f.setContentPane(vg);
		f.pack();
		f.setVisible(true);
	
		d.addObserver(vt);
		d.addObserver(vg);
		d.setTaille(10);
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		while(choix>0){
			d.setTaille(choix);
			choix=sc.nextInt();
		}
		sc.close();
		System.exit(1);
	}	
}
