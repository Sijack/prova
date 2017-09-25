
public class InitialBalanceException extends IllegalArgumentException {
	public InitialBalanceException(){
		super("Errore, saldo negativo");
	}
	public InitialBalanceException(String msg){
		super(msg);
	}
}
