import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MailSender {
	
	// from, message, friends 2d array
	void sendMail(String emailAddress, String message, String[][] friendsArray) {
		Map<String, String []> friends = getFriendsMap(friendsArray);
		
		ArrayList<String> toArray = new ArrayList<String>();
		getToAddresses(emailAddress, friends, toArray);
		
		// remove from address
		toArray.remove(toArray.indexOf(emailAddress));
		
		for(String to : toArray) {
			sendMail(to, message);
		}
	}
	
	// returns : map -> person : friends []
	private Map<String, String[]> getFriendsMap(String[][] arr) {
		Map<String, String []> map = new HashMap<String, String[]>();
		
		for(int i=0; i<arr.length; i++) {
			String user = arr[i][0].trim();
			String [] friendsList = arr[i][1].replaceAll("\\s+","").split(",");
			
			map.put(user, friendsList);
		}
		
		return map;
	}
	
	private void getToAddresses(String from, Map<String, String []> friends, ArrayList<String> toArray) {

		// if already checked
		if(toArray.contains(from)) {
			return;
		}
		
		toArray.add(from);

		// check if `from` has any friends
		if(friends.containsKey(from)) {
			for(String entry : friends.get(from)){
				getToAddresses(entry, friends, toArray);
			}
		}
		
	}
	
	// given function to send mail
	void sendMail(String emailAddress, String message) {
		System.out.println("Mail sent to : " + emailAddress);
	}
	
}