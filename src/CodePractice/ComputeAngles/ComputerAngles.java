package CodePractice.ComputeAngles;


public class ComputerAngles {

    public static void main(String[] args) {
        // format的模板
        java.text.DecimalFormat df = new java.text.DecimalFormat("#0.00");

        // 初始化数据
        int a = 3;
        int b = 4;
        int c = 5;

        // 计算弧度表示的角
        double B = Math.acos((a * a + c * c - b * b) / (2.0 * a * c));
        // 用角度表示的角
        B = Math.toDegrees(B);
        // 格式化数据，保留两位小数
        String temp = df.format(B);
        System.out.println(temp);
    }
}