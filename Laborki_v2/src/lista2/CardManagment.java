package lista2;

import java.util.ArrayList;
import java.util.List;

public class CardManagment {
	List<Player> playerlist;
	List<Card> actualDeck;
	
	DeckManagment deck = new DeckManagment();

	 
	public CardManagment(){
		generateNewDeck();
	}
	
	public void generateNewDeck(){
		deck.GenerateRandomDeck();
		actualDeck = deck.showDeck();
	}
	
	public boolean isPosibleToDistribute(int howManyCards, int howManyPlayers){
		return (howManyCards * howManyPlayers <= deck.showDeck().size() );
	}
	
	public void createPlayer(int howMany){
		playerlist = new ArrayList<Player>();
		for(int i=0; i<howMany; i++){
			playerlist.add(i, new Player());
		}
	
	}
	
	public List<Player> showPlayers(){
		return playerlist;
	}
	public void distributeCards(int howManyCards){
		if(isPosibleToDistribute(howManyCards,playerlist.size())){
			for(Player player: playerlist){
				for(int j=0; j<howManyCards; j++){
					(player).hand.addCard(actualDeck.get(j));
					actualDeck.remove(j);
				}
			}
		} else
			System.out.println("Za du¿o kart dla danej iloœci graczy");
	}
}
