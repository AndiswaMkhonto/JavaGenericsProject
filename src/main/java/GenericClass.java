public class GenericClass<T> {
    /*Generic class of type T to set and get a private single
      variable which can either be String or Integer*/
    private T values;

    public T getValues() {
        return values;
    }

    public void setValues(T values) {
        this.values = values;
    }

    public <T> void printArrayContent(T[] array) {
        for (T items : array) {
            System.out.print(items + " "); // Print both integer and/or string elements
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        GenericClass g = new GenericClass();

        /*Instantiating the values of the array contents*/
        GenericClass<String> stringInstance = new GenericClass<String>();
        GenericClass<Integer> integerInstance = new GenericClass<Integer>();

        stringInstance = new GenericClass<String>();
        stringInstance.setValues("Test");

        //This should print out the word Test
        System.out.println(stringInstance.getValues());

        integerInstance = new GenericClass<Integer>();
        integerInstance.setValues(1000);

        //This is should print out 100
        System.out.println(integerInstance.getValues());
        //Using the array content method to print out the contents of the array
        g.printArrayContent(new Integer[]{12, 324, 6, 7900});
        g.printArrayContent(new String[]{"Andi", "Vicky"});

    }
}




