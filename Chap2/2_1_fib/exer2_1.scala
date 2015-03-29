object exer2_1{
    def fib(n: Int) :Int ={
        if (n == 0) 0
        else if (n ==1) 1
        else {
            @annotation.tailrec
            def go(index:Int, before:Int, before2: Int): Int ={
                if (index == n) before + before2
                else go(index + 1, before + before2, before)
            }
            go(2, 1, 0)
        }
    }
}