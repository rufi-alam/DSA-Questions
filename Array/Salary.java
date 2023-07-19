//java Program to calculate tax of salary
//input salary <=10000 ----> No Tax
//input salary>10000 b/w salary<=100000 --->10% tax
//input salary>100000 b/w salary<=500000 --->20% tax
//input salary>500000 b/w salary<=1000000 --->30% tax
//input salary>1000000 b/w salary<=2000000 --->40% tax
//input salary>2000000 b/w salary<=3000000 --->50% tax
//input salary>3000000 --->60% tax

import java.util.Scanner;
class Salary
{
	public static void main(String[] args) 
	{
		int salary; double tax;
		System.out.print("Enter Salary ");
		Scanner r=new Scanner(System.in);
		salary=r.nextInt();

		if (salary<=10000) 
		{
			System.out.print(salary+ " no tax ");
		}
		else if (salary>10000 && salary<=100000) 
		{
			tax=salary*0.10;
			System.out.print(salary+" "+tax);
		}
		else if (salary>100000 && salary<=500000) 
		{
			tax=salary*0.20;
			System.out.print(salary+" "+tax);
		}
		else if (salary>500000 && salary<=1000000) 
		{
			tax=salary*0.30;
			System.out.print(salary+" "+tax);
		}
		else if (salary>1000000 && salary<=2000000) 
		{
			tax=salary*0.40;
			System.out.print(salary+" "+tax);
		}
		else if (salary>2000000 && salary<=3000000) 
		{
			tax=salary*0.50;
			System.out.print(salary+" "+tax);
		}
		else
		{
            tax=salary*0.60;
			System.out.print(salary+" "+tax);
		}
	}
}

