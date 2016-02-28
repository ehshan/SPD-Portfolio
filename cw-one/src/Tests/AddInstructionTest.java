package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sml.AddInstruction;
import sml.Instruction;
import sml.Machine;
import sml.Registers;

import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class AddInstructionTest {

    private Machine machine;
    private Registers registers;
    private Instruction instruction;

    @Before
    public void setUp() throws Exception {

        machine = new Machine();
        registers = new Registers();
        instruction = new AddInstruction("add",1,2,3);
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
        machine.getRegisters().setRegister(2,2);
        machine.getRegisters().setRegister(3,3);
        //executes instruction
        instruction.execute(machine);

        //check if register 1 contain the sum of 2+3
        assertEquals(machine.getRegisters().getRegister(1), 5);
    }

    @Test
    public void testToString() throws Exception {

        //checks toString method
        assertEquals(instruction.toString(), "add: add 2 + 3 to 1");
    }

}