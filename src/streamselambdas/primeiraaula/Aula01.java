package primeiraaula;

public class Aula01 {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Olá mundo!");
			}
		}).run();
		
		new Thread(() -> System.out.println("Ola mundo 2")).run();
	}
}
