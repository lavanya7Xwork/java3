class XworkZApplicationRunner {
    public static void main(String[] args) {
        System.out.println("Main method started");

        XworkZApplication.createApplication(null, "user123@example.com", "4GM20CS056", "1234567890", "123 Main St, Example City");
		XworkZApplication.getApplicationData();
        System.out.println("Main method ended");
    }
}