package Chapter14_BinarySearchTrees;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class Ques14_11 { 
	
	private int offset=0;
	Map<String,Integer> clientMap=new HashMap<String,Integer>();
	NavigableMap<Integer,Set<String>> credits=new TreeMap<Integer,Set<String>>();
	public void  insert(String clientID,int c) {
		clientMap.put(clientID, c);
	}
	
	public Boolean remove(String clientID) {
		if(clientMap.containsKey(clientID)) {
			clientMap.remove(clientID);
			return true;
		}
		return false;
		
	}
	
	public Integer lookup(String clientID) {
		return clientMap.get(clientID);
	}
	
	public void addToAll(int c) {
		Set<String> key=clientMap.keySet();
		for(String str:key) {
			Integer value=clientMap.get(str);
			clientMap.put(str, value+c);
		}
	}
	
	public String maxCredit() {
		if(clientMap==null) {
			return null;
		}
		String maxClient=null;
		Integer maxCredit=Integer.MIN_VALUE;
		Set<String> key=clientMap.keySet();
		for(String str:key) {
			Integer value=clientMap.get(str);
			if(maxCredit<value) {
				maxClient=str;
			}
		}
		return maxClient;
		
	}
	
	

	public static void main(String[] args) {
		Ques14_11 obj=new Ques14_11();
		obj.insert("A",10);
		obj.insert("B",20);
		/*System.out.println(obj.lookup("A"));
		System.out.println(obj.remove("A"));
		System.out.println(obj.remove("A"))*/;
		obj.addToAll(10);
		//System.out.println(obj.lookup("A"));
		System.out.println(obj.maxCredit());
		
	}

}
