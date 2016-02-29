package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sml.Instruction;
import sml.Machine;
import sml.Registers;
import sml.LinInstruction;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class LinInstructionTest {

    private Machine machine;
    private Registers registers;
    private Instruction instruction;

    @Before
    public void setUp() throws Exception {

        machine = new Machine();
        registers = new Registers();
        instruction = new LinInstruction("lin",0,5);
        machine.setRegisters(registers);
    }

    @After
    public void tearDown() throws Exception {

        machine = null;
        registers = null;
        instruction = null;
    }

    @Test
    public void testExecute() throws Exception {

        //a second line instruction to test
        Instruction sampleInstruction = new LinInstruction("lin", 1, 10);

        //executes instructions
        instruction.execute(machine);
        sampleInstruction.execute(machine);

        //check if register 0 contain the value 5
        assertEquals(machine.getRegisters().getRegister(0), 5);

        //check if register 1 contain the value 10
        assertEquals(machine.getRegisters().getRegister(1), 10);

    }

    @Test
    public void testToString() throws Exception {

        //checks toString method
        assertEquals(instruction.toString(), "lin: lin register 0 value is 5");

    }

}