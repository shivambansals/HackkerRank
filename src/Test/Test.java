package Test;

public class Test {
    private String uName;
    private String companyNmae;
    private int dateOfJoining;
    private String uEmail;
    private String uPassword;

    public Test(String uName, String companyNmae, int dateOfJoining) {
        this.uName = uName;
        this.companyNmae = companyNmae;
        this.dateOfJoining = dateOfJoining;
        this.uEmail = createUserEmail();
        this.uPassword = createuPassword();


    }

    public static void main(String[] args) {
        Test user1 = new Test("Shivam", "GLA", 2018);
        System.out.println(user1.createuPassword());
        System.out.println(user1.createUserEmail());
    }

    private String createuPassword() {
        StringBuilder cp = new StringBuilder();
        cp.append(generateRandomCharacter());
        for (int i = 0; i < 4; i++) {
            cp.append(generateRandomNumber());
        }
        cp.append(generateRandomString().toLowerCase());
        cp.append(generateRandomSpecialSymbol());
        return cp.toString();

    }

    private int generateRandomIntegerFromLimit(int limit) {
        return (int) (Math.random() * limit);
    }

    private char generateRandomCharacter() {
        return (char) ('a' + generateRandomIntegerFromLimit(26));
    }

    private int generateRandomNumber() {
        return generateRandomIntegerFromLimit(10);
    }

    private String generateRandomString() {
        if (getuName().length() < 5) {
            StringBuilder pass = new StringBuilder();
            int defference = 5 - getuName().length();
            pass.append("0".repeat(Math.max(0, defference)));
            return pass.toString();

        }
        return getuName().substring(0, 5);
    }

    private Character generateRandomSpecialSymbol() {
        char[] specialSymbol = {
                '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}', ':', ';', '<', '>', '?', '\\'
        };
        return specialSymbol[generateRandomIntegerFromLimit(specialSymbol.length)];
    }

    private String createUserEmail() {
        return String.format("%s_%d@%s.com", getuName().toLowerCase(), getDateOfJoining(), getCompanyNmae().toLowerCase());
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getCompanyNmae() {
        return companyNmae;
    }

    public void setCompanyNmae(String companyNmae) {
        this.companyNmae = companyNmae;
    }

    public int getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(int dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getuEmail() {
        return uEmail;
    }

    public String getuPassword() {
        return uPassword;

    }
}
