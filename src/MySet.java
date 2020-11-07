public class MySet {

    private int[]set;

    public MySet(int[]set){
        this.set = set;
    }

    public int[] getSet(){
        return set;
    }

    public void setSet(int[] set){
        this.set = set;
    }

    // So in that case, it basically means we found an item
    //that exists in all three of the sets. In that case, we want to return false,
    //because we found that there is one item that all the sets have in common. So
    //we'll return false just now. Otherwise, we return true. So essentially, only
    //if this condition is true, do we return false. Every other instance, we return true.
    public boolean disjoint1(MySet setB, MySet setC){
        for(int a : set){
            for(int b:setB.getSet()){
                for(int c : setC.getSet()){
                    if((a == b) && (b == c)){
                        return false;
                    }
                }
            }
        } return true;
    }

    // the second for each loop--
    //we're going to do a first if statement. And what this will do is basically, if
    //a is equal to b, now if and only if that is true, well, we'll check the third
    //instance. Because if you think about it, the only point we ever need to check
    //the third set is if we found something in common between the first and second sets.
    //If whatever we're checking for hasn't been found by that point, as if there's
    //no commonality between the first and second set, there's no point checking the
    //third set. So in essence, if there are no items in common from set 1 and 2 or
    //A and B, then there's no point in checking the third one. So this actually
    //reduces the complexity quite significantly. So here, what we need to do is
    //we'll get rid of this line here and the end. And we'll do a equals c, like that.
    public boolean disjoint2(MySet setB, MySet setC){
        for(int a : set){
            for(int b:setB.getSet()){
                if(a == b){
                    for(int c : setC.getSet()){
                        if(a == c){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
