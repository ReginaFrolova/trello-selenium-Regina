package com.regina.trello;

import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    @Test
  public void testLogIn() throws InterruptedException {
    app.clickLoginLink();
    app.loginWhithBothAccs();
      //

    }


}
