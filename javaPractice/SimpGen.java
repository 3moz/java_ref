//a simple generic class with two type parameters: T and V
class TwoGen<T, V> {
    T ob1;
    V ob2;

    //pass the contructor a refgerence to an object of type T and object of type V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    //Show type of T and V
    void showTypes() {
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}

//demonstrate TwoGen
class SimpGen {
    public static void main(String args[]) {

        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics!");

        //show the types
        tgObj.showTypes();

        //obtain and show values
        int v = tgObj.getob1();
        System.out.println("value: " + v);

        String str = tgObj.getob2();
        System.out.println("value: " + str);
    }
}

// output:
// Type of T is java.lang.Integer
// Type of V is java.lang.String
// value: 88
// value: Generics!