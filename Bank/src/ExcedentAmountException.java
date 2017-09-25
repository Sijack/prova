
public class ExcedentAmountException extends IllegalArgumentException {
	public ExcedentAmountException(){
		super("Errore, importo eccedente");
	}
	public ExcedentAmountException(String msg){
		super(msg);
	}
}
