package com.utils.properties.objects;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Key;

@Config.Sources(value = {"file:${user.dir}/src/main/resources/Objectrepositiries/AccountPage.properties"})

public interface AccountPageElements extends Config
{

	@Key(value = "sf.accountspage.clkNew.btn")
	String clkAccountsPageNew();
	
	@Key(value = "sf.accountspage.enterAccountName")
	String clkAndTypeAccountsPageAccountName();
	
	@Key(value = "sf.accountspage.clkOwnerShip.dropdown.btn")
	String clkAccountsPageOwnershipDropDown();
	
	@Key(value = "sf.accountspage.clkOwnerShip.dropdown.listOfOptions")
	String clkAccountsPageOwnershipDropDownListOfOptions();
	
	@Key(value = "sf.accountspage.clkOwnerShip.public")
	String clkAccountsPageOwnershipPublic();
	
	@Key(value = "sf.accountspage.clkSave")
	String clkAccountsPageSave();
	
	@Key(value = "sf.accountspage.verifyAccountName")
	String VerifyCreateAccountsPageResult();
	
//	EDIT ACCOUNTS
	@Key(value = "sf.accountspage.clkUniqueSearch")
	String clkAccountsPageUniqueSearch();
	
	@Key(value = "sf.accountspage.listOfAccountNames")
	String clkAccountsPageListOfAccountsName();
	
	@Key(value = "sf.accountspage.AccountName")
	String clkAccountsPageAccountName();
	
	@Key(value = "sf.accountspage.clkdropDown")
	String clkAccountsPageDropDown();
	
	@Key(value = "sf.accountspage.clkEdit")
	String clkAccountsPageEdit();
	
	@Key(value = "sf.accountspage.scrollIntoView.clkType")
	String clkAccountsPageAccountType();
	
	@Key(value = "sf.accountspage.listOfTypeOptions")
	String clkAccountsPageListOfTypesOptions();
	
	@Key(value = "sf.accountspage.scrollIntoView.clkIndustry")
	String clkAccountsPageIndustry();
	
	@Key(value = "sf.accountspage.listOfIndustryOptions")
	String clkAccountsPageIndustryListOfOptions();
	
	@Key(value = "sf.accountspage.scrollIntoView.billing.street")
	String clkAndTypeAccountsPageBillingStreet();
	
	@Key(value = "sf.accountspage.billing.city")
	String clkAndTypeAccountsPageBillingCity();
	
	@Key(value = "sf.accountspage.billing.postalCode")
	String clkAndTypeAccountsPageBillingPostalCode();
	
	@Key(value = "sf.accountspage.billing.country")
	String clkAndTypeAccountsPageBillingCountry();
	
	@Key(value = "sf.accountspage.scrollIntoView.shipping.street")
	String clkAndTypeAccountsPageShippingStreet();
	
	@Key(value = "sf.accountspage.shupping.city")
	String clkAndTypeAccountsPageShippingCity();
	
	@Key(value = "sf.accountspage.shipping.postalCode")
	String clkAndTypeAccountsPageShippingPostalCode();
	
	@Key(value = "sf.accountspage.clk.customerPriority")
	String clkAccountsPageCustomerPriority();
	
	@Key(value = "sf.accountspage.customerPriority.listOfOptions")
	String clkAccountsPageCustomerPriorityListOfOptions();
	
	@Key(value = "sf.accountspage.clkSla")
	String clkAccountsPageSla();
	
	@Key(value = "sf.accountspage.Sla.listOfOptions")
	String clkAccountsPageSlaListOfOptions();
	
	@Key(value = "sf.accountspage.scrollIntoView.clkActive")
	String clkAccountsPageActive();
	
	@Key(value = "sf.accountspage.Active.listOfOptions")
	String clkAccountsPageActiveListOfOptions();
	
	@Key(value = "sf.accountspage.scrollIntoView.clkUpSellOpportunity")
	String clkAccountsPageUpSellOpportunity();
	
	@Key(value = "sf.accountspage.UpSellOpportunity.listOfOptions")
	String clkAccountsPageUpSellOpportunityListOfOptions();
	
	@Key(value = "sf.accountspage.scrollIntoView.clkNumber")
	String clkAndTypeAccountsPagePhoneNumber();
	
	@Key(value = "sf.accountspage.toastMessage")
	String VerifyEditAccountsPageResults();
	
	
	
	
}
