package abstractF;

public class CastleA2 implements Castle {
	@Override
	public Knight getKnight() {
		return new KnightA2();
	}
	@Override
	public Archer getArcher() {
		return new ArcherA2();
	}
}