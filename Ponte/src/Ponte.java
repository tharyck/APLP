import java.util.ArrayList;
import java.util.List;

public class Ponte implements Runnable {

	private List<String> filaDeCarros;

	public Ponte() {
		this.filaDeCarros = new ArrayList<>();
	}

	public void carro(String carro) {
		filaDeCarros.add(carro);
	}

	@Override
	public void run() {
		while (!this.filaDeCarros.isEmpty()) {
			if (this.filaDeCarros.contains("A")) {
				System.out.println("Passando carro A --> B");
				this.filaDeCarros.remove("A");
			} else if (this.filaDeCarros.contains("B")) {
				System.out.println("Passando carro B --> A");
				this.filaDeCarros.remove("B");
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}