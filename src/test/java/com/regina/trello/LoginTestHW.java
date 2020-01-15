package com.regina.trello;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestHW extends TestBase {
@BeforeMethod
public void ensurePreconditions(){
  if(app.getSession().isAvatarPresentOnHeader()){
    app.getSession().logout();
  }
}

  @Test
  public void testLogInWithAtlassianAcc() throws InterruptedException {
    app.getSession().clickLoginLink();
    app.getSession().fillLoginFormAtlassianAcc("reginafrolova75@gmail.com", "916233020105r");
    app.getSession().pause(20000);
    Assert.assertTrue
            (app.getSession().isAvatarPresentOnHeader());
  }
  @Test
  public void testLogInWithAtlassianAcc2() throws InterruptedException {
    app.getSession().clickLoginLink();
    app.getSession().fillLoginFormAtlassianAcc("reginafrolova75@gmail.com", "916233020105r");
    app.getSession().pause(20000);
    Assert.assertTrue
            (app.getSession().isAvatarPresentOnHeader());
  }

  @Test(enabled = false)
  public void negativeTestLogInWithAtlassianAcc() throws InterruptedException {
    app.getSession().clickLoginLink();
    app.getSession().fillLoginFormAtlassianAcc("roch", "");
    app.getSession().pause(8000);
    Assert.assertTrue(app.getSession().isErrorPresent());
    Assert.assertTrue
            (!app.getSession().isAvatarPresentOnHeader());
  }

  @Test(enabled = false)
  public void testLogInOldAcc() throws InterruptedException {
    app.getSession().clickLoginLink();
    app.getSession().fillLoginFormOldAcc("reginafrolova75@gmail.com", "916233020105r");
    app.getSession().confirmLogin();
    Assert.assertTrue
            (app.getSession().isAvatarPresentOnHeader());
  }


}
