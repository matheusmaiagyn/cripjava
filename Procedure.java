package criptografia;

import java.util.ArrayList;

public class Procedure 
{

    public static String Encriptar(String msg, int QtCrip, boolean pEncrip, boolean pAutomatico)
    {
        String alphabet = "";
        String codalphabet = "";
        String pFinalMsg = "";
        String codmsg = "";
        String msgtocrip = msg;
        String pCodAuto = "mnbvcxzçlkjhgfdsapoiuytrewqMNBVCXZÇLKJHGFDSAPOIUYTREWQ";
        String pQtdCodCrip = "";
        int pQtdCrip = QtCrip;
        
        if(pEncrip)
        {
            alphabet = "abcdefghijklmnopqrstuvxwyzç1234567890ABCDEFGHIJKLMNOPQRSTUVXWYZÇãõéôíá:., ";
            codalphabet = "qwertyuiopasdfghjklzxcvbnm#5467213908QWERTYUIOPASDFGHJKLZXCVBNM&õé[ãáí}*@ ";
            
            if(pAutomatico)
            {
                pQtdCodCrip += pCodAuto.charAt(QtCrip-1);
                
            }
        }else
        {
            alphabet = "qwertyuiopasdfghjklzxcvbnm#5467213908QWERTYUIOPASDFGHJKLZXCVBNM&õé[ãáí}*@ ";
            codalphabet = "abcdefghijklmnopqrstuvxwyzç1234567890ABCDEFGHIJKLMNOPQRSTUVXWYZÇãõéôíá:., ";
            
            if(msgtocrip.charAt(0)=='+')
            {
                for(int pDefineQtCrip=0; pDefineQtCrip < pCodAuto.length(); pDefineQtCrip++)
                {
                    if(msgtocrip.charAt(1)==pCodAuto.charAt(pDefineQtCrip))
                    {
                        pQtdCodCrip += pDefineQtCrip+1;
                    }
                }
                msgtocrip = msgtocrip.substring(2);
            }
        }
        
        for(int k=0; k < pQtdCrip; k++)
        { 
            for(int i=0; i < msgtocrip.length(); i++)
            {
                for(int j=0; j < codalphabet.length(); j++)
                {
                    if(msgtocrip.charAt(i)==codalphabet.charAt(j))
                    {
                        codmsg += alphabet.charAt(j);
                    }
                }
            }
            msgtocrip = codmsg;
            codmsg = "";
        }
        
        if(pAutomatico)
        {
            if(pEncrip)
            {
            pFinalMsg = "+" + pCodAuto.charAt(QtCrip-1);
            }
        }
        
        pFinalMsg += msgtocrip;

        return pFinalMsg;
    }
}
