package Tests;

import org.junit.Test;
import sml.Registers;


import static org.junit.Assert.*;

/**
 * @author Ehshan Veerabangsa
 */
public class RegistersTest {

    private Registers registers = new Registers();


    @Test
    public void testGetandSetRegister() throws Exception {

        //assigns a value to first register
        registers.setRegister(0,1);

        //check if value present
        assertEquals(1,registers.getRegister(0));
    }


    @Test
    public void testSetNewRegisters() throws Exception {

        // creates a new array of registers for object
        registers.setRegisters(new int[3]);

        //assigning some values
        registers.setRegister(0,4);
        registers.setRegister(1,2);

        //checking with the registers to string method
        assertEquals("sml.Registers(registers=[4, 2, 0])",registers.toString());

    }

}