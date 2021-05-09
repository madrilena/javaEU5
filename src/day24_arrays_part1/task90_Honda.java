package day24_arrays_part1;

public class task90_Honda {

	public static void main(String[] args) {
		
		String[] carList = {"BMW","Mercedes","Honda","Toyota","Nissan","Ferrari"};
		
           boolean flag = false;
           
		for (int i=0;i<carList.length;i++) {
			
			if(carList[i].equals("Honda")){
				//System.out.println("I found your car Honda in this array");
				
			//}else {
				//System.out.println("I could not find your car Honda in this array");
				flag=true;
				break;
				
				
			}
		}
		if (flag) {
			System.out.println("Found it");
		}else {
			System.out.println("Not found it");
		}
		
	}

}
