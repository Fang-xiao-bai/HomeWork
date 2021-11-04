package Chapter_four._5;
/*
 * @Time  :      2021/11/04 19:09
 * @Author:      方小白
 * @class_name:  _5
 * @Software  :  IntelliJ IDEA
 */


//Product
interface Chart{
    void draw();
}


//ConcreteProduct
class Graph implements Chart{
    @Override
    public void draw() {
        System.out.println("Can draw graph");
    }
}

class Histogram implements Chart{
    @Override
    public void draw() {
        System.out.println("Can draw histogram");
    }
}


//Factory
interface ChartFactory{
    Chart createChart();   //抽象工厂方法
}


//ConcreteFactory
//具体工厂类实现了工厂方法，不同的具体工厂可以创建不同的具体产品
class GraphFactory implements ChartFactory{
    @Override
    public Chart createChart() {
        return new Graph();
    }
}

class HistogramFactory implements ChartFactory{
    @Override
    public Chart createChart() {
        return new Histogram();
    }
}



//main
public class _5 {
    public static void main(String[] args) {
        ChartFactory graph1 = new GraphFactory();        //创建工厂对象
        Chart gChart = graph1.createChart();             //创建具体产品
        gChart.draw();                                   //调用方法

        ChartFactory graph2 = new HistogramFactory();
        Chart hChart = graph2.createChart();
        hChart.draw();
    }
}
