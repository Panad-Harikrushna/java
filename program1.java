/* 1.Paul has bought a new notebook of "idol" brand, with a processor speed of 2.66GHz, 8 GB of RAM, 500GB hard disk, with a 15-inch monitor, for $1760.55. 
He has chosen service plan 'C' among plans 'A', 'B', 'C', and 'D', plus on-site servicing but did not choose extended warranty. 
Identify the data types and name the variables.*/

//Ans==>  Identify the data types and name the variables.

class IdentifyDataTypes
	
{
		public static void main(String[] args)
			{
				String name = "Paul";
				String brand = "idol";
				double processorspeedInGHz = 2.66;
				float ramSizeInGB = 8;
				int HardDiskInGB = 500;
				byte InchMonitor = 15;
				double rupeesIn$ = 1760.55;
				char servicePlan = 'C';
				boolean OnSiteServicing = true;
				boolean ExtendedWarranty = false;
				System.out.println("Name :"+name);
				System.out.println("Brand :"+brand);
				System.out.println("speed of processer :"+processorspeedInGHz+" GHz");
				System.out.println("RAM size :"+ramSizeInGB+" GB");
				System.out.println("Hard disk size :"+HardDiskInGB+" GB");
				System.out.println("Monitor size :"+InchMonitor+" Inch");
				System.out.println("Total cost :"+rupeesIn$+" $");
				System.out.println("Service plan :"+servicePlan);
				System.out.println("ON site servicing :"+OnSiteServicing);
				System.out.println("ExtendedWarranty :"+ExtendedWarranty);

			}
}	
	

