package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 1){
            result.add(Arrays.asList(1));
            return result;
        }else {
            List<List<Integer>> prevTriangle = generate(numRows - 1);
            List<Integer> lastRow = prevTriangle.get(prevTriangle.size() - 1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1); // Thêm phần tử đầu tiên

            for (int i = 1; i < lastRow.size(); i++) {
                newRow.add(lastRow.get(i - 1) + lastRow.get(i));
            }

            newRow.add(1); // Thêm phần tử cuối cùng
            prevTriangle.add(newRow);

            return prevTriangle;
        }
    }
}
