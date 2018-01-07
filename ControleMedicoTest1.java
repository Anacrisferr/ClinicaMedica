
package clinicamedica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ana
 */
public class ControleMedicoTest {
    
    public ControleMedicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of menuMedico method, of class ControleMedico.
     */
    @Test
    public void testMenuMedico() {
        System.out.println("menuMedico");
        ControleMedico instance = new ControleMedico();
        instance.menuMedico();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of novoMedico method, of class ControleMedico.
     */
    @Test
    public void testNovoMedico() {
        System.out.println("novoMedico");
        ControleMedico instance = new ControleMedico();
        instance.novoMedico();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadMedico method, of class ControleMedico.
     */
    @Test
    public void testCadMedico() {
        System.out.println("cadMedico");
        Medico m = null;
        ControleMedico instance = new ControleMedico();
        instance.cadMedico(m);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarMedico method, of class ControleMedico.
     */
    @Test
    public void testListarMedico() {
        System.out.println("listarMedico");
        ControleMedico instance = new ControleMedico();
        instance.listarMedico();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterarMedico method, of class ControleMedico.
     */
    @Test
    public void testAlterarMedico() {
        System.out.println("alterarMedico");
        ControleMedico instance = new ControleMedico();
        instance.alterarMedico();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of chamarMetodoDeletar method, of class ControleMedico.
     */
    @Test
    public void testChamarMetodoDeletar() {
        System.out.println("chamarMetodoDeletar");
        ControleMedico instance = new ControleMedico();
        instance.chamarMetodoDeletar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletarMedico method, of class ControleMedico.
     */
    @Test
    public void testDeletarMedico() {
        System.out.println("deletarMedico");
        String cpf = "";
        ControleMedico instance = new ControleMedico();
        instance.deletarMedico(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
