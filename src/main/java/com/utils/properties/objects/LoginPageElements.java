package com.utils.properties.objects;

import org.aeonbits.owner.Config;

@Config.Sources(value = {"file:${user.dir}/src/main/resources/Objectrepositiries/LoginPage.properties"})
public interface LoginPageElements extends Config {
	
	@Key(value = "sf.lp.username.field")
	String getUsernameObject();
	
	@Key(value = "sf.lp.password.field")
	String getPasswordObject();
	
	@Key(value = "sf.lp.login.button")
	String getLoginButtonObject();

}