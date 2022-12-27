package com.example.arturaandkakatya;

import android.util.Log;

public class Lion extends Cat implements Printable{

    public Lion(){
        super();
        Log.i("constructor", "Constructor Lion()");
    }

    public static String whatCatsLike(){
        return "I'm lion and i like playing!";
    }


    @Override
    public void draw(){
        Log.i("draw()", "Draw lion");
    }

    @Override
    public void print() {

    }
}
