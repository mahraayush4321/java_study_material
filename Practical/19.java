class genclass<T>{
	T obj1, obj2;
	
	genclass(T po1, T po2){
		obj1=po1;
		obj2=po2;
	}

	void get(){
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
class demo{
	public static void main(String args[]){
		
		genclass<Integer> obj1=new genclass<Integer>(1,2);
		obj1.get();

		genclass<String> obj2=new genclass<String> ("abc", "def");
		obj2.get();
	}
}
