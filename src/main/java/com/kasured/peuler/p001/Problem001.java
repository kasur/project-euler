class Problem001 {


    public static void main(final String[] args) {
        final int N = Integer.parseInt(args[0], 10);
        System.out.println(solve(N));
    }

    /**
     * @param N - the upper limit 
     */
    public static long solve(final long N) {
        if(N < 3) {
            return 0;
        }

        return doSolve(N, 3L, 1L, 0L) + doSolve(N, 5L, 1L, 0L) - doSolve(N, 15L, 1L, 0L);
    }

    @tailrec
    private static long doSolve(final long N, final long mod, final long idx, final long acc) {
        final long n = mod * idx;
        if(n >= N) {
            return acc;
        } else {
            return doSolve(N, mod, idx + 1, acc + n);
        }
    }

}

