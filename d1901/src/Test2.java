package src;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");

        List<Integer> list2 = new ArrayList<>();
        //list1.add(111);
        //list1.add(222);

        List list3 = new ArrayList();
        list3.add("sdsd");
        list3.add(2121);
        list3.add(23.2323);

        bianLi(list1);  //List<String>  ---->List     类型擦除
        //bianLi(list2); //List<Integer>---->List     类型擦除
        bianLi(list3);  //List
    }


    static void bianLi(List<?> list){
        //<?>是某种特定的类型，是什么类型不知道
        //可以限制不运行放入数据
        for (Object s : list) {  //foreach循环语法是对迭代器的简化语法
            System.out.println(s);
        }
        //list.add("sdss");

    }
//    static void bianLi(List<String> list){
//
//        for (String s : list) {  //foreach循环语法是对迭代器的简化语法
//            System.out.println(s);
//        }
//        list.add("sdss");
//
//    }


}
