package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sml.DivInstruction;
import sml.Machine;
import sml.Registers;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class DivInstructionTest {

    private Machine machine;
    private Registers registers;
    private DivInstruction instruction;

    @Before
    public void setUp() throws Exception {
        machine = new Machine();
        registers = new Registers();
        instruction = new DivInstruction("div",2,0,1);
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

        machine.getRegisters().setRegister(0,6);
        machine.getRegisters().setRegister(1,3);
        instruction.execute(machine);

        assertEquals(2, machine.getRegisters().getRegister(2));
    }


    @Test
    public void testToString() throws Exception {

        assertEquals(instruction.toString(), "div: div 0 / 1 to 2");
    }
}