package debercolor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Buton extends JPanel{
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);    
        
    }

    public Buton(){
        
        AccionColor accionVerde= new AccionColor("VERDE (V)", Color.GREEN);
        AccionColor accionRojo= new AccionColor("ROJO (R)", Color.RED);
        AccionColor accionAmar= new AccionColor("AMARILLO (A)", Color.YELLOW);
       
        JButton BTNVERDE = new JButton(accionVerde);
        add(BTNVERDE);
        JButton BTNROJO = new JButton(accionRojo);
        add(BTNROJO);
        JButton BTNAMAR = new JButton(accionAmar);
        add(BTNAMAR);
        
        InputMap mapaent= getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        mapaent.put(KeyStroke.getKeyStroke("ctrl V"), "Fondo Verde");
        mapaent.put(KeyStroke.getKeyStroke("ctrl R"), "Fondo Rojo");
        mapaent.put(KeyStroke.getKeyStroke("ctrl A"), "Fondo Amarillo");
        
        
        ActionMap mapaAccion= getActionMap();
        mapaAccion.put("Fondo Verde", accionVerde);
        mapaAccion.put("Fondo Rojo", accionRojo);
        mapaAccion.put("Fondo Amarillo", accionAmar);
    }
    
    private class AccionColor extends AbstractAction{
        public AccionColor(String Nombre, Color colorb){
          putValue(Action.NAME, Nombre);
          putValue(Action.SHORT_DESCRIPTION, "Poner el fondo de color " + Nombre);
          putValue("Color_de_Fondo", colorb);
        }

        @Override
        public void actionPerformed(ActionEvent e){
            Color c=(Color)getValue("Color_de_Fondo");
            setBackground(c);
        }
    }
}












