package src;
/*
class Holder<T>
        定义一个类型参数变量，变量名是T（单个大写字母是命名习惯）
 */
public class Holder<T> {
    private T value;//使用上面的类型参数T
    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
