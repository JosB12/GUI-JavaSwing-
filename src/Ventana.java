import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Ventana {
    JFrame ventana;
    JPanel panelA,panelB,panelBorde,panelDeterminado1,panelDeterminado2,panelDeterminado3,subPanel1,subPanel2,subPanel3,subPanel4,subPanel5,subPanel6,subPanel7,subPanel8, panelBotones;
    JLabel label1, label2,label3,label4,label5,label6,label7;
    JCheckBox botonChek;
    String[] opcionesElegir = {"Editor predeterminado", "Editor 1", "Editor 2", "Editor 3"};
    ImageIcon icono;
    JButton boton1,boton2,boton3;


    public void panelA(){
        panelA = new JPanel();
        label1 = new JLabel();

        panelA.setBounds(16,5,270,20);

        label1.setText("Establecer propiedad jLabel1's font utilizando:");
        label1.setPreferredSize(new Dimension(270,17));


        panelA.add(label1);
    }

    public void panelB(){
        panelB = new JPanel();

        panelB.setBounds(290,5,250,29);
        JComboBox<String> menuDesplegable = new JComboBox<>(opcionesElegir);
        menuDesplegable.setPreferredSize(new Dimension(250,20));

        panelB.add(menuDesplegable);
    }
    public void panelBorde() {
        panelBorde = new JPanel();
        subPanel1 = new JPanel();
        subPanel2 = new JPanel();
        label2 = new JLabel();
        subPanel1 = new JPanel();
        label1 = new JLabel();
        subPanel3 = new JPanel();
        label3 = new JLabel();
        panelDeterminado1= new JPanel();
        panelDeterminado2= new JPanel();
        panelDeterminado3= new JPanel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        subPanel4 = new JPanel();
        subPanel5 = new JPanel();
        subPanel6 = new JPanel();
        subPanel7 = new JPanel();
        subPanel8 = new JPanel();
        label7 = new JLabel();

        //Layout nulo del borde
        panelBorde.setLayout(null);
        panelBorde.setBounds(5, 70, 526, 370);
        panelBorde.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        botonChek = new JCheckBox("Obtener el tipo de letra a partir del tipo de letra predeterminado");
        botonChek.setBounds(7,10,390,30);

        //Panel del texto fuente
        label2.setText("Fuente:");
        subPanel2.setBounds(15, 50, 50, 25);

        //panel determinado fuente
        panelDeterminado1.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        label4.setText("Tahoma");
        label4.setPreferredSize(new Dimension(165,10));
        panelDeterminado1.setBounds(15, 80, 180, 23);


        //Panel de estilo de fuente
        label1.setText("Estilo de Fuente: ");
        subPanel1.setBounds(218, 50, 100, 25); // No se moverá con setBounds de panelBorde


        //panel determinado estilo
        panelDeterminado2.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        label5.setText("Sin Formato");
        label5.setPreferredSize(new Dimension(120,10));
        panelDeterminado2.setBounds(210, 80, 130, 23);


        //Panel de Tamaño
        label3.setText("Tamaño:");
        subPanel3.setBounds(380,50, 50, 25);

        //panel determinado Tamaño
        panelDeterminado3.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        label6.setText("18");
        label6.setPreferredSize(new Dimension(120,10));
        panelDeterminado3.setBounds(360, 80, 140, 23);

        // lista de fuentes
        JList fuenteLetra;
        String[] fuentes = {"JSTOR\n", "PubMed\n", "Scopus\n", "Nature\n", "Science\n", "Altera\n"
                , "Sylfaen\n", "Symbol\n", "Tahoma\n", "Times New Roman\n", "Trebuchet MS\n", "Verdana\n", "Webding\n"};
        fuenteLetra = new JList(fuentes);
        JScrollPane scroll = new JScrollPane(fuenteLetra);
        scroll.setPreferredSize(new Dimension(180,150));
        subPanel4.setBounds(15,115, 190 , 160);

        //lista de estilos
        JList estiloLetra;
        String[] estilos = {"Sin Formato\n", "Negrita\n", "Cursiva\n", "Negrita cursiva\n"};
        estiloLetra = new JList(estilos);
        JScrollPane scroll2 = new JScrollPane(estiloLetra);
        scroll2.setPreferredSize(new Dimension(130,150));
        subPanel5.setBounds(205,115, 140 , 160);

        //lista de tamaNos
        JList tamaNoLetra;
        String[] tamaNos = {"3\n", "5\n", "8\n", "10\n", "12\n", "14\n", "18\n", "24\n", "36\n", "38\n", "42\n", "45\n", "49"};
        tamaNoLetra = new JList(tamaNos);
        JScrollPane scroll3 = new JScrollPane(tamaNoLetra);
        scroll3.setPreferredSize(new Dimension(130,150));
        subPanel6.setBounds(360,115, 140 , 160);

        subPanel7.setBounds(20,280, 475 , 80);
        Border vistaPrevia = BorderFactory.createTitledBorder(new LineBorder(Color.black), "Vista previa",TitledBorder.LEFT,TitledBorder.DEFAULT_POSITION, new Font(" ", Font.BOLD,12));;
        subPanel7.setBorder(vistaPrevia);

        label7.setText("The QUICK bown fox jumps over the lazy dog");
        label7.setFont(new Font("Helvetica",Font.BOLD,18));

        panelBorde.add(botonChek);
        subPanel2.add(label2);
        panelBorde.add(subPanel2);
        panelDeterminado1.add(label4);
        panelBorde.add(panelDeterminado1);
        panelDeterminado2.add(label5);
        panelBorde.add(panelDeterminado2);
        panelDeterminado3.add(label6);
        panelBorde.add(panelDeterminado3);
        subPanel1.add(label1);
        panelBorde.add(subPanel1);
        subPanel3.add(label3);
        panelBorde.add(subPanel3);
        subPanel4.add(scroll);
        panelBorde.add(subPanel4);
        subPanel5.add(scroll2);
        panelBorde.add(subPanel5);
        subPanel6.add(scroll3);
        panelBorde.add(subPanel6);
        subPanel7.add(label7);
        panelBorde.add(subPanel7);

    }
    public void panelBotones(){
        panelBotones = new JPanel();
        boton1 = new JButton("Aceptar");
        boton2 = new JButton("Cancelar");
        boton3 = new JButton("Ayuda");

        panelBotones.setLayout(null);

        boton1.setBounds(250,20, 80 , 20);
        boton1.setBackground(Color.lightGray);

        boton2.setBounds(337,20, 90 , 20);
        boton2.setBackground(Color.lightGray);

        boton3.setBounds(432,20, 80 , 20);
        boton3.setBackground(Color.lightGray);

        panelBotones.setBounds(20,430, 520 , 80);

        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);

    }
    public void ventanaMetodo(){
        ventana =new JFrame();
        ventana.setTitle("jLabel1 [jLabel] - font");
        ventana.setSize(554,554);
        ventana.setLayout(null);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);

        icono= new ImageIcon("azucar.png");
        ventana.setIconImage(icono.getImage());

        ventana.add(panelA);
        ventana.add(panelB);
        ventana.add(panelBorde);
        ventana.add(panelBotones);
    }
    public Ventana(){
        panelA();
        panelB();
        panelBorde();
        panelBotones();
        ventanaMetodo();
    }
}