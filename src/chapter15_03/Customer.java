package chapter15_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Customer {

	public static void main(String[] args) {
		
		List<String> customerList = new ArrayList<>(Arrays.asList(
			"西川 貴浩,xxxx@gmail.com,041-0604,北海道函館市元村町",
			"浅井 唯,xxxx@yahoo.co.jp,144-0034,東京都大田区西糀谷",
			"浜口 英則,yyyy@gmail.com,880-0879,宮崎県宮崎市宮崎駅東",
			"鈴木 明人,xxxx@gmail.com,041-0604,北海道函館市元村町",
			"浅井 流々,xxxx@yahoo.co.jp,144-0034,東京都大田区西糀谷",
			"浜口 英俊,yyyy@gmail.com,880-0879,宮崎県宮崎市宮崎駅東"
		));
        
        customerList.forEach(customer -> processCustomer(customer));
	}
	
    private static void processCustomer(String customer) {
        String[] details = customer.split(",");
        String name = details[0];
        String email = details[1];
        String code = details[2];
        String address = details[3];
        
        System.out.println(GetName(name));
        System.out.println(GetEmail(email));
        System.out.println(GetCode(code));
        System.out.println(GetAddress(address));
    }
    
    private static String GetName(String name)  {
		return "名前：" + name;
	}
	
    private static String GetEmail(String email)  {
		return "メールアドレス：" + email;
	}
	
    private static String GetCode(String code)  {
		return "郵便番号：" + code;
	}
	
    private static String GetAddress(String address)  {
		return "住所：" + address;
		
	}

}
