package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sml.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class BnzInstructionTest {

    private Machine machine;
    private Registers registers;
    private Instruction instruction;
    private ArrayList<Instruction> program;

    @Before
    public void setUp() throws Exception {
        machine = new Machine();
        registers = new Registers();
        instruction = new BnzInstruction("bnz",3,"f1");
        program = new ArrayList<>();
        machine.setRegisters(registers);
    }

    @After
    public void tearDown() throws Exception {
        machine = null;
        registers = null;
        instruction = null;
        program = null;
    }

    @Test
    public void testExecute() throws Exception {

        //give test machine some labels
        machine.getLabels().addLabel("f0");
        machine.getLabels().addLabel("f1");
        machine.getLabels().addLabel("f2");
        machine.getLabels().addLabel("f3");
        machine.getLabels().addLabel("f4");
        machine.getLabels().addLabel("f5");


        //some test instructions - for factorial 6
        Instruction inOne = new LinInstruction("lin", 20, 6);
        Instruction inTwo = new LinInstruction("lin", 21, 1);
        Instruction inThree = new LinInstruction("lin", 22, 1);
        Instruction inFour = new MulInstruction("mul", 21, 21, 20);
        Instruction inFive = new SubInstruction("sub", 20, 20, 22);
        Instruction inSix = new BnzInstruction("bnz", 20, "f3");

        //adding the instruction to a program list
        program.add(inOne);
        program.add(inTwo);
        program.add(inThree);
        program.add(inFour);
        program.add(inFive);
        program.add(inSix);

        //assigned program list to the machine
        machine.setProg(program);

        //excute the machine
        machine.execute();

        //check if the value stored in register 21 is indeed the factorial of 6
        assertEquals(720, machine.getRegisters().getRegister(21));

    }

    @Test
    public void testToString() throws Exception {
        assertEquals("bnz: bnz register 3 go to label f1", instruction.toString());

    }
}