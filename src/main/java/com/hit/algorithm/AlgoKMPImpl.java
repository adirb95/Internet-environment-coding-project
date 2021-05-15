package com.hit.algorithm;

public class AlgoKMPImpl implements IAlgoKMP {
    public AlgoKMPImpl() {
        super();
    }

    @Override
    public Boolean k_m_p(String p, String t) {
        int[] pai_arr = this.Reisha(p, t);
        int i = 0, j = 0, res = -1;
        while (i < t.length()) {
            if (t.toCharArray()[i] == p.toCharArray()[j]) {
                if (res == -1) res = i;
                i++;
                j++;
                if (j == p.length()) return true;
            } else {


                if (j > 0) {
                    j = pai_arr[j - 1];
                    res = -1;
                } else i++;

            }
        }
        if (j != p.length()) return false;
        return true;
    }

    @Override
    public int[] Reisha(String P, String T) {
        int[] arr_pai = new int[P.length()];
        int i = 1, j = 0;
        arr_pai[0] = 0;
        while (i < P.length()) {
            if (P.toCharArray()[i] == P.toCharArray()[j]) {
                arr_pai[i] = (j++) + 1;
                i++;
            } else {
                if (j > 0) {
                    j = arr_pai[j - 1];
                } else
                    i++;
            }

        }
        return arr_pai;
    }
}
