package bank;

class AccountsNotFoundException extends Exception {
  public AccountsNotFoundException(String accountName) {
    super("Account not found : " + accountName)
  }
}