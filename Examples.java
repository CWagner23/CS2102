import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

	public Examples(){}

	Dillo babyDillo = new Dillo(8, false);
	Dillo adultDillo = new Dillo(24, false);
	Dillo hugeDeadDillo = new Dillo(65, true);
	Boa billy = new Boa("Billy", 32, "ferns");
	Boa trixie = new Boa("Trixie", 8, "apples");
	Boa ethan = new Boa("Ethan", 10, "people");

	Shark noInputShark = new Shark();
	Shark jaws = new Shark(1000);
	Shark freddie = new Shark(400, 5);
	Shark joe = new Shark(100, 0);
	Shark jason = new Shark(400, 100);

	Fish bass = new Fish(10, 4.8);
	Fish salmon = new Fish(4, 6.7);
	Fish grouper = new Fish(13, 5.4);
	
	
	@Test
	public void checkSmallFish(){
		assertTrue(salmon.isNormalSize());
	}
	
	@Test
	public void checkLargerFish(){
		assertTrue(bass.isNormalSize());
	}
	
	@Test
	public void checkShark(){
		assertTrue(freddie.isNormalSize());
	}

	@Test
	public void checkDangerousShark(){
		assertTrue(freddie.isDangerToPeople());
	}

	@Test
	public void checkFriendlyShark(){
		assertFalse(joe.isDangerToPeople());
	}
	
	@Test
	public void checkNoInputShark(){
		assertTrue(noInputShark.isDangerToPeople());
	}
	
	@Test
	public void checkOneInputShark(){
		assertTrue(jaws.isDangerToPeople());
	}
	
	@Test
	public void test(){
		assertTrue((new Shark()).isDangerToPeople());
	}
	
	@Test
	public void checkFishDanger(){
		assertFalse(salmon.isDangerToPeople());
	}
	
	@Test
	public void checkDangerousBoa(){
		assertTrue(ethan.isDangerToPeople());
	}

	@Test
	public void checkFriendlyBoa(){
		assertFalse(billy.isDangerToPeople());
	}
	
	@Test 
	public void checkDillo(){
		assertFalse(babyDillo.isDangerToPeople());
	}
	
	@Test
	public void checkDillo2(){
		assertFalse(babyDillo.isDangerToPeople());
	}
	
}
