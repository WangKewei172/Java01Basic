// 使用public修饰的class的名字必须与文件名保持一致！
public class HelloWorld{
    public static void main(String args[]){
        // System：系统。out：系统输出。println：按行打印
        System.out.println("hello world! 你好，世界！");  // 看来println自带换行符，像python的print一样

        System.out.println("hello world! \n你好，世界！");  // 双引号是字符串，里面可带转义字符

        // 单引号内只能圈字符，不能圈字符串，
        // 否则会出现："5: 错误: 未结束的字符文字" "5: 错误: 需要';'" "5: 错误: 非法字符: '\uff0c'" "5: 错误: 不是语句"等错误
        System.out.println('c');


    }
}

/* **错误: 找不到或无法加载主类 HelloWorld**
    怎么出现的：在class文件里直接点idea的运行；或者是`java .\HelloWorld.class`
    解决办法：`java 类名`而不是`java 类文件路径`
    出现原因：
 */

/* **9: 错误: 编码 GBK 的不可映射字符 (0x80)**
    怎么出现的：在println里添加了中文，编译时报错
    解决办法：编译时带上编码 `javac -encoding utf-8 .\HelloWorld.java`
    出现原因：
 */