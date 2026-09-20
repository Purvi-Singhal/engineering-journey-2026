/**
 * q6_scope_tracer.java
 * 
 * Detailed tracing problem for variable shadowing and nested scopes.
 */
public class q6_scope_tracer {
    static int globalVal = 100;
    int instanceVal = 50;

    public void runTrace() {
        int instanceVal = 20; // Shadows field 'instanceVal'
        int blockAccumulator = 0;

        System.out.println("Step 1: Method entry");
        System.out.println("  Local instanceVal       = " + instanceVal);       // 20
        System.out.println("  Object this.instanceVal = " + this.instanceVal);  // 50
        System.out.println("  Static globalVal        = " + globalVal);         // 100

        {
            // Block 1
            int temp = 5;
            blockAccumulator += (instanceVal * temp); // 20 * 5 = 100
            System.out.println("Step 2: Inside Block 1");
            System.out.println("  temp                    = " + temp);              // 5
            System.out.println("  blockAccumulator        = " + blockAccumulator); // 100
        }

        {
            // Block 2: temp is redeclared in independent block
            int temp = 10;
            blockAccumulator += (this.instanceVal * temp); // 50 * 10 = 500
            System.out.println("Step 3: Inside Block 2");
            System.out.println("  temp                    = " + temp);              // 10
            System.out.println("  blockAccumulator        = " + blockAccumulator); // 600
        }

        System.out.println("Step 4: Method exit");
        System.out.println("  Final blockAccumulator  = " + blockAccumulator);      // 600
    }

    public static void main(String[] args) {
        System.out.println("====== SCOPE & SHADOWING TRACE ======");
        q6_scope_tracer tracer = new q6_scope_tracer();
        tracer.runTrace();
        System.out.println("=====================================");
    }
}
