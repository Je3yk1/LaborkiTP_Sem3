package lista2;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	private List<Card> hand = new ArrayList<>();
	
	public void addCard(Card card){
		hand.add(card);
	}
	
	public List<Card> showHand(){
		return hand;
	}
	
	public void showStrHand(){
		for(int i=0; i<hand.size();i++)
			System.out.println(hand.get(i).getAll());
	}
	
	public boolean findCard(String rank){
		int i = 0;
		while((hand.size()>i)&&(hand.get(i).getRank() != rank))
			i++;
		
		if(i<hand.size())
			return true;
		else
			return false;
	}
	
	public boolean findCard(String rank, String type){
		int i =0;
		while((i<hand.size())&&(hand.get(i).getAll() != rank+""+type))
			i++;
		if(i<hand.size())
			return true;
		else
			return false;
	}
}
