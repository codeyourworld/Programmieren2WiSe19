package shoppingListMvc;

/**
 * Represents a Pair of two Objects. It can be used for return two values.
 * @author Stephi
 *
 * @param <L> Left part of a pair
 * @param <R> Right part of a pair
 */
public class Pair<L,R> {

	  private final L left;
	  private final R right;

	  /**
	   * Creates a pair of two objects. 
	   * @param left part of the pair
	   * @param right part of the pair
	   */
	  public Pair(L left, R right) {
	    this.left = left;
	    this.right = right;
	  }

	  /**
	   * Returns the left part of the pair
	   * @return left
	   */
	  public L getLeft() { 
		  return left; 
	  }
	  
	  /**
	   * Returns the right part of the pair
	   * @return right
	   */
	  public R getRight() { 
		  return right; 
	  }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Pair)) {
			return false;
		}

		@SuppressWarnings("unchecked")
		Pair<L,R> other = (Pair<L,R>) obj;
		if (left == null) {
			if (other.left != null) {
				return false;
			}
		} else if (!left.equals(other.left)) {
			return false;
		}
		if (right == null) {
			if (other.right != null) {
				return false;
			}
		} else if (!right.equals(other.right)) {
			return false;
		}
		return true;
	}


	  

	}