import java.util.*;

class Profile{
        protected String username;
        protected String password;
        protected String email;
        
       public Profile(String username,String password, String email ){
           this.username= username;
           this.password = password;
           this.email = email;
       }
       public void displayProfile(){
           System.out.println("Username:"+username);
           System.out.println("Email:"+email);
           }
           
       }
       
class PersonalProfile extends Profile{
    public PersonalProfile(String username,String password, String email){
        super(username,password,email);
    }
// @Override
    public void displayProfile(){
        System.out.println("============Personal Profile===================");
        super.displayProfile();
    }
}
class BusinessProfile extends Profile{
        private String CompanyName;
    public BusinessProfile(String username,String password, String email, String CompanyName){
        super(username,password,email);
        this.CompanyName = CompanyName;
    }
    // @Override
    public void displayProfile(){
        System.out.println("============Business Profile===================");
        super.displayProfile();
        System.out.println("Company Name :"+CompanyName);
    }
}
class InfluencerProfile extends Profile{
    private int FollowerCount;
    
    public InfluencerProfile(String username,String password, String email,int FollowerCount){
        super(username,password,email);
        this.FollowerCount = FollowerCount;
    }
    // @Override
    public void displayProfile(){
        System.out.println("============Influencer Profile===================");
        super.displayProfile();
        System.out.println("Follower Count : "+ FollowerCount);
    }
}

public class Main {
    public static void main(String[] args) {
    
PersonalProfile perPro = new PersonalProfile("Nanhekhan7","1233@khan","Nanhekhan7@gmail.com");
BusinessProfile bissPro = new BusinessProfile("Aman Choupra","1233@Aman","choupra_aman76@gmail.com","ChoupraGroup Inc.");
InfluencerProfile influPro = new InfluencerProfile("Rockey15","1233@rockey","Rockey15@gmail.com",13520000);
    
                perPro.displayProfile();
                bissPro.displayProfile();
                influPro.displayProfile();
    
        
        
        
        
    }
    
}















