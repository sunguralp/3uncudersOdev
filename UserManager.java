
public class UserManager {
			
	public void save(User user) {
		System.out.println(user.firstName +" -> Kaydedildi");
		System.out.println(user.lastName +" -> Kaydedildi");
		System.out.println(user.email +" -> Kaydedildi");
		System.out.println(user.city +" -> Kaydedildi");
		System.out.println(user.getZipCode());
	}
		
		public void infoUser(User[] users) {
	    	  for(User user : users) {
	    		 save(user);
	    		 

	    	  }
		}
	    		  
	    	  

}
