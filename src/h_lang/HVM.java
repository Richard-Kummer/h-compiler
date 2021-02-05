package h_lang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HVM {
    private final String compiled;
    private final int MAX_SIZE;
    private final Scanner input;

    public HVM(HCompiler compiler, int MAX_SIZE, Scanner input) {
        this.compiled = compiler.getCompiled();
        this.MAX_SIZE = MAX_SIZE;
        this.input = input;
    }

    public void run() { //TODO add runtime execution
        int pointer = 0;
        int[] memory = new int[this.MAX_SIZE];
        Arrays.fill(memory, 0);

        ArrayList<Integer> sections = new ArrayList<>();

        int mode = 0; //0=write, 1=pointer, 2=goto
        boolean isNegative = false;

        StringBuilder int_buffer = new StringBuilder();
        int final_int;

        final char[] compiled = this.compiled.toCharArray();

        for(int i = 0; i < compiled.length; i++) { //scan for ; markers first
            if(compiled[i] == ';') {
                sections.add(i);
            }
        }

        for(int i = 0; i < compiled.length; i++) {
            char symbol = compiled[i];

            if(!(int_buffer.isEmpty() || String.valueOf(symbol).matches("\\d"))) {
                final_int = Integer.parseInt(new String(int_buffer));
                int_buffer.setLength(0);
                if(isNegative) {
                    final_int *= -1;
                }
                isNegative = false;

                if(mode == 0) {
                    memory[pointer] += final_int;
                } else if(mode == 1) {
                    pointer += final_int;
                } else {
                    i = sections.get(final_int);
                }
            }

            if(symbol == ';') {
                break;
            } else if(symbol == '>') {
                mode = 2;
            } else if(symbol == '-') {
                isNegative = !isNegative;
            } else if(symbol == '<') {
                mode = 0;
            } else if(symbol == '^') {
                mode = 1;
            } else if(symbol == ':') {
                System.out.print((char)memory[pointer]);
            } else if(symbol == '?') {
                memory[pointer] += input.next().charAt(0);
            } else {
                int_buffer.append(symbol);
            }
        }
    }
}
