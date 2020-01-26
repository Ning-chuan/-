package myutil;

import java.util.jar.JarOutputStream;

public class TestString {
    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "abcd";
        String s3 = new String("abcd");
        String s4 = new String("abcd");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s3==s4);//false
        //String类将equals方法重写了  比较的是字符值
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s3.equals(s4));//true

//        byte[] value = new byte[]{65,97,48};
//        String str = new String(value);//AaO
//        System.out.println(str);

//        char[] value = {'h','e','l','l','o'};
//        String str = new String(value,2,3);
//        System.out.println(str);
//        System.out.println(str.equals(null));
//        System.out.println(str.hashCode());

//        TestString ts = new TestString();
//        System.out.println(ts);
//        String str1 = new String("bcd");
//        System.out.println(str1);//toString方法
//
//        String str = "abcdef";
//        String result = "";
//        for(int i=0;i<str.length();i++){
//            int value = str.codePointAt(i);//获取索引为i的元素
//            result+=(char)value-48;//密钥 U盾
//        }
//        System.out.println(result);
//        System.out.println(str.codePointBefore(1));

//        String str = "abcdef";
//        str.concat("g");
//        System.out.println(str);
//        //上面的输出结果还是abcdef
//        //原因是concat()的过程是
//        //先创建一个新的String对象(字符串常量池) value属性 7个
//        //再将刚才String对象value值依次取出来 存入新对象的value属性 g放在后面
//        //最后返回新的String对象
//        System.out.println(str.concat("g"));

//        String str = "a"+"b"+"c"+"d"+"e";
//        System.out.println(str);
//        //问：产生了几个String对象  答：9个

//        String str = "a";
//        long time1 = System.currentTimeMillis();
//        for (int i=1;i<200000;i++){
//            //str+="a";//15259毫秒
//            str = str.concat("a");//8639毫秒
//        }
//        long time2 = System.currentTimeMillis();
//        System.out.println(time2-time1);

//        String str1 = "abcd";
//        String str2 = "ac";
//        System.out.println(str1.compareTo(str2));

//        String str = "abcdefg";
//        boolean value = str.contains("ce");
//        System.out.println(value);

//        String str = "TestString.java";
//        boolean result = str.endsWith(".java");
//        System.out.println(result);

//        String str = "我爱你中国";
//        byte[] b = str.getBytes();
//        for(byte v:b){
//            System.out.println(v);
//        }
//        char[] c = str.toCharArray();
//        for(char v:c){
//            System.out.println(v);
//        }

        String str = "abcdefgabc";
        int index = str.lastIndexOf("b",7);
        System.out.println(index);

    }
}
