public class Shapes {

    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
    public String tri1(int h){
	int counter = 0;
	String output = "";
	while (counter < h){
	    counter = counter + 1;
	    int counter2 = 0;
	    while (counter2 < counter){
		output = output + "*";
		counter2 = counter2 + 1;}
	    output = output + "\n";}
	return output;
    }
    public String tri2(int h){
	int counter = 0;
	int counter2;
	int counter3 = 0;
	String output = "";
	while (counter < h){
	    counter = counter + 1;
	    counter2 = h - counter;
	    counter3 = h - counter2;
	    while (counter2 > 0){
		output = output + " ";
		counter2 = counter2 - 1;}
	    while(counter3 > 0){
		output = output + "*";
		counter3 = counter3 - 1;}
	    output = output + "\n";
}
	return output;
	    
    }
}
