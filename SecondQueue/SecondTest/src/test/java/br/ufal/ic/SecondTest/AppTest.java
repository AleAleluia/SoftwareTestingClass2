package br.ufal.ic.SecondTest;

import java.util.InputMismatchException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	private Queue queue;
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Colocar um número negativo como tamanho para a fila
     * 
     */
    public void test01()
    {
    	try {
    		queue = new Queue(-1);
    		fail();
    	}
    	catch (Exception exc) {
    		assertTrue(true);
    	}
    }
    
    /**
     * Colocar um número inteiro muito grande
     * como tamanho para a fila
     * 
     */
    public void test02()
    {
    	try {
    		queue = new Queue(2147483647*2+1);
    		fail();
    	}
    	catch (Exception exc) {
    		assertTrue(true);
    	}
    }
    
    /**
     * Colocar o maior inteiro possível
     * como tamanho para a fila
     * 
     */
    public void test03()
    {
    	try {
    		queue = new Queue(2147483647);
    		fail();
    	}
    	catch (OutOfMemoryError out) {
    		assertTrue(true);
    	}
    }
    
    /**
     * Colocar um float para
     * o tamanho da fila
     * 
     */
    public void test04()
    {
    	try {
    		queue = new Queue(1.1);
    		fail();
    	}
    	catch (InputMismatchException e) {
    		assertTrue(true);
    	}
    }
    
    /**
     * Colocar um caractere para
     * o tamanho da fila
     * 
     */
    public void test05()
    {
    	try {
    		queue = new Queue('a');
    		fail();
    	}
    	catch (Error e) {
    		assertTrue(true);
    	}
    }
    
    /**
     * Colocar zero para
     * o tamanho da fila
     * 
     */
    public void test06()
    {
    	try {
    		queue = new Queue(0);
    		assertTrue(true);
    	}
    	catch (InputMismatchException e) {
    		fail();
    	}
    }
    
    /**
     * Adicionar um elemento numa fila
     * de tamanho zero
     * 
     */
    public void test07()
    {
    	try {
    		queue = new Queue(0);
    		queue.add(10);
    		fail();
    	}
    	catch (InputMismatchException e) {
    		assertTrue(true);
    	}
    }
    
    /**
     * Escolher 1 como tamanho da fila e depois
     * adicionar e remover um item
     * 
     */
    public void test08()
    {
    	try {
    		queue = new Queue(1);
    		queue.add(5);
    		queue.remove();
    		// TODO: get stand output to assert equals
    		assertTrue(true);
    	}
    	catch (Exception e) {
    		fail();
    	}
    }
    
    /**
     * Utilizar o comando print e depois o comando size
     * 
     */
    public void test09()
    {
    	try {
    		queue = new Queue(2);
    		queue.add(5);
    		queue.print();
    		queue.size();
    		// TODO: get stand output to assert equals
    		assertTrue(true);
    	}
    	catch (Exception e) {
    		fail();
    	}
    }
    
    /**
     * Digitar um caractere em vez de um número
     * para escolher a operação a ser realizada
     * 
     */
    public void test10()
    {
    	
    }
    
    /**
     * Adicionar um float na fila
     * 
     */
    public void test11()
    {
    	try {
    		queue = new Queue(2);
    		queue.add(5.0);
    		// TODO: get stand output to assert equals
    		fail();
    	}
    	catch (InputMismatchException e) {
    		assertTrue(true);
    	}
    }
    
    /**
     * Adicionar um caracter na fila
     * 
     */
    public void test12()
    {
    	try {
    		queue = new Queue(2);
    		queue.add('a');
    		// TODO: get stand output to assert equals
    		fail();
    	}
    	catch (InputMismatchException e) {
    		assertTrue(true);
    	}
    }
    
    /**
     * Adicionar um inteiro muito grande na fila
     * 
     */
    public void test13()
    {
    	try {
    		queue = new Queue(2);
    		queue.add(99999999999999);
    		// TODO: get stand output to assert equals
    		fail();
    	}
    	catch (InputMismatchException e) {
    		assertTrue(true);
    	}
    }
}
