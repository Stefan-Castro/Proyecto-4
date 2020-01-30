package debercolor;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class Ventana extends JFrame{

    public Ventana(){
        
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension size = t.getScreenSize();
        int alt= size.height;
        int anch = size.width;
        setSize(alt/2 , anch/2);
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
        setTitle("ALEXANDER CASTRO");
        EventMouse EventoRaton = new EventMouse();
        addMouseListener(EventoRaton);
        addMouseMotionListener(EventoRaton);
        EventosTecla Tecla = new EventosTecla();
        addKeyListener(Tecla);
        
        Buton mibuton = new Buton();
        add(mibuton);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class EventMouse implements MouseListener,MouseMotionListener{
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Haz Hecho Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("Acabas de presionar el botón izquierdo");
        } 
        else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
            System.out.println("Acabas de presionar la rueda del ratón");
        } 
        else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
            System.out.println("Acabas de presionar el botón derecho");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Acabas de Levantar");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de Entrar"); 
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de Salir");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estás arrastrando");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estás moviendo");
    }
}

class EventosTecla implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {
        char let = e.getKeyChar();
        System.out.println("El caracter presionado es: " + let);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int codigo = e.getKeyCode();
        System.out.println(codigo);
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
