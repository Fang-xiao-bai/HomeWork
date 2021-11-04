package Chapter_four._6;
/*
 * @Time  :      2021/11/04 19:56
 * @Author:      方小白
 * @class_name:  XML_Util
 * @Software  :  IntelliJ IDEA
 */

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

//创建工具类 便于读取配置文件，并通过储存在配置文件中的类名字符串反射生成对象
public class XML_Util {
    //该方法用于从config.xml中提取类名并返回一个实例对象
    public static Object getBean(){
        try{
            //创建DOM文档对象
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("src//main//java//Chapter_four//_6//config.xml"));       //doc 的type为Document

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node n = nl.item(0).getFirstChild();        //文本节点的子类
            String text = n.getNodeValue().trim();           //n.得到 <>..</>之间的数值.去空行


            //通过得到的类名生成实例对象并将其返回
            Class c = Class.forName(text);                   //Java反射机制    forName(String className)方法返回与带有给定字符串名的类或接口
            Object obj = c.newInstance();                    //创建此对象所表示的类的一个新实例
            return obj;                                      //返回对象


        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}