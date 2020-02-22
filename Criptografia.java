package criptografia;

public class Criptografia 
{
    
    public Criptografia()
    {
        Descriptografar(55, "Teste 40", false, false);
    }

    public String Criptografar(int QtCrip, String msgto, boolean pCripOrNot, boolean pAutoOrNot)
    {
        String print = Procedure.Encriptar(msgto,QtCrip, true, true);
        System.out.println(print);
        return print;
    }
    
    public void Descriptografar(int QtCrip, String msgto, boolean pCripOrNot, boolean pAutoOrNot)
    {
        System.out.println(Procedure.Encriptar(Criptografar(QtCrip, msgto, !pCripOrNot, pAutoOrNot), QtCrip, pCripOrNot, pAutoOrNot));
    }
    
    public static void main(String[] args) 
    {
        new Criptografia();
    }
    
}
