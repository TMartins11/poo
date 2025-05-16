package apphostel.model;

public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Wrapper classes: Boolean, Byte, Short, Integer, Long, Float, Double, Character.

        // Primitive Types
        int i = 50;
        System.out.println("i is equal to: " + i);

        // Using wrapper classes

        // Deprecated way, worst performance.
        // 'new Integer(i)' is deprecated because it creates a new object every time
        // instead of reusing objects from a cache (for small values,  -128 to 127).
        // This can lead to performance issues.
        Integer wrngWrapper = new Integer(5);  // Obsolete approach
        System.out.println(wrngWrapper.intValue());

        // Correct way to create an Integer wrapper.
        // Integer.valueOf(i) is the recommended approach, and it may reuse a cached object.
        Integer iWrapper = Integer.valueOf(i);
        System.out.println(iWrapper.byteValue());

        // Easiest way to create an Integer wrapper.
        // Auto-boxing: Java will automatically convert a primitive to its wrapper class.
        Integer xWrapper = 5; // Auto-boxing in action
        System.out.println(xWrapper.intValue());

        /*
         * Unboxing: Converting an Integer (object) to an int (primitive).
         * This process is automatic in Java (auto-unboxing).
         */
        int a = iWrapper;  // Unboxing: automatic conversion from Integer to int
        System.out.println(a);

        // Creating an Integer wrapper using valueOf() (recommended approach)
        int x = 11;
        Integer iNumber = Integer.valueOf(x);
        System.out.println(iNumber.byteValue());

        // Creating an Integer wrapper using auto-boxing (simpler alternative)
        Integer ntNumber = 5; // Auto-boxing: Java converts the primitive to an Integer object automatically
        System.out.println(ntNumber.intValue());

        // Correct ways to create a Long wrapper:
        Long numberLong1 = Long.valueOf(5);  // Using valueOf()
        Long numberLong2 = 5L;               // Using auto-boxing (recommended)

        System.out.println(numberLong1);
        System.out.println(numberLong2);
    }
}