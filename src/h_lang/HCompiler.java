package h_lang;

public class HCompiler {
    private final String hScript;

    public HCompiler(String hScript) {
        this.hScript = hScript;
    }

    String getCompiled() { //TODO actual compiling
        return this.hScript;
    }
}
