package Class1;

public class SearchInArray {
    public static int SearchInArray(int a[], int key) {

        int res = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                res = i;
            }
        }
        return res;

    }
}
