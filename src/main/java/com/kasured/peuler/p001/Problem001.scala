object Problem001 {

    //boilerplate
    def main(args: Array[String]) {
        if(args == null || args.length < 1) {println(0)} else {
            val N = java.lang.Integer.parseInt(args(0), 10)
            println(solve(N))
        }
    }

    def solve(N: Long): Long = {
        //check edge case and go into tailrec dance
        if(N < 3) 0 else doSolve(N, 3, 1, 0) + doSolve(N, 5, 1, 0) - doSolve(N, 15, 1, 0)
    }

    @scala.annotation.tailrec
    def doSolve(N: Long, mod: Long, idx: Long, acc: Long): Long = {
        //calc current value
        val n = mod * idx;
        //check if it out of upper bound return accumulator
        //else do tailrec call with updated sum and increased index
        if(n >= N) acc else doSolve(N, mod, idx + 1, acc + n)
    }

}

