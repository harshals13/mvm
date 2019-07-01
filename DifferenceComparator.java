import java.util.Comparator;

public class DifferenceComparator implements Comparator{  
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			Match s1=(Match)o1;  
			Match s2=(Match)o2;  
			
			if(s1.scoreDifference == s2.scoreDifference) {
				
				return 0; 
				
			} else if(s1.scoreDifference>s2.scoreDifference) {
				
				return 1;
				
			} else {
				
				return -1;
				
			} 
				  
		}
	}  
