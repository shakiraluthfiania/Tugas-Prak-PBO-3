/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class persegipanjang implements bidang{
public int panjang;
public int lebar;
public persegipanjang(int panjang, int lebar) 
{
    this.panjang = panjang;
    this.lebar = lebar;
}
public void setpanjang(int panjang) 
{
    this.panjang = panjang;
}
public void setlebar(int lebar) 
{
    this.lebar = lebar;
}
public int getpanjang() 
{
    return panjang;
}
public int getlebar() 
{
    return lebar;
}
@Override
public double luas() 
{
    return this.panjang * this.lebar;
}
@Override
public double keliling() 
{
    return 2 * (this.panjang + this.lebar);
   }
}