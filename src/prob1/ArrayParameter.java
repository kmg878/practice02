package prob1;

public class ArrayParameter {

	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		printCharArray(c); // 원래 배열 원소 출력
		replaceSpace(c); // 공백 문자 바꾸기
		printCharArray(c); // 수정된 배열 원소 출력
	}

	static void replaceSpace( char a[] ) {
		int length=a.length;
		for(int i=0;i<length;i++){
			if(a[i]==' '){
				a[i]=',';
			}
			System.out.print(a[i]);
			}
		}
	

	static void printCharArray( char a[] ) {
		int length=a.length;
		for(int i=0;i<length;i++){
		System.out.print(a[i]);
		}
		
		}
		
		
		
	}

