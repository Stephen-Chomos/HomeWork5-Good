
public class Breaker {

	public int getDifference(char text, char language) {
		int textInt = 0;
		int langInt = 0;
		int difference;
		switch (text) {
		case 'a':
			textInt = 1;
			break;
		case 'b':
			textInt = 2;
			break;
		case 'c':
			textInt = 3;
			break;
		case 'd':
			textInt = 4;
			break;
		case 'e':
			textInt = 5;
			break;
		case 'f':
			textInt = 6;
			break;
		case 'g':
			textInt = 7;
			break;
		case 'h':
			textInt = 8;
			break;
		case 'i':
			textInt = 9;	
			break;
		case 'j':
			textInt = 10;	
			break;
		case 'k':
			textInt = 11;	
			break;
		case 'l':
			textInt = 12;	
			break;
		case 'm':
			textInt = 13;	
			break;
		case 'n':
			textInt = 14;	
			break;
		case 'o':
			textInt = 15;	
			break;
		case 'p':
			textInt = 16;	
			break;
		case 'q':
			textInt = 17;	
			break;
		case 'r':
			textInt = 18;	
			break;
		case 's':
			textInt = 19;	
			break;
		case 't':
			textInt = 20;			
			break;
		case 'u':
			textInt = 21;	
			break;
		case 'v':
			textInt = 22;		
			break;
		case 'w':
			textInt = 23;		
			break;
		case 'x':
			textInt = 24;		
			break;
		case 'y':
			textInt = 25;		
			break;
		case 'z':
			textInt = 26;		
			break;
		}
		
		switch (language) {
		case 'a':
		langInt = 1;
		break;
	case 'b':
		langInt = 2;
		break;
	case 'c':
		langInt = 3;
		break;
	case 'd':
		langInt = 4;
		break;
	case 'e':
		langInt = 5;
		break;
	case 'f':
		langInt = 6;
		break;
	case 'g':
		langInt = 7;
		break;
	case 'h':
		langInt = 8;
		break;
	case 'i':
		langInt = 9;	
		break;
	case 'j':
		langInt = 10;	
		break;
	case 'k':
		langInt = 11;	
		break;
	case 'l':
		langInt = 12;	
		break;
	case 'm':
		langInt = 13;	
		break;
	case 'n':
		langInt = 14;	
		break;
	case 'o':
		langInt = 15;	
		break;

	case 'p':
		langInt = 16;	
		break;
	case 'q':
		langInt = 17;	
		break;
	case 'r':
		langInt = 18;	
		break;
	case 's':
		langInt = 19;	
		break;
	case 't':
		langInt = 20;			
		break;
	case 'u':
		langInt = 21;	
		break;
	case 'v':
		langInt = 22;		
		break;
	case 'w':
		langInt = 23;		
		break;
	case 'x':
		langInt = 24;		
		break;
	case 'y':
		langInt = 25;		
		break;
	case 'z':
		langInt = 26;		
		break;
	}
		
		if (langInt > textInt) {
			return langInt - textInt;
		}
		else {
			return textInt-langInt;
		}
	}
	
	public int getInt(char text) {
		int textInt = 0;
		switch (text) {
		case 'a':
			textInt = 1;
			break;
		case 'b':
			textInt = 2;
			break;
		case 'c':
			textInt = 3;
			break;
		case 'd':
			textInt = 4;
			break;
		case 'e':
			textInt = 5;
			break;
		case 'f':
			textInt = 6;
			break;
		case 'g':
			textInt = 7;
			break;
		case 'h':
			textInt = 8;
			break;
		case 'i':
			textInt = 9;	
			break;
		case 'j':
			textInt = 10;	
			break;
		case 'k':
			textInt = 11;	
			break;
		case 'l':
			textInt = 12;	
			break;
		case 'm':
			textInt = 13;	
			break;
		case 'n':
			textInt = 14;	
			break;
		case 'o':
			textInt = 15;	
			break;
		case 'p':
			textInt = 16;	
			break;
		case 'q':
			textInt = 17;	
			break;
		case 'r':
			textInt = 18;	
			break;
		case 's':
			textInt = 19;	
			break;
		case 't':
			textInt = 20;			
			break;
		case 'u':
			textInt = 21;	
			break;
		case 'v':
			textInt = 22;		
			break;
		case 'w':
			textInt = 23;		
			break;
		case 'x':
			textInt = 24;		
			break;
		case 'y':
			textInt = 25;		
			break;
		case 'z':
			textInt = 26;		
			break;
		}
		return textInt;
	}
	
	public char backToChar(int text) {
		char out = ' ';
		switch (text) {
		case 1:
			out ='a';
			break;
		case 2:
			out ='b';			
			break;
		case 3:
			out ='c';			
			break;
		case 4:
			out ='d';			
			break;
		case 5:
			out ='e';			
			break;
		case 6:
			out ='f';			
			break;
		case 7:
			out ='g';			
			break;
		case 8:
			out ='h';			
			break;
		case 9:
			out ='i';			
			break;
		case 10:
			out ='j';			
			break;
		case 11:
			out ='k';			
			break;
		case 12:
			out ='l';			
			break;
		case 13:
			out ='m';			
			break;
		case 14:
			out ='n';			
			break;
		case 15:
			out ='o';			
			break;
		case 16:
			out ='p';			
			break;
		case 17:
			out ='q';			
			break;
		case 18:
			out ='r';			
			break;
		case 19:
			out ='s';			
			break;
		case 20:
			out ='t';			
			break;
		case 21:
			out ='u';			
			break;
		case 22:
			out ='v';			
			break;
		case 23:
			out ='w';			
			break;
		case 24:
			out ='x';			
			break;
		case 25:
			out ='y';			
			break;
		case 26:
			out ='z';			
			break;
		}
		return out;
	}
}