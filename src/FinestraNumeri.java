import javax.swing.JFrame;
import javax.swing.JLabel;

public class FinestraNumeri extends JFrame {
    JLabel numeroTel = new JLabel();
    JLabel label = new JLabel("NUMERO DI TELEFONO: ");
    FinestraNumeri(Rubrica r, String nome){
        this.setSize(500, 100);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setVisible(false);
        this.setTitle("Numeri di telefono");
        this.setLayout(null);
        this.setResizable(false);

        this.add(numeroTel);
        this.add(label);

        label.setBounds(10, 10, 150, 50);
        label.setLayout(null);
        label.setFocusable(false);

        numeroTel.setBounds(170, 10, 100, 50);
        numeroTel.setLayout(null);
        numeroTel.setFocusable(false);
        numeroTel.setText(r.rubrica.get(nome));
    }

}
