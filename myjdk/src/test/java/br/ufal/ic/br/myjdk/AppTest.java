package br.ufal.ic.br.myjdk;

import java.util.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase{

	//Teste 1: Tentar criar uma fila de tamanho zero, tamanho negativo, tamanho sendo char
	public void test1(){
		try{
			PriorityQueue pq = new PriorityQueue(0);
			pq = new PriorityQueue(-5);
			pq = new PriorityQueue('a');
			fail("Aceita fila de tamanho zero, tamanho negativo e tamanho char");
		}catch (Exception e){
			System.out.println("Não aceita fila de tamanho zero, tamanho negativo e tamanho char");
		}
	}
	
	//Teste 2: Criar uma fila, adicionar dois elementos e verificar se a ordem é correta
	public void test2(){
		PriorityQueue pq = new PriorityQueue(3);
		assertEquals(true, pq.add(5));
		assertEquals(true, pq.add(9));
		assertEquals(5, pq.remove());
		assertEquals(9, pq.remove());		
	}
	
	//Teste 3: Criar uma fila, adicionar dois elementos e tentar remover três
	public void test3(){
		PriorityQueue pq = new PriorityQueue(3);
		pq.add(1);
		pq.add(2);
		pq.remove();
		pq.remove();
		try{
			pq.remove();
			fail("Remove elementos que não existem");
		}catch(NoSuchElementException e){
			System.out.println("Não permite remover elementos inexistentes");
		}
	}

	//Teste 4: Tentar remover um objeto que não está na fila
	public void test4(){
		PriorityQueue pq = new PriorityQueue(3);
		pq.add(1);
		pq.add(2);
		pq.add(3);
		assertEquals(false,pq.remove(4));
	}
	
	//Teste 5: Tentar adicionar dois elementos de tipos diferentes
	public void test5(){
		PriorityQueue pq = new PriorityQueue(3);
		pq.add(1);
		try{
			pq.add('a');
			fail("Permite adicionar itens de tipos diferentes");
		}catch(Exception e){
			System.out.println("Não permite adicionar itens de tipos diferentes");
		}
	}
	
	//Teste 6: Usar Peek com a fila vazia
	public void test6(){
		PriorityQueue pq = new PriorityQueue(3);
		assertEquals(null,pq.peek());
	}
	
	//Teste 7: Adicionar dois elementos, limpar a fila e tentar remover um elemento antigo
	public void test7(){
		PriorityQueue pq = new PriorityQueue(3);
		pq.add(1);
		pq.add(2);
		pq.clear();
		assertEquals(false, pq.remove(1));
	}
}
