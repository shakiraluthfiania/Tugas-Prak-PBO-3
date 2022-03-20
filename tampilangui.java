
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class tampilangui extends JFrame implements ActionListener{
 JLabel labeljudul = new JLabel("KALKULATOR BALOK");
 JLabel labelpanjang = new JLabel("Panjang");
 JTextField textpanjang = new JTextField(30);
 JLabel labellebar = new JLabel("Lebar");
 JTextField textlebar = new JTextField(30); 
 JLabel labeltinggi = new JLabel("Tinggi");
 JTextField texttinggi = new JTextField(30);   
 JLabel labelhasil = new JLabel("Hasil");
 JLabel labelluas = new JLabel();
 JLabel labelkeliling = new JLabel();
 JLabel labelluaspermukaan = new JLabel();
 JLabel labelvolume = new JLabel();     
 JButton btnhitung = new JButton("Hitung");
 JButton btnreset = new JButton("Reset");

public tampilangui(){
    setTitle("Kalkulator Balok");  
    setSize(450, 0);
    setLayout(null);
    add(labeljudul);
    add(labelpanjang);
    add(textpanjang);
    add(labellebar);
    add(textlebar);
    add(labeltinggi);
    add(texttinggi);   
    add(labelhasil);
    add(labelluas);
    add(labelkeliling);
    add(labelluaspermukaan);
    add(labelvolume);  
    add(btnhitung);
    add(btnreset);
    
    labeljudul.setBounds(130,5,140,30);
    labelpanjang.setBounds(50,60,100,20);
    textpanjang.setBounds(130,60,200,20);
    labellebar.setBounds(50,85,100,20);
    textlebar.setBounds(130,85,200,20);
    labeltinggi.setBounds(50,110,100,20);
    texttinggi.setBounds(130,110,200,20);
    labelhasil.setBounds(180,135,100,30);
    labelluas.setBounds(30,185,200,30);
    labelkeliling.setBounds(30,205,200,30);
    labelluaspermukaan.setBounds(30,225,200,30);
    labelvolume.setBounds(30,245,200,30);
    btnhitung.setBounds(115,340,80,20);
    btnreset.setBounds(205,340,80,20);   
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        btnhitung.addActionListener(this);
        btnreset.addActionListener(this);
     }
       
@Override
public void actionPerformed(ActionEvent e){
int panjang,lebar,tinggi;   
    if (e.getSource() == btnhitung) {
    if (textpanjang.getText().isEmpty()) 
{
    JOptionPane.showMessageDialog(this, "Panjang tidak boleh kosong!");
} 
    else if (textlebar.getText().isEmpty()) 
{
    JOptionPane.showMessageDialog(this, "Lebar tidak boleh kosong!");
} 
    else if (texttinggi.getText().isEmpty()) 
{
    JOptionPane.showMessageDialog(this, "Tinggi tidak boleh kosong!");
} 
    else {
    try {
        panjang = Integer.parseInt(textpanjang.getText());
        lebar = Integer.parseInt(textlebar.getText());
        tinggi = Integer.parseInt(texttinggi.getText());
        balok balok = new balok(panjang, lebar, tinggi);
        labelluas.setText("Luas Persegi Panjang            :  " + balok.luas());
        labelkeliling.setText("Keliling Persegi Panjang    :  " + balok.keliling());
        labelluaspermukaan.setText("Luas Permukaan Balok   :  " + balok.luaspermukaan());
        labelvolume.setText("Volume Balok                  :  " + balok.volume());
        } 
    catch(NumberFormatException err){
    JOptionPane.showMessageDialog(this, "Masukkan angka!");
                }
            }
        }   
    if (e.getSource() == btnreset) {
        labelluas.setText(" ");
        labelkeliling.setText(" ");
        labelluaspermukaan.setText(" ");
        labelvolume.setText(" ");
        textpanjang.setText("");
        textlebar.setText("");
        texttinggi.setText("");
        }
    }
}