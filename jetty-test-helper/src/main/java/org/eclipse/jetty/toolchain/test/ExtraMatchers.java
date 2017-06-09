//
//  ========================================================================
//  Copyright (c) 1995-2017 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.toolchain.test;

import java.util.List;

import org.eclipse.jetty.toolchain.test.matchers.IsOrderedCollectionContaining;

/**
 * Extra Matchers for the Junit Hamcrest users out there.
 */
public class ExtraMatchers
{
    /**
     * Creates a matcher for {@link Iterable}s that matches when consecutive passes over the
     * examined {@link Iterable} yield at least one item that is matched by the corresponding
     * matcher from the specified <code>itemMatchers</code>. Whilst matching, each traversal of
     * the examined {@link Iterable} will stop as soon as a matching item is found.
     * <p>
     * For example:
     * 
     * <pre>
     * assertThat(Arrays.asList(&quot;foo&quot;,&quot;bar&quot;,&quot;baz&quot;),hasItems(endsWith(&quot;z&quot;),endsWith(&quot;o&quot;)))
     * </pre>
     * 
     * @param itemMatchers
     *            the matchers to apply to items provided by the examined {@link Iterable}
     * @param <T>
     *            the type
     * @return the matcher
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <T> org.hamcrest.Matcher<java.lang.Iterable<? super T>> ordered(List<T> itemMatchers)
    {
        return new IsOrderedCollectionContaining(itemMatchers);
    }
}