/**
 * ScopeAndShadowingDemo.java
 * 
 * Demonstrates:
 * 1. Class / Static Scope (global across instances)
 * 2. Instance Field Scope (per object instance)
 * 3. Method / Local Variable Scope
 * 4. Block Scope ({ ... })
 * 5. Variable Shadowing and resolution with 'this' keyword
 */
public class ScopeAndShadowingDemo {

    // 1. Static / Class Variable (Scope: entire class lifecycle)
    static String universe = "Milky Way";

    // 2. Instance Variable (Scope: across all non-static methods in this object instance)
    int score = 100;
    String tag = "GLOBAL_INSTANCE";

    public void demonstrateScopes() {
        // 3. Method Scope / Local Variable
        int score = 500; // SHADOWS the instance variable 'score'
        String methodVar = "Inside demonstrateScopes()";

        System.out.println("--- Method Scope & Shadowing ---");
        System.out.println("Local 'score' (shadows instance field) : " + score);
        System.out.println("Instance 'score' (accessed via this.)   : " + this.score);
        System.out.println("Local 'methodVar'                     : " + methodVar);
        System.out.println("Static 'universe'                     : " + ScopeAndShadowingDemo.universe);

        // 4. Nested Block Scope 1
        {
            int blockA = 10;
            System.out.println("\n--- Inside Block A ---");
            System.out.println("blockA variable: " + blockA);
            System.out.println("Can still read method local score: " + score);
        }
        // System.out.println(blockA); // COMPILE ERROR: blockA cannot be resolved outside its block

        // 5. Nested Block Scope 2 (Independent block)
        {
            // Allowed: blockA is out of scope from the previous block, so we can declare a new one here
            int blockA = 20; 
            int blockB = 30;
            System.out.println("\n--- Inside Block B ---");
            System.out.println("New blockA in Block B: " + blockA);
            System.out.println("blockB in Block B: " + blockB);
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("          SCOPE & VARIABLE SHADOWING DEMO         ");
        System.out.println("==================================================");

        ScopeAndShadowingDemo demo = new ScopeAndShadowingDemo();
        demo.demonstrateScopes();

        System.out.println("==================================================");
    }
}
