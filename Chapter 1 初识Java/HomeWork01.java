public class HomeWork01{
    public static void main(String args[]){
        printMyInfo();
        System.out.println("");
        printForm();
    }
    /**
     * 题目：在控制台或命令行输出自己的姓名、性别和年龄，每个属性各占一行
     */
    public static void printMyInfo(){
        System.out.println("姓名：koway");
        System.out.println("性别：男");
        System.out.println("年龄：19");
    }

    /**
     * 题目：在控制台或命令行输出一个表格，表头为：姓名，性别，年龄。内容为：张三，男，20；李四，女，18；
     */
    public static void printForm(){
        System.out.println("姓名\t性别\t年龄");
        System.out.println("--------------------");
        System.out.println("张三\t男\t20");
        System.out.println("李四\t女\t18");
    }
}

/**
 * **5: 错误: 找不到符号**
 * **3: 错误: 无法从静态上下文中引用非静态 方法**
 *
 * 怎么出现的：函数没加static
 * 解决办法：函数定义时带上static。如果是非main函数，可以去掉该函数的static。  总之要么都有static，要么都没有(？)
 * 出现原因：
 * > 静态方法中不能直接调用非静态方法。因为非静态方法不是独立存在的，它是依附于对象存在——即只有申明了对象，才能通过对象调用。
 * > 而静态方法则可以直接通过类名调用，而不需要申明对象。因此直接引用非静态方法就会出错。
 * > 比如常见的main方法都是静态的，必须由static修饰，因此在main方法里调用类的其他非静态方法，都是需要先申明对象，才能用。否则就会出现引用非静态方法的错误。
 *
 */

