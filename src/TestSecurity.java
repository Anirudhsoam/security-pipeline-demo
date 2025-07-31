// TestSecurity.java
public class TestSecurity {
    private String password = "admin123"; // Security issue
    private String apiKey = "12345-secret-key"; // Another security issue
    
    public void duplicateCode() {
        System.out.println("Hello World");
        System.out.println("Hello World"); // Code duplication
        System.out.println("Hello World"); // More duplication
    }
    
    public void anotherMethod() {
        System.out.println("Hello World"); // Same duplication
        String unused = "This variable is never used"; // Code smell
    }
    
    // Method with security vulnerability
    public void sqlQuery(String userInput) {
        String sql = "SELECT * FROM users WHERE name = '" + userInput + "'"; // SQL injection risk
        System.out.println(sql);
    }
}
