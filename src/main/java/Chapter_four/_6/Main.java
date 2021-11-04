package Chapter_four._6;
/*
 * @Time  :      2021/11/04 19:59
 * @Author:      方小白
 * @class_name:  Client
 * @Software  :  IntelliJ IDEA
 */



//main
public class Main {
    public static void main(String[] args) {
        Factory f1 = (Factory)XML_Util.getBean();         //配置文件实现
        assert f1 != null;                                //百度一下
        Product p1 = f1.createProduct();                  //通过修改配置文件指定何种格式的数据转换
        p1.change();
    }
}
