import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gato {
		public static void main(String[] args)throws IOException {
		BufferedReader recibir=new BufferedReader (new InputStreamReader(System.in));//<- la cosita de aquí es para dar entrada a valores
		String game[][];
		game = new String[3][3];
		int n=0;
		int fila;
		int columna;
			for (int a=0; a<=2; a=a+1) {
			
				for (int b=0; b<=2; b=b+1) {
		game[a][b]="-";
		int dato;
		int dato1;
		
				}

		}

		
		System.out.println(" 0   1   2");
		System.out.println("0 "+game[0][0]+" | "+game[0][1]+" | "+game[0][2]);
		System.out.println("  __________");
		System.out.println("2 "+game[1][0]+" | "+game[1][1]+" | "+game[1][2]);
		System.out.println("  __________");
		System.out.println("3 " +game[2][0]+" | "+game[2][1]+" | "+game[2][2]);

		while (n<10) { 

		
		System.out.println("turno del jugador 1.");
		System.out.println(" f");
		int dato=Integer.parseInt(recibir.readLine());
		System.out.println(" c");
		int dato1=Integer.parseInt(recibir.readLine());
		
		
		while (game[dato][dato1]== "X" || game[dato][dato1]== "O" ) { 
		System.out.println("esa ubicacion ya no esta disponible, intenta otra vez");
		System.out.println(" horizontal.");
		dato=Integer.parseInt(recibir.readLine());
		System.out.println("vertical.");
		dato1=Integer.parseInt(recibir.readLine());
		}
		game[dato][dato1] = "X";
		
		System.out.println(" 0   1   2");
		System.out.println("0 "+game[0][0]+" | "+game[0][1]+" | "+game[0][2]);
		System.out.println("  ___________");
		System.out.println("1 "+game[1][0]+" | "+game[1][1]+" | "+game[1][2]);
		System.out.println("  ___________");
		System.out.println("2 "+game[2][0]+" | "+game[2][1]+" | "+game[2][2]);

		n=n+1;


		if (game[0][0]== "X" && game[0][1]== "X" && game[0][2]== "X") {
		System.out.println("El ganador es el jugador 'x'.");
		break;
		}
		if (game[1][0]== "X" && game[1][1]== "X" && game[1][2]== "X") {
		System.out.println("El ganador es el jugador 'x'.");
		break;
		}
		else if (game[2][0]== "X" && game[2][1]== "X" && game [2][2]== "X") {
		System.out.println("El ganador es el jugador X.");
		break;
		}
		if (game[0][0]== "X" && game[1][0]== "X" && game [2][0]== "X") {
		System.out.println("El ganador es el jugador 1.");
		break;
		}
		if (game[0][1]== "X" && game[1][1]== "X" && game [2][1]== "X") {
		System.out.println("El ganador es el jugador 1.");
		break;
		}
		if (game[0][2]== "X" && game[1][2]== "X" && game[2][2]== "X") {
		System.out.println("El ganador es el jugador '1'.");
		break;
		}
		
		if (game[0][0]== "X" && game[1][1]== "X" &&  game[2][2]== "X") {
		System.out.println("El ganador es el jugador 1.");
		break;
		}
		if (game[0][2]== "X" && game[1][1]== "X" && game[2][0]== "X") {
		System.out.println("El ganador es el jugador 1.");
		break;
		}
	
		if (n==9) {
		break;
		}
		while (n<10) { 

			
			System.out.println("turno del jugador 2.");
			System.out.println(" f");
			int dato12=Integer.parseInt(recibir.readLine());
			System.out.println(" c");
			int dato11=Integer.parseInt(recibir.readLine());
			
			
			
			while (game[dato12][dato11]== "X" || game[dato12][dato11]== "O" ) { 
			System.out.println("esa ubicacion ya no esta disponible, intenta otra vez");
			System.out.println(" horizontal.");
			dato=Integer.parseInt(recibir.readLine());
			System.out.println("vertical.");
			dato1=Integer.parseInt(recibir.readLine());
			}
			game[dato12][dato11] = "O";
			
			System.out.println(" 0   1   2");
			System.out.println("0 "+game[0][0]+" | "+game[0][1]+" | "+game[0][2]);
			System.out.println("  ___________");
			System.out.println("1 "+game[1][0]+" | "+game[1][1]+" | "+game[1][2]);
			System.out.println("  ___________");
			System.out.println("2 "+game[2][0]+" | "+game[2][1]+" | "+game[2][2]);

			n=n+1;


			if (game[0][0]== "O" && game[0][1]== "O" && game[0][2]== "O") {
			System.out.println("El ganador es el jugador 'O'.");
			break;
			}
			if (game[1][0]== "O" && game[1][1]== "O" && game[1][2]== "O") {
			System.out.println("El ganador es el jugador 'O'.");
			break;
			}
			else if (game[2][0]== "X" && game[2][1]== "X" && game [2][2]== "X") {
			System.out.println("El ganador es el jugador O.");
			break;
			}
			if (game[0][0]== "O" && game[1][0]== "O" && game [2][0]== "O") {
			System.out.println("El ganador es el jugador 2.");
			break;
			}
			if (game[0][1]== "O" && game[1][1]== "O" && game [2][1]== "O") {
			System.out.println("El ganador es el jugador 2.");
			break;
			}
			if (game[0][2]== "O" && game[1][2]== "O" && game[2][2]== "O") {
			System.out.println("El ganador es el jugador '2'.");
			break;
			}
			
			if (game[0][0]== "O" && game[1][1]== "O" &&  game[2][2]== "O") {
			System.out.println("El ganador es el jugador 2.");
			break;
			}
			if (game[0][2]== "O" && game[1][1]== "O" && game[2][0]== "O") {
			System.out.println("El ganador es el jugador 2.");
			break;
			}
		
			if (n==9) {
			break;
			}
		
		
				}

			}
		}
}
