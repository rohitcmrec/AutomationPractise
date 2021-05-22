package scipts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pages.AddToCart;
import pages.HomePage;
import pages.LoginPage;

public class AddProducttoCart extends BaseClass{
	
	@Test
	public void addtocart() throws FileNotFoundException, IOException 
	{
		LoginPage lp = new LoginPage(driver);
		lp.signbtnclick(pd.getpropertiesdata("username"), pd.getpropertiesdata("password"));
		lp.searchproduct(pd.getpropertiesdata("product"));
		lp.submitbtnclick();
		
		HomePage hp = new HomePage(driver);
		u.dropDown(hp.getDropdwon(), pd.getpropertiesdata("dd"));
		hp.finaldressclick();
		
		AddToCart at = new AddToCart(driver);
		at.plusbtnclick();
		u.dropDown(at.getddsize(), pd.getpropertiesdata("size"));
		at.coloroptionclick();
		at.addtocartbtnclick();
		at.ptcheckoutclick();
	}
	

}
