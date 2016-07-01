import java.util.Scanner;

public class ValidarValor {
	public static int validarInt(int min,int max){

		boolean valido=false;
		int valor=0;
		Scanner s= new Scanner(System.in);
		do{
			

			try{
				System.out.println("Valor:");
				valor = Integer.parseInt(s.nextLine());
				
				if(valor >=min && valor<=max)
					valido = true;
				else{
					System.out.println("Digite um numero entre "+min+" e "+max);
				}
			}
			catch(Exception e){
				System.out.println("Por favor, digite um valor correto");
			}
		}
		while(!valido);

		return valor;
	}
}