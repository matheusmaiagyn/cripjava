package criptografia;

public class Criptografia {
    
    public Criptografia(){
        Criptografar();
        Descriptografar();
    }
    
    public void Criptografar(){
        String msgto = "Teste msG";
        int QtCrip = 4;
        //System.out.println(Cript.Encriptar(msgto,QtCrip));
        System.out.println(Cript.Encriptar(msgto,QtCrip, true));
    }
    
    public void Descriptografar(){
        String msgtode = "Rdsrd asC";
        int QtCrip = 4;
        //System.out.println(Decript.Decryp(msgtode, QtCrip));
        System.out.println(Cript.Encriptar(msgto,QtCrip, false));
    }

    public static void main(String[] args) {
        new Criptografia();
    }
    
}
