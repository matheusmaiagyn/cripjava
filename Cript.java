package criptografia;

import java.util.ArrayList;

public class Cript {
    
    public static String Cryp(String msg, int QtCrip){
        String alphabet = "abcdefghijklmnopqrstuvxwyzç1234567890ABCDEFGHIJKLMNOPQRSTUVXWYZÇãõéôíá:., ";
        String codalphabet = "qwertyuiopasdfghjklzxcvbnm#5467213908QWERTYUIOPASDFGHJKLZXCVBNM&õé[ãáí}*@ ";
        String codmsg = "";
        String msgtocrip = msg;
        for(int k=0; k < QtCrip; k++){ 
            for(int i=0; i < msgtocrip.length(); i++){
                for(int j=0; j < alphabet.length(); j++){
                    if(msgtocrip.charAt(i)==alphabet.charAt(j)){
                        //codmsg.append(codalphabet.charAt(j));
                        codmsg += codalphabet.charAt(j);
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
