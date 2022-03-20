/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class balok extends persegipanjang implements ruang{
private int tinggi;
public int gettinggi() 
{
    return tinggi;
}
public balok(int tinggi, int panjang, int lebar) 
{
    super(panjang, lebar);
    this.tinggi = tinggi;
}
@Override
public double volume() 
{
    return this.luas() * this.tinggi;
}
@Override
public double luaspermukaan() 
{
int panjang;
    panjang = this.panjang;
int lebar;
    lebar = this.lebar;
int tinggi;
    tinggi = this.tinggi;
return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)) ;
}
public void settinggi(int tinggi) 
{
    this.tinggi = tinggi;
   }    
}