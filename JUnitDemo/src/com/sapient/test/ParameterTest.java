package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.Palindrome;

@RunWith(JUnitPlatform.class)
public class ParameterTest {
	
	private static Palindrome obj;
	
	@BeforeAll
	public static void beforeAll(){
		obj=new Palindrome();
	}
	@AfterAll
	public static void afterAll(){
		obj=null;
	}
	
	@ParameterizedTest 
	@ValueSource(strings={"nitin","kayak","malayalam"})//used to pass only one parameter is passed 
	public void testPalindrome1(String str){
		assertTrue(obj.checkPalindrome(str));
	}
	
	@ParameterizedTest
	@ValueSource(strings={"rama","germany",""})
	public void testPalindrome2(String str){
		assertFalse(obj.checkPalindrome(str));
	}

}
