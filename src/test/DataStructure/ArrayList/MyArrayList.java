package test.DataStructure.ArrayList;

/**
 * List(线性表)的特征：
 * 1.线性表的元素有逻辑上的前后关系
 * 2.每个元素都有一个唯一的位置相关联 --下标[0,size)
 *
 * void clear() //清空
 * List<E>subList(int fromindex,int toIndex)//截取部分list
 */

/**
 * 顺序表： 物理上元素相连的线性表 -> 数组
 * 约束：
 *  1) 0 <= size <= array.length
 *      array[0,size) != null
 *      array[size,array.length) == null
 */
public class MyArrayList implements MyList {
    //定义属性
    private Long[] array; //array.length 也就是我们的容量(capacity)
    private int size;     //保存元素的个数

    //构造方法
    //无参构造
    public MyArrayList(){
        // 容量没有规定,自行规定
        // 元素个数 == 0
        this.array = new Long[20];
        this.size = 0;
        //这一步不是必须，将数组中的每个位置都初始化成null
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }
    //有参构造
    public MyArrayList(int initalCapacity){
        // 容量有规定为 initalCapacity
        // 元素个数 == 0
        this.array = new Long[initalCapacity];
        this.size = 0;
        //这一步不是必须，将数组中的每个位置都初始化成null
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }
    /**
     * 返回线性表中的元素个数
     * @return
     */
    @Override
    public int size() {
        return size;
    }
    /**
     * 将 e 尾插到线性表中，一定返回true
     * @param e
     * @return
     */
    @Override
    public boolean add(Long e) {
        //TODO:回头解决扩容的问题，即现在假设 capacity是足够的
        //为size赋予了一个新的逻辑含义 —— 尾插时的元素的位置
        array[size] = e;
        //让元素个数 + 1
        size = size + 1;
        //返回true代表插入成功
        return true;
    }
    /**
     * 将 e 插入线性表的 index位置 ，从[index , size() )向后移
     * index 的合法下标 [0 , size() ]
     * 如果下标不合法，抛出一个 ArrayIndexOutOfBoundsException
     * @param index
     * @param e
     */
    @Override
    public void add(int index, Long e) {
        //TODO:回头解决扩容的问题，即现在假设 capacity是足够的
        //首先判断下标是否合法
        if(index < 0 || index > size){
            //此时下标不合法，抛出异常
            throw new ArrayIndexOutOfBoundsException("下标不合法，发生数组越界异常");
        }

        //此处，下标一定合法
        //从后往前搬，将index 位置空下来，即从size - 1开始搬，一直到index
        //i : 搬家时的出发点
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];//将array[i] 搬到 array[i + 1]
        }
        //将e放到 [index] 位置
        array[index] = e;
        //元素个数 + 1
        size = size + 1;
    }
    /**
     * 删除 index 位置的元素
     * index 的合法下标 [0 , size() )
     * 如果下标不合法，抛出一个 ArrayIndexOutOfBoundsException
     * @param index
     * @return 从线性表中删除的元素
     */
    //时间复杂度O(n)
    @Override
    public Long remove(int index) {
        //首先判断下标是否合法
        if(index < 0 || index >= size){
            //此时下标不合法，抛出异常
            throw new ArrayIndexOutOfBoundsException("下标不合法，发生数组越界异常");
        }

        //此处，下标一定合法
        Long temp = array[index];
        //搬家 此时起始点为index + 1
        //[index + 1,size)
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        //最后面的那个变成空
        //真实中是否置null ，需要根据性能考虑
        array[size - 1] = null;
        size--;
        return temp;
    }
    /**
     * 从前到后，删除第一个遇到的 e (equals() == true)
     * @param e
     * @return 删除成功，返回true ，删除失败(没有该元素)，返回 false
     */
    //时间复杂度O(n)
    @Override
    public boolean remove(Long e) {
        //按照从前到后的顺序，找到第一个遇到的 e
        for (int i = 0; i < size; i++) {
            //比较 array 的值 是否和e 相等(equals)
            if(array[i].equals(e)){
                remove(i);
                return true;
            }
        }

        //循环结束，说明没有找到
        return false;
    }
    /**
     * 直接返回 index 位置的元素
     * index 的合法下标 [0 , size() )
     * @param index
     * @return
     * 时间复杂度O(1)
     */
    @Override
    public Long get(int index) {
        //首先判断下标是否合法
        if(index < 0 || index >= size){
            //此时下标不合法，抛出异常
            throw new ArrayIndexOutOfBoundsException("下标不合法，发生数组越界异常");
        }

        //此处，下标一定合法
        return array[index];
    }
    /**
     * 使用 e 替换index 位置的元素
     * index 的合法下标 [0 , size() )
     * @param index
     * @param e
     * @return 原来 index 位置的元素
     * 时间复杂度O(1)
     */
    @Override
    public Long set(int index, Long e) {
        //首先判断下标是否合法
        if(index < 0 || index >= size){
            //此时下标不合法，抛出异常
            throw new ArrayIndexOutOfBoundsException("下标不合法，发生数组越界异常");
        }

        //此处，下标一定合法
        Long l = array[index];
        array[index] = e;
        return l;
    }
    /**
     * 返回第一次遇到 e 的下标 (equals() == true)
     * @param e
     * @return 如果没有遇到 ，返回 -1
     * 时间复杂度O(N)
     */
    @Override
    public int indexOf(Long e) {
        //按照从前到后的顺序，找到第一个遇到的 e
        for (int i = 0; i < size; i++) {
            //比较 array 的值 是否和 e 相等(equals)
            if(array[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    /**
     * 从后往前 ，返回第一次遇到 e 的下标 (equals() == true)
     * @param e
     * @return 如果没有遇到 ，返回 -1
     * 时间复杂度O(N)
     */
    @Override
    public int lastIndexOf(Long e) {
        //按照从前到后的顺序，找到第一个遇到的 e
        for (int i = size - 1; i >= 0 ; i--) {
            //比较 array 的值 是否和 e 相等(equals)
            if(array[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    /**
     * 线性表中是否包含 e (equals() == true)
     * @param e
     * @return
     * 时间复杂度O(N)
     */
    @Override
    public boolean contains(Long e) {
//        //按照从前到后的顺序，找到第一个遇到的 e
//        for (int i = 0; i < size; i++) {
//            //比较 array 的值 是否和 e 相等(equals)
//            if(array[i].equals(e)){
//                return true;
//            }
//        }
//        return false;
        return indexOf(e) != -1;
    }

    /**
     * 清空线性表
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        this.size = 0;
    }

    /**
     * 判断线性表是否是空的（empty） 等价于一个元素都没有
     * @return
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private static void 检查顺序表是否合法(MyArrayList myArrayList){
        //1) 0 <= size <= array.length
        if(myArrayList.size < 0){
            throw new RuntimeException();
        }
        if(myArrayList.size > myArrayList.array.length){
            throw new RuntimeException();
        }
        //     array[0,size) != null
        for (int i = 0; i < myArrayList.size; i++) {
            if(myArrayList.array[i] == null){
                throw new RuntimeException();
            }
        }
        //array[size,array.length) == null
        for (int i = myArrayList.size; i < myArrayList.array.length; i++) {
            if(myArrayList.array[i] != null){
                throw new RuntimeException();
            }
        }
    }
    private static void 断言顺序表的元素个数一定是(MyArrayList myArrayList,int size){
        if(myArrayList.size != size){
            throw new RuntimeException();
        }
    }
    private static void 断言顺序表的指定位置元素一定是(MyArrayList myArrayList,int index,long e){
        //Long != long
        //long != long
        if(myArrayList.array[index] != e){
            throw new RuntimeException();
        }
    }
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        检查顺序表是否合法(myArrayList);
        //无参构造方法定义的顺序表，size 应该是0
        断言顺序表的元素个数一定是(myArrayList, 0);

        /**
         * 先测试尾插add()
         */
        boolean r;
        r = myArrayList.add(Long.valueOf(100));//手动把 int 包装成 Long
        //检查 r 必须是 true
        if(r == false){
            throw new RuntimeException();
        }
        检查顺序表是否合法(myArrayList);
        断言顺序表的元素个数一定是(myArrayList, 1);
//        if(myArrayList.array[0] != 100){//Long != int
//                                        //long != int
//                                        //long != long
//            throw new RuntimeException();
//        }
        断言顺序表的指定位置元素一定是(myArrayList, 0, 100);
//        myArrayList.add(10L);//编译器自动把long 包装成 Long
//        myArrayList.add(20L);
//        myArrayList.add(30L);
//        myArrayList.add(40L);
//        myArrayList.add(50L);
//        System.out.println(Arrays.toString(myArrayList.array));
//        myArrayList.remove(2);
//        System.out.println(Arrays.toString(myArrayList.array));
        /**
        * 测试 根据index 进行插入add(int index,Long e)
         */
        myArrayList.add(1,200L);
        检查顺序表是否合法(myArrayList);
        断言顺序表的元素个数一定是(myArrayList, 2);
        断言顺序表的指定位置元素一定是(myArrayList, 0, 100);
        断言顺序表的指定位置元素一定是(myArrayList, 1, 200);
        myArrayList.add(0,0L);
        检查顺序表是否合法(myArrayList);
        断言顺序表的元素个数一定是(myArrayList,3 );
        断言顺序表的指定位置元素一定是(myArrayList, 0, 0);
        断言顺序表的指定位置元素一定是(myArrayList, 1, 100);
        断言顺序表的指定位置元素一定是(myArrayList, 2, 200);
        myArrayList.add(1,300L);
        检查顺序表是否合法(myArrayList);
        断言顺序表的元素个数一定是(myArrayList,4 );
        断言顺序表的指定位置元素一定是(myArrayList, 0, 0);
        断言顺序表的指定位置元素一定是(myArrayList, 1, 300);
        断言顺序表的指定位置元素一定是(myArrayList, 2, 100);
        断言顺序表的指定位置元素一定是(myArrayList, 3, 200);
//        myArrayList.add(13,4000L);//非法下标，抛出异常

        /**
         * 测试 remove(int index)
         */
        Long l = myArrayList.remove(1);
        if(l != 300){
            throw new RuntimeException();
        }
        检查顺序表是否合法(myArrayList);
        断言顺序表的元素个数一定是(myArrayList,3 );
        断言顺序表的指定位置元素一定是(myArrayList, 0, 0);
        断言顺序表的指定位置元素一定是(myArrayList, 1, 100);
        断言顺序表的指定位置元素一定是(myArrayList, 2, 200);

//        System.out.println(Arrays.toString(myArrayList.array));// [0,100,200]
        myArrayList.add(300L);
        myArrayList.add(200L);
        myArrayList.remove(200L);
        检查顺序表是否合法(myArrayList);
        断言顺序表的元素个数一定是(myArrayList, 4);
        断言顺序表的指定位置元素一定是(myArrayList, 0, 0);
        断言顺序表的指定位置元素一定是(myArrayList, 1, 100);
        断言顺序表的指定位置元素一定是(myArrayList, 2, 300);
        断言顺序表的指定位置元素一定是(myArrayList, 3, 200);
//        System.out.println(Arrays.toString(myArrayList.array));
//        System.out.println(myArrayList.remove(5000L));
        MyArrayList myArrayList1 = new MyArrayList(100);
        Long E = myArrayList1.get(2);//发生越界异常  区分 容量 和 元素个数
    }
}
