package ba.firma.entity;

import java.io.Serializable;

/**
 * BankAccountDao implements Dao
 * ShowSao implements Dao
 *
 * <p>
 * <title>DAO</title>
 * BankAccount bankAccount = new BankAccount(..
 * bankAcccount.setAccountNumebr
 * bankAccount.setAmount
 * bankAccount.setOwner(,,,)
 * <p>
 * BankAccountDao bankAccountDao = new BankAccountDao()...
 * bankAccounDao.save(bankAccount)
 * </p>
 * <p>
 * <title>Active record - uprošćen</title>
 * BankAccount bankAccount = new BankAccount(..
 * bankAcccount.setAccountNumebr
 * bankAccount.setAmount
 * bankAccount.setOwner(,,,)
 * bankAccount.save();
 * </p>
 */
public class BankAccount extends ActiveBankAccount implements Serializable {

    private String accountNumber;
    private Double amount;
    private String owner;

    public BankAccount() {
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return accountNumber;
    }
}
