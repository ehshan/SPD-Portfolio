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
     System.out.println(this.toString());
    }

    @Override
    public String toString() {
        if(this.result !=0)return super.toString() + " register " + register +" value is "+this.result;
        return super.toString() + " register " + register;
    }
}
