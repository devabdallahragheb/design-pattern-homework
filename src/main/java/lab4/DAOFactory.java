package lab4;

public class DAOFactory {
    public static AccountDAO getAccountDAO(boolean isTestEnvironment) {
        if (isTestEnvironment) {
            return new AccountDAOImpl();
        } else {
            System.out.println("false");
            return new DBAccountDAOImpl();
        }
    }
}
