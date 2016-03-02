package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sml.*;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class OutInstructionTest {

    private Machine machine;
    private Registers registers;
    private Instruction instruction;

    @Before
    public void setUp() throws Exception {
        machine = new Machine();
        registers = new Registers();
        instruction = new OutInstruction("out",4);
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

        //retrieves registers & assigns values to them
        machine.getRegisters().setRegister(4,11);

        //executes instruction
        instruction.execute(machine);

        //check if register 4 contains the set value
        assertEquals(11,machine.getRegisters().getRegister(4));
    }

    @Test
    public void testToString() throws Exception {

        assertEquals("out: out register 4 value is 11", instruction.toString());
    }
}