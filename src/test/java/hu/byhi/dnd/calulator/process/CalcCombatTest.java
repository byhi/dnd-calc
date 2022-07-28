package hu.byhi.dnd.calulator.process;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalcCombatTest {

	@Test
	public void getHitAttack() {
		int armor = 18, attck = 18;

		boolean actual = CalcCombat.getAttack( armor, attck);

		assertThat(actual).isTrue();
	}

	@Test
	public void getMissedAttack() {
		int armor = 18, attck = 17;

		boolean actual = CalcCombat.getAttack( armor, attck);

		assertThat(actual).isFalse();
	}

	@Test
	public void getHitAttack_negativcase() {
		int armor = 18, attck = 17;

		boolean actual = CalcCombat.getAttack( armor, attck);

		assertThat(actual).isFalse();
	}

	@Test
	public void getMissedAttack_negativcase() {
		int armor = 16, attck = 17;

		boolean actual = CalcCombat.getAttack( armor, attck);

		assertThat(actual).isTrue();
	}
}