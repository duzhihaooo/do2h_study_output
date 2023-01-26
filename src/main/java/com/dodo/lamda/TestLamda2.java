package com.dodo.lamda;

public class TestLamda2 {
    //2.静态内部类
    static class Love2 implements ILove {
        @Override
        public void love(int a) {
            System.out.println("I Love You " + a + " times");
        }
    }

    public static void main(String[] args) {
        ILove love = new Love();
        love.love(3000);

        love = new Love2();
        love.love(3000);

        //3.局部内部类
        class Love3 implements ILove {
            @Override
            public void love(int a) {
                System.out.println("I Love You " + a + " times");
            }
        }
        love = new Love3();
        love.love(3000);

        //4.匿名内部类
        love = new ILove() {
            @Override
            public void love(int a) {
                System.out.println("I Love You " + a + " times");
            }
        };
        love.love(3000);

        //5.Lamda简化
        love = (a) -> {
            System.out.println("I Love You " + a + " times");
        };
        love.love(3000);

        ILove love2more = (a) -> {
            System.out.println("Loving You So Much "+a+" Cant Any More");
        };
        love2more.love(10101);

        //总结：
        //1.前提是接口为函数时表达接口
        //2.多个参数也可以去掉参数类型，要去掉就都去掉，必须加上括号

    }
}

interface ILove {
    void love(int a);
}

//1.实现类
class Love implements ILove {
    @Override
    public void love(int a) {
        System.out.println("I Love You " + a + " times");
    }
}