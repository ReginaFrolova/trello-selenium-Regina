package com.regina.trello;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TeamCreationTests extends TestBase{
  @BeforeMethod
  public void preconditions() throws InterruptedException {
    if(!app.getSession().isAvatarPresentOnHeader()){
      app.getSession().loginAtlassianAcc();
    }
  }

  @Test
  public void teamCreationTestFromHeader(){
int teamCountBefore = app.getTeam().getTeamsCount();
  //  String teamId =
   //         wd.findElement(By.cssSelector("[data-test-id^=home-team-tab-section]")).getAttribute("data-test-id");
  //  System.out.println(teamId);
    app.getBoard().clickOnPlusButton();
    app.getTeam().selectCreateTeamFromDropDown();
    app.getTeam().fillTeamCreationForm("teamName", "teamDescr");
    app.getTeam().submitTeamCreation();
//    if(isElementPresent(By.cssSelector("[name='close']"))){
//      closeInviteToTheTeamForm();
//    }
    app.getTeam().clickLaterButton();
int teamCountAfter = app.getTeam().getTeamsCount();
  Assert.assertEquals(teamCountAfter, teamCountBefore+1);
    //String overflowValue = ApplicationManager.wd.findElement(By.cssSelector("")).getCssValue("overflow");
  }

}
