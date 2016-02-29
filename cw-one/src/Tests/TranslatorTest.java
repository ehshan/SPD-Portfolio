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
public class TranslatorTest {

    private final String filename = "testAdd.sml";
    private Translator translator = new Translator(filename);
    private Labels lables = new Labels();
    private ArrayList<Instruction> program = new ArrayList<>();


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        translator  = null;
    }

    @Test
    public void testReadAndTranslate() throws Exception {

        //adding sml instructions to empty array lists
        translator.readAndTranslate(lables, program);

        //checking that the program contains 3 instructions
        assertEquals(3, program.size());


        //checking the correct instruction have been stored in program array list
        //using toString methods to check
        assertEquals("f0: lin register 1 value is 3", program.get(0).toString());
        assertEquals("f1: lin register 2 value is 2", program.get(1).toString());
        assertEquals("f2: add 1 + 2 to 3", program.get(2).toString());

    }

    @Test
    public void testGetInstruction() throws Exception {


    }
}