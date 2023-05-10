package tw.Jason.tools;

public class Jason18 {
	private int x, y;
	public Jason18(String x, String y) throws Exception {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}
	public int plus() {
		return x + y;
	}
}
