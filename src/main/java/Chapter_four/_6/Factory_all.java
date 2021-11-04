package Chapter_four._6;
/*
 * @Time  :      2021/11/04 20:00
 * @Author:      方小白
 * @class_name:  Factory
 * @Software  :  IntelliJ IDEA
 */


interface Factory{
    public Product createProduct();
}

class TxtFactory implements Factory{
    @Override
    public Product createProduct() {
        return new TXTProduct();
    }
}

class DataFactory implements Factory{
    @Override
    public Product createProduct() {
        return new DataBaseProduct();
    }
}

class ExcelFactory implements Factory{
    @Override
    public Product createProduct() {
        return new ExcelProduct();
    }
}