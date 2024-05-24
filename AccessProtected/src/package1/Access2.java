package package1;

import package2.Access3;

public class Access2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 a = new Access1();
        System.out.println (a.hours);
        System.out.println (a.minutes);
        
        Access3 b = new Access3();
        System.out.println (a.hours);
        System.out.println (a.minutes);



	}

}
