package dev.demo_tests_unitaires;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dev.Utils.*;


/**
 * Unit test for simple App.
 */
public class AppTest
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest()
	{
	}

	@Test
	public void levenshteinDistanceChatChats()
	{
		assertEquals(1, StringUtils.levenshteinDistance("Chat", "Chats"));
	}

	@Test
	public void levenshteinDistanceChienChine()
	{
		assertEquals(2, StringUtils.levenshteinDistance("chien", "chine"));
	}

	@Test
	public void levenshteinDistanceVilleVieille()
	{
		assertEquals(2, StringUtils.levenshteinDistance("Ville", "Vieille"));
	}

	@Test(expected = NullPointerException.class)
	public void levenshteinDistanceNullVieille()
	{
		assertEquals(2, StringUtils.levenshteinDistance(null, "Vieille"));
	}

	@Test(expected = NullPointerException.class)
	public void levenshteinDistanceVieilleNull()
	{
		assertEquals(2, StringUtils.levenshteinDistance("Vieille", null));
	}

	@Test(expected = NullPointerException.class)
	public void levenshteinDistanceNullNull()
	{
		assertEquals(2, StringUtils.levenshteinDistance(null, null));
	}

	@Test
	public void levenshteinDistanceVideVide()
	{
		assertEquals(0, StringUtils.levenshteinDistance("", ""));
	}

	@Test
	public void levenshteinDistanceVideVieille()
	{
		assertEquals("Vieille".length(), StringUtils.levenshteinDistance("", "Vieille"));
	}
}