package com.utils.properties.objects;

import org.aeonbits.owner.Config;

@Config.Sources(value = {"file:${user.dir}/src/main/resources/Objectrepositiries/LandingPage.properties"})
public interface LandingPageElements extends Config {
	
	@Key(value = "sf.landingpage.toggle.button")
	String clkToggle();
	
	@Key(value = "sf.landingpage.viewall")
	String clkViewAll();
	
	@Key(value = "sf.landingpage.applauncher.search")
	String clkAppLauncherSearchAndTypeSales();
	
	@Key(value = "sf.landingpage.applauncher.accountsSales")
	String clkSales();
	
	@Key(value = "sf.landingpage.homepage.opportunities")
	String clkOpportunities();
	
	@Key(value = "sf.landingpage.clkAccount.btn")
	String clkAccount();
	
	
	
	
	
	
	
	

}
