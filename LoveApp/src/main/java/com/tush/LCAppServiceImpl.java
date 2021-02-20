package com.tush;

import org.springframework.stereotype.Service;

@Service
public class LCAppServiceImpl implements LCAppService {

	public final String LCAppFormula ="FLAME";
	
	@Override
	public String CalculateLove(String userName, String crushName) {
		
		int userAndCrushcount = (userName+crushName).toCharArray().length;
		
		int formulaCount = LCAppFormula.toCharArray().length;
		
		int rem = userAndCrushcount % formulaCount;
		
		char resultChar = LCAppFormula.charAt(rem);
		
		String result = whatsBetweenUs(resultChar);
		
		return result;
	}

	@Override
	public String whatsBetweenUs(char calculationResult) {
		
		String result = null;
		
		
		if(calculationResult == 'F') {
			result= LoveCalculatorConstants.F_char_meaning;
		}
			
		
		if(calculationResult == 'L') {
			result=  LoveCalculatorConstants.L_char_meaning;
		}
		
		if(calculationResult == 'A') {
			result=  LoveCalculatorConstants.M_char_meaning;
		}
		
		if(calculationResult == 'M') {
			result=  LoveCalculatorConstants.A_char_meaning;
		}
		
		if(calculationResult == 'E') {
			result=  LoveCalculatorConstants.E_char_meaning;
		}
		return result;
	}

}
