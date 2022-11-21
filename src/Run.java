import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
import java.math.BigInteger;

public class Run {
	String file;
	String backup;
	Letter letters[] = new Letter[26];
	int size=0;
	int top=0;
	int second = 0;
	char tester= ' ';
	int numUnique=0;
	int numTotal=0;
	Breaker obj = new Breaker();
	int difference;
	ArrayList<String> list = new ArrayList<String>();
	Input inputs[] = new Input[4];
	int personal;
	
	public Run() {}
	
	public void runner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the cypher Breaker!");
		System.out.println("Are you inputting a text file or a numerical code conversation. 1 for text; 2 for conversation");
		int input = scanner.nextInt();
		
		switch (input) {
		case 1:
		System.out.print("Please input the path to your file:");
	    String fileName = "C:\\\\Users\\\\schom\\\\eclipse-workspace\\\\Homework5\\\\src\\\\Input.txt";//scanner.next();
	    boolean done = false;
	    done = load(fileName);
	    while (done == false) {
	    	System.out.print("Incorrect file path. Please input the correct file path:");
		    fileName = scanner.next();
		    System.out.println();
		    done = load(fileName);
	    }
	    
	    parse();
	    getStats();
	    sort(letters, numUnique);
	    str();
	    tester = letters[0].getLet();
	    difference = obj.getDifference('i', tester);
	    personal = obj.getInt('i');
	    System.out.println(difference);
	    System.out.println(file);
	    breakIt();
	    System.out.println();
	    difference = obj.getDifference('e', tester);
	    System.out.println("e" + difference);
	    System.out.println(file);
	    breakIt();
	    break;
		case 2:
			String gInt = "5";
			String pInt = "3267000013";
			String AInt = "1958258942";
			String BInt = "670001116";
			System.out.println("Please input g: ");
			gInt = scanner.next();
			System.out.println("Please input p: ");
			pInt = scanner.next();
			System.out.println("Please input A: ");
			AInt = scanner.next();
			System.out.println("Please input B: ");
			BInt = scanner.next();
			int b = 0;
			int a = 0;
			int powerI;
			int count = 1;
			BigInteger g = new BigInteger(gInt);
			BigInteger p = new BigInteger(pInt);
			BigInteger A = new BigInteger(AInt);
			BigInteger B = new BigInteger(BInt);
			BigInteger p1 = p.subtract(BigInteger.ONE);
			BigInteger i = new BigInteger("0");
			BigInteger aB = new BigInteger("0");
			BigInteger bB = new BigInteger("0");
			BigInteger power = new BigInteger("1");
			for (BigInteger bi = BigInteger.valueOf(0); bi.compareTo(p1) == -1; bi = bi.add(BigInteger.ONE) ) {
				for (BigInteger ji = BigInteger.valueOf(0); ji.compareTo(bi) == -1; ji = ji.add(BigInteger.ONE) ) {
					power = power.multiply(g);
				}
				i = g.mod(p);
				if (i.compareTo(B) == 0) {
					System.out.println("Found You");
					bB = i;
					break;
				}
			}
			
			
		    //finding shared secret
			BigInteger bBigInt = bB;
		    BigInteger s = A.modPow(bBigInt, p);
		    System.out.println();
		    System.out.println("Their shared secret is: " + s);
		    
		    
		    
			break;
		default:
			System.out.println("Incorrect input. Restart to try again");
			break;
		}
	}
	
	public boolean load(String fileName) {
		File myObj = new File(fileName);
		Scanner myReader = null;
		try {
			myReader = new Scanner(myObj);
		} catch (FileNotFoundException e3) {
			return false;
		}
		
		file = myReader.nextLine();
		size = file.length();
		myReader.close();
		System.out.println("File Read successful");
		return true;
	}
	
	public boolean load2(String fileName) {
		File myObj = new File(fileName);
		Scanner myReader = null;
		try {
			myReader = new Scanner(myObj);
		} catch (FileNotFoundException e3) {
			return false;
		}
		
		while (myReader.hasNextLine()) {
		file = myReader.nextLine();
		list.add(file);
		}
		myReader.close();
		System.out.println("File Read successful");
		return true;
	}
	
	public void parse() {
		backup = file;
		boolean check = false;
		for(int i = 0; i < size; ++i) {
			tester = file.charAt(i);
			if (tester != ' ') {
				for (int j =0; j < numUnique; ++j) {
					if (tester == letters[j].getLet()) {
						letters[j].addCount();
						++numTotal;
						check = true;
					}
				}
				if(check == false) {
					letters[numUnique] = new Letter(tester);
					++numUnique;
					++numTotal;
				}
			}
			check = false;
		}
		System.out.println("Parse complete");
	}
	
	public void parse2() {
		
	}
	
	public void getStats() {
		for (int i = 0; i < numUnique; ++i) {
			letters[i].setFreq(numTotal);
		}
	}
	
	public void sort(Letter arr[], int n) {
		if (n <= 1) {
            return; 
        }
		sort(arr,  n-1);
		
		Letter last = arr[n-1];
		double laster = arr[n-1].getFreq();
		int j = n - 2;
		while (j >= 0 && arr[j].getFreq() < laster) { 
            arr[j+1] = arr[j];               
            j--; 
        } 
        arr[j+1] = last; 
	}
	
	public void str() {
		for (int i = 0; i < numUnique; ++i) {
			letters[i].print();
		}
	}
	
	public void breakIt() {
		int testInt = 0;
		int setInt = 0;
		int spotInt = 0;
		char setChar = ' ';
		for(int i = 0; i < size; ++i) {
			tester = file.charAt(i);
			if (tester != ' ') {
				testInt = obj.getInt(tester);
				if (testInt < 26 - difference) {
					setInt = testInt + difference;
					setChar = obj.backToChar(setInt);
					System.out.print(setChar);
				}
				else {
					spotInt = 26 - testInt;
					setInt = difference - spotInt;
					setChar = obj.backToChar(setInt);
					System.out.print(setChar);
				}
			}
			else {
				System.out.print(" ");
			}
		
	}
		System.out.println();
		System.out.println("Cypher breaker complete");
	}
		
		
}