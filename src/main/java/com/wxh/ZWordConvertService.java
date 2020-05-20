package com.wxh;

import java.util.Arrays;

/**
 * @author wangxiaohui56
 * @date Created in 17:04 2020/5/20
 */
public class ZWordConvertService {
    /**
     * 1.计算出列数
     * 2.计算当前字符映射行列
     * 3.转换为结果
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if (s.length() == 0 || numRows == 1) {
            return s;
        }

        int colNum = s.length() / (2 * numRows - 2);
        if (s.length() % (2 * numRows - 2) > 0) {
            colNum++;
        }

        colNum = colNum * (numRows - 1);

        Character[][] wordNums = new Character[numRows][];

        int row = 0;
        int col = 0;
        int charIndex = 0;
        for (int i = 0; i < numRows; i++) {
            wordNums[i] = new Character[colNum];
        }

        for (int i = 0; i < numRows * colNum; i++) {
            int interval = col % (numRows - 1);

            if (interval == 0 || row == (numRows - 1 - interval)) {
                wordNums[row][col] = s.charAt(charIndex);
                charIndex++;
            } else {
                wordNums[row][col] = null;
            }

            if (charIndex >= s.length()) {
                break;
            }

            if (row == numRows - 1) {
                col++;
            }

            row = (i + 1) % numRows;
        }

        char[] result = new char[s.length()];
        int index = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < colNum; j++) {
                if (wordNums[i][j] != null) {
                    result[index] = wordNums[i][j];
                    index++;
                }
            }
        }


        return String.valueOf(result);
    }

    /**
     * 最终是将结果转换为字符串，所以不必完全纠结格式，直接计算下一个字符位置
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convertPro(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n) {
                    ret.append(s.charAt(j + cycleLen - i));
                }
            }
        }
        return ret.toString();

    }
}
