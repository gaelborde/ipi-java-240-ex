package com.ipiecoles.java.java240;

public class BitcoinServiceSingleton {

    private BitcoinServiceSingleton(){

    }

    private static BitcoinServiceSingleton singleton = null;

    public static BitcoinServiceSingleton getSingleton(){
        if(singleton == null){
            singleton = new BitcoinServiceSingleton();
        }
        return singleton;
    }
}
