package StringExercice;

// 1. 字符串循环移位包含
// 给定两个字符串 s1 和 s2，要求判定 s2 是否能够被 s1 做循环移位得到的字符串包含。
public class StringRotationContains {
    public boolean StringRotationContains(String s1, String s2) {
        String s = s1 + s1;
        return s.contains(s2);
    }
}
