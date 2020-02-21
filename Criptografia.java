package criptografia;

public class Criptografia 
{
    
    public Criptografia()
    {
        Criptografar();
        Descriptografar();
    }

    public void Criptografar()
    {
        String msgto = "Teste msG";
        int QtCrip = 3;
        System.out.println(Decript.Encriptar(msgto,QtCrip, true));
    }
    
    public void Descriptografar()
    {
        String msgtode = "Vxlvx elH";
        int QtCrip = 3;
        System.out.println(Decript.Encriptar(msgtode,QtCrip, false));
    }
    
    public static void main(String[] args) 
    {
        new Criptografia();
    }
    
}
