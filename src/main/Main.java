package main;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import h_lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the path to file");
        Path fileName = Path.of(input.nextLine());

        HVM hvm = new HVM(new HCompiler(Files.readString(fileName)));
        hvm.run();
    }
}
