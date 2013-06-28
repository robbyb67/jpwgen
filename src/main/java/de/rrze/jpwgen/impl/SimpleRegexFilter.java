package de.rrze.jpwgen.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SimpleRegexFilter extends AbstractPasswordFilter
{

	private Pattern regexPattern;

	private boolean search = false;

	private String id;
	
	public SimpleRegexFilter(String id, String regex, boolean search)
			throws PatternSyntaxException
	{
		super();
		
		this.id=id;
		regexPattern = Pattern.compile(regex);
		this.search = search;

	}
	
	@Override
	public String getID() 
	{
		return this.id;
	}
	
	@Override
	public String filter(int passwordFlags, String password)
	{
		String pass = null;

		Matcher matcher = regexPattern.matcher(password);

		if (search)
		{
			if (matcher.find())
			{
				pass = password;
			}
		} else
		{
			if (matcher.matches())
			{
				pass = password;
			}

		}
		
		return pass;
	}

}
