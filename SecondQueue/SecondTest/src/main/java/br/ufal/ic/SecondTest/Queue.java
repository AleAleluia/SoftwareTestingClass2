package br.ufal.ic.SecondTest;

import java.util.InputMismatchException;

public class Queue {
	private int size;
	private int[] queue;
	private int filled;
	
	public Queue(int size) throws OutOfMemoryError, NegativeArraySizeException,InputMismatchException, NumberFormatException{
		
		if(size == 0)
			throw new InputMismatchException();
		
		this.size = size;
		this.queue = new int[size];
		this.filled = 0;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public void add(int elemento){
		if(this.filled == 0)
		{
			queue[filled] = elemento;
			this.filled++;
		}
		else{
			if(this.filled < this.size)
			{
				queue[filled] = elemento;
				this.filled++;
			}
			else
			{
				System.out.println("A fila esta cheia!");
			}
		}
	}
	
	public void remove(){
		if(this.filled == 0){
			System.out.println("Nao ha elemento para remover");
		}
		else{
			System.out.print(this.queue[0]);
			System.out.println();
			int aux=0;
			while(aux < this.filled){
				queue[aux] = queue[++aux];
				aux++;
			}
			this.filled--;
		}
	}
	
	public void element(){
		if(filled == 0){
			System.out.println("Nao ha elemento para mostrar");
		}
		else{
			System.out.print(queue[0]);
			System.out.println();
		}
	}
	
	public void size(){
		System.out.println(this.filled);
	}
	
	public void print(){
		int aux=0;
		while(aux < this.filled){
			System.out.print(queue[aux]);
			System.out.println();
			aux++;
		}
	}

}
