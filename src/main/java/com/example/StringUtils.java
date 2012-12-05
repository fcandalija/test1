package com.example;

import java.util.Collections;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * Utility String methods.
 */
public class StringUtils {

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
		Collections.sort(sortedParts);
		Collections.reverse(sortedParts);
		result = Joiner.on(separator==null?"":separator).join(sortedParts);
		return result;
	}

}
