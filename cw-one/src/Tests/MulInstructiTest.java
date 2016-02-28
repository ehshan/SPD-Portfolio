package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sml.Machine;
import sml.MulInstruction;
import sml.Registers;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class MulInstructiTest {

    private Machine machine;
    private Registers registers;
    private MulInstruction instruction;


    @Before
    public void setUp() throws Exception {
        machine = new Machine();
        registers = new Registers();
        instruction = new MulInstruction("mul",1,2,3);
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

        machine.getRegisters().setRegister(2,2);
        machine.getRegisters().setRegister(3,3);
        instruction.execute(machine);

        assertEquals(machine.getRegisters().getRegister(1), 6);

    }

    @Test
    public void testToString() throws Exception {

        assertEquals(instruction.toString(), "mul: mul 2 * 3 to 1");
    }
}