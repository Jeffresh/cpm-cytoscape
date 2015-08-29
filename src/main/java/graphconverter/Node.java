package graphconverter;

import java.util.Objects;

/**
 * @author davcem
 * @version 1.0
 * @since 2015-06-12
 * 
 * Class represents a node
 * <p>
 * A node is given by a {@link #id}, a {@link #x} coordinate, a  {@link #y} coordinate, the {@link #cell} to which
 * the {@link Node} belongs, a {@link #parent} and the {@link #area}
 * */
public class Node {
	
	/** The id. */
	private String id;
	
	/** The x. */
	private int x;
	
	/** The y. */
	private int y;
	
	/** The cell. */
	private String cell;
	
	/** The parent of a node. */
	private String parent;
	
	/** The area of the node (could be a cell also). */
	private int area;
	
	/**
	 * Instantiates a new node.
	 *
	 * @param newId the new id
	 * @param newX the new x
	 * @param newY the new y
	 * @param newCell the new cell
	 * @param newParent the parent of the new cell
	 */
	public Node(String newId, int newX, int newY, String newCell, String newParent){
		
		id = newId;
		x = newX;
		y = newY;
		cell = newCell;
		parent = newParent;
		
	}
	
	
	/**
	 * Creates the index from coordinates of this {@link Node}.
	 *
	 * @param i the i
	 * @param j the j
	 * @return the string
	 */
	public static String createIndexFromCoordinates(int i, int j){
		
		return String.valueOf(i) + "-" + String.valueOf(j);
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the cell.
	 *
	 * @return the cell
	 */
	public String getCell() {
		return cell;
	}

	/**
	 * Sets the id.
	 *
	 * @param newId the new id
	 */
	public void setId(String newId) {
		this.id = newId;
	}

	/**
	 * Sets the cell.
	 *
	 * @param cell the new cell
	 */
	public void setCell(String cell) {
		this.cell = cell;
	}
	
	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public String getIndex(){
		
		return String.valueOf(getX()) + "-" + String.valueOf(getY());
	}

	/**
	 * Sets the x.
	 *
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Sets the y.
	 *
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * @return the parent
	 */
	public String getParent() {
		return parent;
	}


	/**
	 * @param parent the parent to set
	 */
	public void setParent(String parent) {
		this.parent = parent;
	}
	
	/**
	 * @return the volume
	 */
	public int getVolume() {
		return area;
	}


	/**
	 * @param volume the volume to set
	 */
	public void setArea(int volume) {
		this.area = volume;
	}


	/**
	 * Function checks if {@link Node} is equal to this {@link Node}.
	 *
	 * @param object the object
	 * 
	 * @return true if {@link Object} is instance of {@link Node} and if the {@link #id}s of the {@link Node}s
	 * are identical and if the {@link #x} and {@link #y} coordinates are identical and if the {@link Node}s
	 * belong to the same {@link #cell}
	 * @return false otherwise
	 */
	@Override
	public boolean equals(Object object){
		
		if(object instanceof Node){
		
			Node node = (Node) object;
			
			if(this.getId().equals(node.getId()) && this.getX() == node.getX() 
					&& this.getX() == node.getX() 
					&& this.getCell() == node.getCell()){
	        
	                return true;
	        }	
		}
		
		return false;
	}
	
	/** Function returns the hashCode for given {@link Node}
	 * 
	 * @return hashCode of given {@link Node} which is generated by {@link Objects.hashCode()}
	 */
	@Override
    public int hashCode() {
        
		return Objects.hash(x, y);
    }
}