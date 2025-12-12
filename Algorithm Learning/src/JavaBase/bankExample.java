package JavaBase;

public class bankExample {

    public static class Bank {
        double money = 2000.0;

        public void withDraw(double amount) throws InsufficientBalanceException {
            if (amount <= 0) {
                throw new IllegalArgumentException("取款金额必须大于零！");
            }

            if (amount > money) {
                String message = "取款金额不足,尝试取出" + amount + ",但是目前账户只有" + money;
                throw new InsufficientBalanceException("余额不足" + message);
            }

            money -= amount;
            System.out.println("成功取出" + amount + ",还剩下" + money);
        }
    }


    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            System.out.println("取200");
            bank.withDraw(200);

            System.out.println("取1000");
            bank.withDraw(1000);

            /*System.out.println("取-100");
            bank.withDraw(-100);*/
        } catch (InsufficientBalanceException e) {
            throw new RuntimeException("交易失败" + e.getMessage());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("交易失败,参数出错" + e.getMessage());
        } finally {
            try {
                bank.withDraw(-200);
            } catch (IllegalArgumentException | InsufficientBalanceException | IllegalCallerException |
                     IllegalMonitorStateException e) {
                System.err.println("交易失败" + e.getMessage());
            }
        }


    }

}
