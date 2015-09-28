package voitures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

import voitures.Garage;
import static org.hamcrest.CoreMatchers.is;

public class GarageTest {

    private Garage instance;
    private Garage instance_vide;
    
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    public GarageTest() {
    }

    @Before
    public void setUp() {
        System.out.println("nouvelle instance");
        instance = new Garage(10);
        instance.ajouter(new Auto("Renault", "megane",
                3000.00f, 6.00f,
                200000, 4, 5));
        instance.ajouter(new Auto("Tata", "toto",
                500.00f, 5.00f,
                20000, 3, 4));
        instance_vide = new Garage(10);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of f1 method, of class Garage.
     */
    @Test
    public void testF1() {
        System.out.println("Test de F1");
        collector.checkThat("Test de F1", instance.f1("Renault"), is(1));
    }

    /**
     * Test of f2 method, of class Garage.
     */
    @Test
    public void testF2() {
        System.out.println("Test de F2");
        collector.checkThat("Test de F2", instance.f2("megane"), is(1));
        collector.checkThat("Test de F2", instance.f2("f350"), is(0));
    }

    /**
     * Test of f3 method, of class Garage.
     */
    @Test
    public void testF3() {
        System.out.println("Test de F3");
        collector.checkThat("Test de F3", instance.f3(), is(2));
        instance.ajouter(new Auto("BABa", "bubu",
                500.00f, 5.00f,
                20000, 3, 4));
        collector.checkThat("Test de F3", instance.f3(), is(3));
    }

    /**
     * Test of f4 method, of class Garage.
     */
    @Test
    public void testF4() {
        collector.checkThat("Test de F4", instance.f4(), is(false));
        collector.checkThat("Test de F4", instance_vide.f4(), is(true));
    }

    /**
     * Test of f5 method, of class Garage.
     */
    @Test
    public void testF5() {
        System.out.println("Test de F5");
        collector.checkThat("Test de F5", instance.f5(), is(2));
        instance.ajouter(new Auto("Pure", "green",
                500.00f, 3.00f,
                20000, 3, 4));
        collector.checkThat("Test de F5", instance.f5(), is(3));
    }

    /**
     * Test of f6 method, of class Garage.
     */
    @Test
    public void testF6() {
        collector.checkThat("Test de F6", instance.f6(), is(0));
    }

    /**
     * Test of f7 method, of class Garage.
     */
    @Test
    public void testF7() {
        System.out.println("Test de F7");
        collector.checkThat("Test de F7", instance.f7(), is(2500.00f));
        instance.ajouter(new Auto("cheap", "pascherpascher",
                50.00f, 3.00f,
                20000, 3, 4));
        collector.checkThat("Test de F7", instance.f7(), is(2950.00f));
    }

    /**
     * Test of f8 method, of class Garage.
     */
    @Test
    public void testF8() {
        collector.checkThat("Test de F8", instance.f8(), is(110000));
        collector.checkThat("Test de F8", instance_vide.f8(), is(0));
    }

    /**
     * Test of f9 method, of class Garage.
     */
    @Test
    public void testF9() {
        System.out.println("Test de F9");
        collector.checkThat("Test de F9", instance.f9(), is(-1));
        instance.ajouter(new Auto("Limousine", "laPleinDePlace",
                50.00f, 3.00f,
                20000, 5, 10));
        collector.checkThat("Test de F9", instance.f9(), is(3));
    }

    /**
     * Test of f10 method, of class Garage.
     */
    @Test
    public void testF10() {
        collector.checkThat("Test de F10", instance.f10(1,100000), is(1));
        collector.checkThat("Test de F10", instance.f10(10,10), is(-1));
        collector.checkThat("Test de F10", instance_vide.f10(0,0), is(-1));
    }

}
