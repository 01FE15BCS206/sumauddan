package in.ac.kletech;

public class Search {

	void search(){
	}
	boolean Search(Object key){
		return false;
	}
	void display(){
		
	}
	}
public class BinarySearch extends Search{
	int[] a=new int[10];
	public BinarySearch(int[]a)
	{
		this.a=a;
	}
	void sort(){
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length-1;j++)
				if(a[j-1]>a[j])
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
				
	}
	boolean search(Object Key)
	{
		int k=(Integer)Key;
		return binarySearch(0,a.length-1,k);
		
		
	}
	void display(){
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
	boolean binarySearch(int l,int h,int key)
	{
		boolean res=false;
		if(l<h)
		{
			int mid=(l+h)/2;
			if(a[mid]==key)
				return true;
			else if(a[mid]>key)
				return binarySearch(l,mid-1,key);
			else
				return binarySearch(mid+1,h,key);
		}
		else return res;
	}
}
public class SequentialSearch extends Search{
	String[]a=new String[10];
	public SequentialSearch(String[] a){
		this.a=a;
		
	}
	void sort(){
	for(int i=0;i<a.length;i++)
		for(int j=i+1;j<a.length-i;j++)
			if(a[j-1].compareToIgnoreCase(a[j])<0)
			{
				String temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
	
			}
	boolean Search(Object key){
		String k=(String)key;
		return sequenceSearch(k);
		
	}
	void display(){
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	boolean sequencesearch(String key)
	{
		boolean res=false;
		for(int i=0;i<a.length;i++)
			if(a[i].equalsIgnoreCase(key))
			{
				res=true;break;
			}
		return res;
	}
			
}

