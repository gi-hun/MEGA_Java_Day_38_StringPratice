package day_38;

public class stringPratice {
	public static void main(String[] args) {
		String nameData = "";
		nameData+=	"100001/�̸���";nameData += "\n";		
		nameData += "100002/�̿���";nameData += "\n";
		nameData += "100003/���缮";nameData += "\n";
		nameData += "100004/�ڸ��";nameData += "\n";
		nameData += "100005/�ֿ���";nameData += "\n";
		nameData += "100006/�ں���";
		
		System.out.println("<nameData>");
		System.out.println(nameData);
		System.out.println();
		
		String[] temp_name = nameData.split("\n");
		int name_size = temp_name.length;
	
		String[] nd_id = new String[name_size];
		String[] nd_name = new String[name_size];
		for(int i=0;i<name_size;i++)
		{
			String[] value = temp_name[i].split("/");
			nd_id[i] = value[0];		//nameData�� id������ ����ִ�.
			nd_name[i] = value[1];		//nameData�� name������ ����ִ�.
			
			/*id_name[i*2] = temp_name[i].split("/");��  ���� ���� ������?
			 *id_name[i*2]�� �ּҰ��ȿ� '���� ����Ų��
			 *temp_name[i].split("/")�� �ּҰ��� ����Ų��. ������ ����+new�� �����ִ�.
			 *����, '��=�ּҰ�'�̶� ������ �� ���̴�.
			 **/
		}
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
		
		System.out.println("<moneyData>");
		System.out.println(moneyData);
		System.out.println();
		
		String[] temp_money = moneyData.split("\n");
		int money_size = temp_money.length;
		
		String[] md_id = new String[money_size];
		String[] md_money = new String[money_size];
		for(int i=0;i<money_size;i++)
		{
			String[] value = temp_money[i].split("/");
			md_id[i] = value[0];			//moneyData�� id������ ����ִ�		
			md_money[i] = value[1];			//moneyData�� money������ ����ִ�
		}
		// ����) moneyData �� nameData �� �����ؼ� �Ʒ��Ͱ��� ��������
		
		/* * 100001/�̸���/600
		 * 100003/���缮/7000
		 * 100001/�̸���/100
		 * 100002/�̿���/400
		 * 100001/�̸���/600
		 * 100004/�ڸ��/900
		 * 100001/�̸���/130
		 * 100003/���缮/200
		 * 100002/�̿���/700
		 * 100002/�̿���/900
		 * 100004/�ڸ��/800
		 * nd_id /nd_name/md_money*/
		 
		//nd_id�� md_id�� ������ <nd_id + nd_name + md_money> ������� ���
		
		System.out.println("<Name+Money Data>");
		for(int i=0;i<money_size;i++)
		{
			for(int j=0;j<name_size;j++)
			{
				if(nd_id[j].equals(md_id[i]))
				{
					System.out.println(nd_id[j]+"/"+nd_name[j]+"/"+md_money[i]);
				}
			}
		}
		System.out.println();
		

	}
}