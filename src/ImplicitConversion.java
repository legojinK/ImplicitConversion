
public class ImplicitConversion {

	public static void main(String[] args) {
		byte bnum=10;
		int num= bnum;

		// 형변환 더 적은 수에서 더 큰 수로
		// bNum은 1바이트 > int는 4바이트

		System.out.println(num);

		long lnum = 10;
		// 10이라는 수는 리터럴에 4바이트로 저장되어있지만 자연스러운 형변환이 일어남

		float fnum = lnum;
		// fNum 4바이트,lNum 8바이트이지만 더 정밀한 수>자연스러운 형변환
		System.out.println(fnum);

		double dnum = fnum + num;
		// fNum + num에서 num이 자연스럽게 float로 형변환이 일어남 >double로 형변환이 일어남

		System.out.println(dnum);
		
		int inum=1000;
		byte bNum =(byte)inum;
		System.out.println(bNum);
		
		//byte의 데이터는 1바이트를 쓰고 256개의 데이터를 표현하고 -128부터 +127까지 표현을 함
		//1000이라는 숫자를 표현할수 없음 일부가 잘리게됨 > 데이터가 유실되게 된다
		
		
		double dNum = 3.14;
		inum = (int)dNum;
		
		System.out.println(inum);
		
		float fnum1=0.9F;
		int num1 = (int)dNum + (int)fnum1;
		int num2 =(int)(dNum + fnum1);
		System.out.println(num1);
		System.out.println(num2);
	} 

}
