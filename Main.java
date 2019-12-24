public class Main {
	public static void main(String[] args) {
		
		String sender = "";
		String message = "";

		String [][] friends=  {
			{"rahul@test.com", "rajat@test.com, rashmi@test.com, vinod@test.com"},
			{"vineet@test.com", "ajay@test.com, rajat@test.com, rahul@test.com"},
			{"vinod@test.com", "rahul@test.com, nitin@test.com, vineet@test.com"}
		};

		if (args.length != 2) {
			System.out.println("wrong inputs provided.");
			System.out.println("<usage> : java Main <sender_name> <quoted message>");

			System.out.println("\navailable senders : ");
			for(int i=0; i<friends.length; i++) {
				System.out.println("- " + friends[i][0]);
			}
			
			System.exit(0);
		} else {
			sender = args[0];
			message = args[1];
		}
		
		MailSender mailSender = new MailSender();	
		mailSender.sendMail(sender, message, friends);
	}
}
