
import java.util.Scanner;

public class main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int escolha, tam, run=0, preenchido=0, elemento, aux=0;
		
		System.out.println("Diga o tamanho da fila");
		tam = scan.nextInt();
		
		int[] fila = new int[tam];
		
		while(run == 0){
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Add"); ///Adiciona um elemento
			System.out.println("2 - Remove"); ///Remove e imprime o primeiro elemento
			System.out.println("3 - Element");  ///Imprime o primeiro elemento
			System.out.println("4 - Size"); ///Retorna o tamanho da lista
			System.out.println("5 - Print"); ///Remove todos os elementos e imprime
			System.out.println("6 - Quit"); ///Encerra o programa
			
			//escolha = ValidarValor.validarInt(1, 6);
			escolha = scan.nextInt();
			
			switch(escolha){
			case 1:
				System.out.println("Add selecionado");
				System.out.println("Digite o elemento que voce quer adicionar");
				elemento = scan.nextInt();
				if (preenchido == 0)
				{
					fila[preenchido] = elemento;
					preenchido++;
				}
				else{
					if(preenchido < tam)
					{
						fila[preenchido] = elemento;
						preenchido++;
					}
					else
					{
						System.out.println("A fila esta cheia!");
					}
				}
				break;
				
			case 2:
				System.out.println("Remove selecionado");
				if(preenchido == 0){
					System.out.println("Nao ha elemento para remover");
				}
				else{
					System.out.print(fila[0]);
					System.out.println();
					aux=0;
					while(aux < preenchido){
						fila[aux] = fila[++aux];
						aux++;
					}
					preenchido--;
				}
				break;
				
			case 3:
				System.out.println("Element selecionado");
				if(preenchido == 0){
					System.out.println("Nao ha elemento para mostrar");
				}
				else{
					System.out.print(fila[0]);
					System.out.println();
				}
				break;
				
			case 4:
				System.out.println("Size selecionado");
				System.out.print(preenchido);
				System.out.println();
				break;
				
			case 5:
				System.out.println("Print selecionado");
				aux=0;
				while(aux<preenchido){
					System.out.print(fila[aux]);
					System.out.println();
					aux++;
				}
				break;
				
			case 6:
				run = 1;
				break;
			}
		}
	}
}
