public class IntegerTwo {

    public int value;

    public IntegerTwo(){

        this.value = 0;
    }

    public IntegerTwo(int value){

        this.value = value;
    }

public void setValue(int value){

    this.value = value;
}
public int getValue(){

    return this.value;
}

public boolean isEven(){
        return value%2==0;
}

public boolean isOdd(){
        return value%2!=0;
}

public  void prettyPrint(){
        IO.println(value);
}

public  String toString(){
        String valueStr = Integer.toString(value);
        return valueStr;
}

}