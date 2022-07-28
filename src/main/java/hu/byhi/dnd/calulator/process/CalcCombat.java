package hu.byhi.dnd.calulator.process;

public class CalcCombat {

	public static boolean getAttack(int armor, int attck) {
		return armor <= attck;
	}
}
