import java.util.*;

public class Arraystuff {
    /*-------------------- Instance Variables --------------------*/

    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment 
    */
    public final int final_example = 123;

    /*-------------------- Constructors --------------------*/
    
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    /*-------------------- Methods --------------------*/
    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }
    public int find(int n){
	int result = -1;
	int counter = 0;
	while (counter < a.length - 1 && a[counter] != n){
	    counter = counter + 1;
	    if(a[counter] == n){
	    result = counter;
	    }
	}
	return result;
    }
    public int maxVal(){
	int result;
	result = a[0];
	for (int counter = 1;counter < a.length - 1;counter = counter + 1){
	    if(a[counter] > result){
		result = a[counter];
	    }
	}
	return result;
    }
    public int sum67(int[] nums) {
	int sum = 0;
	boolean add = true;
	for(int counter=0;counter < nums.length; counter++){
	    if (nums[counter] == 6){
		add = false;}
	    if(add == true){
		sum = sum + nums[counter];
	    }
	    if(nums[counter] == 7){
		add = true;
	    }
	}
	return sum;
    }
    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.find(100));
	System.out.println(as.maxVal());
	
    }
}
