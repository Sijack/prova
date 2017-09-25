import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int balance, number;
			String name;
			boolean ok;
			
			
			System.out.print("Nome cliente: ");
			name = in.nextLine();
			System.out.print("Numero conto: ");
			number = in.nextInt();
			
			while (!ok) {
				try {
					System.out.print("Saldo conto: ");
					balance = in.nextInt();
					BankAccount account = new BankAccount(balance, name, number);
					ok = true;
				}
				catch(InitialBalanceException e) {
					System.out.println("Saldo negativo");
				}
			}
				
	}

}
