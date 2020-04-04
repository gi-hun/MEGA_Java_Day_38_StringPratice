package day_38;

public class StringPratice2 {
	public static void main(String[] args) {
		String data = "10001/��ö��/600\n";
		data += "10002/�̿���/800\n";
		data += "10001/��ö��/1400\n";
		data += "10003/���缮/780\n";
		data += "10002/�̿���/950\n";
		data += "10004/�ڸ��/330\n";
		data += "10001/��ö��/670\n";
		data += "10003/���缮/3300\n";
		data += "10002/�̿���/200\n";
		data += "10004/�ڸ��/6800\n";
		data = data.substring(0 , data.length()-1); // ������ �ۻ��� 
		System.out.println(data);
		System.out.println("=====================");
		String [] tokens = data.split("\n");
		int totalSize = tokens.length;
		
		int numList [] = new int[totalSize];
		String nameList [] = new String[totalSize];
		int priceList[] = new int[totalSize];
		
		for(int i = 0; i < totalSize; i++) 
		{
			String values[] = tokens[i].split("/");
			numList[i] = Integer.parseInt(values[0]);
			nameList[i] = values[1];
			priceList[i] = Integer.parseInt(values[2]);
		}
		
		System.out.println("num" + "" + "   name" + "" + " price");
		for(int i = 0; i < totalSize; i++) 
		{
			System.out.println(numList[i] + " " + nameList[i] + " " + priceList[i]);
		}
		System.out.println("=====================");
		
		// ����1) �� ������ ��  ������ ȸ���� ������ �������������� ����� �����̴�.
		//		 �����͸� �Ʒ��� ���� ��� �Ͻÿ� (�� ȸ���� ���� ���� )	
		/*
		  =====================
			10001 ��ö�� 2670
			10002 �̿��� 1950
			10003 ���缮 4080
			10004 �ڸ�� 7130
		   =====================		  
		 */
		
		int[] num = new int[totalSize];
		String[] name = new String[totalSize];
		
		int count=0;
		System.out.println("totalSize="+totalSize);
		for(int i=0;i<totalSize;i++)
		{
			int check=0;
			System.out.println("I:"+i);
			for(int j=0;j<i;j++)
			{
				System.out.println("J:"+j);
				if(num[j]==numList[i])
				{
					System.out.println("i:"+i);
					System.out.println("j:"+j);
					System.out.println("num[j]:"+num[j]);
					check=1;
				}
			}
			System.out.println("-----------------");
			if(check==0)
			{
				num[count]=numList[i];
				name[count]=nameList[i];
				count++;
			}
		}
		
		for(int i = 0;i<count;i++)
		{
			System.out.println(num[i] + " " +name[i]);
		}
		System.out.println("=====================");
		
		int total[] = new int[totalSize];
		
		for(int i=0;i<totalSize;i++)
		{
			for(int j=0;j<count;j++)
			{
				if(num[j]==numList[i])
				{
					total[j] += priceList[i];
				}
			}
		}
		
		for(int i=0;i<count;i++)
		{
			System.out.println(num[i]+" "+name[i]+" "+total[i]);
		}
	}
}