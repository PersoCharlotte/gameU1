import java.util.HashMap;
import java.util.Map;

/**
 * Class Room - a room in an adventure game.
 *
 * A "Room" represents one location in the scenery of the game. It is connected
 * to other rooms via exits. The exits are labelled north, east, south, west.
 * For each direction, the room stores a reference to the neighboring room, or
 * null if there is no exit in that direction.
 * 
 */
public class Room {

	public String description;

	/*
	 * public Room northExit; public Room southExit; public Room eastExit; public
	 * Room westExit;
	 */

	private HashMap<String, Room> exits;

	/**
	 * Create a room described "description". Initially, it has no exits.
	 * "description" is something like "a kitchen" or "an open court yard".
	 * 
	 * @param description
	 *            The room's description.
	 */
	public Room(String description) {
		this.description = description;
		this.exits = new HashMap<>();

	}

	/**
	 * Define the exits of this room. Every direction either leads to another room
	 * or is null (no exit there).
	 * 
	 * @param north
	 *            The north exit.
	 * @param east
	 *            The east east.
	 * @param south
	 *            The south exit.
	 * @param west
	 *            The west exit.
	 */
	/*
	 * public void setExits(Room north, Room east, Room south, Room west) { if(north
	 * != null) northExit = north; if(east != null) eastExit = east; if(south !=
	 * null) southExit = south; if(west != null) westExit = west; }
	 */

	/**
	 * Ajouter une methode getExit (String direction) qui prend en parametre une
	 * chaine de caracteres representant la direction et qui retourne un objet Room
	 * (la sortie dans cette direction).
	 * 
	 * @param direction
	 * @return rep la sortie dans cette direction
	 */
	public Room getExits(String direction) {
		Room rep = null;
		if (exits.containsKey(direction)) {
			rep = exits.get(direction);
		}

		return rep;

	}

	/**
	 * Ajouter une methode setExit(String direction, Room neighbor) qui prend deux
	 * parametres : une chaine de caracteres pour la direction et un objet de type
	 * Room (neighbor) qui est la piece voisine dans cette direction et qui ajoute à
	 * l'objet exits de type HashMap une entree.
	 * 
	 * @param direction
	 * @param neighbor
	 */
	public void setExit(String direction, Room neighbor) {
		exits.put(direction, neighbor);
	}

	/**
	 * @return The description of the room.
	 */
	public String getDescription() {
		return description;
	}
	
	public String getLongDescription() {
		return "you are "+ description +" sortie(s):"+ this.getExitString();
	}

	public String getExitString() {
		String rep="";
		for (Map.Entry<String, Room> entry : exits.entrySet()) {
			rep+=" "+(entry.getKey() );
		}
		return rep;
	}

}
