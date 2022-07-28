
package ferreteria;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Usuario
 */
public class formulario {
    JFrame f = new JFrame();
    JPanel p1 = new JPanel();
    
    public void form(){
        f.setTitle("INGRESO DE DATOS");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        //para agregar las cooordenadas que aparezca en la pantalla
        f.setBounds(600,250,400,400);
        f.setVisible(true);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setLayout(null);
        f.add(p1);
        
        JLabel l1 = new JLabel("REGISTRO DE PRODUCTOS");
        l1.setBounds(120,20,200,50);
        p1.add(l1);
        
        JLabel l2 = new JLabel("CÓDIGO");
        l2.setBounds(40,90,100,25);
        p1.add(l2);
        
        JTextField t1 = new JTextField();
        t1.setBounds(120,90,100,25);
        p1.add(t1);
                
        JLabel l3 = new JLabel("NOMBRE");
        l3.setBounds(40,130,100,25);
        p1.add(l3);
        
        JTextField t2 = new JTextField();
        t2.setBounds(120,130,100,25);
        p1.add(t2);
        
        JLabel l4 = new JLabel("CANTIDAD");
        l4.setBounds(40,170,100,25);
        p1.add(l4);
        
        JTextField t3 = new JTextField();
        t3.setBounds(120,170,100,25);
        p1.add(t3);
        
        JLabel l5 = new JLabel("FABRIACIÓN");
        l5.setBounds(40,210,100,25);
        p1.add(l5);
        
        JTextField t4 = new JTextField();
        t4.setBounds(120,210,100,25);
        p1.add(t4);
        
        
        JButton b1 = new JButton("GUARDAR");
        b1.setBounds(150,270,100,25);
        p1.add(b1);
  
        ActionListener gaurdar = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Ferreteria ferre = new Ferreteria();
                ferre.crear(Integer.parseInt(t1.getText()), t2.getText(), Integer.parseInt(t3.getText()), t4.getText());   
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                t4.setText(null);
            }
            
        };
        b1.addActionListener(gaurdar);        
    }
       
    public static void main(String[] args){
        formulario f= new formulario();
        f.form();  
    } 
}
