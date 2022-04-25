
@FunctionalInterface
public interface Consumer<t> {
	/**
	 * Performs this operation on the given argument
	 * 
	 * @param T the input argument
	 */
	void accept(t T);
}