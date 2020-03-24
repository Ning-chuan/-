package test;

import java.util.ArrayList;

public class ConnectionPool {
    private static final int DEFAULT_CAPACITY = 10;
    private ArrayList<MyConnection> list = new ArrayList<>();
    {
        while(list.size()<DEFAULT_CAPACITY){
            list.add(new MyConnection());
        }
    }

    //设计一个方法 让别人从池中获取MyConnection对象
    public MyConnection getMyConnection(){
        MyConnection result = null;
        for(MyConnection mc:list){
            if(mc.isCanUsed()==true){
                result = mc;
                break;
            }
        }
        return result;
    }
}
