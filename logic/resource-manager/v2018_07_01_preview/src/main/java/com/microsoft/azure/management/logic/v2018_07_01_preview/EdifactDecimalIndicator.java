/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2018_07_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EdifactDecimalIndicator.
 */
public final class EdifactDecimalIndicator extends ExpandableStringEnum<EdifactDecimalIndicator> {
    /** Static value NotSpecified for EdifactDecimalIndicator. */
    public static final EdifactDecimalIndicator NOT_SPECIFIED = fromString("NotSpecified");

    /** Static value Comma for EdifactDecimalIndicator. */
    public static final EdifactDecimalIndicator COMMA = fromString("Comma");

    /** Static value Decimal for EdifactDecimalIndicator. */
    public static final EdifactDecimalIndicator DECIMAL = fromString("Decimal");

    /**
     * Creates or finds a EdifactDecimalIndicator from its string representation.
     * @param name a name to look for
     * @return the corresponding EdifactDecimalIndicator
     */
    @JsonCreator
    public static EdifactDecimalIndicator fromString(String name) {
        return fromString(name, EdifactDecimalIndicator.class);
    }

    /**
     * @return known EdifactDecimalIndicator values
     */
    public static Collection<EdifactDecimalIndicator> values() {
        return values(EdifactDecimalIndicator.class);
    }
}
