package org.example;

/**
 * Anonymous classes
 * example_1
 */

class Action {
    public void doAction() {
        System.out.println("Doing an action");
    }
}


class Human {

    public void doYoga() {
        Action action = new Action() {
            public void doAction() {
                System.out.println("Doing yoga.");
            }
        };
        action.doAction();
    }
}

/**
 * Anonymous classes
 * example_2
 */

//class CalculatorWrapper {
//    static Calculator anonymousCalculator = new Calculator() {
//        @Override
//        public long sum(long val1, long val2) {
//            return val1 + val2;
//        }
//
//        @Override
//        public long subtraction(long val1, long val2) {
//            return val1 - val2;
//        }
//    };
//}
//
//abstract class Calculator {
//
//    public abstract long sum(long val1, long val2);
//
//    public abstract long subtraction(long val1, long val2);
//}

/**
 * Anonymous classes
 * example_3
 */
//class IteratorExecutor {
//
//    static void performIterationsWithCallback(int numberOfIterations, LoopCallback callback) {
//        for (int i = 0; i < numberOfIterations; i++) {
//            callback.onNewIteration(i);
//
//        }
//    }
//
//    static void startIterations(int numberOfIterations) {
//        // invoke the method performIterationsWithCallback here
//        LoopCallback loopCallback = new LoopCallback() {
//            @Override
//            public void onNewIteration(int iteration) {
//                System.out.println("Iteration: " + iteration);
//
//            }
//        };
//        performIterationsWithCallback(numberOfIterations, loopCallback);
//    }
//}
//
//// Don't change the code below
//interface LoopCallback {
//
//    void onNewIteration(int iteration);
//}

/**
 * Anonymous classes
 * example_4
 */
//
//import java.util.Scanner;
//
//public class Main {
//
//    private static String message;
//    private static int errorCode;
//
//    public static void main(String[] args) {
//
//        final Scanner scanner = new Scanner(System.in);
//        message = scanner.nextLine();
//        errorCode = Integer.parseInt(scanner.nextLine());
//
//        Callback callback = new Callback() {
//            @Override
//            public void onStarted() {
//                System.out.println("The process started");
//            }
//
//            @Override
//            public void onStopped(String cause) {
//                System.out.println(cause);
//
//            }
//
//            @Override
//            public void onFinished(int code) {
//                if (code == 0) System.out.println("The process successfully finished");
//                else System.out.println("The process is finished with error: " + code);
//
//            }
//
//        };
//        startLongProcess(callback);
//
//    }
//
//    public static void startLongProcess(Callback callback) {
//        callback.onStarted();
//        callback.onStopped(message);
//        callback.onStarted();
//        callback.onFinished(errorCode);
//    }
//
//}
//
//interface Callback {
//
//    void onStarted();
//
//    void onStopped(String cause);
//
//    void onFinished(int code);
//}

//import static org.example.SuperClass.method1;


/**
 * Anonymous classes
 * example_5
 */

//import static org.example.SuperClass.method1;
//
//abstract class SuperClass {
//
//    public static void method1() {
//        System.out.println("It's a static method.");
//    }
//
//    public void method2() {
//        System.out.println("It's not a static method.");
//    }
//
//    public abstract void method3();
//}
//
//class CreateInstance {
//
//    public static SuperClass create() {
//
//        SuperClass instance = new SuperClass() {
//
//            @Override
//            public void method2() {
//                System.out.println("method2");
//            }
//
//            @Override
//            public void method3() {
//                System.out.println("method3");
//
//            }
//        };
//
//        method1();
//        instance.method2();
//        instance.method3();
//
//        return instance;
//    }
//}
//public class Main{
//    public static void main(String[] args) {
//        CreateInstance.create();
//
//    }
//}

/**
 * Anonymous classes
 * example_6
 */

//class MyExample {
//    public static void main(String[] args) {
//
//        //Anonymous class is created as a constructor argument
//        Thread t = new Thread(new Runnable() {
//            public void run() {
//                System.out.println("Run, Forrest, run!");
//            }
//        });
//        t.run();
//    }
//}


