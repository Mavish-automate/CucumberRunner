package com.utils.properties.objects;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Key;

@Config.Sources(value = {"file:${user.dir}/src/main/resources/Objectrepositiries/OpportunitiesPage.properties"})

public interface OpportunitiesPageElements extends Config
{
	@Key(value = "sf.opportunitypage.newbutton")
	String clkNew();
	
	@Key(value = "sf.opportunitypage.opportunityname")
	String typeOpportrunityName();
	
	@Key(value = "sf.opportunitypage.clkclosedate")
	String clkCloseDate();
	
	@Key(value = "sf.opportunitypage.listofclosedate")
	String listOfCloseDate();
	
	@Key(value = "sf.opportunitypage.selectclosedate")
	String selectCloseDate();
	
	@Key(value = "sf.opportunitypage.clkstage")
	String clkStage();
	
	@Key(value = "sf.opportunitypage.clkneedanalysis")
	String clkNeedAnalysis();
	
	@Key(value = "sf.opportunitypage.save")
	String clkSave();
	
	@Key(value = "sf.opportunitypage.toastmessage")
	String verifyOpportunityResult();
	
	//	EDIT OPPOPRTUNITY
	@Key(value = "sf.opportunitypage.search")
	String clkOpportunitySearch();
	
	@Key(value = "sf.opportunitypage.searchname")
	String clkOpportunitySearchName();
	
	@Key(value = "sf.opportunitypage.clkdropdown")
	String clkOpportunityDropdown();
	
	@Key(value = "sf.opportunitypage.clkedit")
	String clkOpportunityEdit();
	
	@Key(value = "sf.opportunitypage.selectclosedatetomorrow")
	String selectOpportunitycloseDateTomorrow();
	
	@Key(value = "sf.opportunitypage.clkperceptionanalysis")
	String clkOpportunityPerceptionAnalysis();
	
	@Key(value = "sf.opportunitypage.clkAndTypeDescription")
	String clkOpportunityDescription();


//	DELETE OPPORTUNITY
	
	@Key(value = "sf.opportunitypage.clkdelete")
	String selectOpportunityDelete();
	
	@Key(value = "sf.opportunitypage.delete")
	String clkOpportunityDelete();
}
