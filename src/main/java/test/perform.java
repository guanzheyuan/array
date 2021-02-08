package test;


import dto.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class perform {
    public static void main(String[] args) {
        // 创建空数组
        List<items> list = new ArrayList();
        // 初始化数组数据
        List<items>  initializeList = createGoods(list);
        // try catch 监听异常
        try {
            // 控制台输出文字
            System.out.print("请输入商品序号(回车结束):");
            // 控制台输入
            Scanner scanner = new Scanner(System.in);
            int inputStr = Integer.parseInt(scanner.next());
            // 校验数组是否有数据
            if (null != initializeList && initializeList.size() > 0) {
                // 输出指定下标的数组数据
                try {
                    System.out.println(initializeList.get(inputStr).getName()+':'+initializeList.get(inputStr).getPrice());
                }catch (Exception e) {
                    System.out.println("index not found as items");
                }
            }
        }catch (Exception e){
            System.out.println("It's not a number");
        }

    }

    /**
     * 初始化数组内数据
     * @param list
     * @return
     */
    private static List<items> createGoods(List<items> list){
        list.add(new items("Bread",3));
        list.add(new items("Milk",2.50));
        list.add(new items("ToyCar",15));
        list.add(new items("Lollipop",0.50));
        list.add(new items("Elephant",50));
        // 商品列表展示
        System.out.println("商品列表展示如下");
        for (int i = 0;i<list.size();i++) {
            System.out.println("商品序号："+(i)+",商品名称："+list.get(i).getName()+",商品价格："+list.get(i).getPrice());
        }
        return list;
    }
}

