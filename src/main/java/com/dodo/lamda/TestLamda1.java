package com.dodo.lamda;

public class TestLamda1 {
    //3.静态内部类
    static class Like3 implements ILike{
        @Override
        public void lamda() {
            System.out.println("I Like Lamda  静态内部类");
        }
    }

    public static void main(String[] args) {
        ILike like = new Like();
        like.lamda();
        like = new Like3();
        like.lamda();

        //4.局部内部类
        class Like4 implements ILike{
            @Override
            public void lamda() {
                System.out.println("I Like Lamda  局部内部类");
            }
        }
        like = new Like4();
        like.lamda();

        //5.匿名内部类
        like = new ILike() {
            @Override
            public void lamda() {
                System.out.println("I Like Lamda  匿名内部类");
            }
        };
        like.lamda();

        //6.Lamda简化
        like = () ->{
            System.out.println("I Like Lamda  Lamda简化");
        };
        like.lamda();

    }


}


//1.定义一个函数式接口
interface ILike{
    void lamda();
}

//2.实现类
class Like implements ILike{
    @Override
    public void lamda() {
        System.out.println("I Like Lamda  外部实现类");
    }
}