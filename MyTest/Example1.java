package MyTest;


    interface SpeakHello {      //定义一个“说话”的接口
        void speakHello();
    }

    class Chinese implements SpeakHello {   //Chinese类实现“说话”接口
        public void speakHello() {
            System.out.println("说人话");
        }
    }

    class English implements SpeakHello {   //English类实现“说话”接口
        public void speakHello() {
            System.out.println("speak English!");
        }
    }

    class KindHello{                        //定义一个参数为 “说话”接口 的类，由于java支持向上转型，所以实现该接口的任何类都
                                            //可以通过该类，进行函数调用。
                                            //优点：不需要创建多个对象调用不同的函数。
        public void lookHello(SpeakHello hello){
            hello.speakHello();
        }
    }

    //.Java文件中有且只有一个 public 修饰类
public class Example1 {
    public static void main(String[] args) {
        KindHello kindhello = new KindHello();
        kindhello.lookHello(new Chinese());
        kindhello.lookHello(new English());


    }
}



