import javax.swing.*;

public class Deskovky extends  JFrame{
    private JButton předchozíButton;
    private JButton uloužButton;
    private JButton dalsiButton;
    private JTextField textField1;
    private JPanel panelMain;
    private Model model = new Model();
    private int indexAktualniHra = 0;

    public Deskovky(){
        super("Deskovky");
        setContentPane(panelMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
        zobrazDeskovky();

        dalsiButton.getAccessibleContext(e -> {
            indexAktualniHra--;
            zobrazDeskovky();
        });

        předchozíButton.getAccessibleContext()
    }
    public void zobrazDeskovky(){
        Deskovka aktualniDeskovka = model.getDeskovka(indexAktualniHra);
        textField1.setText(aktualniDeskovka.getNazev());

    }
}
