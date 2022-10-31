package lab_5.prob1.rulesets;

import java.awt.Component;

import lab_5.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	private CDWindow cdWin;
	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWin = (CDWindow) ob;
		nonempty();
		priceRule();
	}

	private void nonempty()throws RuleException{
		if(cdWin.getPriceValue().trim().isEmpty()
		|| cdWin.getArtistValue().trim().isEmpty()){
			throw new RuleException("All fields must be nonempty");
		}
	}

	private void priceRule() throws RuleException{
		String val = cdWin.getPriceValue().trim();
		double value = 0.00;

		try{
			value = Double.parseDouble(val);
		}
		catch (NumberFormatException e){
			throw new RuleException("Price must be a floating point number.");
		}

		int len = val.length();
		if(len < 3 || val.charAt(len-3)!='.'){
			throw new RuleException("Price must have exactly two digits after the decimal point.");
		}

		if(value <=0.49 ){
			throw new RuleException("Price must be a number greater than 0.49.");
		}
	}

}
