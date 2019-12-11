package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Mauro", "Bassan");

		em1.setAlternateEmail("mb@begear.com");
		// System.out.println(em1.getAlternateEmail());

		System.out.println(em1.showInfo());
	}

}
