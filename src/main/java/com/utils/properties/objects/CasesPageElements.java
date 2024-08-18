package com.utils.properties.objects;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Key;

@Config.Sources(value = {"file:${user.dir}/src/main/resources/Objectrepositiries/CasesPage.properties"})

public interface CasesPageElements extends Config
{


	@Key(value = "sf.casespage.new.button")
	String clkCasesNew();
	
	@Key(value = "sf.casespage.status.dropdown")
	String clkCasesStatusDropDown();
	
	@Key(value = "sf.casespage.status.dropdown.escalated")
	String clkCasesStatusEscalated();
	

	@Key(value = "sf.casespage.caseorigin.dropdown")
	String clkCasesCaseOriginDropdown();
	
	@Key(value = "sf.casespage.caseorigin.dropdown.email")
	String clkCasesCaseOriginDropDownEmail();
	
	@Key(value = "sf.casespage.contactname")
	String clkCasesSearchContacts();
	
	@Key(value = "sf.casespage.contactname.firstListOption")
	String clkCasesFirstListedOptionName();
	
	@Key(value = "sf.casespage.subject")
	String clkAndTypeCasesSubject();
	
	@Key(value = "sf.casespage.description")
	String clkAndTypeCasesDescription();
	
	@Key(value = "sf.casespage.save")
	String clkCasesSave();
	
//	EDIT CASES
	

	@Key(value = "sf.casespage.clkdropdown")
	String clkCasesDropDown();
	
	@Key(value = "sf.casespage.clkedit")
	String clkCasesEdit();
	
	@Key(value = "sf.casespage.status.dropdown.escalated")
	String clkCasesStatusDropDownEscalated();
	

	@Key(value = "sf.casespage.status.dropdown.working")
	String clkCasesStatusDropDownWorking();
	
	@Key(value = "sf.casespage.priority")
	String clkCasesPriority();
	
	@Key(value = "sf.casespage.priority.low")
	String clkCasesPriorityLow();
	
	@Key(value = "sf.casespage.caseorigin.dropdown.phone")
	String clkCasesCaseOriginPhone();
	
	@Key(value = "sf.casespage.caseorigin.slaviolation")
	String clkCasesSlaViolation();
	
	@Key(value = "sf.casespage.caseorigin.slaviolation.no")
	String clkCasesSlaViolationNo();
	
//	DELETE CASES
	@Key(value = "sf.casespage.clkdelete")
	String clkCasesDelete();
	
	
	
	
	
	
	
}
