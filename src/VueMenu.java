import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JPanel;


public class VueMenu extends JPanel implements ActionListener{
	private static final int tailleMenu = 10;
	private Bouton[] bouton = new Bouton[tailleMenu];
	Disque modele;
	
	public VueMenu(Disque d){
		modele=d;
		setPreferredSize(new Dimension(710,35));
		setLayout(new GridLayout(1, 10, 39, 5));
		
		//Définition d"un groupe de boutons radio pour ne sélectionner qu'une figure à dessiner à la fois
		ButtonGroup radio=new ButtonGroup(); 
		String[] labelImage={"Retour","Refaire","Rectangle","Cercle","Triangle","Polygone","Move","Resize","Unaffected","Couleur"};
		String[] commentaire={"Retour","Refaire","Dessiner un Rectangle","Dessiner un Cercle","Dessiner un Triangle","Dessiner un Polygone","Deplacer","Redimensionner","Non affecté","Changer la couleur"};
		for(int i=0;i<tailleMenu;i++){
			bouton[i]=(Bouton)this.add(new Bouton(new ImageIcon("./Image/"+labelImage[i]+".png"), labelImage[i]));
			bouton[i].setBackground(new Color(255, 255, 255));
			bouton[i].setToolTipText(commentaire[i]);
			bouton[i].addActionListener(this);
		}
		MouseAdapter actionListener = new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Color background = JColorChooser.showDialog(null,"Changer de Couleur", null);
                if (background != null) {
                	bouton[9].setBackground(background);
                	modele.setCouleur(background);
                }
            }
        };
		bouton[9].setBackground(new Color(0, 0, 0));
        bouton[9].addMouseListener(actionListener);
		for(int i=0;i<0;i++){
			radio.add(bouton[i]);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == bouton[2]) {
            System.out.println("Rectangle" );
        } else if (source == bouton[3]) {
            System.out.println("Cercle" );
        } else if (source == bouton[4]) {
            System.out.println("Triangle" );
        } else if (source == bouton[5]) {
            System.out.println("Polygone" );
        }
	}

}
