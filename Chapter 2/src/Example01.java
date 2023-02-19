// JMM: Java Memory Model。Java内存模型
// 在Java中，内存分为栈和堆两大块
/**
 * 变量的定义
 * 变量名的规则：只能以字母、下划线、$开头，其余部分由任意多的字母、数字、下划线、$组成
 * @author wangkewei
 */
public class Example01 {
    // 输入psvm可以快捷创建main函数
    public static void main(String args[]){
        /**
         *  整型类型
         */
        byte b = (byte) 0xFFFFFFFF;   // 最多8个F，不然会提示“过大的整数”，byte类型不是8bit吗？一个F最起码4bit吧
        int integer = (int)0xFFFFFFFF;  // int类型也是8个F，byte实际上会转成int？
        long longInteger = (long)0xFFFFFFFFFL;    // long也是8个F，那结论应该是，如果可能溢出就往上转？但是long是8字节啊
        long longInteger2 = (long) Math.pow(2,64);  // 输出的结果为2^32-1，是int的最大值

        // 在网上搜索后，发现是由于Java在任何情况下，处理整数型的“字面量（数据）”时，默认会将字面量当做int型处理。
        // 它会优先处理右边的数字，默认它是int型。要解决此事，在数字后面加一个L/l，让它知道这是long型
        byte bb = (byte)0xFFFFFFFFFFFl; // 再次尝试，发现如果是溢出的值，会输出-1

        /**
         *  浮点类型
         */
        // 类比整型，Java在处理浮点数时，会默认把它当作double类型处理，所以要加个f/F表示是单精度
        float flo = 4.0f;
        double dou = 1145.14;

        /**
         *  布尔类型
         */
        // Java中的布尔类型变量在编译完成后就不存在了。因为Java是在C++基础上开发的，
        // 而C++使用0和非0表示假和真。在JVM规范中有明确说明，单个boolean类型的变量，
        // 在编译过程中惠被翻译为int类型的变量，占4字节。对于boolean类型的数组，
        // 在编译过程中会被翻译为byte类型的数组，每个变量占1个字节。
        boolean bool = true;

        /**
         * 字符类型
         */
        // 在Java中，char类型可以储存汉字。因为Java采用的是Unicode编码，
        // 而Unicode编码中收录的汉字占用是2个字节，Java里面char类型也是占用2字节。
        // 所以在Unicode编码中收录的汉字可以使用char储存，而未收录的不一定能使用
        char ch = '哼';
        char str[] = "哼哼哼啊啊啊啊啊啊".toCharArray();

        char 王 = 'd';   // 好像也可以用中文作为变量名，不过肯定是不推荐用

        System.out.println(王);
        System.out.println(str);

    }

}
