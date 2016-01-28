import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maximize {
	public static void main(String[] args) {
		List<String> directFriendsForUser = null;//getDirectFriendsForUser("");
	    
	    Map<String, Integer> m = new HashMap<String, Integer>();
	    for(String u: directFriendsForUser()){
	    	List<String> c = getAttendedCoursesForUser(u);
	        for(String v1:c)
	        m.put(v1, m.containsKey(v1)?(m.get(v1) +1):1);
	    }
	    Set<Entry<String, Integer>> set = m.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
	        {
	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	            {
	                return (o2.getValue()).compareTo( o1.getValue() );
	            }
	        } );

	    List<String> s = new ArrayList<String>();
	    for(Map.Entry<String, Integer> entry:list){
	            
	        s.add(entry.getKey());
	        }
	}

	private static List<String> getAttendedCoursesForUser(String u) {
		// TODO Auto-generated method stub
		return null;
	}

	private static  List<String> directFriendsForUser() {
		// TODO Auto-generated method stub
		return null;
	}
}
