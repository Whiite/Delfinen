/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSuite;
import Data.MemberTest;
import Data.TxtAccessTest;
import Logic.CompResTest;
import Logic.ControllerTest;
import Logic.PaymentTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Malte
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({MemberTest.class, TxtAccessTest.class, CompResTest.class, 
    ControllerTest.class, PaymentTest.class})
public class TestSuite {
    
}