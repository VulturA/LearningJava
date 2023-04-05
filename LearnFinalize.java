package exercice;


class FDemo {

//
	int x;

//The constructor FDemo defines one parameter called i, which is used to initialize the instance variable x
	FDemo(int i) {
		x = i;
	}

	// called when object is recycled
	public void finalize() {

		System.out.println("Finalizing " + x);

	}

	// generates an object that is immediately destroyed

	void generator(int i) {
		FDemo o = new FDemo(i);

	}
}


public class LearnFinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int count;
   FDemo ob = new FDemo(0);
   System.out.println(ob);
  
   // Generating a large number of objects;
   //at some point, garbage collection will occur
   for (count=1; count < 50; count++)
	   ob.generator(count);
   
	//ob.finalize();

   
   
	}

}
