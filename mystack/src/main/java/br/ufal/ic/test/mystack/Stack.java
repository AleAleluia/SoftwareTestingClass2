package br.ufal.ic.test.mystack;

//import java.util.ArrayDeque;
import java.util.EmptyStackException;

public class Stack {

	//private final ArrayDeque<Object> stack;
	private Object[] stack;
	/*private int size;
	private int top;*/
	private int filled;
	
	public Stack(int numElements) {
		//stack = new ArrayDeque<Object>(numElements);
		//this.size = numElements;
		if(numElements < 0){
			this.stack = new Object[10];			
		}
		else{
			this.stack = new Object[numElements];
		}
		//this.top = 0;
		filled = 0;
	}
	
	public boolean empty() {
		
		//return stack.isEmpty();
		
		return filled == 0;
	}
	
	public Object push(Object o) {
		
		//stack.push(o);
		//return o;
		if(o == null) throw new NullPointerException();
		
		if(stack.length == 0){
			this.stack = new Object[1];
			stack[0] = o;
			this.filled++;
		}
		else{
			if(filled == stack.length)
				resize(2*stack.length);
			
			stack[filled++] = o;
			
		}
		
		return o;
	}
	
	private void resize(int max){
		Object[] stack2;
		stack2 = new Object[max];
		for(int i=0; i<filled; i++)
			stack2[i] = stack[i];
		stack = stack2;
		
	}
	
	public Object pop() {
		
		if (empty()) throw new EmptyStackException();
		//return stack.removeLast();
		Object objeto = stack[--filled];
		if(filled > 0 && filled == stack.length/4)
			resize(stack.length/2);
		return objeto;
	}
	
	public Object peek() {
		
		if (empty()) throw new EmptyStackException();
		
		return stack[filled-1];
		//return stack.getLast();
	}
}
