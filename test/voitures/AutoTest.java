package voitures;

import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Before;
//import org.junit.BeforeClass;
import org.junit.Test;

//import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

import voitures.Auto;
import static org.hamcrest.CoreMatchers.is;

public class AutoTest {

	private Auto instance1;
	private Auto instance2;

	@Rule
	  public ErrorCollector collector= new ErrorCollector();
	
	public AutoTest() {
	}

	@Before
	public void setUp() {
		System.out.println("nouvelles instances");
		instance1 = new Auto("Renault", "megane", 
				3000.00f, 6.00f, 
				200000, 5, 5);
		instance2 = new Auto("Tata", "toto", 
				500.00f, 5.00f, 
				20000, 3, 4); 
	}

	@After
	public void tearDown() {
	}
	
	/**
	 * Test of getMarque method, of class Auto.
	 */
	@Test
	public void testGetMarque() {
		System.out.println("Test de getMarque");
		collector.checkThat("Test de getMarque 1",instance1.getMarque(),is("Renault"));
		collector.checkThat("Test de getMarque 2",instance2.getMarque(),is("Tata"));	}
	
	/**
	 * Test of getModele method, of class Auto.
	 */
	@Test
	public void testGetModele() {
		System.out.println("Test de getModele");
		collector.checkThat("Test de getModele 1",instance1.getModele(),is("megane"));
		collector.checkThat("Test de getModele 2",instance2.getModele(),is("toto"));	}

	/**
	 * Test of getPrix method, of class Auto.
	 */
	@Test
	public void testGetPrix() {
		System.out.println("Test de getPrix");
		collector.checkThat("Test de getPrix 1",instance1.getPrix(),is(3000.00f));
		collector.checkThat("Test de getPrix 2",instance2.getPrix(),is(500.00f));	}

	/**
	 * Test of getConso method, of class Auto.
	 */
	@Test
	public void testGetConso() {
		System.out.println("Test de getConso");
		collector.checkThat("Test de getConso 1",instance1.getConso(),is(6.00f));
		collector.checkThat("Test de getConso 2",instance2.getConso(),is(5.00f));		}
	
	/**
	 * Test of getKilometrage method, of class Auto.
	 */
	@Test
	public void testGetKilometrage() {
		System.out.println("Test de getKilometrage");
		collector.checkThat("Test de getKilometrage 1",instance1.getKilometrage(),is(200000));
		collector.checkThat("Test de getKilometrage 2",instance2.getKilometrage(),is(20000));	}

	/**
	 * Test of getNbPortes method, of class Auto.
	 */
	@Test
	public void testGetNbPortes() {
		System.out.println("Test de getNbPortes");
		collector.checkThat("Test de getNbPortes 1",instance1.getNbPortes(),is(5));
		collector.checkThat("Test de getNbPortes 2",instance2.getNbPortes(),is(3));	}
	
	/**
	 * Test of getNbPlaces method, of class Auto.
	 */
	@Test
	public void testGetNbPlaces() {
		System.out.println("Test de getNbPlaces");
		collector.checkThat("Test de getNbPlaces 1",instance1.getNbPlaces(),is(5));
		collector.checkThat("Test de getNbPlaces 2",instance2.getNbPlaces(),is(4));	}
}