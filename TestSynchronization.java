package synchronization;

public class TestSynchronization {

public static void main(String[] args) {
		
		
		Sender sender=new Sender();
		
		User t1= new User("Pravalli", "Hello Good morning...!", sender);
		
		User t2= new User("Shyam", "Hello A very Goord Morning to all of you...!", sender);
		
		t1.start();
		t2.start();
	}
}
