
public class ImplicitConversion {

	public static void main(String[] args) {
		byte bnum=10;
		int num= bnum;

		// ����ȯ �� ���� ������ �� ū ����
		// bNum�� 1����Ʈ > int�� 4����Ʈ

		System.out.println(num);

		long lnum = 10;
		// 10�̶�� ���� ���ͷ��� 4����Ʈ�� ����Ǿ������� �ڿ������� ����ȯ�� �Ͼ

		float fnum = lnum;
		// fNum 4����Ʈ,lNum 8����Ʈ������ �� ������ ��>�ڿ������� ����ȯ
		System.out.println(fnum);

		double dnum = fnum + num;
		// fNum + num���� num�� �ڿ������� float�� ����ȯ�� �Ͼ >double�� ����ȯ�� �Ͼ

		System.out.println(dnum);
		
		int inum=1000;
		byte bNum =(byte)inum;
		System.out.println(bNum);
		
		//byte�� �����ʹ� 1����Ʈ�� ���� 256���� �����͸� ǥ���ϰ� -128���� +127���� ǥ���� ��
		//1000�̶�� ���ڸ� ǥ���Ҽ� ���� �Ϻΰ� �߸��Ե� > �����Ͱ� ���ǵǰ� �ȴ�
		
		
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
