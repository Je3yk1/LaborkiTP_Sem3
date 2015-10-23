package lista2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class CardsTest {

	@Test
	public void testCreatePlayer() {
		CardManagment cardMng = new CardManagment();
		cardMng.createPlayer(10);
		assertNotNull(cardMng.playerlist.get(0));
	}
	//@Ignore
	@Test
	public void testCardGenerator(){
		DeckManagment deck = new DeckManagment();
		List<Card> actDeck = new ArrayList<Card>();
		deck.GenerateRandomDeck();
		actDeck = deck.showDeck();
		System.out.println("Deck size ="+actDeck.size());
		for(int i=0; i<10; i++)
			System.out.println(actDeck.get(i).getAll());
	}
	//@Ignore
	@Test 
	public void testHand(){
		CardManagment cardManage = new CardManagment();
		cardManage.createPlayer(2);
		cardManage.distributeCards(2);
		cardManage.playerlist.get(0).hand.showStrHand();
		System.out.println("-------");
		cardManage.playerlist.get(1).hand.showStrHand();
		System.out.println("-------");
	}
	
	@Test
	public void testQuantity(){
		DeckManagment deckMng = new DeckManagment();
		deckMng.GenerateRandomDeck();
		List<Card> actDeck = new ArrayList<Card>();
		actDeck = deckMng.showDeck();
		int ace = 0, king = 0, tens = 0, jack = 0;
		for(int i=0; i<actDeck.size();i++){
			if(actDeck.get(i).getRank()=="Ace")ace ++;
			if(actDeck.get(i).getRank()=="King") king++;
			if(actDeck.get(i).getRank()=="10") tens++;
			if(actDeck.get(i).getRank()=="Jack") jack++;
		}
		
		assertEquals(4, ace);
		assertEquals(4, king);
		assertEquals(4, tens);
		assertEquals(4, jack);
	}
}
