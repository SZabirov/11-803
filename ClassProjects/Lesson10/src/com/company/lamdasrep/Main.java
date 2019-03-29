package com.company.lamdasrep;

public class Main {

    public static void main(String[] args) {
	    MyStrings ms = new MyStrings();
	    ms.add("aaaa");
	    ms.add("qweporiu");
	    MyFunction mf = new MyFunction() {
            @Override
            public String process(String s) {
                return s.toUpperCase();
            }
        };
	    MyFunction mfWithLambda = s -> s.toUpperCase();
	    ms.processAll(mfWithLambda);
	    ms.showAll();
    }
}
