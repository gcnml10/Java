package chapter5.card;

public class CardCompany {
	
	private static int CardID = 10000;
	
	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {};
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
	
	public Card createCard() {
		CardID += 1 ;
		Card card = new Card(CardID);
		return card;
	}
	
	

}
