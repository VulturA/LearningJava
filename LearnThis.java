


package exercice;

//Bellow we have a program that creates a class called Pwr that computes the result of a number raised in some integer power
//The Java sytnax permits the name of a parameter or a local variable to be the same as the name of  an instance variable
class Pwr { 
	double b;
	int e;
	double val;
	Pwr (double b, int e) {
		
	//b=base;
		
		//b from this.b refers to the b instance variable, not the parameter
		this.b = b;
	
	//e=exp;
		//e from this.e refers to the b instance variable, not the parameter
		this.e = e;
	
	val =1;
		
	
	
	//we have here two variables b and e (parameters defined by the constructors), which are used to initialize the instance variable b and e 
	
	//if exp == 0 then we will return the initial value of the base and val
	if (e==0 ) return;
	//if e > 0 then we will enter the for loop and we will iterate for each e, decrementing it
	//if e =3 and base=5 then val=1*5, then val=5*5 and then val = 25*5

	for ( ; e>0; e--)
		//System.out.println(val + "  cici");
		val = val * b;
		
}
//Here we have a function that will return the value of val
double get_pwr() {
	
	return val;
	
	
}


}

public class LearnThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//when the lignes bellow will be executed, the values from paranheses will be pased to the paramethers of the Pwr constructor, which are then assigned 
		//to the instance variables b and e
 Pwr x = new Pwr(4.0, 0);
 Pwr y = new Pwr (2.5, 1);
 Pwr z = new Pwr (5.0, 3);
 System.out.println (x.b + " raised to the " + x.e + " power is " + x.get_pwr() );
 System.out.println (y.b + " raised to the " + y.e + " power is " + y.get_pwr() );
 System.out.println (z.b + " raised to the " + z.e + " power is " + z.get_pwr() );
	}

}
