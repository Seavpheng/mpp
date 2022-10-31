package lab_5.prob1.rulesets;

import java.awt.Component;

import lab_5.prob1.gui.*;

import javax.swing.plaf.basic.BasicComboBoxUI;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {

	private BookWindow bookwin;
	@Override
	public void applyRules(Component ob) throws RuleException {
		bookwin = (BookWindow) ob;
		nonempty();
		isbnRule();
		priceRule();
	}

	private void nonempty() throws RuleException {
		if(bookwin.getIsbnValue().trim().isEmpty()
				|| bookwin.getTitleValue().trim().isEmpty()
				|| bookwin.getPriceValue().trim().isEmpty()
		)

		throw  new RuleException("All fields must be nonempty");
	}

	private void isbnRule() throws RuleException{
		String val = bookwin.getIsbnValue().trim();
		try{
			Long.parseLong(val);
		}catch (NumberFormatException e){
			throw  new RuleException("Isbn must be numeric");
		}

		int len = val.length();
		if(len != 10 && len != 13){
			throw new RuleException("ISBN must have 10 or 13 digits");
		}

		if(len == 10 && !(val.charAt(0) == 1 ||val.charAt(0) == 0 )){
			throw new RuleException("First digit of 10-digit ISBN must be 0 or 1");
		}

		if(len == 13 && !(val.startsWith("978") || val.startsWith("979"))) {
			throw new RuleException("All 13-digit ISBNs must begin with either '978' or '979'");
		}
	}

	private void priceRule() throws RuleException{
		String val = bookwin.getPriceValue().trim();
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
