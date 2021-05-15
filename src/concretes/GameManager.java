package concretes;

import abstracts.GameService;
import entities.Game;


public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		 System.out.println("Game Id : " +(game.getId()+ " Added."));
		 System.out.println("Game Name : " +(game.getName()+ " Added."));
		 System.out.println("Game Price : " +(game.getUnitPrice()+ " Added."));
		 System.out.println("Game Sstock : " +(game.getUnitStock()+ " Added."));
		 
		
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game Updated.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game Deleted.");
		
	}



}
