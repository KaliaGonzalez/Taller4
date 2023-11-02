package uniandes.dpoo.taller5.interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class PanelInformacion extends JPanel implements ActionListener{ 
	private Interfaz interfaz;   
	private JTextField txtJugadas;
	
	public PanelInformacion (Interfaz pVentana) {  
		interfaz = pVentana;
		setLayout( new BorderLayout( ) );   
		JPanel panelInfo = new JPanel( );
        panelInfo.setLayout( new BorderLayout( ) );

        JPanel panelInfo1 = new JPanel( );
        panelInfo1.setLayout( new GridLayout( 3, 4 ) );
        panelInfo1.setBorder( new EmptyBorder( 5, 0, 0, 0 ) );
		JLabel etiquetaJugadas = new JLabel( " Jugadas:  " );  
		etiquetaJugadas.setHorizontalAlignment( JLabel.LEFT ); 
		panelInfo1.add( etiquetaJugadas );
        txtJugadas= new JTextField( );
        txtJugadas.setEditable( false );
        panelInfo1.add( txtJugadas); 
        panelInfo.add( panelInfo1, BorderLayout.SOUTH ); 
        add( panelInfo, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
    
}
