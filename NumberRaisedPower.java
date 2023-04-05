package exercice;

// Bellow we have a program that creates a class called Pwr that computes the result of a number raised in some integer power
class Pwrn { 
	double b;
	int e;
	double val;
	Pwrn (double base, int exp) {
	b=base;
	e=exp;
	
	val =1;
	//we have here two variables base and exp (parameters defined by the constructors), which are used to initialize the instance variable b and e 
	
	System.out.println(exp);
	//if exp == 0 then we will return the initial value of the base and val
	if (exp==0 ) return;
	//if exp > 0 then we will enter the for loop and we will iterate for each exp, decrementing it
	//if exp =3 and base=5 then val=1*5, then val=5*5 and then val = 25*5
	System.out.println(exp);
	for ( ; exp>0; exp--)
		//System.out.println(val + "  cici");
		val = val * base;
		System.out.println(val + "  calcul");
}
//Here we have a function that will return the value of val
double get_pwr() {
	System.out.println(val + "  calculare");
	return val;
	
	
}


}

public class NumberRaisedPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//when the lignes bellow will be executed, the values from paranheses will be pased to the paramethers of the Pwr constructor, which are then assigned 
		//to the instance variables b and e
    Pwrn x = new Pwrn(4.0, 0);
    Pwrn y = new Pwrn (2.5, 1);
    Pwrn z = new Pwrn (5.0, 3);
    System.out.println (x.b + " raised to the " + x.e + " power is " + x.get_pwr() );
    System.out.println (y.b + " raised to the " + y.e + " power is " + y.get_pwr() );
    System.out.println (z.b + " raised to the " + z.e + " power is " + z.get_pwr() );
	}

}
