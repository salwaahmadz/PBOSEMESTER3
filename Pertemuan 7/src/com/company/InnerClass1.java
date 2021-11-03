package com.company;

class OuterClass{
    int x = 10;

    class InnerClass{
        int y = 5;
        public int jumlah(){
            return x+y;
        }
    }
}

public class InnerClass1 {
    public static void main(String[] args){
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println("Hasil = "+ (myInner.jumlah()));
    }
}
