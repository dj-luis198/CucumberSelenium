@ForgetPassword
Feature: Login to ForgotPassword Page

  Background:
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"

  @ForgetPasswordLink
  Scenario: Verify ForgetPassword link on Login Page

    When User clicks on Forgot your Password Link
    Then User should navigate to a new page