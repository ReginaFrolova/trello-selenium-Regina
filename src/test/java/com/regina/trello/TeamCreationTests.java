package com.regina.trello;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamCreationTests extends TestBase{
  @BeforeMethod
  public void preconditions() throws InterruptedException {
    if(!app.isAvatarPresentOnHeader()){
      app.loginAtlassianAcc();
    }
  }

  @Test
  public void teamCreationTestFromHeader(){
int teamCountBefore = app.getTeamsCount();
  //  String teamId =
   //         wd.findElement(By.cssSelector("[data-test-id^=home-team-tab-section]")).getAttribute("data-test-id");
  //  System.out.println(teamId);
    app.clickOnPlusButton();
    app.selectCreateTeamFromDropDown();
    app.fillTeamCreationForm("teamName", "teamDescr");
    app.submitTeamCreation();
//    if(isElementPresent(By.cssSelector("[name='close']"))){
//      closeInviteToTheTeamForm();
//    }
    app.clickLaterButton();
int teamCountAfter = app.getTeamsCount();
  Assert.assertEquals(teamCountAfter, teamCountBefore+1);
    String overflowValue = ApplicationManager.wd.findElement(By.cssSelector("")).getCssValue("overflow");
  }

}
