import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        System.out.println("hello world");
        // 首次链接到远程仓库：git remote add origin https://github.com/coloredglaze32/my-java-project.git

        // 推送代码到github
        /*
        git branch -M main
        git push -u origin main
         */

        //后续更新代码
        /*
        git add .
        git commit -m “更新代码”
        git push origin main
         */

        List<Integer> l = new ArrayList<Integer>();
        Collections.addAll(l, 1,2,3);
        System.out.println(l);
    }
}