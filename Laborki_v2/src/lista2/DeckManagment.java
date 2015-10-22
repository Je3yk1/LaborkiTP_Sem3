package lista2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class DeckManagment {
	private List<Card> DeckOfCards;
	
 	public List<Card> GenerateRandomDeck(){
 		List<Card> cardsDeck = GenerateDeck();
 		DeckOfCards = new ArrayList<Card>();
 		Random rnd = new Random();
 		for(int i=0; i<cardsDeck.size();i++){
 			Card card;
 			do card = cardsDeck.get(rnd.nextInt(cardsDeck.size()));
 					while (DeckOfCards.contains(card));
 			DeckOfCards.add(card);
 		}
 		return DeckOfCards;
 	}
	
	public List<Card> GenerateDeck(){
		List<Card> Deck = new ArrayList<Card>();
		HashMap<Integer, String> CardsMap;
		CardsMap = new HashMap<Integer, String>();
		CardsMap.put(2, "2");
		CardsMap.put(3, "3");
		CardsMap.put(4, "4");
		CardsMap.put(5, "5");
		CardsMap.put(6, "6");
		CardsMap.put(7, "7");
		CardsMap.put(8, "8");
		CardsMap.put(9, "9");
		CardsMap.put(10, "10");
		CardsMap.put(11, "Jack");
		CardsMap.put(12, "Queen");
		CardsMap.put(13, "King");
		CardsMap.put(14, "Ace");
		
		for(int i=2; i<=14; i++){
			Deck.add(new Card(CardsMap.get(i), "Diamonds"));
			Deck.add(new Card(CardsMap.get(i), "Spades"));
			Deck.add(new Card(CardsMap.get(i), "Hearts"));
			Deck.add(new Card(CardsMap.get(i), "Clubs"));
		}
		return Deck;
	}
	
	public List<Card> showDeck(){
		if(DeckOfCards == null)
			GenerateRandomDeck();
		return DeckOfCards;
	}
}
