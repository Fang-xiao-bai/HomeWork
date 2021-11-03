package Chapter_four;
/*
 * @Time  :      2021/11/02 18:04
 * @Author:      方小白
 * @class_name:  _4
 * @Software  :  IntelliJ IDEA
 */


//Product
interface Car{
    public void describe();
}


//ConcreteProduct
class BMW_Car implements Car{
    String brand = "BMW";

    @Override
    public void describe() {
        System.out.println("Brand:" + this.brand);
    }
}

class Benz_Car implements Car{
    String brand = "Benz";

    @Override
    public void describe() {
        System.out.println("Brand:" + this.brand);
    }
}


//Factory
interface CarFactory{
    public Car createCar();     //抽象工厂方法
}


//ConcreteFactory
class BMW_Car_Factory implements CarFactory{

    @Override
    public Car createCar() {
        Car car = new BMW_Car();
        return car;
    }
}

class Benz_Car_Factory implements CarFactory{

    @Override
    public Car createCar() {
        Car car = new Benz_Car();
        return car;
    }
}








//main
public class _4 {
    public static void main(String[] args) {
        CarFactory carFactory1 = new BMW_Car_Factory();      //Factory
        Car car1 = new BMW_Car();                            //Product
        car1.describe();                                     //method

        CarFactory carFactory2 = new Benz_Car_Factory();
        Car car2 = new Benz_Car();
        car2.describe();
    }
}
