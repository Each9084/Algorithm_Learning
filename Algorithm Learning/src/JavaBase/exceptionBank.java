package JavaBase;

public class exceptionBank {


    public static class BankAccount{
        private double balance = 1000.0;

        public void withDraw(double amount) throws InsufficientBalanceException{
            // 场景一：金额是负数
            if (amount<=0){
                throw new IllegalArgumentException("取款金额必须大于零！");
            }

            if(amount > balance){
                String message = "余额不足！当前余额: " + balance + "，尝试取出: " + amount;
                throw new InsufficientBalanceException(message);
            }

            balance-=amount;
            System.out.println("成功取出 " + amount + " 元。当前余额: " + balance + " 元。");
        }

    }


    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try{
            System.out.println("--- 尝试取款 200 元 ---");
            account.withDraw(200);

            System.out.println("\n--- 尝试取款 1000 元 (余额不足) ---");
            account.withDraw(1000); // 抛出 InsufficientBalanceException

            System.out.println("\n--- 尝试取款 -100 元 (负数) ---");
            account.withDraw(-100);

        } catch (InsufficientBalanceException e) {
            System.out.println("❌ 交易失败: "+e.getMessage());
        }catch (IllegalArgumentException e){
            System.err.println("❌ 交易失败: " + e.getMessage());
        }finally {
            // 尝试负数金额取款（会抛出 IllegalArgumentException）
            System.out.println("\n--- 尝试取款 -50 元 ---");
            try {
                account.withDraw(-50);
            } catch (Exception e) {
                System.err.println("❌ 输入错误: " + e.getMessage());
            }
        }
    }
}
