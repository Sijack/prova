
public class NegativeAmountException extends IllegalArgumentException {
	public NegativeAmountException(){
		super("Errore, importo negativo");
	}
	public NegativeAmountException(String msg){
		super(msg);
	}
}
