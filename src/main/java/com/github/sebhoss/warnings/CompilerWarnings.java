/*
 * Copyright © 2013 Sebastian Hoß <mail@shoss.de>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See http://www.wtfpl.net/ for more details.
 */
package com.github.sebhoss.warnings;

/**
 * List of Eclipse compiler warnings which can be suppressed by the {@link SuppressWarnings} annotation.
 * 
 * @see <a
 *      href="http://help.eclipse.org/kepler/index.jsp?topic=/org.eclipse.jdt.doc.user/tasks/task-suppress_warnings.htm">Eclipse
 *      Reference Documentation</a>
 */
@SuppressWarnings(CompilerWarnings.NLS)
public final class CompilerWarnings {

    /**
     * Suppresses all warnings
     */
    public static final String ALL                      = "all";

    /**
     * Suppresses warnings relative to boxing/unboxing operations
     */
    public static final String BOXING                   = "boxing";

    /**
     * Suppresses warnings relative to cast operations
     */
    public static final String CAST                     = "cast";

    /**
     * Suppresses warnings relative to deprecated annotation
     */
    public static final String DEP_ANN                  = "dep-ann";

    /**
     * Suppresses warnings relative to deprecation
     */
    public static final String DEPRECATION              = "deprecation";

    /**
     * Suppresses warnings relative to missing breaks in switch statements
     */
    public static final String FALLTHROUGH              = "fallthrough";

    /**
     * Suppresses warnings relative to finally block that don't return
     */
    public static final String FINALLY                  = "finally";

    /**
     * Suppresses warnings relative to locals that hide variable
     */
    public static final String HIDING                   = "hiding";

    /**
     * Suppresses warnings relative to missing entries in a switch statement (enum case)
     */
    public static final String INCOMPLETE_SWITCH        = "incomplete-switch";

    /**
     * Suppresses warnings relative to javadoc warnings
     */
    public static final String JAVADOC                  = "javadoc";

    /**
     * Suppresses warnings relative to non-localized string literals
     */
    public static final String NLS                      = "nls";

    /**
     * Suppresses warnings relative to null analysis
     */
    public static final String NULL                     = "null";

    /**
     * Suppresses warnings relative to usage of raw types
     */
    public static final String RAWTYPES                 = "rawtypes";

    /**
     * Suppresses warnings relative to usage of resources of type Closeable
     */
    public static final String RESOURCE                 = "resource";

    /**
     * suppress warnings relative to usage of discouraged or forbidden references
     */
    public static final String RESTRICTION              = "restriction";

    /**
     * Suppresses warnings relative to missing serialVersionUID field for a serializable class
     */
    public static final String SERIAL                   = "serial";

    /**
     * Suppresses warnings relative to incorrect static access
     */
    public static final String STATIC_ACCESS            = "static-access";

    /**
     * Suppresses warnings relative to methods that could be declared as static
     */
    public static final String STATIC_METHOD            = "static-method";

    /**
     * Suppresses warnings relative to overriding a method without super invocations
     */
    public static final String SUPER                    = "super";

    /**
     * Suppresses warnings relative to unoptimized access from inner classes
     */
    public static final String SYNTHETHIC_ACCESS        = "synthethic-access";

    /**
     * Suppresses warnings because of missing synchronize when overriding a synchronized method
     */
    public static final String SYNC_OVERRIDE            = "sync-override";

    /**
     * Suppresses warnings relative to unchecked operations
     */
    public static final String UNCHECKED                = "unchecked";

    /**
     * Suppresses warnings relative to field access unqualified
     */
    public static final String UNQUALIFIED_FIELD_ACCESS = "unqualified-field-access";

    /**
     * Suppresses warnings relative to unused code and dead code
     */
    public static final String UNUSED                   = "unused";

    private CompilerWarnings() {
        // Constants class
    }

}
