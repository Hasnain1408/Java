class Test {
    int a, b;
    Test(int i) {
        a = i;
    }
    Test incrByTen() {
        Test temp = new Test(a+10);
        return temp;
    }


//    Test(int i, int j) {
//        a = i;
//        b = j;
//    }
//    void meth(int i, int j) {
//        i *= 2;
//        j /= 2;
//    }
//    void meth(Test o) {
//        o.a *= 2;
//        o.b /= 2;
//    }


    }

