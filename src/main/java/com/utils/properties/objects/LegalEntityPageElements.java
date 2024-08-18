package com.utils.properties.objects;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Key;

@Config.Sources(value = {"file:${user.dir}/src/main/resources/Objectrepositiries/LegalEntity.properties"})

public interface LegalEntityPageElements extends Config
{


	@Key(value = "sf.legalEntity.search.type.legalentity")
	String typeLegalEntity();
	
	@Key(value = "sf.legalEntity.clklegalEntity")
	String clkLegalEntity();
	
	@Key(value = "sf.legalEntity.clknewlegalEntity")
	String clkNewLegalEntity();
	
	@Key(value = "sf.legalEntity.enterlegalEntityname")
	String enterLegalEntityName();
	
	@Key(value = "sf.legalEntity.clksave")
	String clkLegalEntitySAve();
	
	@Key(value = "actualtextlegalentity")
	String verifyLegalEntityResult();
	
//	EDIT LEGAL ENTITY
		
	@Key(value = "sf.legalEntity.search.legalEntity.byname")
	String searchLegalEntityName();
	
	@Key(value = "sf.legalEntity.clk.search.legalEntity.byname")
	String clkLegalEntitySearchedName();
	
	@Key(value = "sf.legalEntity.clkdropdown")
	String clkLegalEntityDropDown();
	
	@Key(value = "sf.legalEntity.clkedit")
	String clkLegalEntityEdit();
	
	@Key(value = "sf.legalEntity.enter.companyname.testleaf")
	String clkAndTypeLegalEntityCompanyName();
	
	@Key(value = "sf.legalEntity.select.status")
	String clkLegalEntityStatus();
	
	@Key(value = "sf.legalEntity.select.status.active")
	String clkLegalEntityStatusActive();
	
	
	
}
