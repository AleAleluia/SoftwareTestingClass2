package br.ufal.ic.SecondTest;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.ufal.ic.SecondTest.QueueMain;

public class QueueMain {
	
	public static void main (String[] args){
		Scanner scan1 = new Scanner(System.in);
		boolean valido=false;

		int choose=0, run=1, number;
		
		while(!valido){
			try {
				System.out.println("Diga o tamanho da fila");
				choose = Integer.parseInt(scan1.next());
				Queue fila = new Queue(choose);
				valido = true;
				
				while(run == 1){
					System.out.println("O que deseja fazer?");
					System.out.println("1 - Add"); ///Adiciona um elemento
					System.out.println("2 - Remove"); ///Remove e imprime o primeiro elemento
					System.out.println("3 - Element");  ///Imprime o primeiro elemento
					System.out.println("4 - Size"); ///Retorna o tamanho da lista
					System.out.println("5 - Print"); ///Imprime
					System.out.println("6 - Quit"); ///Encerra o programa
					
					choose = Integer.parseInt(scan1.next());
					
					if(choose == 1){ //Add
						System.out.println("Digite o numero que voce deseja adicionar");
						number = Integer.parseInt(scan1.next());
						fila.add(number);
					}
					else if(choose == 2){ //Remove
						fila.remove();
					}
					else if(choose == 3){ //Element
						fila.element();
					}
					else if(choose == 4){ //Size
						fila.size();
					}
					else if(choose == 5){ //Print
						fila.print();
					}
					else if(choose == 6){ //Quit
						run = 0;
					}
					else{
						System.out.println("Opcao invalida!");
					}
				}
				
			}
			catch (OutOfMemoryError e) {
				System.out.println("Operacao nao permitida");
			}
			catch (InputMismatchException e) {
				System.out.println("Operacao nao permitida");
			}
			catch (NegativeArraySizeException e) {
				System.out.println("Operacao nao permitida");
			}
			catch (NumberFormatException e){
				System.out.println("Operacao nao permitida");
			}
		}

	}

}
