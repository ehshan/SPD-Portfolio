package sml;

/**
 * This class ....
 *
 * @author Ehshan Veerabangsa
 */
public class SubInstruction  extends Instruction{

    private int result;
    private int op1;
    private int op2;


    public SubInstruction(String label, String op) {
        super(label, op);
    }

    public SubInstruction(String label, int result, int op1, int op2) {
        this(label, "sub");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    @Override
    public void execute(Machine m) {

    }
}
