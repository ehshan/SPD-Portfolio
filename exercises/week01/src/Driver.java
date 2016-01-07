/**
 * Created by ehshan on 07/01/2016.
 */
public class Driver {

    public static void main(String[] args) {
        Storage<BankAccount> aStorage = new Storage<>();
        Storage<String> sStorage = new Storage<>();

        Class<BankAccount> baCls = BankAccount.class;
        BankAccount myAccount = null;
        try {
            myAccount = baCls.newInstance();
            aStorage.setValue(myAccount);

            // Deposit
            myAccount.deposit(15);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println(aStorage.getValue().showBalance());

        if (aStorage.getClass() == aStorage.getClass()) {
            System.out.println("EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
