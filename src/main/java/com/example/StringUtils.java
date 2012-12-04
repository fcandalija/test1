package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * Utility String methods.
 */
public class StringUtils {

	/**
	 * Comparator enabling that compare {@link String} using the contrary of {@link String#compare(String)}
	 * @author Tiaped
	 * @TODO use it in a static final attribute
	 */
	private static final class ReverseStringComparator implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			return -s1.compareTo(s2);
		}
	}

	/**
	 * Returns the alphabetically sorted and reversed concatenation of
	 * {@code parts}, an empty strings if {@code strings} is null or empty. Each
	 * {@code parts} are separated with {@code separator}.
	 * 
	 * @param parts
	 *          parts to join, may be null or empty.
	 * @param separator
	 *          separator between each part, empty string should be use if null.
	 * 
	 * @return the alphabetically sorted and reversed concatenation of String
	 *         {@code parts}, an empty strings if {@code strings} is null or
	 *         empty.
	 */
	public static String joinAlphabeticalyReversed(final Iterable<String> parts, final String separator) {
		String result = "";
		// Not yet sorted
		List<String> sortedParts = Lists.newArrayList(parts==null?Lists.<String>newArrayListWithExpectedSize(0):parts);
		Collections.sort(sortedParts, new ReverseStringComparator());
		result = Joiner.on(separator==null?"":separator).join(sortedParts);
		return result;
	}

}
