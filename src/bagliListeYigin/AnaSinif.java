package bagliListeYigin;

public class AnaSinif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BagliListeYigin yigin=new BagliListeYigin(6);
		yigin.push("MİRAÇ", "Akkoyun", 555, 2003);
		yigin.printYigin();
		yigin.push("sdada", "sdaasda", 222, 2000);
		yigin.printYigin();
		yigin.pop();
		yigin.printYigin();
		yigin.push("sdada", "sdaasda", 222, 2000);
		yigin.push("sdada", "sdaasda", 222, 2000);
		yigin.push("sdada", "sdaasda", 222, 2000);
		yigin.push("sdada", "sdaasda", 222, 2000);
		yigin.push("sdada", "sdaasda", 222, 2000);
		yigin.push("sdada", "sdaasda", 222, 2000);
		yigin.printYigin();
		

	}

}
