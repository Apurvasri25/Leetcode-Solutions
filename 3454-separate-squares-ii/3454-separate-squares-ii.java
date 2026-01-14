class Solution {
    class SegTree {
        int[] cnt;
        long[] covered;
        int[] xs;
        SegTree(int n, int[] xs) {
            cnt = new int[4*n];
            covered = new long[4*n];
            this.xs = xs;
        }
        void update(int idx, int l, int r, int ql, int qr, int val) {
            if (qr <= l || r <= ql) return;
            if (ql <= l && r <= qr) {
                cnt[idx] += val;
            } else {
                int mid = (l + r)/2;
                update(idx*2, l, mid, ql, qr, val);
                update(idx*2+1, mid, r, ql, qr, val);
            }
            if (cnt[idx] > 0) {
                covered[idx] = xs[r] - xs[l];
            } else {
                covered[idx] = (r - l > 1)? covered[idx*2] + covered[idx*2+1]: 0;
            }
        }
    }

    public double separateSquares(int[][] squares) {
        List<int[]> evs = new ArrayList<>();
        TreeSet<Integer> setX = new TreeSet<>();
        for (int[] sq: squares) {
            evs.add(new int[]{sq[1], 1, sq[0], sq[0]+sq[2]});
            evs.add(new int[]{sq[1]+sq[2], -1, sq[0], sq[0]+sq[2]});
            setX.add(sq[0]);
            setX.add(sq[0]+sq[2]);
        }
        evs.sort(Comparator.comparingInt(a->a[0]));
        int[] xs = setX.stream().mapToInt(i->i).toArray();
        SegTree tree = new SegTree(xs.length-1, xs);

        // total area
        long area = 0;
        int prevY = evs.get(0)[0];
        for (int[] e: evs) {
            area += tree.covered[1] * (e[0]-prevY);
            tree.update(1, 0, xs.length-1,
                Arrays.binarySearch(xs, e[2]),
                Arrays.binarySearch(xs, e[3]), e[1]);
            prevY = e[0];
        }
        double half = area/2.0;

        tree = new SegTree(xs.length-1, xs);
        area = 0;
        prevY = evs.get(0)[0];
        for (int[] e: evs) {
            long w = tree.covered[1];
            double areaStep = w * (e[0]-prevY);
            if (area + areaStep >= half) {
                return prevY + (half-area)/w;
            }
            area += areaStep;
            tree.update(1, 0, xs.length-1,
                Arrays.binarySearch(xs, e[2]),
                Arrays.binarySearch(xs, e[3]), e[1]);
            prevY = e[0];
        }
        return prevY;
    }
}
