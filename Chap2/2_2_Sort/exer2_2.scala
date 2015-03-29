object exer2_2{
    def isSorted[A] (as: Array[A], ordered: (A, A) => Boolean): Boolean = {
        @annotation.tailrec
        def go (as2: Array[A], n: A): Boolean = {
            if (as2.length == 0) true
            else if (ordered(n, as2(0)) == false) {
                false
            }
            else go (as2.tail, as2(0))
        }
        go(as.tail, as(0))
    }
}