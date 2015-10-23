package lista2;

public class Card {
	public final String rank;
	public final String type;
	
	public Card(String rank, String type){
		this.rank = rank;
		this.type = type;
	}
	
	public String getRank(){
		return rank;
	}
	
	public String getType(){
		return type;
	}
	
	public String getAll(){
		return rank+"_"+type;
	}
}
