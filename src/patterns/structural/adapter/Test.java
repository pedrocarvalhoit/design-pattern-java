package patterns.structural.adapter;

public class Test {
	
	public static void main(String[] args) {
		
		RoundHole hole = new RoundHole(7);
		RoundPeg rpeg = new RoundPeg(7);
		
		if(hole.fits(rpeg)) {
			System.out.println("Roud peg fits roud hole");
		}
		
		SquarePeg smallSquarePeg = new SquarePeg(4);
		SquarePeg bigSquarePeg = new SquarePeg(40);
		
		SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(bigSquarePeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg fits round hole .");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg  does not fit into round hole -");
        }
		
	}
	
}
