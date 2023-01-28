import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
//tworzenie dwoch obiektow klasy ksiazka
	public static void main(String[] args) throws IOException {
		Ksiazka k1 = new Ksiazka("Bruce Eckel", "Thinking in Java", 2006);
		Ksiazka k2 = new Ksiazka("Radoslaw Sokol", "ABC ochrony przed wirusami", 2004);
    Czytelnik c1 = new Czytelnik("Michał", "Bochenek");
    
		//plik teskstwowy musi byc opakowany filewriter/bufferem zeby mozna bylo w nim pisac
		FileWriter fw = new FileWriter("plik.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		//zapisywanie do pliku tesktowego
		bw.write("-------\n");
    //wywolanie metody toString
		bw.write(k1.toString());
		bw.write("-------\n");
    //tu tez jest wywolywana metoda toString w inny sposob -> szuuka w obiekcie K2 metode toString stad opis
		bw.write("" + k2);
		
		bw.close();//metoda zamykania pliku tekstowego w ktorym bylo pisane

    FileWriter fw2 = new FileWriter("czytelnicy.txt");
		BufferedWriter bw2 = new BufferedWriter(fw2);
		
		bw2.write("-------\n");
		bw2.write(c1.toString());
		
		bw2.close();
		
		FileReader fr = new FileReader("plik.txt");//tu ten plik jest otwierany do czytania
		BufferedReader br = new BufferedReader(fr);// z zewnatrz opakowywany obiektem klasy BufferedReader aby miec dostep do metofy readLine ktora czyta linijke tekstu (wiersz)
		
		while(true) {
			String wiersz = br.readLine();
			if(wiersz == null) break;//bedzie czytac do momentu 'break' czyli jezeli wiersz wczytany aktualnie z pliku  jest null czyli nie ma wiecej wierszy
			System.out.print(wiersz + "\n");//wyswietlanie na ekranie
		}
		
		br.close();

    FileReader fr2 = new FileReader("czytelnicy.txt");//tu ten plik jest otwierany do czytania
		BufferedReader br2 = new BufferedReader(fr2);// z zewnatrz opakowywany obiektem klasy BufferedReader aby miec dostep do metofy readLine ktora czyta linijke tekstu (wiersz)
		
		while(true) {
			String wiersz = br2.readLine();
			if(wiersz == null) break;//bedzie czytac do momentu 'break' czyli jezeli wiersz wczytany aktualnie z pliku  jest null czyli nie ma wiecej wierszy
			System.out.print(wiersz + "\n");//wyswietlanie na ekranie
		}
		
		br2.close();
    
	}
}

/*
 * Zadania:
 * 1. Stworz wlasna klase Czytelnik (z atrybutami: imie oraz nazwisko).
 * 2. Otworz do zapisu kolejny plik (np. czytelnicy.txt).
 * 3. Zapisz do niego 2 obiekty klasy Czytelnik.
 * 4. Wypisz na ekran zawartosc pliku czytelnicy.txt.
 * 
 */
