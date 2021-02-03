package h_lang;

public class HVM {
    private final String compiled;

    public HVM(HCompiler compiler) {
        this.compiled = compiler.getCompiled();
    }

    public void run() { //TODO add runtime execution
        System.out.print(this.compiled);
    }
}
