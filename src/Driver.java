public class Driver {


//    private static int[] set1 = {1,2,3};
//    private static int[] set2 = {4,5,6};
//    private static int[] set3 = {7,8,9};
    //this returns true for both disjoint methods

    private static int[] set1 = {1,2,3};
    private static int[] set2 = {1,5,6};
    private static int[] set3 = {1,8,9};
    //this returns false for both disjoint methods

    private static MySet setA = new MySet(set1);
    private static MySet setB = new MySet(set2);
    private static MySet setC = new MySet(set3);

    public static void main(String[] args){
        long start = System.nanoTime();
        System.out.println(setA.disjoint1(setB,setC));
        System.out.println("Disjoint1: " + (System.nanoTime() - start));
        start = System.nanoTime();
        System.out.println(setA.disjoint2(setB,setC));
        System.out.println("Disjoint2: " + (System.nanoTime() - start));
        //disjoint 2 runs much faster
    }
}
