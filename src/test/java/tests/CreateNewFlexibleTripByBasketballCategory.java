package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CreateNewFlexibleTripByBasketballCategory extends BaseLoginTest {
	
	@Epic("create profile")
	@Feature("set by sub category to graph values")
	@Story("as user, i want to set by sub category to graph values")
	@Severity(SeverityLevel.NORMAL)
	@Description("valid the basketball sub category graph value can set on tell us page")
	@Test(description="valid the basketball sub category graph value")
	public void createNewFlexibleTripByBasketballCategory() {
		Assert.assertEquals(
				mp.createNewFlexibleSportTripByCategory("Basketball"),
				"1");
	}
}
