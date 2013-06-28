package de.rrze.jpwgen.flags.impl;

import de.rrze.jpwgen.IPwGenRegEx;
import de.rrze.jpwgen.flags.AbstractPwFlag;

public class StartsNoUpperLetterFlag extends AbstractPwFlag
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public StartsNoUpperLetterFlag()
	{
		mask = IPwGenRegEx.REGEX_STARTS_NO_UPPER_LETTER_FLAG;
	}
}