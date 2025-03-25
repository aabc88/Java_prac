package ch3.section8_exception;


//은행 시스템가정
//예금인출, 입금이 진행됨.
//입금이 0 보다 작은 수가 들어온다
//출금이 잔고 보다 큰 수가 들어온다
//이런 상황은 자바에선 예외는 아니지만
//예외를 상속받아 커스텀화 하여 제작 가능

class BadBankingException extends Exception {
    //복잡하게 작성할 수 있으나 어떤 에러인지 클래스명으로 구분할 용도이다.
    //에러 발생 대응은 다른곳에서
    BadBankingException(String message) {
        super(message);
    }
}

//통장을 추상화 시킨 클래스
class BankAccount {
    private String name;
    private int number; //통장번호
    private int balance; //잔고

    BankAccount(String name, int number, int balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    void withdraw(int amt) throws BadBankingException {
        if (amt > balance) {
            throw new BadBankingException("잔액부족");
        }
        balance -= amt;
    }

    void deposit(int amg) throws BadBankingException {
        if (amg < 0 ) {
            throw new BadBankingException("0보다 작은 금액 입금 요청");
        }
        balance += amg;
    }

}

public class Exam3 {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Bank Account", 10, 100);
        try {
            bankAccount.withdraw(3000);
        } catch (BadBankingException e) {
            System.out.println(e.getMessage());
        }
    }
}
