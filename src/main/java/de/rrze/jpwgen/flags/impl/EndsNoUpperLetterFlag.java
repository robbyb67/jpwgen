package de.rrze.jpwgen.flags.impl;

import de.rrze.jpwgen.IPwGenRegEx;
import de.rrze.jpwgen.flags.AbstractPwFlag;

public class EndsNoUpperLetterFlag extends AbstractPwFlag
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EndsNoUpperLetterFlag()
	{
		mask = IPwGenRegEx.REGEX_ENDS_NO_UPPER_LETTER_FLAG;
	}
}