public class Produtor extends Thread{
	
	private int id;
	private Buffer buffer;
	private int producaoTotal;
	
	public Produtor(int id, Buffer buffer, int producao) {
		this.id = id;
		this.buffer = buffer;
		this.producaoTotal = producao;
	}
	
	public void run() {
        for (int i = 0; i < producaoTotal; i++) {
            buffer.set(id, i);
        }
        System.out.println("Produtor #" + id + " concluido!");
    }

}
