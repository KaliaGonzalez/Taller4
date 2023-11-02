package uniandes.dpoo.taller5.interfaz;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import uniandes.dpoo.taller4.modelo.RegistroTop10;
import uniandes.dpoo.taller4.modelo.Tablero;
import uniandes.dpoo.taller4.modelo.Top10;


@SuppressWarnings("serial")
public class Interfaz extends JFrame{ 
	private RegistroTop10 registro; 
	private Tablero tablero; 
	private Top10 top10; 
	private PanelConfiguracion configuracion; 
	private PanelInformacion informacion; 
	private JPanel opciones; 
	private PanelTablero table; 
	
	public Interfaz () { 
		setTitle("LightsOut");
		setSize( 900, 700 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
        setLayout( new BorderLayout( ) );
        opciones = new PanelOpciones(this); 
        add( opciones, BorderLayout.EAST); 
        setResizable( false );
        setLocationRelativeTo( null ); 
        informacion = new PanelInformacion(this); 
        add(informacion,BorderLayout.SOUTH);  
        
        
        
        // Configurar ventana para llamar al metodo dispose() al cerrar la ventana
        setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
	}
	
	public void nuevoTablero() {}
 
	public void reiniciarJuego() {} 
	
	public void mostrarTop10() {} 
	
	public void cambiarJugador() {}
	
	
	
	
	
	

	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
            // Unifica la interfaz para Mac y para Windows.
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

            Interfaz interfaz = new Interfaz( );
            interfaz.setVisible( true );
        }
        catch( Exception e )
        {
            e.printStackTrace( );
        }
	}

}
