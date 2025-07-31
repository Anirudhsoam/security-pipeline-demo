// TestSecurity.java
public class TestSecurity {
    private String password = "admin123"; // Security issue
    
    public void duplicateCode() {
        System.out.println("Hello");
        System.out.println("Hello"); // Code duplication
    }
}
