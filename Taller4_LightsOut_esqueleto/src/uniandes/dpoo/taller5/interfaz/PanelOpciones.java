package uniandes.dpoo.taller5.interfaz;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
@SuppressWarnings("serial")
public class PanelOpciones extends JPanel implements ActionListener { 
	public final static String NUEVO= "Nuevo";
	public final static String REINICIAR = "Reiniciar"; 
	public final static String TOP_10 = "Top_10"; 
	public final static String CAMBIAR = "Cambiar Jugador"; 
	//Botones 
	private JButton bNuevo; 
	private JButton bReiniciar; 
	private JButton bTop_10; 
	private JButton bCambiar; 
	//Interfaz principal 
	private Interfaz ventana; 
	//metodo para la creacion de los metodos
	 public  PanelOpciones( Interfaz pVentana) { 
		 ventana = pVentana; 
		 setBackground(Color.GRAY); 
		// Configura propiedades visuales
	     setLayout( new GridLayout( 4, 4, 11,11 ) );
	     setBorder( new EmptyBorder( 6, 6, 6, 6 ) ); 
	     //Boton nuevo
	     	bNuevo = new JButton( "Nuevo" );
	        bNuevo.setActionCommand( NUEVO);
	        bNuevo.addActionListener( this );
	        bNuevo.setPreferredSize( new Dimension( 130, 10) );
	        add( bNuevo ); 
	     //Boton Reiniciar 
	        bReiniciar = new JButton( "Reinciar" );
	        bReiniciar.setActionCommand( REINICIAR);
	        bReiniciar.addActionListener( this );
	        bReiniciar.setPreferredSize( new Dimension( 130, 10 ) );
	        add( bReiniciar ); 
	     //Boton top_10 
	        bTop_10 = new JButton( "Top 10" );
	        bTop_10.setActionCommand( TOP_10);
	        bTop_10.addActionListener( this );
	        bTop_10.setPreferredSize( new Dimension( 130, 10 ) );
	        add( bTop_10 ); 
	      //Boton cambiar jugdor
	        bCambiar = new JButton( "Cambiar jugador" );
	        bCambiar.setActionCommand( CAMBIAR);
	        bCambiar.addActionListener( this );
	        bCambiar.setPreferredSize( new Dimension( 130, 10 ) );
	        add( bCambiar );
	        
	        validate();
		 
	 }

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String comando = event.getActionCommand( );

		System.out.println("Identificador/Command del Evento a atender:" + comando);

		if( comando.equals( NUEVO) )
        {
            ventana.nuevoTablero();
        }
        else if( comando.equals( REINICIAR ) )
        {
            ventana.reiniciarJuego();
        }
        else if( comando.equals( TOP_10) )
        {
            ventana.mostrarTop10();
        }
        else if( comando.equals( CAMBIAR) )
        {
            ventana.cambiarJugador();
        }
	} 
	

}
