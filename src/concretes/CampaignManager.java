package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	
	@Override
	public void add(Campaign campaign) {
		 System.out.println(campaign.getName()+ " Added.");
		 System.out.println(campaign.getId()+ " Id Added.");
		 System.out.println(campaign.getDiscountRate()+ " Added.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getDiscountRate()+ " Discount Rate Updated.");
		
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+ "Campaign Deleted.");
		
		
	}

}
