package Chapter_four._6;
/*
 * @Time  :      2021/11/04 20:02
 * @Author:      方小白
 * @class_name:  Product
 * @Software  :  IntelliJ IDEA
 */



//Product
interface Product {
    public void change();
}


//ConcreteProduct
class TXTProduct implements Product{
    @Override
    public void change() {
        System.out.println("txt转换");
    }
}

class DataBaseProduct implements Product{
    @Override
    public void change() {
        System.out.println("database转换");
    }
}

class ExcelProduct implements Product{
    @Override
    public void change() {
        System.out.println("excel转换");
    }
}