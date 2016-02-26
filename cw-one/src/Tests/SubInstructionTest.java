package Tests;

import sml.Machine;
import sml.Registers;
import sml.SubInstruction;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class SubInstructionTest {

    Machine machine = new Machine();
    Registers registers = new Registers();
    SubInstruction instruction = new SubInstruction("sub", 1, 3, 2);

    @org.junit.Before
    public void setUp() throws Exception {
        machine.setRegisters(registers);

    }

    @org.junit.After
    public void tearDown() throws Exception {
        machine = null;
        registers = null;
        instruction = null;
    }

    @org.junit.Test
    public void testExecute() throws Exception {

        machine.getRegisters().setRegister(3, 3);
        machine.getRegisters().setRegister(2, 2);
        instruction.execute(machine);

        assertTrue(machine.getRegisters().getRegister(1) == 1);
    }

    @org.junit.Test
    public void testToString() throws Exception {

        assertEquals(instruction.toString(), "sub: sub 3 - 2 to 1");
    }
}