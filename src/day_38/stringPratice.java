package day_38;

public class stringPratice {
	public static void main(String[] args) {
		String nameData = "";
		nameData+=	"100001/이만수";nameData += "\n";		
		nameData += "100002/이영희";nameData += "\n";
		nameData += "100003/유재석";nameData += "\n";
		nameData += "100004/박명수";nameData += "\n";
		nameData += "100005/최여정";nameData += "\n";
		nameData += "100006/박병욱";
		
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
			nd_id[i] = value[0];		//nameData의 id정보가 들어있다.
			nd_name[i] = value[1];		//nameData의 name정보가 들어있다.
			
			/*id_name[i*2] = temp_name[i].split("/");가  에러 나는 이유는?
			 *id_name[i*2]은 주소값안에 '값을 가리킨다
			 *temp_name[i].split("/")은 주소값을 가리킨다. 힙에서 구현+new가 숨어있다.
			 *따라서, '값=주소값'이라서 에러가 난 것이다.
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
			md_id[i] = value[0];			//moneyData의 id정보가 들어있다		
			md_money[i] = value[1];			//moneyData의 money정보가 들어있다
		}
		// 문제) moneyData 와 nameData 를 조합해서 아래와같이 만들어보세요
		
		/* * 100001/이만수/600
		 * 100003/유재석/7000
		 * 100001/이만수/100
		 * 100002/이영희/400
		 * 100001/이만수/600
		 * 100004/박명수/900
		 * 100001/이만수/130
		 * 100003/유재석/200
		 * 100002/이영희/700
		 * 100002/이영희/900
		 * 100004/박명수/800
		 * nd_id /nd_name/md_money*/
		 
		//nd_id랑 md_id가 같으면 <nd_id + nd_name + md_money> 순서대로 출력
		
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