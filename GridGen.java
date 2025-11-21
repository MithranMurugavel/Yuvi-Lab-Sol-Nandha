package Data_Structure;
import java.util.*;
public class GridGen {
	
	
	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N Value :");
		 int n = sc.nextInt();
		 
		 for(int i=0;i<n;i++) {
			 List<Integer> temp = new ArrayList<>();
			 for(int j=0;j<n;j++) {
				int Num = (int)(Math.random() * 10) * 2 + 2;
				 temp.add(Num);
			 }
			 list.add(temp);
		 }
		 boolean flag = true;
		 do {
			System.out.println("Choose the Options \n 1. Display the Matrix Table \n 2. To Mark the Value \n 3. Exit");
			int num =sc.nextInt();
			switch (num) {
				
			case 1:{
				display1(list);
				break;
				}
			case 2:{
				 System.out.print("Enter the value to Mark(eNTER 0 to exit): ");
				 int val = sc.nextInt();
				 display2(list,val);
				 break;
			}
			case 3:{
				System.out.println("Exiting....");
				flag=false;
				break;
			}
			}
		 }while(flag);
	}

	private static void display1(List<List<Integer>> list) {
		int n = list.size();

	    System.out.println("\nGenerated NxN array:\n");

	    System.out.print("    ");
	    for (int c = 0; c < n; c++) {
	        System.out.printf("%4s ", String.format("%02d", c));
	    }
	    System.out.println();

	    StringBuilder border = new StringBuilder("   ");
	    for (int c = 0; c < n; c++) {
	        border.append("+----");
	    }
	    border.append("+");

	    System.out.println(border.toString());

	    for (int r = 0; r < n; r++) {
	        System.out.printf("%02d ", r);
	        for (int c = 0; c < n; c++) {
	            int num = list.get(r).get(c);
	            System.out.print("| ");
	            System.out.printf("%-3s", num);
	        }
	        System.out.println("|");
	        System.out.println(border.toString());
		
	}
}

	private static void display2(List<List<Integer>> list, int val) {
		    if(list == null || list.isEmpty()) return;
		    int n = list.size();
		    
		    System.out.println();
		    System.out.print("    ");
		    for(int c=0;c<n;c++){
		        System.out.printf("%4s", String.format("%02d", c));
		    }
		    System.out.println();
		    StringBuilder border = new StringBuilder();
		    border.append("   ");
		    for(int c=0;c<n;c++){
		        border.append("+----");
		    }
		    border.append("+");
		    System.out.println(border.toString());
		    for(int r=0;r<n;r++){
		        System.out.printf("%02d ", r);
		        for(int c=0;c<n;c++){
		            int v = list.get(r).get(c);
		            String cell = String.valueOf(v);
		            if(v == val) cell = "[" + cell + "]";
		            System.out.print("| ");
		            System.out.printf("%-3s", cell);
		        }
		        System.out.println("|");
		        System.out.println(border.toString());
		    }
		   System.out.printf("Number %d appeared %d times in this table \n ",val,count);
		}

	}


