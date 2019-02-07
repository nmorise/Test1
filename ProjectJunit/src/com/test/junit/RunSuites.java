package com.test.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestSumOfNumbers.class,TestMultiplyNumbers.class,TestDivideNumbers.class})
public class RunSuites {

}
