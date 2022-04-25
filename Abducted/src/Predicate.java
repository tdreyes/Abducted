@FunctionalInterface
public interface Predicate<t> {
	/**
	 *  Evaluates this predicate on the argument
	 * @param T the input argument
	 * @return {@code true} if the input argument matches the predicate
	 * otherwise {@code false}
	 */
	boolean test(t T);
}
