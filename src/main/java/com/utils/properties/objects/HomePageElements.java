package com.utils.properties.objects;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Key;

@Config.Sources(value = {"file:${user.dir}/src/main/resources/Objectrepositiries/HomePage.properties"})

public interface HomePageElements extends Config
{
	@Key(value = "sf.homepage.more.button")
	String clkMore();
	
	@Key(value = "sf.homepage.cases.button")
	String clkCases();
}
