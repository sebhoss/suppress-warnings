/*
 * Copyright © 2013 Sebastian Hoß <mail@shoss.de>
 * This work is free. You can redistribute it and/or modify it under the
 * terms of the Do What The Fuck You Want To Public License, Version 2,
 * as published by Sam Hocevar. See http://www.wtfpl.net/ for more details.
 */
package com.github.sebhoss.warnings;

/**
 * List of PMD warnings which can be suppressed by the {@link SuppressWarnings} annotation.
 * 
 * @see <a
 *      href="http://pmd.sourceforge.net/pmd-5.0.5/suppressing.html">http://pmd.sourceforge.net/pmd-5.0.5/suppressing.html</a>
 */
@SuppressWarnings(CompilerWarnings.NLS)
public final class PMDWarnings {

    /**
     * Suppresses all PMD warnings
     */
    public static final String PMD                                                 = "PMD";

    /**
     * Avoid jumbled loop incrementers - its usually a mistake, and is confusing even if intentional. <h2>Example</h2>
     * 
     * <pre>
     * public class JumbledIncrementerRule {
     *     public void foo() {
     *         for (int i = 0; i &lt; 10; i++) { // only references 'i'
     *             for (int k = 0; k &lt; 20; i++) { // references both 'i' and 'k'
     *                 System.out.println(&quot;Hello&quot;);
     *             }
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String JUMBLED_INCREMENTER                                 = "PMD.JumbledIncrementer";

    /**
     * Some for loops can be simplified to while loops, this makes them more concise. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         // No Init or Update part, may as well be: while (true)
     *         for (; true;) {
     *             // do stuff..
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String FOR_LOOP_SHOULD_BE_WHILE_LOOP                       = "PMD.ForLoopShouldBeWhileLoop";

    /**
     * Override both public boolean Object.equals(Object other), and public int Object.hashCode(), or override neither.
     * Even if you are inheriting a hashCode() from a parent class, consider implementing hashCode and explicitly
     * delegating to your superclass. <h2>Example</h2>
     * 
     * <pre>
     * public class Bar { // poor, missing a hashcode() method
     *     public boolean equals(Object o) {
     *         // do some comparison
     *     }
     * }
     * 
     * public class Baz { // poor, missing an equals() method
     *     public int hashCode() {
     *         // return some hash value
     *     }
     * }
     * 
     * public class Foo { // perfect, both methods provided
     *     public boolean equals(Object other) {
     *         // do some comparison
     *     }
     * 
     *     public int hashCode() {
     *         // return some hash value
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String OVERRIDE_BOTH_EQUALS_AND_HASHCODE                   = "PMD.OverrideBothEqualsAndHashcode";

    /**
     * Partially created objects can be returned by the Double Checked Locking pattern when used in Java. An optimizing
     * JRE may assign a reference to the baz variable before it creates the object the reference is intended to point
     * to. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     Object baz;
     * 
     *     Object bar() {
     *         if (baz == null) { // baz may be non-null yet not fully created
     *             synchronized (this) {
     *                 if (baz == null) {
     *                     baz = new Object();
     *                 }
     *             }
     *         }
     *         return baz;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a
     *      href="http://www.javaworld.com/javaworld/jw-02-2001/jw-0209-double.html">http://www.javaworld.com/javaworld/jw-02-2001/jw-0209-double.html</a>
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String DOUBLE_CHECKED_LOCKING                              = "PMD.DoubleCheckedLocking";

    /**
     * Avoid returning from a finally block, this can discard exceptions. <h2>Example</h2>
     * 
     * <pre>
     * public class Bar {
     *     public String foo() {
     *         try {
     *             throw new Exception(&quot;My Exception&quot;);
     *         } catch (Exception e) {
     *             throw e;
     *         } finally {
     *             return &quot;A. O. K.&quot;; // return not recommended here
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.05
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String RETURN_FROM_FINALLY_BLOCK                           = "PMD.ReturnFromFinallyBlock";

    /**
     * Do not use "if" statements whose conditionals are always true or always false. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void close() {
     *         if (true) { // fixed conditional, not recommended
     *             // ...
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String UNCONDITIONAL_IF_STATEMENT                          = "PMD.UnconditionalIfStatement";

    /**
     * Avoid instantiating Boolean objects; you can reference Boolean.TRUE, Boolean.FALSE, or call Boolean.valueOf()
     * instead. <h2>Example</h2> </br> <code>
     * Boolean buz = Boolean.valueOf(false); // ...., just reference Boolean.FALSE</br>
     * </br>
     * Boolean bar = new Boolean(&quot;true&quot;); // unnecessary creation, just reference Boolean.TRUE</br>
     * </code>
     * </br>
     * 
     * @since PMD 1.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String BOOLEAN_INSTANTIATION                               = "PMD.BooleanInstantiation";

    /**
     * Sometimes two consecutive 'if' statements can be consolidated by separating their conditions with a boolean
     * short-circuit operator. <h2>Example</h2>
     * 
     * <pre>
     * void bar() {
     *     if (x) { // original implementation
     *         if (y) {
     *             // do stuff
     *         }
     *     }
     * }
     * 
     * void bar() {
     *     if (x &amp;&amp; y) { // optimized implementation
     *         // do stuff
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String COLLAPSIBLE_IF_STATEMENTS                           = "PMD.CollapsibleIfStatements";

    /**
     * When deriving an array of a specific class from your Collection, one should provide an array of the same class as
     * the parameter of the toArray() method. Doing otherwise you will will result in a ClassCastException. <h2>Example</h2>
     * 
     * <pre>
     * Collection c = new ArrayList();
     * Integer obj = new Integer(1);
     * c.add(obj);
     * 
     * // this would trigger the rule (and throw a ClassCastException if executed)
     * Integer[] a = (Integer[]) c.toArray();
     * 
     * // this is fine and will not trigger the rule
     * Integer[] b = (Integer[]) c.toArray(new Integer[c.size()]);
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String CLASS_CAST_EXCEPTION_WITH_TO_ARRAY                  = "PMD.ClassCastExceptionWithToArray";

    /**
     * One might assume that the result of "new BigDecimal(0.1)" is exactly equal to 0.1, but it is actually equal to
     * .1000000000000000055511151231257827021181583404541015625. This is because 0.1 cannot be represented exactly as a
     * double (or as a binary fraction of any finite length). Thus, the long value that is being passed in to the
     * constructor is not exactly equal to 0.1, appearances notwithstanding. The (String) constructor, on the other
     * hand, is perfectly predictable: 'new BigDecimal("0.1")' is exactly equal to 0.1, as one would expect. Therefore,
     * it is generally recommended that the (String) constructor be used in preference to this one. <h2>Example</h2>
     * <code></br>
     * BigDecimal bd = new BigDecimal(1.123);  // loss of precision, this would trigger the rule
     * </br>
     * BigDecimal bd = new BigDecimal("1.123");// preferred approach
     * </br>
     * BigDecimal bd = new BigDecimal(12);     // preferred approach, ok for integer values</br>
     * </code></br>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_DECIMAL_LITERALS_IN_BIG_DECIMAL_CONSTRUCTOR   = "PMD.AvoidDecimalLiteralsInBigDecimalConstructor";

    /**
     * The null check here is misplaced. If the variable is null a {@link NullPointerException} will be thrown. Either
     * the check is useless (the variable will never be "null") or it is incorrect. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         if (a.equals(baz) &amp;&amp; a != null) {
     *         }
     *     }
     * }
     * 
     * public class Foo {
     *     void bar() {
     *         if (a.equals(baz) || a == null) {
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String MISPLACED_NULL_CHECK                                = "PMD.MisplacedNullCheck";

    /**
     * Avoid using java.lang.ThreadGroup; although it is intended to be used in a threaded environment it contains
     * methods that are not thread-safe. <h2>Example</h2>
     * 
     * <pre>
     * public class Bar {
     *     void buz() {
     *         ThreadGroup tg = new ThreadGroup(&quot;My threadgroup&quot;);
     *         tg = new ThreadGroup(tg, &quot;my thread group&quot;);
     *         tg = Thread.currentThread().getThreadGroup();
     *         tg = System.getSecurityManager().getThreadGroup();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_THREAD_GROUP                                  = "PMD.AvoidThreadGroup";

    /**
     * The null check is broken since it will throw a NullPointerException itself. It is likely that you used || instead
     * of && or vice versa. <h2>Example</h2>
     * 
     * <pre>
     * public String bar(String string) {
     *     // should be &amp;&amp;
     *     if (string != null || !string.equals(&quot;&quot;))
     *         return string;
     *     // should be ||
     *     if (string == null &amp;&amp; string.equals(&quot;&quot;))
     *         return string;
     * }
     * </pre>
     * 
     * @since PMD 3.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String BROKEN_NULL_CHECK                                   = "PMD.BrokenNullCheck";

    /**
     * Don't create instances of already existing BigInteger (BigInteger.ZERO, BigInteger.ONE) and for Java 1.5 onwards,
     * BigInteger.TEN and BigDecimal (BigDecimal.ZERO, BigDecimal.ONE, BigDecimal.TEN) <h2>Example</h2><code></br>
     * BigInteger bi = new BigInteger(1);       // reference BigInteger.ONE instead</br>
     * BigInteger bi2 = new BigInteger("0");   // reference BigInteger.ZERO instead</br>
     * BigInteger bi3 = new BigInteger(0.0);   // reference BigInteger.ZERO instead</br>
     * BigInteger bi4;</br>
     * bi4 = new BigInteger(0);                // reference BigInteger.ZERO instead</br>
     * </code></br>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String BIG_INTEGER_INSTANTIATION                           = "PMD.BigIntegerInstantiation";

    /**
     * Integer literals should not start with zero since this denotes that the rest of literal will be interpreted as an
     * octal value. <h2>Example</h2><code></br>
     * int i = 012; // set i with 10 not 12</br>
     * int j = 010;    // set j with 8 not 10</br>
     * k = i * j;      // set k with 80 not 120</br>
     * </code>
     * </br>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_USING_OCTAL_VALUES                            = "PMD.AvoidUsingOctalValues";

    /**
     * Application with hard-coded IP addresses can become impossible to deploy in some cases. Externalizing IP adresses
     * is preferable. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private String ip = &quot;127.0.0.1&quot;; // not recommended
     * }
     * </pre>
     * 
     * @since 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_USING_HARD_CODED_IP                           = "PMD.AvoidUsingHardCodedIP";

    /**
     * Always check the return values of navigation methods (next, previous, first, last) of a ResultSet. If the value
     * return is 'false', it should be handled properly. <h2>Example</h2><code></br>
     * Statement stat = conn.createStatement();</br>
     * ResultSet rst = stat.executeQuery("SELECT name FROM person");</br>
     * rst.next();     // what if it returns false? bad form</br>
     * String firstName = rst.getString(1);</br>
     * </br>
     * Statement stat = conn.createStatement();</br>
     * ResultSet rst = stat.executeQuery("SELECT name FROM person");</br>
     * if (rst.next()) {   // result is properly examined and used</br>
     *   String firstName = rst.getString(1);</br>
     * } else  {</br>
     *    // handle missing data</br>
     * }</br>
     * </code></br>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String CHECK_RESULT_SET                                    = "PMD.CheckResultSet";

    /**
     * The use of multiple unary operators may be problematic, and/or confusing. Ensure that the intended usage is not a
     * bug, or consider simplifying the expression. <h2>Example</h2> <code></br>
     * // These are typo bugs, or at best needlessly complex and confusing:</br>
     * int i = - -1;</br>
     * int j = + - +1;</br>
     * int z = ~~2;</br>
     * boolean b = !!true;</br>
     * boolean c = !!!true;</br>
     * </br>
     * // These are better:</br>
     * int i = 1;</br>
     * int j = -1;</br>
     * int z = 2;</br>
     * boolean b = true;</br>
     * boolean c = false;</br>
     * </br>
     * // And these just make your brain hurt:</br>
     * int i = ~-2;</br>
     * int j = -~7;</br>
     * </code></br>
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_MULTIPLE_UNARY_OPERATORS                      = "PMD.AvoidMultipleUnaryOperators";

    /**
     * No need to explicitly extend Object. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Object { // not required
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String EXTENDS_OBJECT                                      = "PMD.ExtendsObject";

    /**
     * The skip() method may skip a smaller number of bytes than requested. Check the returned value to find out if it
     * was the case or not. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * 
     *    private FileInputStream _s = new FileInputStream("file");
     * 
     *    public void skip(int n) throws IOException {
     *       _s.skip(n); // You are not sure that exactly n bytes are skipped
     *    }
     * 
     *    public void skipExactly(int n) throws IOException {
     *       while (n != 0) {
     *          long skipped = _s.skip(n);
     *          if (skipped == 0)
     *             throw new EOFException();
     *          n -= skipped;
     *       }
     *    }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String CHECK_SKIP_RESULT                                   = "PMD.CheckSkipResult";

    /**
     * Using a branching statement as the last part of a loop may be a bug, and/or is confusing. Ensure that the usage
     * is not a bug, or consider using another approach. <h2>Example</h2>
     * 
     * <pre>
     * // unusual use of branching statement in a loop
     * for (int i = 0; i &lt; 10; i++) {
     *     if (i * i &lt;= 25) {
     *         continue;
     *     }
     *     break;
     * }
     * 
     * // this makes more sense...
     * for (int i = 0; i &lt; 10; i++) {
     *     if (i * i &gt; 25) {
     *         break;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String AVOID_BRANCHING_STATEMENT_AS_LAST_IN_LOOP           = "PMD.AvoidBranchingStatementAsLastInLoop";

    /**
     * Explicitly calling Thread.run() method will execute in the caller's thread of control. Instead, call
     * Thread.start() for the intended behavior. <h2>Example</h2><code></br>
     * Thread t = new Thread();</br>
     * t.run();            // use t.start() instead</br>
     * new Thread().run(); // same violation</br>
     * </code>
     * </br>
     * 
     * @since PMD 4.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String DONT_CALL_THREAD_RUN                                = "PMD.DontCallThreadRun";

    /**
     * Don't use floating point for loop indices. If you must use floating point, use double unless you're certain that
     * float provides enough precision and you have a compelling performance need (space or time). <h2>Example</h2>
     * 
     * <pre>
     * public class Count {
     *     public static void main(String[] args) {
     *         final int START = 2000000000;
     *         int count = 0;
     *         for (float f = START; f &lt; START + 50; f++)
     *             count++;
     *         // Prints 0 because (float) START == (float) (START + 50).
     *         System.out.println(count);
     *         // The termination test misbehaves due to floating point granularity.
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/basic.html">PMD Basic Rule Set Documentation</a>
     */
    public static final String DONT_USE_FLOAT_TYPE_FOR_LOOP_INDICES                = "PMD.DontUseFloatTypeForLoopIndices";

    /**
     * Avoid using if statements without using braces to surround the code block. If the code formatting or indentation
     * is lost then it becomes difficult to separate the code being controlled from the rest. <h2>Example</h2>
     * 
     * <pre>
     * if (foo) // not recommended
     *     x++;
     * 
     * if (foo) { // preferred approach
     *     x++;
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String IF_STMTS_MUST_USE_BRACES                            = "PMD.IfSTmtsMustUseBraces";

    /**
     * Avoid using 'while' statements without using braces to surround the code block. If the code formatting or
     * indentation is lost then it becomes difficult to separate the code being controlled from the rest. <h2>Example</h2>
     * 
     * <pre>
     * while (true)
     *     // not recommended
     *     x++;
     * 
     * while (true) { // preferred approach
     *     x++;
     * }
     * </pre>
     * 
     * @since PMD 0.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String WHILE_LOOPS_MUST_USE_BRACES                         = "PMD.WhileLoopsMustUseBraces";

    /**
     * Avoid using if..else statements without using surrounding braces. If the code formatting or indentation is lost
     * then it becomes difficult to separate the code being controlled from the rest. <h2>Example</h2>
     * 
     * <pre>
     * // this is OK
     * if (foo)
     *     x++;
     * 
     * // but this is not
     * if (foo)
     *     x = x + 1;
     * else
     *     x = x - 1;
     * </pre>
     * 
     * @since PMD 0.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String IF_ELSE_STATEMENTS_MUST_USE_BRACES                  = "PMD.IfElseStmtsMustUseBraces";

    /**
     * Avoid using 'for' statements without using curly braces. If the code formatting or indentation is lost then it
     * becomes difficult to separate the code being controlled from the rest. <h2>Example</h2>
     * 
     * <pre>
     * for (int i = 0; i &lt; 42; i++)
     *     foo();
     * </pre>
     * 
     * @since PMD 0.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/braces.html">PMD Braces Rule Set Documentation</a>
     */
    public static final String FOR_LOOPS_MUST_USE_BRACES                           = "PMD.ForLoopsMustUseBraces";

    /**
     * Object clone() should be implemented with super.clone(). <h2>Example</h2>
     * 
     * <pre>
     * class Foo {
     *     public Object clone() {
     *         return new Foo(); // This is bad
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/clone.html">PMD Clone Implementation Rule Set
     *      Documentation</a>
     */
    public static final String PROPER_CLONE_IMPLEMENTATION                         = "PMD.ProperCloneImplementation";

    /**
     * The method clone() should throw a CloneNotSupportedException. <h2>Example</h2>
     * 
     * <pre>
     * public class MyClass implements Cloneable {
     *     public Object clone() { // will cause an error
     *         MyClass clone = (MyClass) super.clone();
     *         return clone;
     *     }
     * }
     * 
     * </pre>
     * 
     * @since PMD 1.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/clone.html">PMD Clone Implementation Rule Set
     *      Documentation</a>
     */
    public static final String CLONE_THROWS_CLONE_NOT_SUPPORTED_EXCEPTION          = "PMD.CloneThrowsCloneNotSupportedException";

    /**
     * The method clone() should only be implemented if the class implements the Cloneable interface with the exception
     * of a final method that only throws CloneNotSupportedException. <h2>Example</h2>
     * 
     * <pre>
     * public class MyClass {
     *     public Object clone() throws CloneNotSupportedException {
     *         return foo;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/clone.html">PMD Clone Implementation Rule Set
     *      Documentation</a>
     */
    public static final String CLONE_METHOD_MUST_IMPLEMENT_CLONEABLE               = "PMD.CloneMethodMustImplementCloneable";

    /**
     * The NPath complexity of a method is the number of acyclic execution paths through that method. A threshold of 200
     * is generally considered the point where measures should be taken to reduce complexity and increase readability.
     * <h2>Example</h2>
     * 
     * <pre>
     * void bar() { // this is something more complex than it needs to be,
     *     if (y) {    // it should be broken down into smaller methods or functions
     *         for (j = 0; j < m; j++) {
     *             if (j > r) {
     *                 doSomething();
     *                 while (f < 5 ) {
     *                     anotherThing();
     *                     f -= 27;
     *                     }
     *                 } else {
     *                     tryThis();
     *                 }
     *             }
     *         }
     *         if ( r - n > 45) {
     *            while (doMagic()) {
     *               findRabbits();
     *            }
     *         }
     *         try {
     *             doSomethingDangerous();
     *         } catch (Exception ex) {
     *             makeAmends();
     *             } finally {
     *                 dontDoItAgain();
     *                 }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NPATH_COMPLEXITY                                    = "PMD.NPathComplexity";

    /**
     * When methods are excessively long this usually indicates that the method is doing more than its name/signature
     * might suggest. They also become challenging for others to digest since excessive scrolling causes readers to lose
     * focus. Try to reduce the method length by creating helper methods and removing any copy/pasted code. <h2>Example</h2>
     * 
     * <pre>
     * public void doSomething() {
     *     System.out.println(&quot;Hello world!&quot;);
     *     System.out.println(&quot;Hello world!&quot;);
     *     // 98 copies omitted for brevity.
     * }
     * </pre>
     * 
     * @since PMD 0.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_METHOD_LENGTH                             = "PMD.ExcessiveMethodLength";

    /**
     * Methods with numerous parameters are a challenge to maintain, especially if most of them share the same datatype.
     * These situations usually denote the need for new objects to wrap the numerous parameters. <h2>Example</h2>
     * 
     * <pre>
     * public void addPerson(       // too many arguments liable to be mixed up
     *     int birthYear, int birthMonth, int birthDate, int height, int weight, int ssn) {
     * 
     *     . . . .
     * }
     *  
     * public void addPerson(      // preferred approach
     *     Date birthdate, BodyMeasurements measurements, int ssn) {
     * 
     *     . . . .
     * }
     * </pre>
     * 
     * @since PMD 0.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_PARAMETER_LIST                            = "PMD.ExcessiveParameterList";

    /**
     * Excessive class file lengths are usually indications that the class may be burdened with excessive
     * responsibilities that could be provided by external classes or functions. In breaking these methods apart the
     * code becomes more managable and ripe for reuse. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar1() {
     *         // 1000 lines of code
     *     }
     * 
     *     public void bar2() {
     *         // 1000 lines of code
     *     }
     * 
     *     public void bar3() {
     *         // 1000 lines of code
     *     }
     * 
     *     public void barN() {
     *         // 1000 lines of code
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_CLASS_LENGTH                              = "PMD.ExcessiveClassLength";

    /**
     * Complexity directly affects maintenance costs is determined by the number of decision points in a method plus one
     * for the method entry. The decision points include 'if', 'while', 'for', and 'case labels' calls. Generally,
     * numbers ranging from 1-4 denote low complexity, 5-7 denote moderate complexity, 8-10 denote high complexity, and
     * 11+ is very high complexity. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {       // This has a Cyclomatic Complexity = 12
     * 1   public void example()  {
     * 2       if (a == b)  {
     * 3           if (a1 == b1) {
     *                 fiddle();
     * 4           } else if a2 == b2) {
     *                 fiddle();
     *             }  else {
     *                 fiddle();
     *             }
     * 5       } else if (c == d) {
     * 6           while (c == d) {
     *                 fiddle();
     *             }
     * 7        } else if (e == f) {
     * 8           for (int n = 0; n < h; n++) {
     *                 fiddle();
     *             }
     *         } else{
     *             switch (z) {
     * 9               case 1:
     *                     fiddle();
     *                     break;
     * 10              case 2:
     *                     fiddle();
     *                     break;
     * 11              case 3:
     *                     fiddle();
     *                     break;
     * 12              default:
     *                     fiddle();
     *                     break;
     *             }
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.03
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String CYCLOMATIC_COMPLEXITY                               = "PMD.CyclomaticComplexity";

    /**
     * Classes with large numbers of public methods and attributes require disproportionate testing efforts since
     * combinational side effects grow rapidly and increase risk. Refactoring these classes into smaller ones not only
     * increases testability and reliability but also allows new variations to be developed easily. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public String   value;
     *     public Bar      something;
     *     public Variable var;
     * 
     *     // [... more more public attributes ...]
     * 
     *     public void doWork() {
     *     }
     * 
     *     public void doMoreWork() {
     *     }
     * 
     *     public void doWorkAgain() {
     *     }
     *     // [... more more public methods ...]
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_PUBLIC_COUNT                              = "PMD.ExcessivePublicCount";

    /**
     * Classes that have too many fields can become unwieldy and could be redesigned to have fewer fields, possibly
     * through grouping related fields in new objects. For example, a class with individual city/state/zip fields could
     * park them within a single Address field. <h2>Example</h2>
     * 
     * <pre>
     * public class Person { // too many separate fields
     *     int   birthYear;
     *     int   birthMonth;
     *     int   birthDate;
     *     float height;
     *     float weight;
     * }
     * 
     * public class Person { // this is more manageable
     *     Date             birthDate;
     *     BodyMeasurements measurements;
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String TOO_MANY_FIELDS                                     = "PMD.TooManyFields";

    /**
     * This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines of code for
     * a given method. NCSS ignores comments, and counts actual statements. Using this algorithm, lines of code that are
     * split are counted as one. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Bar {
     *     public int methd() {
     *         super.methd();
     * 
     *         // this method only has 1 NCSS lines
     *         return 1;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NCSS_METHOD_COUNT                                   = "PMD.NcssMethodCount";

    /**
     * This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines of code for
     * a given type. NCSS ignores comments, and counts actual statements. Using this algorithm, lines of code that are
     * split are counted as one. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Bar {
     *     public Foo() {
     *         // this class only has 6 NCSS lines
     *         super();
     * 
     *         super.foo();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NCSS_TYPE_COUNT                                     = "PMD.NcssTypeCount";

    /**
     * This rule uses the NCSS (Non-Commenting Source Statements) algorithm to determine the number of lines of code for
     * a given constructor. NCSS ignores comments, and counts actual statements. Using this algorithm, lines of code
     * that are split are counted as one. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Bar {
     *     public Foo() {
     *         super();
     * 
     *         // this constructor only has 1 NCSS lines
     *         super.foo();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String NCSS_CONSTRUCTOR_COUNT                              = "PMD.NcssConstructorCount";

    /**
     * A class with too many methods is probably a good suspect for refactoring, in order to reduce its complexity and
     * find a way to have more fine grained objects.
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/codesize.html">PMD Code Size Rule Set
     *      Documentation</a>
     */
    public static final String TOO_MANY_METHODS                                    = "PMD.TooManyMethods";

    /**
     * Denotes whether comments are required (or unwanted) for specific language elements.
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/comments.html">PMD Comments Rule Set
     *      Documentation</a>
     */
    public static final String COMMENT_REQUIRED                                    = "PMD.CommentRequired";

    /**
     * Determines whether the dimensions of non-header comments found are within the specified limits.
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/comments.html">PMD Comments Rule Set
     *      Documentation</a>
     */
    public static final String COMMENT_SIZE                                        = "PMD.CommentSize";

    /**
     * A rule for the politically correct... we don't want to offend anyone.
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/comments.html">PMD Comments Rule Set
     *      Documentation</a>
     */
    public static final String COMMENT_CONTENT                                     = "PMD.CommentContent";

    /**
     * This rule detects when a constructor is not necessary; i.e., when there is only one constructor, its public, has
     * an empty body, and takes no arguments. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public Foo() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_CONSTRUCTOR                             = "PMD.UnnecessaryConstructor";

    /**
     * Assigning a "null" to a variable (outside of its declaration) is usually bad form. Sometimes, this type of
     * assignment is an indication that the programmer doesn't completely understand what is going on in the code. NOTE:
     * This sort of assignment may used in some cases to dereference objects and encourage garbage collection. <h2>
     * Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     Object x = null; // this is OK
     *     x = new Object();
     *     // big, complex piece of code here
     *     x = null; // this is not required
     *     // big, complex piece of code here
     * }
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String NULL_ASSIGNMENT                                     = "PMD.NullAssignment";

    /**
     * A method should have only one exit point, and that should be the last statement in the method. <h2>Example</h2>
     * 
     * <pre>
     * public class OneReturnOnly1 {
     *     public void foo(int x) {
     *         if (x &gt; 0) {
     *             return &quot;hey&quot;; // first exit
     *         }
     *         return &quot;hi&quot;; // second exit
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String ONLY_ONE_RETURN                                     = "PMD.OnlyOneReturn";

    /**
     * Avoid assignments in operands; this can make code more complicated and harder to read. <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     int x = 2;
     *     if ((x = getX()) == 3) {
     *         System.out.println(&quot;3!&quot;);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.03
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String ASSIGNMENT_IN_OPERAND                               = "PMD.AssignmentInOperand";

    /**
     * Each class should declare at least one constructor. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *    // missing constructor
     *   public void doSomething() { ... }
     *   public void doOtherThing { ... }
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AT_LEAST_ONE_CONSTRUCTOR                            = "PMD.AtLeastOneConstructor";

    /**
     * Avoid importing anything from the 'sun.*' packages. These packages are not portable and are likely to change. <h2>
     * Example</h2>
     * 
     * <pre>
     * import sun.misc.foo;
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String DONT_IMPORT_SUN                                     = "PMD.DontImportSun";

    /**
     * A suspicious octal escape sequence was found inside a String literal. The Java language specification (section
     * 3.10.6) says an octal escape sequence inside a literal String shall consist of a backslash followed by:
     * OctalDigit | OctalDigit OctalDigit | ZeroToThree OctalDigit OctalDigit Any octal escape sequence followed by
     * non-octal digits can be confusing, e.g. "\038" is interpreted as the octal escape sequence "\03" followed by the
     * literal character "8". <h2>Example</h2>
     * 
     * <pre>
     * public void foo() {
     *     // interpreted as octal 12, followed by character '8'
     *     System.out.println(&quot;suspicious: \128&quot;);
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String SUSPICIOUS_OCTAL_ESCAPE                             = "PMD.SuspiciousOctalEscape";

    /**
     * It is a good practice to call super() in a constructor. If super() is not called but another constructor (such as
     * an overloaded constructor) is called, this rule will not report it. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Bar {
     *     public Foo() {
     *         // call the constructor of Bar
     *         super();
     *     }
     * 
     *     public Foo(int code) {
     *         // do something with code
     *         this();
     *         // no problem with this
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String CALL_SUPER_IN_CONSTRUCTOR                           = "PMD.CallSuperInConstructor";

    /**
     * Sometimes expressions are wrapped in unnecessary parentheses, making them look like function calls. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     boolean bar() {
     *         return (true);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_PARENTHESES                             = "PMD.UnnecessaryParentheses";

    /**
     * Use explicit scoping instead of the default package private level.
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String DEFAULT_PACKAGE                                     = "PMD.DefaultPackage";

    /**
     * Use bitwise inversion to invert boolean values - it's the fastest way to do this. See
     * http://www.javaspecialists.co.za/archive/newsletter.do?issue=042&locale=en_US for specific details <h2>Example</h2>
     * 
     * <pre>
     * boolean b = true;
     * b = !b; // slow
     * b &circ;= true; // fast
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String BOOLEAN_INVERSION                                   = "PMD.BooleanInversion";

    /**
     * The dataflow analysis tracks local definitions, undefinitions and references to variables on different paths on
     * the data flow. From those informations there can be found various problems. 1. UR - Anomaly: There is a reference
     * to a variable that was not defined before. This is a bug and leads to an error. 2. DU - Anomaly: A recently
     * defined variable is undefined. These anomalies may appear in normal source text. 3. DD - Anomaly: A recently
     * defined variable is redefined. This is ominous but don't have to be a bug. <h2>Example</h2>
     * 
     * <pre>
     * public void foo() {
     *     int buz = 5;
     *     buz = 6; // redefinition of buz -&gt; dd-anomaly
     *     foo(buz);
     *     buz = 2;
     * } // buz is undefined when leaving scope -&gt; du-anomaly
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String DATAFLOW_ANOMALY_ANALYSIS                           = "PMD.DataflowAnomalyAnalysis";

    /**
     * Avoid using final local variables, turn them into fields. <h2>Example</h2>
     * 
     * <pre>
     * public class MyClass {
     *     public void foo() {
     *         final String finalLocalVariable;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_FINAL_LOCAL_VARIABLE                          = "PMD.AvoidFinalLocalVariable";

    /**
     * Java uses the 'short' type to reduce memory usage, not to optimize calculation. In fact, the JVM does not have
     * any arithmetic capabilities for the short type: the JVM must convert the short into an int, do the proper
     * calculation and convert the int back to a short. Thus any storage gains found through use of the 'short' type may
     * be offset by adverse impacts on performance. <h2>Example</h2>
     * 
     * <pre>
     * public class UsingShort {
     *     private short doNotUseShort = 0;
     * 
     *     public UsingShort() {
     *         short shouldNotBeUsed = 1;
     *         doNotUseShort += shouldNotBeUsed;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_USING_SHORT_TYPE                              = "PMD.AvoidUsingShortType";

    /**
     * Use of the keyword 'volatile' is generally used to fine tune a Java application, and therefore, requires a good
     * expertise of the Java Memory Model. Moreover, its range of action is somewhat misknown. Therefore, the volatile
     * keyword should not be used for maintenance purpose and portability. <h2>Example</h2>
     * 
     * <pre>
     * public class ThrDeux {
     *     private volatile String var1; // not suggested
     *     private String          var2; // preferred
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_USING_VOLATILE                                = "PMD.AvoidUsingVolatile";

    /**
     * Unnecessary reliance on Java Native Interface (JNI) calls directly reduces application portability and increases
     * the maintenance burden. <h2>Example</h2>
     * 
     * <pre>
     * public class SomeJNIClass {
     * 
     *     public SomeJNIClass() {
     *         System.loadLibrary(&quot;nativelib&quot;);
     *     }
     * 
     *     static {
     *         System.loadLibrary(&quot;nativelib&quot;);
     *     }
     * 
     *     public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
     *         System.loadLibrary(&quot;nativelib&quot;);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_USING_NATIVE_CODE                             = "PMD.AvoidUsingNativeCode";

    /**
     * Methods such as getDeclaredConstructors(), getDeclaredConstructor(Class[]) and setAccessible(), as the interface
     * PrivilegedAction, allows for the runtime alteration of variable, class, or method visibility, even if they are
     * private. This violates the principle of encapsulation. <h2>Example</h2>
     * 
     * <pre>
     * public class Violation {
     *     public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
     *         // Possible call to forbidden getDeclaredConstructors
     *         Class[] arrayOfClass = new Class[1];
     *         this.getClass().getDeclaredConstructors();
     *         this.getClass().getDeclaredConstructor(arrayOfClass);
     *         Class clazz = this.getClass();
     *         clazz.getDeclaredConstructor(arrayOfClass);
     *         clazz.getDeclaredConstructors();
     *         // Possible call to forbidden setAccessible
     *         clazz.getMethod(&quot;&quot;, arrayOfClass).setAccessible(false);
     *         AccessibleObject.setAccessible(null, false);
     *         Method.setAccessible(null, false);
     *         Method[] methodsArray = clazz.getMethods();
     *         int nbMethod;
     *         for (nbMethod = 0; nbMethod &lt; methodsArray.length; nbMethod++) {
     *             methodsArray[nbMethod].setAccessible(false);
     *         }
     * 
     *         // Possible call to forbidden PrivilegedAction
     *         PrivilegedAction priv = (PrivilegedAction) new Object();
     *         priv.run();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_ACCESSIBILITY_ALTERATION                      = "PMD.AvoidAccessibilityAlteration";

    /**
     * Calls to System.gc(), Runtime.getRuntime().gc(), and System.runFinalization() are not advised. Code should have
     * the same behavior whether the garbage collection is disabled using the option -Xdisableexplicitgc or not.
     * Moreover, "modern" jvms do a very good job handling garbage collections. If memory usage issues unrelated to
     * memory leaks develop within an application, it should be dealt with JVM options rather than within the code
     * itself. <h2>Example</h2>
     * 
     * <pre>
     * public class GCCall {
     *     public GCCall() {
     *         // Explicit gc call !
     *         System.gc();
     *     }
     * 
     *     public void doSomething() {
     *     // Explicit gc call !
     *        Runtime.getRuntime().gc();
     *     }
     * 
     *     public explicitGCcall() { // Explicit gc call ! System.gc(); }
     * 
     *     public void doSomething() { // Explicit gc call ! Runtime.getRuntime().gc(); }
     * }
     * </pre>
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String DO_NOT_CALL_GARBAGE_COLLECTION_EXPLICITLY           = "PMD.DoNotCallGarbageCollectionExplicitly";

    /**
     * Java allows the use of several variables declaration of the same type on one line. However, it can lead to quite
     * messy code. This rule looks for several declarations on the same line. <h2>Example</h2>
     * 
     * <pre>
     * public class OneDeclaration {
     *     String name, lastname; // combined declaration, a violation
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String ONE_DECLARATION_PER_LINE                            = "PMD.OneDeclarationPerLine";

    /**
     * Prefixing parameters by 'in' or 'out' pollutes the name of the parameters and reduces code readability. To
     * indicate whether or not a parameter will be modify in a method, its better to document method behavior with
     * Javadoc. <h2>Example</h2>
     * 
     * <pre>
     * // Not really clear
     * public class Foo {
     *     public void bar(int inLeftOperand, Result outRightOperand) {
     *         outRightOperand.setValue(inLeftOperand * outRightOperand.getValue());
     *     }
     * }
     * 
     * // Far more useful
     * public class Foo {
     *     public void bar(final int leftOperand, final Result rightOperand) {
     *         rightOperand.setValue(leftOperand * rightOperand.getValue());
     *     }
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_PREFIXING_METHOD_PARAMETERS                   = "PMD.AvoidPrefixingMethodParameters";

    /**
     * Avoid using hard-coded literals in conditional statements. By declaring them as static variables or private
     * members with descriptive names maintainability is enhanced. <h2>Example</h2>
     * 
     * <pre>
     * public class Literals {
     *     private static final int TEN = 10;
     * 
     *     public void downCastPrimitiveType() {
     * 
     *         if (i == 10) { // magic number, buried in a method
     *             doSomething();
     *         }
     * 
     *         if (i == TEN) { // preferred approach
     *             doSomething();
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_LITERALS_IN_IF_CONDITION                      = "PMD.AvoidLiteralsInIfCondition";

    /**
     * When you write a public method, you should be thinking in terms of an API. If your method is public, it means
     * other class will use it, therefore, you want (or need) to offer a comprehensive and evolutive API. If you pass a
     * lot of information as a simple series of Strings, you may think of using an Object to represent all those
     * information. You'll get a simplier API (such as doWork(Workload workload), rather than a tedious series of
     * Strings) and more importantly, if you need at some point to pass extra data, you'll be able to do so by simply
     * modifying or extending Workload without any modification to your API. <h2>Example</h2>
     * 
     * <pre>
     * public class MyClass {
     *     public void connect(String username, String pssd, String databaseName, String databaseAdress)
     *     // Instead of those parameters object
     *     // would ensure a cleaner API and permit
     *     // to add extra data transparently (no code change):
     *     // void connect(UserData data);
     *     {
     * 
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String USE_OBJECT_FOR_CLEARER_API                          = "PMD.UseObjectForClearerAPI";

    /**
     * Since Java5 brought a new implementation of the Map designed for multi-threaded access, you can perform efficient
     * map reads without blocking other threads. <h2>Example</h2>
     * 
     * <pre>
     * public class ConcurrentApp {
     *     public void getMyInstance() {
     *         Map map1 = new HashMap(); // fine for single-threaded access
     *         Map map2 = new ConcurrentHashMap(); // preferred for use with multiple threads
     * 
     *         // the following case will be ignored by this rule
     *         Map map3 = someModule.methodThatReturnMap(); // might be OK, if the returned map is already thread-safe
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/controversial.html">PMD Controversial Rule Set
     *      Documentation</a>
     */
    public static final String USE_CONCURRENT_HASH_MAP                             = "PMD.UseConcurrentHashMap";

    /**
     * This rule counts the number of unique attributes, local variables, and return types within an object. A number
     * higher than the specified threshold can indicate a high degree of coupling. <h2>Example</h2>
     * 
     * <pre>
     * import com.Blah;
     * import org.Bar;
     * import org.Bardo;
     * 
     * public class Foo {
     *    private Blah var1;
     *    private Bar var2;
     *  
     *     //followed by many imports of unique objects
     *    void ObjectC doWork() {
     *      Bardo var55;
     *      ObjectA var44;
     *      ObjectZ var93;
     *      return something;
     *    }
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String COUPLING_BETWEEN_OBJECTS                            = "PMD.CouplingBetweenObjects";

    /**
     * A high number of imports can indicate a high degree of coupling within an object. This rule counts the number of
     * unique imports and reports a violation if the count is above the user-specified threshold. <h2>Example</h2>
     * 
     * <pre>
     * import blah.blah.Baz;
     * // 18 others from the same package elided
     * import blah.blah.Bif;
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String EXCESSIVE_IMPORTS                                   = "PMD.ExcessiveImports";

    /**
     * The use of implementation types as object references limits your ability to use alternate implementations in the
     * future as requirements change. Whenever available, referencing objects by their interface types provides much
     * more flexibility. <h2>Example</h2>
     * 
     * <pre>
     * // sub-optimal approach
     * public HashSet getFoo() {
     *     return new HashSet();
     * }
     * 
     * // preferred approach
     * public Set getFoo() {
     *     return new HashSet();
     * }
     * </pre>
     * 
     * @since PMD 0.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String LOOSE_COUPLING                                      = "PMD.LooseCoupling";

    /**
     * Avoid using classes from the configured package hierarchy outside of the package hierarchy, except when using one
     * of the configured allowed classes. <h2>Example</h2>
     * 
     * <pre>
     * package some.package;
     * 
     * import some.other.package.subpackage.subsubpackage.DontUseThisClass;
     * 
     * public class Bar {
     *    DontUseThisClass boo = new DontUseThisClass();
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String LOOSE_PACKAGE_COUPLING                              = "PMD.LoosePackageCoupling";

    /**
     * The Law of Demeter is a simple rule, that says "only talk to friends". It helps to reduce coupling between
     * classes or objects. See also the references: Andrew Hunt, David Thomas, and Ward Cunningham. The Pragmatic
     * Programmer. From Journeyman to Master. Addison-Wesley Longman, Amsterdam, October 1999.; K.J. Lieberherr and I.M.
     * Holland. Assuring good style for object-oriented programs. Software, IEEE, 6(5):38–48, 1989.;
     * http://www.ccs.neu.edu/home/lieber/LoD.html; http://en.wikipedia.org/wiki/Law_of_Demeter <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void example(final Bar b) {
     *         // this method call is ok, as b is a parameter of &quot;example&quot;
     *         final C c = b.getC();
     * 
     *         // this method call is a violation, as we are using c, which we got from B.
     *         // We should ask b directly instead, e.g. &quot;b.doItOnC();&quot;
     *         c.doIt();
     * 
     *         // this is also a violation, just expressed differently as a method chain without temporary variables.
     *         b.getC().doIt();
     * 
     *         // a constructor call, not a method call.
     *         final D d = new D();
     *         // this method call is ok, because we have create the new instance of D locally.
     *         d.doSomethingElse();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/coupling.html">PMD Coupling Rule Set
     *      Documentation</a>
     */
    public static final String LAW_OF_DEMETER                                      = "PMD.LawOfDemeter";

    /**
     * For classes that only have static methods, consider making them Singletons. Note that this doesn't apply to
     * abstract classes, since their subclasses may well include non-static methods. Also, if you want this class to be
     * a Singleton, remember to add a private constructor to prevent instantiation. <h2>Example</h2>
     * 
     * <pre>
     * public class MaybeASingleton {
     *     public static void foo() {
     *     }
     * 
     *     public static void bar() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String USE_SINGLETON                                       = "PMD.UseSingleton";

    /**
     * Avoid unnecessary if-then-else statements when returning a boolean. The result of the conditional test can be
     * returned instead. <h2>Example</h2>
     * 
     * <pre>
     * public boolean isBarEqualTo(int x) {
     * 
     *     if (bar == x) { // this bit of code...
     *         return true;
     *     } else {
     *         return false;
     *     }
     * }
     * 
     * public boolean isBarEqualTo(int x) {
     * 
     *     return bar == x; // can be replaced with this
     * }
     * </pre>
     * 
     * @since PMD 0.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String SIMPLIFY_BOOLEAN_RETURNS                            = "PMD.SimplifyBooleanReturns";

    /**
     * Avoid unnecessary comparisons in boolean expressions, they serve no purpose and impacts readability. <h2>Example</h2>
     * 
     * <pre>
     * public class Bar {
     *     // can be simplified to
     *     // bar = isFoo();
     *     private boolean bar = (isFoo() == true);
     * 
     *     public isFoo() {
     *         return false;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.05
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String SIMPLIFY_BOOLEAN_EXPRESSIONS                        = "PMD.SimplifyBooleanExpressions";

    /**
     * All switch statements should include a default option to catch any unspecified values. <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     int x = 2;
     *     switch (x) {
     *         case 1:
     *             int j = 6;
     *         case 2:
     *             int j = 8;
     *             // missing default: here
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String SWITCH_STATEMENTS_SHOULD_HAVE_DEFAULT               = "PMD.SwitchStmtsShouldHaveDefault";

    /**
     * Avoid creating deeply nested if-then statements since they are harder to read and error-prone to maintain. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar(int x, int y, int z) {
     *         if (x &gt; y) {
     *             if (y &gt; z) {
     *                 if (z == x) {
     *                     // !! too deep
     *                 }
     *             }
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String AVOID_DEEPLY_NESTED_IF_STATEMENTS                   = "PMD.AvoidDeeplyNestedIfStmts";

    /**
     * Reassigning values to incoming parameters is not recommended. Use temporary local variables instead. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private void foo(String bar) {
     *         bar = &quot;something else&quot;;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String AVOID_REASSIGNING_PARAMETERS                        = "PMD.AvoidReassigningParameters";

    /**
     * A high ratio of statements to labels in a switch statement implies that the switch statement is overloaded.
     * Consider moving the statements into new methods or creating subclasses based on the switch variable. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar(int x) {
     *         switch (x) {
     *             case 1: {
     *                 // lots of statements
     *                 break;
     *             }
     *             case 2: {
     *                 // lots of statements
     *                 break;
     *             }
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String SWITCH_DENSITY                                      = "PMD.SwitchDensity";

    /**
     * Calling overridable methods during construction poses a risk of invoking methods on an incompletely constructed
     * object and can be difficult to debug. It may leave the sub-class unable to construct its superclass or forced to
     * replicate the construction process completely within itself, losing the ability to call super(). If the default
     * constructor contains a call to an overridable method, the subclass may be completely uninstantiable. Note that
     * this includes method calls throughout the control flow graph - i.e., if a constructor Foo() calls a private
     * method bar() that calls a public method buz(), this denotes a problem. <h2>Example</h2>
     * 
     * <pre>
     * public class SeniorClass {
     *     public SeniorClass() {
     *         toString(); // may throw NullPointerException if overridden
     *     }
     * 
     *     public String toString() {
     *         return &quot;IAmSeniorClass&quot;;
     *     }
     * }
     * 
     * public class JuniorClass extends SeniorClass {
     *     private String name;
     * 
     *     public JuniorClass() {
     *         super(); // Automatic call leads to NullPointerException
     *         name = &quot;JuniorClass&quot;;
     *     }
     * 
     *     public String toString() {
     *         return name.toUpperCase();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String CONSTRUCTOR_CALLS_OVERRIDABLE_METHOD                = "PMD.ConstructorCallsOverridableMethod";

    /**
     * Instantiation by way of private constructors from outside of the constructor's class often causes the generation
     * of an accessor. A factory method, or non-privatization of the constructor can eliminate this situation. The
     * generated class file is actually an interface. It gives the accessing class the ability to invoke a new hidden
     * package scope constructor that takes the interface as a supplementary parameter. This turns a private constructor
     * effectively into one with package scope, and is challenging to discern. <h2>Example</h2>
     * 
     * <pre>
     * public class Outer {
     *     void method() {
     *         Inner ic = new Inner();// Causes generation of accessor class
     *     }
     * 
     *     public class Inner {
     *         private Inner() {
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String ACCESSOR_CLASS_GENERATION                           = "PMD.AccessorClassGeneration";

    /**
     * If a final field is assigned to a compile-time constant, it could be made static, thus saving overhead in each
     * object at runtime. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public final int BAR = 42; // this could be static and save some space
     * }
     * </pre>
     * 
     * @since PMD 1.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String FINAL_FIELD_COULD_BE_STATIC                         = "PMD.FinalFieldCouldBeStatic";

    /**
     * Ensure that resources (like Connection, Statement, and ResultSet objects) are always closed after use. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class Bar {
     *     public void foo() {
     *         Connection c = pool.getConnection();
     *         try {
     *             // do stuff
     *         } catch (SQLException ex) {
     *             // handle exception
     *         } finally {
     *             // oops, should close the connection using 'close'!
     *             // c.close();
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.2.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String CLOSE_RESOURCE                                      = "PMD.CloseResource";

    /**
     * A non-static initializer block will be called any time a constructor is invoked (just prior to invoking the
     * constructor). While this is a valid language construct, it is rarely used and is confusing. <h2>Example</h2>
     * 
     * <pre>
     * public class MyClass {
     *     // this block gets run before any call to a constructor
     *     {
     *         System.out.println(&quot;I am about to construct myself&quot;);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String NON_STATIC_INITIALIZER                              = "PMD.NonStaticInitializer";

    /**
     * By convention, the default label should be the last label in a switch statement. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar(int a) {
     *         switch (a) {
     *             case 1: // do something
     *                 break;
     *             default: // the default case should be last, by convention
     *                 break;
     *             case 2:
     *                 break;
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String DEFAULT_LABEL_NOT_LAST_IN_SWITCH_STATEMENT          = "PMD.DefaultLabelNotLastInSwitchStmt";

    /**
     * A non-case label (e.g. a named break/continue label) was present in a switch statement. This legal, but
     * confusing. It is easy to mix up the case labels and the non-case labels. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar(int a) {
     *         switch (a) {
     *             case 1:
     *                 // do something
     *                 break;
     *                 mylabel:
     *                 // this is legal, but confusing!
     *                 break;
     *             default:
     *                 break;
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String NON_CASE_LABEL_IN_SWITCH_STATEMENT                  = "PMD.NonCaseLabelInSwitchStatement";

    /**
     * Calls to a collection's toArray() method should specify target arrays sized to match the size of the collection.
     * Initial arrays that are too small are discarded in favour of new ones that have to be created that are the proper
     * size. <h2>Example</h2>
     * 
     * <pre>
     * public void arrayCall() {
     *     List foos = getFoos();
     * 
     *     // inefficient, the array will be discarded
     *     Foo[] fooArray = foos.toArray(new Foo[0]);
     * 
     *     // much better; this one sizes the destination array,
     *     // avoiding of a new one via reflection
     *     Foo[] fooArray = foos.toArray(new Foo[foos.size()]);
     * }
     * </pre>
     * 
     * @since PMD 1.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String OPTIMIZABLE_TO_ARRAY_CALL                           = "PMD.OptimizableToArrayCall";

    /**
     * Avoid equality comparisons with Double.NaN. Due to the implicit lack of representation precision when comparing
     * floating point numbers these are likely to cause logic errors. <h2>Example</h2>
     * 
     * <pre>
     * boolean x = (y == Double.NaN);
     * </pre>
     * 
     * @since PMD 1.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String BAD_COMPARISON                                      = "PMD.BadComparison";

    /**
     * Tests for null should not use the equals() method. The '==' operator should be used instead. <h2>Example</h2>
     * 
     * <pre>
     * String x = &quot;foo&quot;;
     * 
     * if (x.equals(null)) { // bad form
     *     doSomething();
     * }
     * 
     * if (x == null) { // preferred
     *     doSomething();
     * }
     * </pre>
     * 
     * @since PMD 1.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String EQUALS_NULL                                         = "PMD.EqualsNull";

    /**
     * Avoid negation within an "if" expression with an "else" clause. For example, rephrase: if (x != y) diff(); else
     * same(); as: if (x == y) same(); else diff(); Most "if (x != y)" cases without an "else" are often return cases,
     * so consistent use of this rule makes the code easier to read. Also, this resolves trivial ordering problems, such
     * as "does the error case go first?" or "does the common case go first?". <h2>Example</h2>
     * 
     * <pre>
     * boolean bar(int x, int y) {
     *     return (x != y) ? diff : same;
     * }
     * </pre>
     * 
     * @since PMD 1.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String CONFUSING_TERNARY                                   = "PMD.ConfusingTernary";

    /**
     * Avoid instantiating an object just to call getClass() on it; use the .class public member instead. <h2>Example</h2>
     * 
     * <pre>
     * public void instantiation() {
     *     // replace this
     *     Class c = new String().getClass();
     * 
     *     // with this:
     *     Class c = String.class;
     * }
     * </pre>
     * 
     * @since PMD 2.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String INSTANTIATION_TO_GET_CLASS                          = "PMD.InstantiationToGetClass";

    /**
     * Avoid idempotent operations - they have no effect. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() {
     *         int x = 2;
     *         x = x;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String IDEMPOTENT_OPERATIONS                               = "PMD.IdempotentOperations";

    /**
     * Be sure to specify a Locale when creating SimpleDateFormat instances to ensure that locale-appropriate formatting
     * is used. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     // Should specify Locale.US (or whatever)
     *     private SimpleDateFormat sdf = new SimpleDateFormat(&quot;pattern&quot;);
     * }
     * </pre>
     * 
     * @since PMD 2.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String SIMPLE_DATE_FORMAT_NEEDS_LOCALE                     = "PMD.SimpleDateFormatNeedsLocale";

    /**
     * Identifies private fields whose values never change once they are initialized either in the declaration of the
     * field or by a constructor. This helps in converting existing classes to becoming immutable ones. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private int x; // could be final
     * 
     *     public Foo() {
     *         x = 7;
     *     }
     * 
     *     public void foo() {
     *         int a = x + 2;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String IMMUTABLE_FIELD                                     = "PMD.ImmutableField";

    /**
     * When doing String.toLowerCase()/toUpperCase() conversions, use Locales to avoids problems with languages that
     * have unusual conventions, i.e. Turkish. <h2>Example</h2>
     * 
     * <pre>
     * class Foo {
     *  // BAD
     *  if (x.toLowerCase().equals("list"))...
     *  // GOOD
     *  String z = a.toLowerCase(Locale.EN);
     * }
     * </pre>
     * 
     * @since PMD 2.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String USE_LOCALE_WITH_CASE_CONVERSIONS                    = "PMD.UseLocaleWithCaseConversions";

    /**
     * Do not use protected fields in final classes since they cannot be subclassed. Clarify your intent by using
     * private or package access modifiers instead. <h2>Example</h2>
     * 
     * <pre>
     * public final class Bar {
     *     private int   x;
     *     protected int y; // bar cannot be subclassed, so is y really private or package visible?
     * 
     *     Bar() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String AVOID_PROTECTED_FIELD_IN_FINAL_CLASS                = "PMD.AvoidProtectedFieldInFinalClass";

    /**
     * Identifies a possible unsafe usage of a static field. <h2>Example</h2>
     * 
     * <pre>
     * public class StaticField {
     *     static int x;
     * 
     *     public FinalFields(int y) {
     *         x = y; // unsafe
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String ASSIGNMENT_TO_NON_FINAL_STATIC                      = "PMD.AssignmentToNonFinalStatic";

    /**
     * A class that has private constructors and does not have any static methods or fields cannot be used. <h2>Example</h2>
     * 
     * <pre>
     * // This class is unusable, since it cannot be
     * // instantiated (private constructor),
     * // and no static method can be called.
     * 
     * public class Foo {
     *     private Foo() {
     *     }
     * 
     *     void foo() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String MISSING_STATIC_METHOD_IN_NON_INSTANTIATABLE_CLASS   = "PMD.MissingStaticMethodInNonInstantiatableClass";

    /**
     * Method-level synchronization can cause problems when new code is added to the method. Block-level synchronization
     * helps to ensure that only the code that needs synchronization gets it. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     // Try to avoid this:
     *     synchronized void foo() {
     *     }
     * 
     *     // Prefer this:
     *     void bar() {
     *         synchronized (this) {
     *         }
     *     }
     * 
     *     // Try to avoid this for static methods:
     *     static synchronized void fooStatic() {
     *     }
     * 
     *     // Prefer this:
     *     static void barStatic() {
     *         synchronized (Foo.class) {
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String AVOID_SYNCHRONIZED_AT_METHOD_LEVEL                  = "PMD.AvoidSynchronizedAtMethodLevel";

    /**
     * Switch statements without break or return statements for each case option may indicate problematic behaviour.
     * Empty cases are ignored as these indicate an intentional fall-through. <h2>Example</h2>
     * 
     * <pre>
     * public void bar(int status) {
     *     switch (status) {
     *         case CANCELLED:
     *             doCancelled();
     *             // break; hm, should this be commented out?
     *         case NEW:
     *             doNew();
     *             // is this really a fall-through?
     *         case REMOVED:
     *             doRemoved();
     *             // what happens if you add another case after this one?
     *         case OTHER: // empty case - this is interpreted as an intentional fall-through
     *         case ERROR:
     *             doErrorHandling();
     *             break;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String MISSING_BREAK_IN_SWITCH                             = "PMD.MissingBreakInSwitch";

    /**
     * Thread.notify() awakens a thread monitoring the object. If more than one thread is monitoring, then only one is
     * chosen. The thread chosen is arbitrary; thus its usually safer to call notifyAll() instead. <h2>Example</h2>
     * 
     * <pre>
     * void bar() {
     *     x.notify();
     *     // If many threads are monitoring x, only one (and you won't know which) will be notified.
     *     // use instead:
     *     x.notifyAll();
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String USE_NOTIFY_ALL_INSTEAD_OF_NOTIFY                    = "PMD.UseNotifyAllInsteadOfNotify";

    /**
     * Each caught exception type should be handled in its own catch clause. <h2>Example</h2>
     * 
     * <pre>
     * try { // Avoid this
     *       // do something
     * } catch (Exception ee) {
     *     if (ee instanceof IOException) {
     *         cleanup();
     *     }
     * }
     * try { // Prefer this:
     *       // do something
     * } catch (IOException ee) {
     *     cleanup();
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String AVOID_INSTANCEOF_CHECKS_IN_CATCH_CLAUSE             = "PMD.AvoidInstanceofChecksInCatchClause";

    /**
     * The abstract class does not contain any abstract methods. An abstract class suggests an incomplete
     * implementation, which is to be completed by subclasses implementing the abstract methods. If the class is
     * intended to be used as a base class only (not to be instantiated directly) a protected constructor can be
     * provided prevent direct instantiation. <h2>Example</h2>
     * 
     * <pre>
     * public abstract class Foo {
     *   void int method1() { ... }
     *   void int method2() { ... }
     *   // consider using abstract methods or removing
     *   // the abstract modifier and adding protected constructors
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String ABSTRACT_CLASS_WITH_ABSTRACT_METHOD                 = "PMD.AbstractClassWithoutAbstractMethod";

    /**
     * No need to check for null before an instanceof; the instanceof keyword returns false when given a null argument.
     * <h2>Example</h2>
     * 
     * <pre>
     * class Foo {
     *     void bar(Object x) {
     *         if (x != null &amp;&amp; x instanceof Bar) {
     *             // just drop the &quot;x != null&quot; check
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String SIMPLIFY_CONDITIONAL                                = "PMD.SimplifyConditional";

    /**
     * Use equals() to compare object references; avoid comparing them with ==. <h2>Example</h2>
     * 
     * <pre>
     * class Foo {
     *     boolean bar(String a, String b) {
     *         return a == b;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String COMPARE_OBJECTS_WITH_EQUALS                         = "PMD.CompareObjectsWithEquals";

    /**
     * Position literals first in comparisons, if the second argument is null then NullPointerExceptions can be avoided,
     * they will just return false. <h2>Example</h2>
     * 
     * <pre>
     * class Foo {
     *     boolean bar(String x) {
     *         return x.equals(&quot;2&quot;); // should be &quot;2&quot;.equals(x)
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String POSITION_LITERALS_FIRST_IN_COMPARISONS              = "PMD.PositionLiteralsFirstInComparisons";

    /**
     * Avoid the creation of unnecessary local variables. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public int foo() {
     *         int x = doSomething();
     *         return x; // instead, just 'return doSomething();'
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String UNNECESSARY_LOCAL_BEFORE_RETURN                     = "PMD.UnnecessaryLocalBeforeReturn";

    /**
     * Non-thread safe singletons can result in bad state changes. Eliminate static singletons if possible by
     * instantiating the object directly. Static singletons are usually not needed as only a single instance exists
     * anyway. Other possible fixes are to synchronize the entire method or to use an initialize-on-demand holder class
     * (do not use the double-check idiom). See Effective Java, item 48. <h2>Example</h2>
     * 
     * <pre>
     * class Bar {
     *     private static Foo foo = null;
     * 
     *     // multiple simultaneous callers may see partially initialized objects
     *     public static Foo getFoo() {
     *         if (foo == null)
     *             foo = new Foo();
     *         return foo;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String NON_THREAD_SAFE_SINGLETON                           = "PMD.NonThreadSafeSingleton";

    /**
     * Uncommented Empty Method finds instances where a method does not contain statements, but there is no comment. By
     * explicitly commenting empty methods it is easier to distinguish between intentional (commented) and unintentional
     * empty methods. <h2>Example</h2>
     * 
     * <pre>
     * public void doSomething() {
     * }
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String UNCOMMENTED_EMPTY_METHOD                            = "PMD.UncommentedEmptyMethod";

    /**
     * Uncommented Empty Constructor finds instances where a constructor does not contain statements, but there is no
     * comment. By explicitly commenting empty constructors it is easier to distinguish between intentional (commented)
     * and unintentional empty constructors. <h2>Example</h2>
     * 
     * <pre>
     * public Foo() {
     *     super();
     * }
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String UNCOMMENTED_EMPTY_CONSTRUCTOR                       = "PMD.UncommentedEmptyConstructor";

    /**
     * An interface should be used only to characterize the external behaviour of an implementing class: using an
     * interface as a container of constants is a poor usage pattern and not recommended. <h2>Example</h2>
     * 
     * <pre>
     * public interface ConstantsInterface {
     *     public static final int    CONSTANT1 = 0;
     *     public static final String CONSTANT2 = &quot;1&quot;;
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String AVOID_CONSTANTS_INTERFACE                           = "PMD.AvoidConstantsInterface";

    /**
     * SimpleDateFormat instances are not synchronized. Sun recommends using separate format instances for each thread.
     * If multiple threads must access a static formatter, the formatter must be synchronized either on method or block
     * level. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private static final SimpleDateFormat sdf = new SimpleDateFormat();
     * 
     *     void bar() {
     *         sdf.format(); // poor, no thread-safety
     *     }
     * 
     *     synchronized void foo() {
     *         sdf.format(); // preferred
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String UNSYCHRONIZED_STATIC_DATE_FORMATTER                 = "PMD.UnsynchronizedStaticDateFormatter";

    /**
     * Throwing a new exception from a catch block without passing the original exception into the new exception will
     * cause the original stack trace to be lost making it difficult to debug effectively. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void good() {
     *         try {
     *             Integer.parseInt(&quot;a&quot;);
     *         } catch (Exception e) {
     *             throw new Exception(e); // first possibility to create exception chain
     *         }
     *         try {
     *             Integer.parseInt(&quot;a&quot;);
     *         } catch (Exception e) {
     *             throw (IllegalStateException) new IllegalStateException().initCause(e); // second possibility to create
     *                                                                                     // exception chain.
     *         }
     *     }
     * 
     *     void bad() {
     *         try {
     *             Integer.parseInt(&quot;a&quot;);
     *         } catch (Exception e) {
     *             throw new Exception(e.getMessage());
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String PRESERVE_STACK_TRACE                                = "PMD.PreserveStackTrace";

    /**
     * The isEmpty() method on java.util.Collection is provided to determine if a collection has any elements. Comparing
     * the value of size() to 0 does not convey intent as well as the isEmpty() method. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void good() {
     *         List foo = getList();
     *         if (foo.isEmpty()) {
     *             // blah
     *         }
     *     }
     * 
     *     void bad() {
     *         List foo = getList();
     *         if (foo.size() == 0) {
     *             // blah
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String USE_COLLECTION_IS_EMPTY                             = "PMD.UseCollectionIsEmpty";

    /**
     * A class with only private constructors should be final, unless the private constructor is invoked by a inner
     * class. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo { // Should be final
     *     private Foo() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String CLASS_WITH_ONLY_PRIVATE_CONSTRUCTOR_SHOULD_BE_FINAL = "PMD.ClassWithOnlyPrivateConstructorsShouldBeFinal";

    /**
     * Empty methods in an abstract class should be tagged as abstract. This helps to remove their inapproprate usage by
     * developers who should be implementing their own versions in the concrete subclasses. <h2>Example</h2>
     * 
     * <pre>
     * public abstract class ShouldBeAbstract {
     *     public Object couldBeAbstract() {
     *         // Should be abstract method ?
     *         return null;
     *     }
     * 
     *     public void couldBeAbstract() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String EMPTY_METHOD_IN_ABSTRACT_CLASS_SHOULD_BE_ABSTRACT   = "PMD.EmptyMethodInAbstractClassShouldBeAbstract";

    /**
     * Fields whose scopes are limited to just single methods do not rely on the containing object to provide them to
     * other methods. They may be better implemented as local variables within those methods. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private int x; // no reason to exist at the Foo instance level
     * 
     *     public void foo(int y) {
     *         x = y + 5;
     *         return x;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String SINGULAR_FIELD                                      = "PMD.SingularField";

    /**
     * For any method that returns an array, it is a better to return an empty array rather than a null reference. This
     * removes the need for null checking all results and avoids inadvertent NullPointerExceptions. <h2>Example</h2>
     * 
     * <pre>
     * public class Example {
     *     // Not a good idea...
     *     public int[] badBehavior() {
     *         // ...
     *         return null;
     *     }
     * 
     *     // Good behavior
     *     public String[] bonnePratique() {
     *         // ...
     *         return new String[0];
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String RETURN_EMPTY_ARRAY_RATHER_THAN_NULL                 = "PMD.ReturnEmptyArrayRatherThanNull";

    /**
     * If an abstract class does not provides any methods, it may be acting as a simple data container that is not meant
     * to be instantiated. In this case, it is probably better to use a private or protected constructor in order to
     * prevent instantiation than make the class misleadingly abstract. <h2>Example</h2>
     * 
     * <pre>
     * public class abstract Example {
     *     String field;
     *     int otherField;
     * }
     * </pre>
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String ABSTRACT_CLASS_WITHOUT_ANY_METHOD                   = "PMD.AbstractClassWithoutAnyMethod";

    /**
     * Switch statements are indended to be used to support complex branching behaviour. Using a switch for only a few
     * cases is ill-advised, since switches are not as easy to understand as if-then statements. In these cases use the
     * if-then statement to increase code readability.
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String TOO_FEW_BRANCHES_FOR_A_SWITCH_STATEMENT             = "PMD.TooFewBranchesForASwitchStatement";

    /**
     * Use opposite operator instead of negating the whole expression with a logic complement operator. <h2>Example</h2>
     * 
     * <pre>
     * public boolean bar(int a, int b) {
     * 
     *     if (!(a == b)) // use !=
     *         return false;
     * 
     *     if (!(a &lt; b)) // use &gt;=
     *         return false;
     * 
     *     return true;
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String LOGIC_INVERSION                                     = "PMD.LogicInversion";

    /**
     * Java 5 introduced the varargs parameter declaration for methods and constructors. This syntactic sugar provides
     * flexibility for users of these methods and constructors, allowing them to avoid having to deal with the creation
     * of an array. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void foo(String s, Object[] args) {
     *         // Do something here...
     *     }
     * 
     *     public void bar(String s, Object... args) {
     *         // Ahh, varargs tastes much better...
     *     }
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String USE_VARARGS                                         = "PMD.UseVarargs";

    /**
     * Fields should be declared at the top of the class, before any method declarations, constructors, initializers or
     * inner classes. <h2>Example</h2>
     * 
     * <pre>
     * public class HelloWorldBean {
     * 
     *     // Field declared before methods / inner classes - OK
     *     private String _thing;
     * 
     *     public String getMessage() {
     *         return &quot;Hello World!&quot;;
     *     }
     * 
     *     // Field declared after methods / inner classes - avoid this
     *     private String _fieldInWrongLocation;
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String FIELD_DECLARATIONS_SHOULD_BE_AT_START_OF_CLASS      = "PMD.FieldDeclarationsShouldBeAtStartOfClass";

    /**
     * The God Class rule detects the God Class design flaw using metrics. God classes do too many things, are very big
     * and overly complex. They should be split apart to be more object-oriented. The rule uses the detection strategy
     * described in "Object-Oriented Metrics in Practice". The violations are reported against the entire class. See
     * also the references: Michele Lanza and Radu Marinescu. Object-Oriented Metrics in Practice: Using Software
     * Metrics to Characterize, Evaluate, and Improve the Design of Object-Oriented Systems. Springer, Berlin, 1
     * edition, October 2006. Page 80.
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/design.html">PMD Design Rule Set Documentation</a>
     */
    public static final String GOD_CLASS                                           = "PMD.GodClass";

    /**
     * Empty Catch Block finds instances where an exception is caught, but nothing is done. In most circumstances, this
     * swallows an exception which should either be acted on or reported. <h2>Example</h2>
     * 
     * <pre>
     * public void doSomething() {
     *     try {
     *         FileInputStream fis = new FileInputStream(&quot;/tmp/bugger&quot;);
     *     } catch (IOException ioe) {
     *         // not good
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_CATCH_BLOCK                                   = "PMD.EmptyCatchBlock";

    /**
     * Empty If Statement finds instances where a condition is checked but nothing is done about it. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar(int x) {
     *         if (x == 0) {
     *             // empty!
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_IF_STATEMENT                                  = "PMD.EmptyIfStmt";

    /**
     * Empty While Statement finds all instances where a while statement does nothing. If it is a timing loop, then you
     * should use Thread.sleep() for it; if it is a while loop that does a lot in the exit expression, rewrite it to
     * make it clearer. <h2>Example</h2>
     * 
     * <pre>
     * void bar(int a, int b) {
     *     while (a == b) {
     *         // empty!
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_WHILE_STATEMENT                               = "PMD.EmptyWhileStmt";

    /**
     * Avoid empty try blocks - what's the point? <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() {
     *         try {
     *         } catch (Exception e) {
     *             e.printStackTrace();
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_TRY_BLOCK                                     = "PMD.EmptyTryBlock";

    /**
     * Empty finally blocks serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() {
     *         try {
     *             int x = 2;
     *         } finally {
     *             // empty!
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_FINALLY_BLOCK                                 = "PMD.EmptyFinallyBlock";

    /**
     * Empty switch statements serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     int x = 2;
     *     switch (x) {
     *     // once there was code here
     *     // but it's been commented out or something
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_SWITCH_STATEMENTS                             = "PMD.EmptySwitchStatements";

    /**
     * Empty synchronized blocks serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() {
     *         synchronized (this) {
     *             // empty!
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_SYNCHRONIZED_BLOCK                            = "PMD.EmptySynchronizedBlock";

    /**
     * An empty statement (or a semicolon by itself) that is not used as the sole body of a 'for' or 'while' loop is
     * probably a bug. It could also be a double semicolon, which has no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public void doit() {
     *     // this is probably not what you meant to do
     *     ;
     *     // the extra semicolon here this is not necessary
     *     System.out.println(&quot;look at the extra semicolon&quot;);
     *     ;
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_STATEMENT_NOT_IN_LOOP                         = "PMD.EmptyStatementNotInLoop";

    /**
     * Empty initializers serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * 
     *     static {
     *     } // Why ?
     * 
     *     {
     *     } // Again, why ?
     * 
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_INITIALIZER                                   = "PMD.EmptyInitializer";

    /**
     * Empty block statements serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * 
     *     private int _bar;
     * 
     *     public void setBar(int bar) {
     *         {
     *             _bar = bar;
     *         } // Why not?
     *         {
     *         } // But remove this.
     *     }
     * 
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_STATEMENT_BLOCK                               = "PMD.EmptyStatementBlock";

    /**
     * An empty static initializer serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     static {
     *         // empty
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/empty.html">PMD Empty Code Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_STATIC_INITIALIZER                            = "PMD.EmptyStaticInitializer";

    /**
     * Empty finalize methods serve no purpose and should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     protected void finalize() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String EMPTY_FINANLIZER                                    = "PMD.EmptyFinalizer";

    /**
     * If the finalize() is implemented, it should do something besides just calling super.finalize(). <h2>Example</h2>
     * 
     * <pre>
     * protected void finalize() {
     *     super.finalize();
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String FINALIZE_ONLY_CALLS_SUPER_FINALIZE                  = "PMD.FinalizeOnlyCallsSuperFinalize";

    /**
     * Methods named finalize() should not have parameters. It is confusing and most likely an attempt to overload
     * Object.finalize(). It will not be called by the VM. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     // this is confusing and probably a bug
     *     protected void finalize(int a) {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String FINALIZE_OVERLOADED                                 = "PMD.FinalizeOverloaded";

    /**
     * If the finalize() is implemented, its last action should be to call super.finalize. <h2>Example</h2>
     * 
     * <pre>
     * protected void finalize() {
     *     something();
     *     // neglected to call super.finalize()
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String FINALIZE_DOES_NOT_CALL_SUPER_FINALIZE               = "PMD.FinalizeDoesNotCallSuperFinalize";

    /**
     * When overriding the finalize(), the new method should be set as protected. If made public, other classes may
     * invoke it at inappropriate times. <h2>Example</h2>
     * 
     * <pre>
     * public void finalize() {
     *     // do something
     * }
     * </pre>
     * 
     * @since PMD 1.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String FINALIZE_SHOULD_BE_PROTECTED                        = "PMD.FinalizeShouldBeProtected";

    /**
     * The method Object.finalize() is called by the garbage collector on an object when garbage collection determines
     * that there are no more references to the object. It should not be invoked by application logic. <h2>Example</h2>
     * 
     * <pre>
     * void foo() {
     *     Bar b = new Bar();
     *     b.finalize();
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/finalizers.html">PMD Finalizers Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_CALLING_FINALIZE                              = "PMD.AvoidCallingFinalize";

    /**
     * Duplicate or overlapping import statements should be avoided. <h2>Example</h2>
     * 
     * <pre>
     * import java.lang.String;
     * import java.lang.*;
     * </pre>
     * 
     * @since PMD 0.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String DUPLICATE_IMPORTS                                   = "PMD.DuplicateImports";

    /**
     * Avoid importing anything from the package 'java.lang'. These classes are automatically imported (JLS 7.5.3). <h2>
     * Example</h2>
     * 
     * <pre>
     * import java.lang.String; // this is unnecessary
     * import java.lang.*; // this is bad
     * </pre>
     * 
     * @since PMD 0.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String DONT_IMPORT_JAVA_LANG                               = "PMD.DontImportJavaLang";

    /**
     * Avoid the use of unused import statements to prevent unwanted dependencies. <h2>Example</h2>
     * 
     * <pre>
     * // this is bad, if the class doesn't use java.io.File
     * import java.io.File;
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_IMPORTS                                      = "PMD.UnusedImports";

    /**
     * There is no need to import a type that lives in the same package. <h2>Example</h2>
     * 
     * <pre>
     * package foo;
     * 
     * import foo.Buz; // no need for this
     * import foo.*; // or this
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String IMPORT_FROM_SAME_PACKAGE                            = "PMD.ImportFromSamePackage";

    /**
     * If you overuse the static import feature, it can make your program unreadable and unmaintainable, polluting its
     * namespace with all the static members you import. Readers of your code (including you, a few months after you
     * wrote it) will not know which class a static member comes from (Sun 1.5 Language Guide). <h2>Example</h2>
     * 
     * <pre>
     * import static Lennon;
     * import static Ringo;
     * import static George;
     * import static Paul;
     * import static Yoko; // Too much !
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String TOO_MANY_STATIC_IMPORTS                             = "PMD.TooManyStaticImports";

    /**
     * Import statements allow the use of non-fully qualified names. The use of a fully qualified name which is covered
     * by an import statement is redundant. Consider using the non-fully qualified name. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private java.util.List list1; // Unnecessary FQN
     *     private List           list2; // More appropriate given import of 'java.util.List'
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/imports.html">PMD Import Statements Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_FULLY_QUALIFIED_NAME                    = "PMD.UnnecessaryFullyQualifiedName";

    /**
     * In J2EE, the getClassLoader() method might not work as expected. Use
     * Thread.currentThread().getContextClassLoader() instead. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     ClassLoader cl = Bar.class.getClassLoader();
     * }
     * </pre>
     * 
     * @since PMD 3.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String USE_PROPER_CLASS_LOADER                             = "PMD.UseProperClassLoader";

    /**
     * The EJB Specification states that any MessageDrivenBean or SessionBean should be suffixed by 'Bean'. <h2>Example</h2>
     * 
     * <pre>
     * public class SomeBean implements SessionBean {
     * } // proper name
     * 
     * public class MissingTheProperSuffix implements SessionBean {
     * } // non-standard name
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String MDB_AND_SESSION_BEAN_NAMING_CONVENTION              = "PMD.MDBAndSessionBeanNamingConvention";

    /**
     * A Remote Home interface type of a Session EJB should be suffixed by 'Home'. <h2>Example</h2>
     * 
     * <pre>
     * public interface MyBeautifulHome extends javax.ejb.EJBHome {
     * } // proper name
     * 
     * public interface MissingProperSuffix extends javax.ejb.EJBHome {
     * } // non-standard name
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String REMOTE_SESSION_INTERFACE_NAMING_CONVENTION          = "PMD.RemoteSessionInterfaceNamingConvention";

    /**
     * The Local Interface of a Session EJB should be suffixed by 'Local'. <h2>Example</h2>
     * 
     * <pre>
     * public interface MyLocal extends javax.ejb.EJBLocalObject {
     * } // proper name
     * 
     * public interface MissingProperSuffix extends javax.ejb.EJBLocalObject {
     * } // non-standard name
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String LOCAL_INTERFACE_SESSION_NAMING_CONVENTION           = "PMD.LocalInterfaceSessionNamingConvention";

    /**
     * The Local Home interface of a Session EJB should be suffixed by 'LocalHome'. <h2>Example</h2>
     * 
     * <pre>
     * public interface MyBeautifulLocalHome extends javax.ejb.EJBLocalHome {
     * }// proper name
     * 
     * public interface MissingProperSuffix extends javax.ejb.EJBLocalHome {
     * } // non-standard name
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String LOCAL_HOME_NAMING_CONVENTION                        = "PMD.LocalHomeNamingConvention";

    /**
     * Remote Interface of a Session EJB should not have a suffix. <h2>Example</h2>
     * 
     * <pre>
     * // Poor Session suffix
     * public interface BadSuffixSession extends javax.ejb.EJBObject {
     * }
     * 
     * // Poor EJB suffix
     * public interface BadSuffixEJB extends javax.ejb.EJBObject {
     * }
     * 
     * // Poor Bean suffix
     * public interface BadSuffixBean extends javax.ejb.EJBObject {
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String REMOTE_INTERFACE_NAMING_CONVENTION                  = "PMD.RemoteInterfaceNamingConvention";

    /**
     * Web applications should not call System.exit(), since only the web container or the application server should
     * stop the JVM. This rule also checks for the equivalent call Runtime.getRuntime().exit(). <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     System.exit(0); // never call this when running in an application server!
     * }
     * 
     * public void foo() {
     *     Runtime.getRuntime().exit(0); // never stop the JVM manually, the container will do this.
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String DO_NOT_CALL_SYSTEM_EXIT                             = "PMD.DoNotCallSystemExit";

    /**
     * According to the J2EE specification, an EJB should not have any static fields with write access. However, static
     * read-only fields are allowed. This ensures proper behavior especially when instances are distributed by the
     * container on several JREs. <h2>Example</h2>
     * 
     * <pre>
     * public class SomeEJB extends EJBObject implements EJBLocalHome {
     * 
     *     private static int       CountA; // poor, field can be edited
     * 
     *     private static final int CountB; // preferred, read-only access
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String STATIC_EJB_FIELD_SHOULD_BE_FINAL                    = "PMD.StaticEJBFieldShouldBeFinal";

    /**
     * The J2EE specification explicitly forbids the use of threads. <h2>Example</h2>
     * 
     * <pre>
     * // This is not allowed
     * public class UsingThread extends Thread {
     * 
     * }
     * 
     * // Neither this,
     * public class OtherThread implements Runnable {
     *     // Nor this ...
     *     public void methode() {
     *         Runnable thread = new Thread();
     *         thread.run();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/j2ee.html">PMD J2EE Rule Set Documentation</a>
     */
    public static final String DO_NOT_USE_THREADS                                  = "PMD.DoNotUseThreads";

    /**
     * If a class is a bean, or is referenced by a bean directly or indirectly it needs to be serializable. Member
     * variables need to be marked as transient, static, or have accessor methods in the class. Marking variables as
     * transient is the safest and easiest modification. Accessor methods should follow the Java naming conventions,
     * i.e. for a variable named foo, getFoo() and setFoo() accessor methods should be provided. <h2>Example</h2>
     * 
     * <pre>
     * public class Serialized {
     *     private transient int someFoo; // good, it's transient
     *     private static int    otherFoo; // also OK
     *     private int           moreFoo; // OK, has proper accessors, see below
     *     private int           badFoo;  // bad, should be
     *                                     // marked transient
     * 
     *     private void setMoreFoo(int moreFoo) {
     *         this.moreFoo = moreFoo;
     *     }
     * 
     *     private int getMoreFoo() {
     *         return this.moreFoo;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/javabeans.html">PMD JavaBeans Rule Set
     *      Documentation</a>
     */
    public static final String BEAN_MEMBERS_SHOULD_SERIALIZE                       = "PMD.BeanMembersShouldSerialize";

    /**
     * Serializable classes should provide a serialVersionUID field. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo implements java.io.Serializable {
     *     String name;
     *     // Define serialization id to avoid serialization related bugs
     *     // i.e., public static final long serialVersionUID = 4328743;
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/javabeans.html">PMD JavaBeans Rule Set
     *      Documentation</a>
     */
    public static final String MISSING_SERIAL_VERSION_UID                          = "PMD.MissingSerialVersionUID";

    /**
     * The suite() method in a JUnit test needs to be both public and static. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends TestCase {
     *     public void suite() {
     *     } // oops, should be static
     * 
     *     private static void suite() {
     *     } // oops, should be public
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String JUNIT_STATIC_SUITE                                  = "PMD.JUnitStaticSuite";

    /**
     * Some JUnit framework methods are easy to misspell. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends TestCase {
     *     public void setup() {
     *     } // oops, should be setUp
     * 
     *     public void TearDown() {
     *     } // oops, should be tearDown
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String JUNIT_SPELLING                                      = "PMD.JUnitSpelling";

    /**
     * JUnit assertions should include an informative message - i.e., use the three-argument version of assertEquals(),
     * not the two-argument version. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends TestCase {
     *     public void testSomething() {
     *         assertEquals(&quot;foo&quot;, &quot;bar&quot;);
     *         // Use the form:
     *         // assertEquals(&quot;Foo does not equals bar&quot;, &quot;foo&quot;, &quot;bar&quot;);
     *         // instead
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.04
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String JUNIT_ASSERTIONS_SHOULD_INCLUDE_MESSAGE             = "PMD.JUnitAssertionsShouldIncludeMessage";

    /**
     * JUnit tests should include at least one assertion. This makes the tests more robust, and using assert with
     * messages provide the developer a clearer idea of what the test does. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends TestCase {
     *     public void testSomething() {
     *         Bar b = findBar();
     *         // This is better than having a NullPointerException
     *         // assertNotNull(&quot;bar not found&quot;, b);
     *         b.work();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String JUNIT_TESTS_SHOULD_INCLUDE_ASSERT                   = "PMD.JUnitTestsShouldIncludeAssert";

    /**
     * Test classes end with the suffix Test. Having a non-test class with that name is not a good practice, since most
     * people will assume it is a test case. Test classes have test methods named testXXX. <h2>Example</h2>
     * 
     * <pre>
     * // Consider changing the name of the class if it is not a test
     * // Consider adding test methods if it is a test
     * public class CarTest {
     *     public static void main(String[] args) {
     *         // do something
     *     }
     *     // code
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String TEST_CLASS_WITHOUT_TEST_CASES                       = "PMD.TestClassWithoutTestCases";

    /**
     * A JUnit test assertion with a boolean literal is unnecessary since it always will evaluate to the same thing.
     * Consider using flow control (in case of assertTrue(false) or similar) or simply removing statements like
     * assertTrue(true) and assertFalse(false). If you just want a test to halt after finding an error, use the fail()
     * method and provide an indication message of why it did. <h2>Example</h2>
     * 
     * <pre>
     * public class SimpleTest extends TestCase {
     *     public void testX() {
     *         assertTrue(true); // serves no real purpose
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String UNNECESSARY_BOOLEAN_ASSERTION                       = "PMD.UnnecessaryBooleanAssertion";

    /**
     * This rule detects JUnit assertions in object equality. These assertions should be made by more specific methods,
     * like assertEquals. <h2>Example</h2>
     * 
     * <pre>
     * public class FooTest extends TestCase {
     *     void testCode() {
     *         Object a, b;
     *         assertTrue(a.equals(b)); // bad usage
     *         assertEquals(a, b); // good usage
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String USE_ASSERT_EQUALS_INSTEAD_OF_ASSERT_TRUE            = "PMD.UseAssertEqualsInsteadOfAssertTrue";

    /**
     * This rule detects JUnit assertions in object references equality. These assertions should be made by more
     * specific methods, like assertSame, assertNotSame. <h2>Example</h2>
     * 
     * <pre>
     * public class FooTest extends TestCase {
     *     void testCode() {
     *         Object a, b;
     *         assertTrue(a == b); // bad usage
     *         assertSame(a, b); // good usage
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String USE_ASSERT_SAME_INSTEAD_OF_ASSERT_TRUE              = "PMD.UseAssertSameInsteadOfAssertTrue";

    /**
     * This rule detects JUnit assertions in object references equality. These assertions should be made by more
     * specific methods, like assertNull, assertNotNull. <h2>Example</h2>
     * 
     * <pre>
     * public class FooTest extends TestCase {
     *     void testCode() {
     *         Object a = doSomething();
     *         assertTrue(a == null); // bad usage
     *         assertNull(a); // good usage
     *         assertTrue(a != null); // bad usage
     *         assertNotNull(a); // good usage
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String USE_ASSERT_NULL_INSTEAD_OF_ASSERT_TRUE              = "PMD.UseAssertNullInsteadOfAssertTrue";

    /**
     * Avoid negation in an assertTrue or assertFalse test. For example, rephrase: assertTrue(!expr); as:
     * assertFalse(expr); <h2>Example</h2>
     * 
     * <pre>
     * public class SimpleTest extends TestCase {
     *     public void testX() {
     *         assertTrue(&quot;not empty&quot;, !r.isEmpty()); // replace with assertFalse(&quot;not empty&quot;, r.isEmpty())
     *         assertFalse(!r.isEmpty()); // replace with assertTrue(r.isEmpty())
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String SIMPLIFY_BOOLEAN_ASSERTION                          = "PMD.SimplifyBooleanAssertion";

    /**
     * JUnit tests should not contain too many asserts. Many asserts are indicative of a complex test, for which it is
     * harder to verify correctness. Consider breaking the test scenario into multiple, shorter test scenarios.
     * Customize the maximum number of assertions used by this Rule to suit your needs. <h2>Example</h2>
     * 
     * <pre>
     * public class MyTestCase extends TestCase {
     *     // Ok
     *     public void testMyCaseWithOneAssert() {
     *         boolean myVar = false;
     *         assertFalse(&quot;should be false&quot;, myVar);
     *     }
     * 
     *     // Bad, too many asserts (assuming max=1)
     *     public void testMyCaseWithMoreAsserts() {
     *         boolean myVar = false;
     *         assertFalse(&quot;myVar should be false&quot;, myVar);
     *         assertEquals(&quot;should equals false&quot;, false, myVar);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String JUNIT_TEST_CONTAINS_TOO_MANY_ASSERTS                = "PMD.JUnitTestContainsTooManyAsserts";

    /**
     * When asserting a value is the same as a boolean literal, use assertTrue/assertFalse, instead of assertEquals. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class MyTestCase extends TestCase {
     *     public void testMyCase() {
     *         boolean myVar = true;
     *         // Ok
     *         assertTrue(&quot;myVar is true&quot;, myVar);
     *         // Bad
     *         assertEquals(&quot;myVar is true&quot;, true, myVar);
     *         // Bad
     *         assertEquals(&quot;myVar is false&quot;, false, myVar);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/junit.html">PMD JUnit Rule Set Documentation</a>
     */
    public static final String USE_ASSERT_TRUE_INSTEAD_OF_ASSERT_EQUALS            = "PMD.UseAssertTrueInsteadOfAssertEquals";

    /**
     * To make sure the full stacktrace is printed out, use the logging statement with two arguments: a String and a
     * Throwable. <h2>Example</h2>
     * 
     * <pre>
     * public class Main {
     *     private static final Log _LOG = LogFactory.getLog(Main.class);
     * 
     *     void bar() {
     *         try {
     *         } catch (Exception e) {
     *             _LOG.error(e); // Wrong!
     *         } catch (OtherException oe) {
     *             _LOG.error(oe.getMessage(), oe); // Correct
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/logging-jakarta-commons.html">PMD Jakarta Commons
     *      Logging Rule Set Documentation</a>
     */
    public static final String USE_CORRECT_EXCEPTION_LOGGING                       = "PMD.UseCorrectExceptionLogging";

    /**
     * A logger should normally be defined private static final and be associated with the correct class. Private final
     * Log log; is also allowed for rare cases where loggers need to be passed around, with the restriction that the
     * logger needs to be passed into the constructor. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * 
     *     private static final Log LOG = LogFactory.getLog(Foo.class);      // proper way
     * 
     *     protected Log            LOG = LogFactory.getLog(Testclass.class); // wrong approach
     * }
     * </pre>
     * 
     * @since PMD 3.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/logging-jakarta-commons.html">PMD Jakarta Commons
     *      Logging Rule Set Documentation</a>
     */
    public static final String PROPER_LOGGER                                       = "PMD.ProperLogger";

    /**
     * When log messages are composed by concatenating strings, the whole section should be guarded by a
     * isDebugEnabled() check to avoid performance and memory issues. <h2>Example</h2>
     * 
     * <pre>
     * public class Test {
     *     private static final Log __log = LogFactory.getLog(Test.class);
     * 
     *     public void test() {
     *         // okay:
     *         __log.debug(&quot;log something&quot;);
     * 
     *         // okay:
     *         __log.debug(&quot;log something with exception&quot;, e);
     * 
     *         // bad:
     *         __log.debug(&quot;log something&quot; + &quot; and &quot; + &quot;concat strings&quot;);
     * 
     *         // bad:
     *         __log.debug(&quot;log something&quot; + &quot; and &quot; + &quot;concat strings&quot;, e);
     * 
     *         // good:
     *         if (__log.isDebugEnabled()) {
     *             __log.debug(&quot;bla&quot; + &quot;&quot;, e);
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/logging-jakarta-commons.html">PMD Jakarta Commons
     *      Logging Rule Set Documentation</a>
     */
    public static final String GUARD_DEBUG_LOGGING                                 = "PMD.GuardDebugLogging";

    /**
     * Normally only one logger is used in each class. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     Logger log  = Logger.getLogger(Foo.class.getName());
     *     // It is very rare to see two loggers on a class, normally
     *     // log information is multiplexed by levels
     *     Logger log2 = Logger.getLogger(Foo.class.getName());
     * }
     * </pre>
     * 
     * @since PMD 2.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/logging-java.html">PMD Java Logging Rule Set
     *      Documentation</a>
     */
    public static final String MORE_THAN_ONE_LOGGER                                = "PMD.MoreThanOneLogger";

    /**
     * In most cases, the Logger reference can be declared as static and final. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     Logger              log = Logger.getLogger(Foo.class.getName()); // not recommended
     * 
     *     static final Logger log = Logger.getLogger(Foo.class.getName()); // preferred approach
     * }
     * </pre>
     * 
     * @since PMD 2.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/logging-java.html">PMD Java Logging Rule Set
     *      Documentation</a>
     */
    public static final String LOGGER_IS_NOT_STATIC_FINAL                          = "PMD.LoggerIsNotStaticFinal";

    /**
     * References to System.(out|err).print are usually intended for debugging purposes and can remain in the codebase
     * even in production code. By using a logger one can enable/disable this behaviour at will (and by priority) and
     * avoid clogging the Standard out log. <h2>Example</h2>
     * 
     * <pre>
     * class Foo {
     *     Logger log = Logger.getLogger(Foo.class.getName());
     * 
     *     public void testA() {
     *         System.out.println(&quot;Entering test&quot;);
     *         // Better use this
     *         log.fine(&quot;Entering test&quot;);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/logging-java.html">PMD Java Logging Rule Set
     *      Documentation</a>
     */
    public static final String SYSTEM_PRINTLN                                      = "PMD.SystemPrintln";

    /**
     * Avoid printStackTrace(); use a logger call instead. <h2>Example</h2>
     * 
     * <pre>
     * class Foo {
     *     void bar() {
     *         try {
     *             // do something
     *         } catch (Exception e) {
     *             e.printStackTrace();
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/logging-java.html">PMD Java Logging Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_PRINT_STACK_TRACE                             = "PMD.AvoidPrintStackTrace";

    /**
     * Consider replacing Vector usages with the newer java.util.ArrayList if expensive thread-safe operations are not
     * required. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         Vector v = new Vector();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String REPLACE_VECTOR_WITH_LIST                            = "PMD.ReplaceVectorWithList";

    /**
     * Consider replacing Hashtable usage with the newer java.util.Map if thread safety is not required. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         Hashtable h = new Hashtable();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String REPLACE_HASHTABLE_WITH_MAP                          = "PMD.ReplaceHashtableWithMap";

    /**
     * Consider replacing Enumeration usages with the newer java.util.Iterator <h2>Example</h2>
     * 
     * <pre>
     * public class Foo implements Enumeration {
     *     private int x = 42;
     * 
     *     public boolean hasMoreElements() {
     *         return true;
     *     }
     * 
     *     public Object nextElement() {
     *         return String.valueOf(i++);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String REPLACE_ENUMERATION_WITH_ITERATOR                   = "PMD.ReplaceEnumerationWithIterator";

    /**
     * Use of the term 'enum' will conflict with newer versions of Java since it is a reserved word. <h2>Example</h2>
     * 
     * <pre>
     * public class A {
     *     public  class foo {
     *         String enum = "foo";
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_ENUM_AS_IDENTIFIER                            = "PMD.AvoidEnumAsIdentifier";

    /**
     * Use of the term 'assert' will conflict with newer versions of Java since it is a reserved word. <h2>Example</h2>
     * 
     * <pre>
     * public class A {
     *     public  class foo {
     *         String assert = "foo";
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_ASSERT_AS_IDENTIFIER                          = "PMD.AvoidAssertAsIdentifier";

    /**
     * Calling new Integer() causes memory allocation that can be avoided by the static Integer.valueOf(). It makes use
     * of an internal cache that recycles earlier instances making it more memory efficient. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private Integer i = new Integer(0); // change to Integer i = Integer.valueOf(0);
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String INTEGER_INSTANTIATION                               = "PMD.IntegerInstantiation";

    /**
     * Calling new Byte() causes memory allocation that can be avoided by the static Byte.valueOf(). It makes use of an
     * internal cache that recycles earlier instances making it more memory efficient. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private Byte i = new Byte(0); // change to Byte i = Byte.valueOf(0);
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String BYTE_INSTANTIATION                                  = "PMD.ByteInstantiation";

    /**
     * Calling new Short() causes memory allocation that can be avoided by the static Short.valueOf(). It makes use of
     * an internal cache that recycles earlier instances making it more memory efficient. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private Short i = new Short(0); // change to Short i = Short.valueOf(0);
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String SHORT_INSTANTIATION                                 = "PMD.ShortInstantiation";

    /**
     * Calling new Long() causes memory allocation that can be avoided by the static Long.valueOf(). It makes use of an
     * internal cache that recycles earlier instances making it more memory efficient. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private Long i = new Long(0); // change to Long i = Long.valueOf(0);
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String LONG_INSTANTIATION                                  = "PMD.LongInstantiation";

    /**
     * In JUnit 3, the setUp method was used to set up all data entities required in running tests. JUnit 4 skips the
     * setUp method and executes all methods annotated with @Before before all tests <h2>Example</h2>
     * 
     * <pre>
     * public class MyTest {
     *     public void setUp() {
     *         bad();
     *     }
     * }
     * 
     * public class MyTest2 {
     *     &#064;Before
     *     public void setUp() {
     *         good();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String JUNIT_4_TEST_SHOULD_USE_BEFORE_ANNOTATION           = "PMD.JUnit4TestShouldUseBeforeAnnotation";

    /**
     * In JUnit 3, the tearDown method was used to clean up all data entities required in running tests. JUnit 4 skips
     * the tearDown method and executes all methods annotated with @After after running each test. <h2>Example</h2>
     * 
     * <pre>
     * public class MyTest {
     *     public void tearDown() {
     *         bad();
     *     }
     * }
     * 
     * public class MyTest2 {
     *     &#064;After
     *     public void tearDown() {
     *         good();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String JUNIT_4_TEST_SHOULD_USE_AFTER_ANNOTATION            = "PMD.JUnit4TestShouldUseAfterAnnotation";

    /**
     * In JUnit 3, the framework executed all methods which started with the word test as a unit test. In JUnit 4, only
     * methods annotated with the @Test annotation are executed. <h2>Example</h2>
     * 
     * <pre>
     * public class MyTest {
     *     public void testBad() {
     *         doSomething();
     *     }
     * 
     *     &#064;Test
     *     public void testGood() {
     *         doSomething();
     *     }
     * }
     * 
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String JUNIT_4_TEST_SHOULD_USE_TEST_ANNOTATION             = "PMD.JUnit4TestShouldUseTestAnnotation";

    /**
     * In JUnit 3, test suites are indicated by the suite() method. In JUnit 4, suites are indicated through the
     * RunWith(Suite.class) annotation. <h2>Example</h2>
     * 
     * <pre>
     * public class BadExample extends TestCase {
     * 
     *     public static Test suite() {
     *         return new Suite();
     *     }
     * }
     * 
     * &#064;RunWith(Suite.class)
     * &#064;SuiteClasses({ TestOne.class, TestTwo.class })
     * public class GoodTest {
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String JUNIT_4_SUITES_SHOULD_USE_SUITE_ANNOTATION          = "PMD.JUnit4SuitesShouldUseSuiteAnnotation";

    /**
     * In JUnit4, use the @Test(expected) annotation to denote tests that should throw exceptions. <h2>Example</h2>
     * 
     * <pre>
     * public class MyTest {
     *     &#064;Test
     *     public void testBad() {
     *         try {
     *             doSomething();
     *             fail(&quot;should have thrown an exception&quot;);
     *         } catch (Exception e) {
     *         }
     *     }
     * 
     *     &#064;Test(expected = Exception.class)
     *     public void testGood() {
     *         doSomething();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/migrating.html">PMD Migration Rule Set
     *      Documentation</a>
     */
    public static final String JUNIT_USE_EXPECTED                                  = "PMD.JUnitUseExpected";

    /**
     * Fields, local variables, or parameter names that are very short are not helpful to the reader. <h2>Example</h2>
     * 
     * <pre>
     * public class Something {
     *     private int q = 15; // field - too short
     * 
     *     public static void main(String as[]) { // formal arg - too short
     *         int r = 20 + q; // local var - too short
     *         for (int i = 0; i &lt; 10; i++) { // not a violation (inside 'for' loop)
     *             r += q;
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String SHORT_VARIABLE                                      = "PMD.ShortVariable";

    /**
     * Fields, formal arguments, or local variable names that are too long can make the code difficult to follow. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class Something {
     *     int reallyLongIntName = -3;             // VIOLATION - Field
     *     public static void main( String argumentsList[] ) { // VIOLATION - Formal
     *         int otherReallyLongName = -5;       // VIOLATION - Local
     *         for (int interestingIntIndex = 0;   // VIOLATION - For
     *              interestingIntIndex < 10;
     *              interestingIntIndex ++ ) {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String LONG_VARIABLE                                       = "PMD.LongVariable";

    /**
     * Method names that are very short are not helpful to the reader. <h2>Example</h2>
     * 
     * <pre>
     * public class ShortMethod {
     *     public void a(int i) { // Violation
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String SHORT_METHOD_NAME                                   = "PMD.ShortMethodName";

    /**
     * A variable naming conventions rule - customize this to your liking. Currently, it checks for final variables that
     * should be fully capitalized and non-final variables that should not include underscores. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public static final int MY_NUM = 0;
     *     public String           myTest = &quot;&quot;;
     *     DataModule              dmTest = new DataModule();
     * }
     * </pre>
     * 
     * @since PMD 1.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String VARIABLE_NAMING_CONVENTIONS                         = "PMD.VariableNamingConventions";

    /**
     * Method names should always begin with a lower case character, and should not contain underscores. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void fooStuff() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String METHOD_NAMING_CONVENTIONS                           = "PMD.MethodNamingConventions";

    /**
     * Class names should always begin with an upper case character. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * }
     * </pre>
     * 
     * @since PMD 1.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String CLASS_NAMING_CONVENTIONS                            = "PMD.ClassNamingConventions";

    /**
     * Abstract classes should be named 'AbstractXXX'. <h2>Example</h2>
     * 
     * <pre>
     * public abstract class Foo { // should be AbstractFoo
     * }
     * </pre>
     * 
     * @since PMD 1.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String ABSTRACT_NAMING                                     = "PMD.AbstractNaming";

    /**
     * Avoid using dollar signs in variable/method/class/interface names. <h2>Example</h2>
     * 
     * <pre>
     * public class Fo$o { // not a recommended name
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String AVOID_DOLLAR_SIGNS                                  = "PMD.AvoidDollarSigns";

    /**
     * Non-constructor methods should not have the same name as the enclosing class. <h2>Example</h2>
     * 
     * <pre>
     * public class MyClass {
     * 
     *     public MyClass() {
     *     } // this is OK because it is a constructor
     * 
     *     public void MyClass() {
     *     } // this is bad because it is a method
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String METHOD_WITH_SAME_NAME_AS_ENCLOSING_CLASS            = "PMD.MethodWithSameNameAsEnclosingClass";

    /**
     * The method name and return type are suspiciously close to hashCode(), which may denote an intention to override
     * the hashCode() method. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public int hashcode() { // oops, this probably was supposed to be 'hashCode'
     * 
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String SUSPICIOUS_HASHCODE_METHOD_NAME                     = "PMD.SuspiciousHashcodeMethodName";

    /**
     * Field names using all uppercase characters - Sun's Java naming conventions indicating constants - should be
     * declared as final. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     // this is bad, since someone could accidentally
     *     // do PI = 2.71828; which is actually e
     *     // final double PI = 3.16; is ok
     *     double PI = 3.16;
     * }
     * </pre>
     * 
     * @since PMD 2.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String SUSPICIOUS_CONSTANT_FIELD_NAME                      = "PMD.SuspiciousConstantFieldName";

    /**
     * The method name and parameter number are suspiciously close to equals(Object), which can denote an intention to
     * override the equals(Object) method. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public int equals(Object o) {
     *         // oops, this probably was supposed to be boolean equals
     *     }
     * 
     *     public boolean equals(String s) {
     *         // oops, this probably was supposed to be equals(Object)
     *     }
     * 
     *     public boolean equals(Object o1, Object o2) {
     *         // oops, this probably was supposed to be equals(Object)
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String SUSPICIOUS_EQUALS_METHOD_NAME                       = "PMD.SuspiciousEqualsMethodName";

    /**
     * It is somewhat confusing to have a field name matching the declaring class name. This probably means that type
     * and/or field names should be chosen more carefully. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Bar {
     *     int foo; // There is probably a better name that can be used
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String AVOID_FIELD_NAME_MATCHING_TYPE_NAME                 = "PMD.AvoidFieldNameMatchingTypeName";

    /**
     * It can be confusing to have a field name with the same name as a method. While this is permitted, having
     * information (field) and actions (method) is not clear naming. Developers versed in Smalltalk often prefer this
     * approach as the methods denote accessor methods. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     Object bar;
     * 
     *     // bar is data or an action or both?
     *     void bar() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String AVOID_FIELD_NAME_MATCHING_METHOD_NAME               = "PMD.AvoidFieldNameMatchingMethodName";

    /**
     * Detects when a class or interface does not have a package definition. <h2>Example</h2>
     * 
     * <pre>
     * // no package declaration
     * public class ClassInDefaultPackage {
     * }
     * </pre>
     * 
     * @since PMD 3.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String NO_PACKAGE                                          = "PMD.NoPackage";

    /**
     * Detects when a package definition contains uppercase characters. <h2>Example</h2>
     * 
     * <pre>
     * package com.MyCompany; // should be lowercase name
     * </pre>
     * 
     * @since PMD 3.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String PACKAGE_CASE                                        = "PMD.PackageCase";

    /**
     * Detects when a non-field has a name starting with 'm_'. This usually denotes a field and could be confusing. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private int m_foo; // OK
     * 
     *     public void bar(String m_baz) { // Bad
     *         int m_boz = 42; // Bad
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String MISLEADING_VARIABLE_NAME                            = "PMD.MisleadingVariableName";

    /**
     * Methods that return boolean results should be named as predicate statements to denote this. I.e, 'isReady()',
     * 'hasValues()', 'canCommit()', 'willFail()', etc. Avoid the use of the 'get' prefix for these methods. <h2>Example
     * </h2>
     * 
     * <pre>
     * public boolean getFoo(); // bad
     * 
     * public boolean isFoo(); // ok
     * 
     * public boolean getFoo(boolean bar); // ok, unless checkParameterizedMethods=true
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String BOOLEAN_GET_METHOD_NAME                             = "PMD.BooleanGetMethodName";

    /**
     * Classnames with fewer than five characters are not recommended. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String SHORT_CLASS_NAME                                    = "PMD.ShortClassName";

    /**
     * Names for references to generic values should be limited to a single uppercase letter. <h2>Example</h2>
     * 
     * <pre>
     * public interface GenericDao&lt;E extends BaseModel, K extends Serializable&gt; extends BaseDao {
     *     // This is ok...
     * }
     * 
     * public interface GenericDao&lt;E extends BaseModel, K extends Serializable&gt; {
     *     // Also this
     * }
     * 
     * public interface GenericDao&lt;e extends BaseModel, K extends Serializable&gt; {
     *     // 'e' should be an 'E'
     * }
     * 
     * public interface GenericDao&lt;EF extends BaseModel, K extends Serializable&gt; {
     *     // 'EF' is not ok.
     * }
     * 
     * </pre>
     * 
     * @since PMD 4.2.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/naming.html">PMD Naming Rule Set Documentation</a>
     */
    public static final String GENERICS_NAMING                                     = "PMD.GenericsNaming";

    /**
     * A local variable assigned only once can be declared final. <h2>Example</h2>
     * 
     * <pre>
     * public class Bar {
     *     public void foo() {
     *         String txtA = &quot;a&quot;; // if txtA will not be assigned again it is better to do this:
     *         final String txtB = &quot;b&quot;;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String LOCAL_VARIABLE_COULD_BE_FINAL                       = "PMD.LocalVariableCouldBeFinal";

    /**
     * A method argument that is never re-assigned within the method can be declared final. <h2>Example</h2>
     * 
     * <pre>
     * public void foo1(String param) { // do stuff with param never assigning it
     * 
     * }
     * 
     * public void foo2(final String param) { // better, do stuff with param never assigning it
     * 
     * }
     * </pre>
     * 
     * @since PMD 2.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String METHOD_ARGUMENT_COULD_BE_FINAL                      = "PMD.MethodArgumentCouldBeFinal";

    /**
     * New objects created within loops should be checked to see if they can created outside them and reused. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class Something {
     *     public static void main(String as[]) {
     *         for (int i = 0; i &lt; 10; i++) {
     *             Foo f = new Foo(); // Avoid this whenever you can it's really expensive
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_INSTANTIATING_OBJECTS_IN_LOOPS                = "PMD.AvoidInstantiatingObjectsInLoops";

    /**
     * ArrayList is a much better Collection implementation than Vector if thread-safe operation is not required. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class SimpleTest extends TestCase {
     *     public void testX() {
     *         Collection c1 = new Vector();
     *         Collection c2 = new ArrayList(); // achieves the same with much better performance
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String USE_ARRAY_LIST_INSTEAD_OF_VECTOR                    = "PMD.UseArrayListInsteadOfVector";

    /**
     * Since it passes in a literal of length 1, calls to (string).startsWith can be rewritten using (string).charAt(0)
     * at the expense of some readability. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * 
     *     boolean checkIt(String x) {
     *         return x.startsWith(&quot;a&quot;); // suboptimal
     *     }
     * 
     *     boolean fasterCheckIt(String x) {
     *         return x.charAt(0) == 'a'; // faster approach
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String SIMPLIFY_STARTS_WITH                                = "PMD.SimplifyStartsWith";

    /**
     * The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer. If
     * a non-trivial number of these concatenations are being used then the explicit use of a StringBuilder or
     * threadsafe StringBuffer is recommended to avoid this. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         String a;
     *         a = &quot;foo&quot;;
     *         a += &quot; bar&quot;;
     *         // better would be:
     *         // StringBuilder a = new StringBuilder(&quot;foo&quot;);
     *         // a.append(&quot; bar);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String USE_STRING_BUFFER_FOR_STRING_APPENDS                = "PMD.UseStringBufferForStringAppends";

    /**
     * The java.util.Arrays class has a "asList" method that should be used when you want to create a new List from an
     * array of objects. It is faster than executing a loop to copy all the elements of the array one by one. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class Test {
     *     public void foo(Integer[] ints) {
     *         // could just use Arrays.asList(ints)
     *         List l = new ArrayList(10);
     *         for (int i = 0; i &lt; 100; i++) {
     *             l.add(ints[i]);
     *         }
     *         for (int i = 0; i &lt; 100; i++) {
     *             l.add(a[i].toString()); // won't trigger the rule
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String USE_ARRAYS_AS_LIST                                  = "PMD.UseArraysAsList";

    /**
     * Instead of manually copying data between two arrays, use the efficient System.arraycopy method instead. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class Test {
     *   public void bar() {
     *     int[] a = new int[10];
     *     int[] b = new int[10];
     *     for (int i=0;i<10;i++) {
     *       b[i]=a[i];
     *     }
     *   }
     * }
     *      // this will trigger the rule
     *      for (int i=0;i<10;i++) {
     *        b[i]=a[c[i]];
     *      }
     * 
     *   }
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_ARRAY_LOOPS                                   = "PMD.AvoidArrayLoops";

    /**
     * Most wrapper classes provide static conversion methods that avoid the need to create intermediate objects just to
     * create the primitive forms. Using these avoids the cost of creating objects that also need to be
     * garbage-collected later. <h2>Example</h2>
     * 
     * <pre>
     * public int convert(String s) {
     *     int i, i2;
     * 
     *     i = Integer.valueOf(s).intValue(); // this wastes an object
     *     i = Integer.parseInt(s); // this is better
     * 
     *     i2 = Integer.valueOf(i).intValue(); // this wastes an object
     *     i2 = i; // this is better
     * 
     *     String s3 = Integer.valueOf(i2).toString(); // this wastes an object
     *     s3 = Integer.toString(i2); // this is better
     * 
     *     return i2;
     * }
     * </pre>
     * 
     * @since PMD 3.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_WRAPPER_OBJECT_CREATION                 = "PMD.UnnecessaryWrapperObjectCreation";

    /**
     * The conversion of literals to strings by concatenating them with empty strings is inefficient. It is much better
     * to use one of the type-specific toString() methods instead. <h2>Example</h2>
     * 
     * <pre>
     * // inefficient
     * String s = &quot;&quot; + 123;
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String ADD_EMPTY_STRING                                    = "PMD.AddEmptyString";

    /**
     * Java will initialize fields with known default values so any explicit initialization of those same defaults is
     * redundant and results in a larger class file (approximately three additional bytecode instructions per field).
     * <h2>Example</h2>
     * 
     * <pre>
     * public class C {
     *     boolean b     = false; // examples of redundant initializers
     *     byte    by    = 0;
     *     short   s     = 0;
     *     char    c     = 0;
     *     int     i     = 0;
     *     long    l     = 0;
     * 
     *     float   f     = .0f;  // all possible float literals
     *     doable  d     = 0d;   // all possible double literals
     *     Object  o     = null;
     * 
     *     MyClass mca[] = null;
     *     int     i1    = 0, ia1[] = null;
     * 
     *     class Nested {
     *         boolean b = false;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String REDUNDANT_FIELD_INITIALIZER                         = "PMD.RedundantFieldInitializer";

    /**
     * Checks for variables that are defined before they might be used. A reference is deemed to be premature if it is
     * created right before a block of code that doesn't use it that also has the ability to return or throw an
     * exception. <h2>Example</h2>
     * 
     * <pre>
     * public int getLength(String[] strings) {
     * 
     *     int length = 0; // declared prematurely
     * 
     *     if (strings == null || strings.length == 0)
     *         return 0;
     * 
     *     for (String str : strings) {
     *         length += str.length();
     *     }
     * 
     *     return length;
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/optimizations.html">PMD Optimization Rule Set
     *      Documentation</a>
     */
    public static final String PREMATURE_DECLARATION                               = "PMD.PrematureDeclaration";

    /**
     * Catching Throwable errors is not recommended since its scope is very broad. It includes runtime issues such as
     * OutOfMemoryError that should be exposed and managed separately. <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     try {
     *         // do something
     *     } catch (Throwable th) { // should not catch Throwable
     *         th.printStackTrace();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String AVOID_CATCHING_THROWABLE                            = "PMD.AvoidCatchingThrowable";

    /**
     * Methods that declare the generic Exception as a possible throwable are not very helpful since their failure modes
     * are unclear. Use a class derived from RuntimeException or a more specific checked exception. <h2>Example</h2>
     * 
     * <pre>
     * public void foo() throws Exception {
     * }
     * </pre>
     * 
     * @since PMD 1.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String SIGNATURE_DECLARE_THROWS_EXCEPTION                  = "PMD.SignatureDeclareThrowsException";

    /**
     * Using Exceptions as form of flow control is not recommended as they obscure true exceptions when debugging.
     * Either add the necessary validation or use an alternate control structure. <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     try {
     *         try {
     *         } catch (Exception e) {
     *             throw new WrapperException(e);
     *             // this is essentially a GOTO to the WrapperException catch block
     *         }
     *     } catch (WrapperException e) {
     *         // do some more stuff
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String EXCEPTION_AS_FLOW_CONTROL                           = "PMD.ExceptionAsFlowControl";

    /**
     * Code should never throw NullPointerExceptions under normal circumstances. A catch block may hide the original
     * error, causing other, more subtle problems later on. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         try {
     *             // do something
     *         } catch (NullPointerException npe) {
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String AVOID_CATCHING_NPE                                  = "PMD.AvoidCatchingNPE";

    /**
     * Avoid throwing certain exception types. Rather than throw a raw RuntimeException, Throwable, Exception, or Error,
     * use a subclassed exception or error instead. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() throws Exception {
     *         throw new Exception();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String AVOID_THROWING_RAW_EXCEPTION_TYPES                  = "PMD.AvoidThrowingRawExceptionTypes";

    /**
     * Avoid throwing NullPointerExceptions. These are confusing because most people will assume that the virtual
     * machine threw it. Consider using an IllegalArgumentException instead; this will be clearly seen as a
     * programmer-initiated exception. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     void bar() {
     *         throw new NullPointerException();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String AVOID_THROWING_NULL_POINTER_EXCEPTION               = "PMD.AvoidThrowingNullPointerException";

    /**
     * Catch blocks that merely rethrow a caught exception only add to code size and runtime complexity. <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     try {
     *         // do something
     *     } catch (SomeException se) {
     *         throw se;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String AVOID_RETHROWING_EXCEPTION                          = "PMD.AvoidRethrowingException";

    /**
     * Errors are system exceptions. Do not extend them. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo extends Error {
     * }
     * </pre>
     * 
     * @since PMD 4.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String DO_NOT_EXTEND_JAVA_LANG_ERROR                       = "PMD.DoNotExtendJavaLangError";

    /**
     * Throwing exceptions within a 'finally' block is confusing since they may mask other exceptions or code defects.
     * Note: This is a PMD implementation of the Lint4j rule "A throw in a finally block" <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() {
     *         try {
     *             // Here do some stuff
     *         } catch (Exception e) {
     *             // Handling the issue
     *         } finally {
     *             // is this really a good idea ?
     *             throw new Exception();
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String DO_NOT_THROW_EXCEPTION_IN_FINALLY                   = "PMD.DoNotThrowExceptionInFinally";

    /**
     * Catch blocks that merely rethrow a caught exception wrapped inside a new instance of the same type only add to
     * code size and runtime complexity. <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     try {
     *         // do something
     *     } catch (SomeException se) {
     *         // harmless comment
     *         throw new SomeException(se);
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String AVOID_THROWING_NEW_INSTANCE_OF_SAME_EXCEPTION       = "PMD.AvoidThrowingNewInstanceOfSameException";

    /**
     * Avoid catching generic exceptions such as NullPointerException, RuntimeException, Exception in try-catch block.
     * <h2>Example</h2>
     * 
     * <pre>
     * public class PrimitiveType {
     * 
     *     public void downCastPrimitiveType() {
     *         try {
     *             System.out.println(&quot; i [&quot; + i + &quot;]&quot;);
     *         } catch (Exception e) {
     *             e.printStackTrace();
     *         } catch (RuntimeException e) {
     *             e.printStackTrace();
     *         } catch (NullPointerException e) {
     *             e.printStackTrace();
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String AVOID_CATCHING_GENERIC_EXCEPTION                    = "PMD.AvoidCatchingGenericException";

    /**
     * Statements in a catch block that invoke accessors on the exception without using the information only add to code
     * size. Either remove the invocation, or use the return result. <h2>Example</h2>
     * 
     * <pre>
     * public void bar() {
     *     try {
     *         // do something
     *     } catch (SomeException se) {
     *         se.getMessage();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 4.2.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strictexception.html">PMD Strict Exceptions Rule
     *      Set Documentation</a>
     */
    public static final String AVOID_LOSING_EXCEPTION_INFORMATION                  = "PMD.AvoidLosingExceptionInformation";

    /**
     * Code containing duplicate String literals can usually be improved by declaring the String as a constant field.
     * <h2>Example</h2>
     * 
     * <pre>
     * private void bar() {
     *     buz(&quot;Howdy&quot;);
     *     buz(&quot;Howdy&quot;);
     *     buz(&quot;Howdy&quot;);
     *     buz(&quot;Howdy&quot;);
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_DUPLICATE_LITERALS                            = "PMD.AvoidDuplicateLiterals";

    /**
     * Avoid instantiating String objects; this is usually unnecessary since they are immutable and can be safely
     * shared. <h2>Example</h2>
     * 
     * <pre>
     * private String bar = new String(&quot;bar&quot;); // just do a String bar = &quot;bar&quot;;
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String STRING_INSTANTIATION                                = "PMD.StringInstantiation";

    /**
     * Avoid calling toString() on objects already known to be string instances; this is unnecessary. <h2>Example</h2>
     * 
     * <pre>
     * private String baz() {
     *     String bar = &quot;howdy&quot;;
     *     return bar.toString();
     * }
     * </pre>
     * 
     * @since PMD 1.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String STRING_TO_STRING                                    = "PMD.StringToString";

    /**
     * Avoid concatenating non-literals in a StringBuffer constructor or append() since intermediate buffers will need
     * to be be created and destroyed by the JVM. <h2>Example</h2>
     * 
     * <pre>
     * // Avoid this, two buffers are actually being created here
     * StringBuffer sb = new StringBuffer(&quot;tmp = &quot; + System.getProperty(&quot;java.io.tmpdir&quot;));
     * 
     * // do this instead
     * StringBuffer sb = new StringBuffer(&quot;tmp = &quot;);
     * sb.append(System.getProperty(&quot;java.io.tmpdir&quot;));
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String INEFFICIENT_STRING_BUFFERING                        = "PMD.InefficientStringBuffering";

    /**
     * Using equalsIgnoreCase() is faster than using toUpperCase/toLowerCase().equals() <h2>Example</h2>
     * 
     * <pre>
     * boolean answer1 = buz.toUpperCase().equals(&quot;baz&quot;); // should be buz.equalsIgnoreCase(&quot;baz&quot;)
     * </pre>
     * 
     * @since PMD 3.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_CASE_CHANGE                             = "PMD.UnnecessaryCaseChange";

    /**
     * Use StringBuffer.length() to determine StringBuffer length rather than using StringBuffer.toString().equals("")
     * or StringBuffer.toString().length() == ... <h2>Example</h2>
     * 
     * <pre>
     * StringBuffer sb = new StringBuffer();
     * 
     * if (sb.toString().equals(&quot;&quot;)) {
     * } // inefficient
     * 
     * if (sb.length() == 0) {
     * } // preferred
     * </pre>
     * 
     * @since PMD 3.4
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String USE_STRING_BUFFER_LENGTH                            = "PMD.UseStringBufferLength";

    /**
     * Avoid concatenating characters as strings in StringBuffer/StringBuilder.append methods. <h2>Example</h2>
     * 
     * <pre>
     * StringBuffer sb = new StringBuffer();
     * sb.append(&quot;a&quot;); // avoid this
     * 
     * StringBuffer sb = new StringBuffer();
     * sb.append('a'); // use this instead
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String APPEND_CHARACTER_WITH_CHAR                          = "PMD.AppendCharacterWithChar";

    /**
     * Consecutively calling StringBuffer/StringBuilder.append with String literals <h2>Example</h2>
     * 
     * <pre>
     * StringBuffer buf = new StringBuffer();
     * buf.append(&quot;Hello&quot;).append(&quot; &quot;).append(&quot;World&quot;); // poor
     * buf.append(&quot;Hello World&quot;); // good
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String CONSECUTIVE_LITERAL_APPENDS                         = "PMD.ConsecutiveLiteralAppends";

    /**
     * Use String.indexOf(char) when checking for the index of a single character; it executes faster. <h2>Example</h2>
     * 
     * <pre>
     * String s = "hello world";
     *   // avoid this
     * if (s.indexOf("d") {}
     *   // instead do this
     * if (s.indexOf('d') {}
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String USE_INDEX_OF_CHAR                                   = "PMD.UseIndexOfChar";

    /**
     * String.trim().length() is an inefficient way to check if a String is really empty, as it creates a new String
     * object just to check its size. Consider creating a static function that loops through a string, checking
     * Character.isWhitespace() on each character and returning false if a non-whitespace character is found. <h2>
     * Example</h2>
     * 
     * <pre>
     * public void bar(String string) {
     *     if (string != null &amp;&amp; string.trim().size() &gt; 0) {
     *         doSomething();
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String INEFFICIENT_EMPTY_STRING_CHECK                      = "PMD.InefficientEmptyStringCheck";

    /**
     * Failing to pre-size a StringBuffer or StringBuilder properly could cause it to re-size many times during runtime.
     * This rule attempts to determine the total number the characters that are actually passed into
     * StringBuffer.append(), but represents a best guess "worst case" scenario. An empty StringBuffer/StringBuilder
     * constructor initializes the object to 16 characters. This default is assumed if the length of the constructor can
     * not be determined. <h2>Example</h2>
     * 
     * <pre>
     * StringBuffer bad = new StringBuffer();
     * bad.append(&quot;This is a long string that will exceed the default 16 characters&quot;);
     * 
     * StringBuffer good = new StringBuffer(41);
     * good.append(&quot;This is a long string, which is pre-sized&quot;);
     * </pre>
     * 
     * @since PMD 3.6
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String INSUFFICIENT_STRING_BUFFER_DECLARATION              = "PMD.InsufficientStringBufferDeclaration";

    /**
     * No need to call String.valueOf to append to a string; just use the valueOf() argument directly. <h2>Example</h2>
     * 
     * <pre>
     * public String convert(int i) {
     *     String s;
     *     s = &quot;a&quot; + String.valueOf(i); // not required
     *     s = &quot;a&quot; + i; // preferred approach
     *     return s;
     * }
     * </pre>
     * 
     * @since PMD 3.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String USELESS_STRING_VALUE_OF                             = "PMD.UselessStringValueOf";

    /**
     * Individual character values provided as initialization arguments will be converted into integers. This can lead
     * to internal buffer sizes that are larger than expected. Some examples: new StringBuffer() // 16 new
     * StringBuffer(6) // 6 new StringBuffer("hello world") // 11 + 16 = 27 new StringBuffer('A') // chr(A) = 65 new
     * StringBuffer("A") // 1 + 16 = 17 new StringBuilder() // 16 new StringBuilder(6) // 6 new
     * StringBuilder("hello world") // 11 + 16 = 27 new StringBuilder('C') // chr(C) = 67 new StringBuilder("A") // 1 +
     * 16 = 17
     * 
     * @since PMD 3.9
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String STRING_BUFFER_INSTANTIATION_WITH_CHAR               = "PMD.StringBufferInstantiationWithChar";

    /**
     * Using '==' or '!=' to compare strings only works if intern version is used on both sides. Use the equals() method
     * instead. <h2>Example</h2>
     * 
     * <pre>
     * public boolean test(String s) {
     *     if (s == &quot;one&quot;)
     *         return true; // unreliable
     *     if (&quot;two&quot;.equals(s))
     *         return true; // better
     *     return false;
     * }
     * </pre>
     * 
     * @since PMD 4.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String USE_EQUALS_TO_COMPARE_STRINGS                       = "PMD.UseEqualsToCompareStrings";

    /**
     * StringBuffers/StringBuilders can grow considerably, and so may become a source of memory leaks if held within
     * objects with long lifetimes. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private StringBuffer buffer; // potential memory leak as an instance variable;
     * }
     * </pre>
     * 
     * @since PMD 4.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/strings.html">PMD String and StringBuffer Rule Set
     *      Documentation</a>
     */
    public static final String AVOID_STRING_BUFFER_FIELD                           = "PMD.AvoidStringBufferField";

    /**
     * Exposing internal arrays to the caller violates object encapsulation since elements can be removed or replaced
     * outside of the object that owns it. It is safer to return a copy of the array. <h2>Example</h2>
     * 
     * <pre>
     * public class SecureSystem {
     *     UserData[] ud;
     * 
     *     public UserData[] getUserData() {
     *         // Don't return directly the internal array, return a copy
     *         return ud;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/sunsecure.html">PMD Security Code Guidelines Rule
     *      Set Documentation</a>
     */
    public static final String METHOD_RETURNS_INTERNAL_ARRAY                       = "PMD.MethodReturnsInternalArray";

    /**
     * Constructors and methods receiving arrays should clone objects and store the copy. This prevents future changes
     * from the user from affecting the original array. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private String[] x;
     * 
     *     public void foo(String[] param) {
     *         // Don't do this, make a copy of the array at least
     *         this.x = param;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 2.2
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/sunsecure.html">PMD Security Code Guidelines Rule
     *      Set Documentation</a>
     */
    public static final String ARRAY_IS_STORED_DIRECTLY                            = "PMD.ArrayIsStoredDirectly";

    /**
     * Avoid the use temporary objects when converting primitives to Strings. Use the static conversion methods on the
     * wrapper classes instead. <h2>Example</h2>
     * 
     * <pre>
     * public String convert(int x) {
     *     String foo = new Integer(x).toString(); // this wastes an object
     * 
     *     return Integer.toString(x); // preferred approach
     * }
     * </pre>
     * 
     * @since PMD 0.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_CONVERSION_TEMPORARY                    = "PMD.UnnecessaryConversionTemporary";

    /**
     * Avoid the use of unnecessary return statements. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void bar() {
     *         int x = 42;
     *         return;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 1.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_RETURN                                  = "PMD.UnnecessaryReturn";

    /**
     * When a class has the final modifier, all the methods are automatically final and do not need to be tagged as
     * such. <h2>Example</h2>
     * 
     * <pre>
     * public final class Foo {
     *     // This final modifier is not necessary, since the class is final
     *     // and thus, all methods are final
     *     private final void foo() {
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String UNNECESSARY_FINAL_MODIFIER                          = "PMD.UnnecessaryFinalModifier";

    /**
     * The overriding method merely calls the same method defined in a superclass. <h2>Example</h2>
     * 
     * <pre>
     * public void foo(String bar) {
     *     super.foo(bar); // why bother overriding?
     * }
     * 
     * public String foo() {
     *     return super.foo(); // why bother overriding?
     * }
     * 
     * &#064;Id
     * public Long getId() {
     *     return super.getId(); // OK if 'ignoreAnnotations' is false, which is the default behavior
     * }
     * </pre>
     * 
     * @since PMD 3.3
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String USELESS_OVERRIDING_METHOD                           = "PMD.UselessOverridingMethod";

    /**
     * An operation on an Immutable object (String, BigDecimal or BigInteger) won't change the object itself since the
     * result of the operation is a new object. Therefore, ignoring the operation result is an error. <h2>Example</h2>
     * 
     * <pre>
     * class Test {
     *     void method1() {
     *         BigDecimal bd = new BigDecimal(10);
     *         bd.add(new BigDecimal(5)); // this will trigger the rule
     *     }
     * 
     *     void method2() {
     *         BigDecimal bd = new BigDecimal(10);
     *         bd = bd.add(new BigDecimal(5)); // this won't trigger the rule
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String USELESS_OPERATION_ON_IMMUTABLE                      = "PMD.UselessOperationOnImmutable";

    /**
     * After checking an object reference for null, you should invoke equals() on that object rather than passing it to
     * another object's equals() method. <h2>Example</h2>
     * 
     * <pre>
     * public class Test {
     * 
     *     public String method1() {
     *         return &quot;ok&quot;;
     *     }
     * 
     *     public String method2() {
     *         return null;
     *     }
     * 
     *     public void method(String a) {
     *         String b;
     *         // I don't know it method1() can be &quot;null&quot;
     *         // but I know &quot;a&quot; is not null..
     *         // I'd better write a.equals(method1())
     * 
     *         if (a != null &amp;&amp; method1().equals(a)) { // will trigger the rule
     *             // whatever
     *         }
     * 
     *         if (method1().equals(a) &amp;&amp; a != null) { // won't trigger the rule
     *             // whatever
     *         }
     * 
     *         if (a != null &amp;&amp; method1().equals(b)) { // won't trigger the rule
     *             // whatever
     *         }
     * 
     *         if (a != null &amp;&amp; &quot;LITERAL&quot;.equals(a)) { // won't trigger the rule
     *             // whatever
     *         }
     * 
     *         if (a != null &amp;&amp; !a.equals(&quot;go&quot;)) { // won't trigger the rule
     *             a = method2();
     *             if (method1().equals(a)) {
     *                 // whatever
     *             }
     *         }
     *     }
     * }
     * </pre>
     * 
     * @since PMD 3.5
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_NULL_CHECK_IN_EQUALS                         = "PMD.UnusedNullCheckInEquals";

    /**
     * Useless parentheses should be removed. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     * 
     *     private int     _bar1;
     *     private Integer _bar2;
     * 
     *     public void setBar(int n) {
     *         _bar1 = Integer.valueOf((n)); // here
     *         _bar2 = (n); // and here
     *     }
     * 
     * }
     * </pre>
     * 
     * @since PMD 5.0
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unnecessary.html">PMD Unnecessary Rule Set
     *      Documentation</a>
     */
    public static final String USELESS_PARANTHESES                                 = "PMD.UselessParentheses";

    /**
     * Detects when a private field is declared and/or assigned a value, but not used. <h2>Example</h2>
     * 
     * <pre>
     * public class Something {
     *     private static int FOO = 2; // Unused
     *     private int        i   = 5; // Unused
     *     private int        j   = 6;
     * 
     *     public int addOne() {
     *         return j++;
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unusedcode.html">PMD Unused Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_PRIVATE_FIELD                                = "PMD.UnusedPrivateField";

    /**
     * Detects when a local variable is declared and/or assigned, but not used. <h2>Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     public void doSomething() {
     *         int i = 5; // Unused
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.1
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unusedcode.html">PMD Unused Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_LOCAL_VARIABLE                               = "PMD.UnusedLocalVariable";

    /**
     * Unused Private Method detects when a private method is declared but is unused. <h2>Example</h2>
     * 
     * <pre>
     * public class Something {
     *     private void foo() {
     *     } // unused
     * }
     * </pre>
     * 
     * @since PMD 0.7
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unusedcode.html">PMD Unused Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_PRIVATE_METHOD                               = "PMD.UnusedPrivateMethod";

    /**
     * Avoid passing parameters to methods or constructors without actually referencing them in the method body. <h2>
     * Example</h2>
     * 
     * <pre>
     * public class Foo {
     *     private void bar(String howdy) {
     *         // howdy is not used
     *     }
     * }
     * </pre>
     * 
     * @since PMD 0.8
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unusedcode.html">PMD Unused Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_FORMAL_PARAMETER                             = "PMD.UnusedFormalParameter";

    /**
     * Fields in interfaces are automatically public static final, and methods are public abstract. Classes or
     * interfaces nested in an interface are automatically public and static (all nested interfaces are automatically
     * static). For historical reasons, modifiers which are implied by the context are accepted by the compiler, but are
     * superfluous. <h2>Example</h2>
     * 
     * <pre>
     * public interface Foo {
     *     public abstract void bar(); // both abstract and public are ignored by the compiler
     * 
     *     public static final int X = 0; // public, static, and final all ignored
     * 
     *     public static class Bar {
     *     } // public, static ignored
     * 
     *     public static interface Baz {
     *     } // ditto
     * }
     * 
     * public class Bar {
     *     public static interface Baz {
     *     } // static ignored
     * }
     * </pre>
     * 
     * @since PMD 1.02
     * @see <a href="http://pmd.sourceforge.net/pmd-5.0.5/rules/java/unusedcode.html">PMD Unused Rule Set
     *      Documentation</a>
     */
    public static final String UNUSED_MODIFIER                                     = "PMD.UnusedModifier";

    private PMDWarnings() {
        // Constants class
    }

}
