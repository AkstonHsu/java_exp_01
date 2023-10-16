import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Demo class
 *
 * @author axu
 * @date 2023/10/16
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取输入
        int n = scanner.nextInt();
        // 学生数量
        int m = scanner.nextInt();
        // 调整次数
        List<Integer> students = new ArrayList<>();

        // 初始化学生列表，学号由1到n编号
        for (int i = 1; i <= n; i++) {
            students.add(i);
        }

        // 处理调整过程
        for (int i = 0; i < m; i++) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();

            // 处理向后移动
            if (q > 0) {
                int idx = students.indexOf(p);
                students.remove(idx);
                int ins=-1;
                if(idx+q>n){
                    ins=n;
                }
                else{
                    ins=idx+q;
                }

                students.add(ins,p);
            }
            // 处理向前移动
            else if (q < 0) {
                int idx = students.indexOf(p);
                students.remove(idx);
                int ins=-1;
                if(idx+q<0){
                    ins=0;
                }
                else{
                    ins=idx+q;
                }
                students.add(ins,p);
            }
        }

        // 输出最终结果
        for (int i = 0; i < n; i++) {
            System.out.print(students.get(i) + " ");
        }
    }
}
