package gameProjectDemo;

import concretes.CampaignManager;
import concretes.GameManager;
import concretes.GamerManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {
	public static void main(String[] args) {
	
	GamerManager gamerManager = new GamerManager();
	Gamer gamer1 = new Gamer(55542,	"Asena","Taşkıran","08.05.1998",23,"66373254310");
	gamerManager.add(gamer1);
	System.out.println("-----------WELCOME TO MY WORLD----------" );
	
    GameManager gameManager = new GameManager();
    Game Pubg = new Game(22252,"Pubg",87,10);
    gameManager.add(Pubg);
    System.out.println("----------------GREAT FPS GAME-------------------");
    
    CampaignManager campaignManager = new CampaignManager();	
	Campaign kampanya = new Campaign(215643,"Black Friday",100/50);
	campaignManager.add(kampanya);	
	System.out.println(	"----------GREAT CAMPAIGN!-----------");
	
 }
}

