package h_lang;

import java.util.HashMap;

public class HCompiler {
    private final char[] hCode;

    public HCompiler(String hCode) {
        char[] hChars = hCode.toCharArray();
        StringBuilder hBuilder = new StringBuilder();

        for(char hChar: hChars) {
            if(hChar == 'h') {
                hBuilder.append('h');
            } else if(hChar == 'H') {
                hBuilder.append('H');
            }
        }

        this.hCode = hBuilder.toString().toCharArray();
    }

    String getCompiled() {
        StringBuilder compiled = new StringBuilder();

        final HashMap<String, Character> commands = new HashMap<>();
        commands.put("HhHhh", ';');
        commands.put("HhHhH", '>');
        commands.put("HH", '-');
        commands.put("Hhhh", '<');
        commands.put("HhhH", '^');
        commands.put("HhHHh", ':');
        commands.put("HhHHH", '?');

        int intBuffer = 1;
        boolean parsingInt = false;
        StringBuilder hBuffer = new StringBuilder();

        for(char hChar : this.hCode) {
            if(parsingInt) {
                if (hChar == 'h') {
                    intBuffer++;
                } else {
                    compiled.append(intBuffer);
                    intBuffer = 1;
                    parsingInt = false;
                }
            } if(!parsingInt) {
                if(hBuffer.isEmpty() && hChar == 'h') {
                    parsingInt = true;
                } else {
                    hBuffer.append(hChar);
                    if(commands.containsKey(hBuffer.toString())) {
                        compiled.append(commands.get(hBuffer.toString()));
                        hBuffer.setLength(0);
                    }
                }
            }
        }

        return new String(compiled);
    }
}
