package dev.Utils;

import junit.framework.Test;

public class StringUtilsTest {

	public void testAppTest() throws Exception
	{
		if (StringUtils.levenshteinDistance("chat", "chats") != 1)
		{
			throw new Exception("LevenshteinDistance fausse chat");
		}

		if (StringUtils.levenshteinDistance("machins", "machine") != 1)
		{
			throw new Exception("LevenshteinDistance fausse machins");
		}

		if (StringUtils.levenshteinDistance("avion", "aviron") != 1)
		{
			throw new Exception("LevenshteinDistance fausse avion");
		}

		if (StringUtils.levenshteinDistance("distance", "instance") != 2)
		{
			throw new Exception("LevenshteinDistance fausse distance");
		}

		if (StringUtils.levenshteinDistance("chien", "chine") != 2)
		{
			throw new Exception("LevenshteinDistance fausse chien");
		}

		if (StringUtils.levenshteinDistance(null, "chine") != 2)
		{
			throw new Exception("LevenshteinDistance fausse null-chine");
		}

		if (StringUtils.levenshteinDistance("chien", null) != 2)
		{
			throw new Exception("LevenshteinDistance fausse chien-null");
		}

		if (StringUtils.levenshteinDistance(null, null) != 2)
		{
			throw new Exception("LevenshteinDistance fausse null-null");
		}

		if (StringUtils.levenshteinDistance("2", "chien") != 5)
		{
			throw new Exception("LevenshteinDistance fausse null-null");
		}

		
	}
	
		
	}
	

