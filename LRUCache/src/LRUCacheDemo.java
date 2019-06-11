
public class LRUCacheDemo {
	public static void main(String args[]) {
		// Manual Testing
		LRUCache<Integer, String> obj = new LRUCache<Integer, String>(3);
		obj.put(1, "First");
		System.out.println(obj.get(1));		
		obj.getList().print();
		obj.put(2, "Second");			
		obj.getList().print();
		System.out.println(obj.get(2));			
		obj.getList().print();
		obj.get(2);
		obj.getList().print();
		obj.put(3, "Third");
		obj.getList().print();
	}

}
