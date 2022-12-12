import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.event.*;

public class Finestra extends JFrame implements MouseListener{
    Rubrica r = new Rubrica();
    String column[]={"NOME","NUMERO DI TELEFONO"};
    JButton bottone = new JButton(" INVIA NOME");
    JLabel label = new JLabel("INSERISCI NOME E NUMERO DI TELEFONO");
    JLabel label2 = new JLabel();
    JLabel nome = new JLabel("NOME");
    JLabel numero = new JLabel("NUMERO");
    JTextField text = new JTextField();
    JTextField text2 = new JTextField();
    JScrollPane scroll = new JScrollPane();
    JScrollPane scroll2 = new JScrollPane();

    Finestra(){
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Rubrica");
        this.setLayout(null);
        this.setResizable(false);

        this.add(bottone);
        this.add(label);
        this.add(label2);
        this.add(nome);
        this.add(numero);
        this.add(text);
        this.add(text2);
        this.add(scroll);
        this.add(scroll2);
        
        bottone.setBounds(400, 200, 300, 50);
        bottone.setLayout(null);
        bottone.setFocusable(false);
        bottone.addMouseListener(this);

        label.setBounds(420, 10, 300, 50);
        label.setLayout(null);
        label.setFocusable(false);

        label2.setBounds(420, 150, 300, 50);
        label2.setLayout(null);
        label2.setFocusable(false);

        nome.setBounds(10, 10, 145, 50);
        nome.setLayout(null);
        nome.setFocusable(false);

        numero.setBounds(170, 10, 145, 50);
        numero.setLayout(null);
        numero.setFocusable(false);

        text.setBounds(400, 100, 145, 50);
        text.setLayout(null);
        text.setFocusable(true);
        text.addMouseListener(this);

        text2.setBounds(555, 100, 145, 50);
        text2.setLayout(null);
        text2.setFocusable(true);
        text2.addMouseListener(this);
        
        scroll.setBounds(10, 50, 150, 480);

        scroll2.setBounds(170, 50, 150, 480);

    }

    @Override
    public void mouseClicked(MouseEvent e) {     
        String nome;
        String numero;
        if(e.getSource() == bottone){
            if(text.getText().equals("") || text2.getText().equals("")){
                label2.setText("INSERISCI NOME E NUMERO DI TELEFONO!");
                return;
            }
            nome = text.getText();
            numero = text2.getText();
            r.add(nome, numero);
            text.setText("");
            text2.setText("");
            JList<String> list = new JList<>(r.toArray(r)); 
            scroll.setViewportView(list);
            scroll2.setViewportView(new JList<>(r.toArrayNum()));
        }
        r.print(r);
    }
  

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

}
