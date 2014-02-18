package com.common.enginnering.model.scale;

/**
 * La enumeración que define el estado en el que vamos a tener los extremos de dicho intervalo para ver si estos son abiertos o cerrados.
 * 
 * <ul>
 * <li>{@link Extreme#OPEN}</li>
 * <li>{@link Extreme#CLOSE}</li>
 * </ul>
 * 
 * @since 05/02/2014
 * @author Guillermo Mazzali
 * @version 1.0
 */
public enum Extreme {

	/**
	 * Representa un extremo abierto de un intervalo.
	 */
	OPEN('(', ')'), 
	/**
	 * Representa un extremo cerrado de un intervalo.
	 */
	CLOSE('[', ']');

	/**
	 * El caracter izquierdo de un intervalo.
	 */
	private Character left;
	/**
	 * El caracter derecho de un intervalo.
	 */
	private Character right;

	/**
	 * El constructor de un extremo.
	 * 
	 * @param left
	 *            El simbolo del lado izquierdo.
	 * @param right
	 *            El simbolo del lado derecho.
	 */
	private Extreme(Character left, Character right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * Retorna el simbolo del lado del intervalo que corresponde con lo siguiente:
	 * 
	 * <ul>
	 * <li><b>0:</b> simbolo izquierdo</li>
	 * <li><b>1:</b> simbolo derecho</li>
	 * <li><b>Otro valor:</b> 'X'</li>
	 * </ul>
	 * 
	 * @param side
	 *            El valor que nos permite saber que simbolo recuperar.
	 * @return El simbolo que corresponde con el lado del parámetro recibido.
	 */
	public Character getCharacter(int side) {
		if (side == 0) {
			return this.left;
		} else if (side == 1) {
			return this.right;
		} else {
			return 'X';
		}
	}
}