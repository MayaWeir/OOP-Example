// The "Exc1" class.
import java.awt.*;
import hsa.Console;

public class Exc1
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	//Part 1
	Student[] s = new Student [5];
	s [0] = new Student ("Megan");
	s.setMarks (5, 9);
	s.calcAverage ();
	s [1] = new Student ("Maia");
	s.setMarks (2, 6);
	s.calcAverage ();
	s [2] = new Student ("Josh");
	s.setMarks (3, 10);
	s.calcAverage ();
	s [3] = new Student ("Nayaab");
	s.setMarks (4, 6);
	s.calcAverage ();
	s [4] = new Student ("Lily");
	s.setMarks (1, 9);
	s.calcAverage ();

	Car[] ca = new Car [5];
	ca [0] = new Car ("Ford", "GT", 100, 150);
	ca.drive (10);
	ca.gasUp ();
	ca [1] = new Car ("Jeep", "Cherokee", 100, 200);
	ca.drive (20);
	ca.gasUp ();
	ca [2] = new Car ("BMW", "F30", 150, 200);
	ca.drive (30);
	ca.gasUp ();
	ca [3] = new Car ("Mazda", "CX5", 120, 180);
	ca.drive (14);
	ca.gasUp ();
	ca [4] = new Car ("Honda", "Civic", 170, 250);
	ca.drive (17);
	ca.gasUp ();

	House[] h = new House [5];
	h [0] = new House (222, "Bathurst St", "Toronto", "Ontario", "A1B2C3", 300, 2);
	h.displayAddress ();
	h [1] = new House (543, "Avenue Road", "Toronto", "Ontario", "D1E2F3", 300, 2);
	h.displayAddress ();
	h [2] = new House (56, "Yonge St", "Toronto", "Ontario", "G1H2I3", 300, 2);
	h.displayAddress ();
	h [3] = new House (33, "Bombay Ave", "Toronto", "Ontario", "J1K2L3", 300, 2);
	h.displayAddress ();
	h [4] = new House (867, "Sheppard Ave", "Toronto", "Ontario", "M1N2O3", 300, 2);
	h.displayAddress ();

	Animal[] a = new Animal [5];
	a [0] = new Animal ("cow", 100);
	a.feed ("vegetables");
	a.sleep ();
	a [1] = new Animal ("bird", 10);
	a.feed ("seeds");
	a.sleep ();
	a [2] = new Animal ("rabbit", 5);
	a.feed ("vegetables");
	a.sleep ();
	a [3] = new Animal ("dog", 30);
	a.feed ("meat");
	a.sleep ();
	a [4] = new Animal ("elephant", 150);
	a.feed ("meat");
	a.sleep ();

	//Part 2
	Student[] s = new Student [5];
	s [0] = new Student ("Megan");
	s.setMarks (5, 9);
	s.calcAverage ();
	s [1] = new Student ("Maia");
	s.setMarks (2, 6);
	s.calcAverage ();
	s [2] = new Student ("Josh");
	s.setMarks (3, 10);
	s.calcAverage ();
	s [3] = new Student ("Nayaab");
	s.setMarks (4, 6);
	s.calcAverage ();
	s [4] = new Student ("Lily");
	s.setMarks (1, 9);
	s.calcAverage ();
	Student[] temp = new Student [10];
	s [0] = new Student ("Megan");
	s.setMarks (5, 9);
	s.calcAverage ();
	s [1] = new Student ("Maia");
	s.setMarks (2, 6);
	s.calcAverage ();
	s [2] = new Student ("Josh");
	s.setMarks (3, 10);
	s.calcAverage ();
	s [3] = new Student ("Nayaab");
	s.setMarks (4, 6);
	s.calcAverage ();
	s [4] = new Student ("Lily");
	s.setMarks (1, 9);
	s.calcAverage ();
	s [8] = new Student ("Filip");
	s.setMarks (1, 2);
	s.calcAverage ();
	for (int i = 0 ; i < 10 ; i++)
	{
	    s [i].calcAverage ();
	    System.out.println (s [i].message);
	}


	// Place your program here.  'c' is the output console
    } // main method
} // Exc1 class
