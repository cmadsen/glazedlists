/**
 * Glazed Lists
 * http://glazedlists.dev.java.net/
 *
 * COPYRIGHT 2003 O'DELL ENGINEERING LTD.
 */
package ca.odell.glazedlists;

import java.util.List;

/**
 * An item that can be compared to a list of filters to see if it matches.
 *
 * @see <a href="https://glazedlists.dev.java.net/tutorial/part2/index.html">Glazed
 * Lists Tutorial Part 2 - Text Filtering</a>
 * @see <a href="https://glazedlists.dev.java.net/tutorial/part8/index.html#filtering">Glazed
 * Lists Tutorial Part 8 - Performance Tuning</a>
 *
 * @author <a href="mailto:jesse@odel.on.ca">Jesse Wilson</a>
 */
public interface TextFilterable {

    /**
     * Gets this object as a list of Strings. These Strings
     * should contain all object information so that it can be compared
     * to the filter set.
     *
     * @param baseList a list that the implementor shall add their filter
     *      strings to via <code>baseList.add()</code>. This may be a non-empty
     *      List and it is an error to call any method other than add().
     */
    public void getFilterStrings(List baseList);
}
