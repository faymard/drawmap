package drawmap.model;

public interface Graph {
	/**
	 * @return the number of vertices in <code>this</code>
	 */
	public abstract int getNbVertices();

	/**
	 * @param i
	 * @param j
	 * @return the cost of arc (i,j) if (i,j) is an arc; -1 otherwise
	 */
	public abstract double getCost(Long i, Long j);

	/**
	 * @param i
	 * @param j
	 * @return true if <code>(i,j)</code> is an arc of <code>this</code>
	 */
	public abstract boolean isArc(Long i, Long j);

}
