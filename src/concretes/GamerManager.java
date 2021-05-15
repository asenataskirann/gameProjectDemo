package concretes;
import entities.Gamer;
import abstracts.GamerService;


public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Gamer Id : " +(gamer.getId()+ " Added."));
		System.out.println("Gamer Name-Surname : " +(gamer.getFirstName() + (" "+gamer.getLastName() + " Added.")));
		System.out.println(	"Identification Number :" + (gamer.getIdentificationNumber()));
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer Updated.");
		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer Deleted.");
		
	}
	


	
}
