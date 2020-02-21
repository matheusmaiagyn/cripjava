package criptografia;

import java.util.ArrayList;

public class Cripto {

    public static String Encriptar(String msg, int QtCrip, Bool pEncrip)
    {
        String alphabet = "";
        String codalphabet = "";
        
        if(pEncrip){
            alphabet = "abcdefghijklmnopqrstuvxwyzç1234567890ABCDEFGHIJKLMNOPQRSTUVXWYZÇãõéôíá:., ";
            codalphabet = "qwertyuiopasdfghjklzxcvbnm#5467213908QWERTYUIOPASDFGHJKLZXCVBNM&õé[ãáí}*@ ";
        }else{
            alphabet = "qwertyuiopasdfghjklzxcvbnm#5467213908QWERTYUIOPASDFGHJKLZXCVBNM&õé[ãáí}*@ ";
            codalphabet = "abcdefghijklmnopqrstuvxwyzç1234567890ABCDEFGHIJKLMNOPQRSTUVXWYZÇãõéôíá:., ";
        }

        String codmsg = "";
        String msgtocrip = msg;
        for(int k=0; k < QtCrip; k++){ 
            for(int i=0; i < msgtocrip.length(); i++){
                for(int j=0; j < codalphabet.length(); j++){
                    if(msgtocrip.charAt(i)==codalphabet.charAt(j)){
                        codmsg += alphabet.charAt(j);
                    }
                }
            }
        msgtocrip = codmsg;
        codmsg = "";
        }
        return msgtocrip.toString();
    }
}



public class Decript {
    
    public static String Decryp(String msg, int QtCrip){
        String alphabet = "abcdefghijklmnopqrstuvxwyzç1234567890ABCDEFGHIJKLMNOPQRSTUVXWYZÇãõéôíá:., ";
        String codalphabet = "qwertyuiopasdfghjklzxcvbnm#5467213908QWERTYUIOPASDFGHJKLZXCVBNM&õé[ãáí}*@ ";
        String codmsg = "";
        String msgtocrip = msg;
        for(int k=0; k < QtCrip; k++){ 
            for(int i=0; i < msgtocrip.length(); i++){
                for(int j=0; j < codalphabet.length(); j++){
                    if(msgtocrip.charAt(i)==codalphabet.charAt(j)){
                        //codmsg.append(codalphabet.charAt(j));
                        codmsg += alphabet.charAt(j);
                    }
                }
            }
        msgtocrip = codmsg;
        codmsg = "";
        //msgtocrip = codmsg.toString();
        //codmsg.setLength(0);
        }
        return msgtocrip.toString();
    }
}
