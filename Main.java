/*
 * Scrivere un programma in linguaggio Java per la rappresentazione del triangolo di Floyd. Il
triangolo di Floyd e' un triangolo rettangolo che contiene numeri interi, definito riempiendo
le righe del triangolo con numeri consecutivi e partendo da 1 nell'angolo in alto a
sinistra.
Si consideri ad esempio il caso N=5. Il triangolo di Floyd e' il seguente:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
Il programma riceve da tastiera un numero intero N. Il programma visualizza le prime
N righe del triangolo di Floyd.
Suggerimento. Si osserva che il numero di valori in ogni riga corrisponde all'indice della
riga: 1 valore sulla prima riga, 2 sulla seconda, 3 sulla terza.
 * */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero intero: ");
		int number = input.nextInt();
		int n=1;
		for(int i=1; i<number; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(n + " ");
				n++;
			}
			System.out.println("");
		}
		

	}

}
