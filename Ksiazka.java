public class Ksiazka {
	private String autor;
	private String tytul;	
	private int rokWydania;
	
	public Ksiazka(String autor, String tytul, int rokWydania) {
		this.autor = autor;
		this.tytul = tytul;
		this.rokWydania = rokWydania;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getTytul() {
		return tytul;
	}

	public int getRokWydania() {
		return rokWydania;
	}
	
	public String toString() {
		String wynik = "Autor: " + autor + "\n";
		wynik += "Tytul: " + tytul + "\n";
		wynik += "Rok: " + rokWydania + "\n";
		return wynik;
	}
}
