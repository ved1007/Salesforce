package pages;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
//	@Before
	public void setup() {
	
		BasePage basepage = new BasePage();
		basepage.setup();
		
		
		
		
	}
//	@After
	public void teardown() {
		
		BasePage basepage = new BasePage();
		basepage.teardown();
		
	}

}
