class MyntraAccountRunner {
    public static void main(String[] args) {
        System.out.println("Main method started");

        MyntraAccount.createMyntraAccount("user123", "user123@example.com", "securePass123", "1234567890", "123 Main St, Example City");
		MyntraAccount.getAccountData();
        System.out.println("Main method ended");
    }
}