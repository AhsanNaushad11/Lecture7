package buildingArraylist;

public class MyArrayList<T> {

	T list[];
	int size = 0;
	
	@SuppressWarnings("unchecked")
	MyArrayList() {
		list = (T[]) new Object[size];
	}
	
	@SuppressWarnings("unchecked")
	void AddToArrayList(T element) {
		size = size+1;
		T temp[] = (T[]) new Object[size];
		for(int i = 0; i<list.length; i++)
			temp[i] = list[i];
		temp[list.length] = element;
		list = temp;
	}
	
	int ContainsInArrayList(T t) {
		int index = 0;
		for(int i = 0; i<list.length; i++)
			if(list[i] == t)
				index = i;
			else index=-1;
		return index;
	}
	
	void DisplayArrayList() {
		System.out.print("[");
		for(int i = 0; i<list.length; i++)
			System.out.print(list[i]+", ");
		System.out.print("\b\b]");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<Integer> myarraylist = new MyArrayList<Integer>();
		myarraylist.AddToArrayList(7);
		myarraylist.AddToArrayList(8);
		myarraylist.AddToArrayList(5);
		myarraylist.AddToArrayList(8);
		
		System.out.print("The ArrayList is ");
		myarraylist.DisplayArrayList();
	}
}