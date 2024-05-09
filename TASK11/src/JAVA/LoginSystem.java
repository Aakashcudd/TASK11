package JAVA;

	import java.util.HashMap;
	import java.util.Map;

	public class LoginSystem {

	    private Map<String, String> passwordMap;

	    public LoginSystem() {
	        passwordMap = new HashMap<>();
	        passwordMap.put("user1", "password123");
	        passwordMap.put("user2", "letmein");
	    }

	    public void login(String username, String password) {
	        try {
	            boolean isValid = validatePassword(username, password);

	            if (isValid) {
	                System.out.println("Login successful!");
	            } else {
	                System.out.println("Incorrect password. Please try again.");
	            }
	        } catch (Exception e) {
	            System.err.println("Login failed due to an unexpected error: " + e.getMessage());
	        }
	    }

	    private boolean validatePassword(String username, String password) throws Exception {
	        String storedPassword = getPasswordFromDatabase(username);

	        if (storedPassword != null && storedPassword.equals(password)) {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    private String getPasswordFromDatabase(String username) throws Exception {
	        if (passwordMap.containsKey(username)) {
	            return passwordMap.get(username);
	        } else {
	            throw new Exception("User not found");
	        }
	    }

	    public static void main(String[] args) {
	        LoginSystem loginSystem = new LoginSystem();

	        loginSystem.login("user1", "password123");
	        loginSystem.login("user2", "wrongpassword");
	        loginSystem.login("user3", "password123");
	    }
	

	}


