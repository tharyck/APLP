
public class Consumidor extends Thread{
	
	private int id;
	private Buffer buffer;
	private int totalConsumir;
	
	public Consumidor(int id, Buffer buffer, int consumir) {
		this.id = id;
		this.buffer = buffer;
		this.totalConsumir = consumir;
	}
	
	public void run() {
        for (int i = 0; i < totalConsumir; i++) {
            buffer.get(id);
        }
        System.out.println("Consumidor #" + id + " concluido!");
    }

}
