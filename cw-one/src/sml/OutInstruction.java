package sml;

/**
 * This class prints out the value held in the register
 *
 * @author Ehshan Veerabangsa
 */
public class OutInstruction extends Instruction {

    private int register;
    private int result;

    public OutInstruction(String label, String op) {
        super(label, op);
    }

    public OutInstruction(String label, int register) {
        super(label, "out");
        this.register = register;
    }


    @Override
    public void execute(Machine m) {
        this.result = m.getRegisters().getRegister(register);
        System.out.println("Register " + register + " value is " + this.result);
    }

    @Override
    public String toString() {
        return super.toString() + " register " + register;
    }
}
