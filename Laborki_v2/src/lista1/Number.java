package lista1;



/**
 * Klasa number posiadaj¹ca metody zmieniaj¹ce nam 
 * @author jedrzej
 *
 */

public class Number {
	int a;
	/**
	 * Konstruktor klasy
	 * @param a
	 */
	public Number(int a) {
	
		this.a = a;
	
	}
	/**
	 * Funkcja zwraca nam postac binarna przechowywanej liczby naturalnej
	 * @return
	 */
	public String printBin(){
		return Integer.toBinaryString(a);
	}
	/**
	 * Funkcja oddajaca nam postac ósemkow¹ liczby
	 * @param a - liczba któr¹ chcemy zamieniæ
	 *
	 * @return zamieniona liczba zwracana jako String
	 */
	public String printOct(){
		return Integer.toOctalString(a);
	}
	/**
	 * Funkcja dajaca nam postac szesnastkowa liczby
	 * @param a liczba ktora chcemy zmienic
	 * @return postac szesnastkowa liczby
	 */
	public String printHex(){
		
		return Integer.toHexString(a);
	}
}
