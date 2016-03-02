package sml;

/**
 * This class changes the order the instruction execution by moving
 * the program to the new label, assuming the value in the register is not zero
 *
 * @author Ehshan Veerabangsa
 */
public class BnzInstruction extends Instruction {


    private int register;
    private String newLabel;

    public BnzInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public BnzInstruction(String label, int register, String newLabel){
        super(label, "bnz");
        this.register = register;
        this.newLabel = newLabel;

    }

    @Override
    public void execute(Machine m) {
        if (m.getRegisters().getRegister(register) != 0){
            m.setPc(m.getLabels().indexOf(newLabel));
        }
    }

    @Override
    public String toString() {
        return super.toString() +" register "+ this.register + " go to label "+ newLabel;
    }
}
