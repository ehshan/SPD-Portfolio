package Tests;

import sml.Machine;
import sml.Registers;
import sml.SubInstruction;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class SubInstructionTest {

    Machine machine;
    Registers registers;
    SubInstruction instruction;

    @org.junit.Before
    public void setUp() throws Exception {
        machine = new Machine();
        registers = new Registers();
        instruction = new SubInstruction("sub", 1, 3, 2);
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

        assertEquals(machine.getRegisters().getRegister(1), 1);
    }

    @org.junit.Test
    public void testToString() throws Exception {

        assertEquals(instruction.toString(), "sub: sub 3 - 2 to 1");
    }
}