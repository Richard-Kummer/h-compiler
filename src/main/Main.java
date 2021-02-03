package main;

import h_lang.*;

public class Main {
    public static void main(String[] args) { //TODO Add file selection
        HVM hvm = new HVM(new HCompiler("content of hf file"));
        hvm.run();
    }
}
