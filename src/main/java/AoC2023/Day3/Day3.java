package AoC2023.Day3;

import java.util.List;

public class Day3 {

    private List<String> lines;
    private String number1;
    private String number2;

    public Day3(String i) {
        lines = new Input(i).parseInput();
    }

    public int task1() {
        int res = 0;
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            String lineBefore = "";
            String lineAfter = "";
            if (y > 0) {
                lineBefore = lines.get(y - 1);
            }
            if (y < lines.size() - 1) {
                lineAfter = lines.get(y + 1);
            }
            boolean hasadjacentSymbol = false;
            String number = "";
            for (int x = 0; x < line.length(); x++) {
                char c = line.charAt(x);
                if (c == '.') {
                    boolean symbolDiagonaly = false;
                    if (!lineBefore.isEmpty() && lineBefore.charAt(x) != '.' && !Character.isDigit(lineBefore.charAt(x))) {
                        hasadjacentSymbol = true;
                        symbolDiagonaly = true;
                    }
                    if (!lineAfter.isEmpty() && lineAfter.charAt(x) != '.' && !Character.isDigit(lineAfter.charAt(x))) {
                        hasadjacentSymbol = true;
                        symbolDiagonaly = true;
                    }

                    if (!lineBefore.isEmpty() && lineBefore.charAt(x) != '.' && !Character.isDigit(lineBefore.charAt(x))) {
                        hasadjacentSymbol = true;
                        symbolDiagonaly = true;
                    }
                    if (!lineAfter.isEmpty() && lineAfter.charAt(x) != '.' && !Character.isDigit(lineAfter.charAt(x))) {
                        hasadjacentSymbol = true;
                        symbolDiagonaly = true;
                    }

                    if (!number.isEmpty() && hasadjacentSymbol) {
                        res += Integer.parseInt(number);
                    }
                    if (!symbolDiagonaly) {
                        hasadjacentSymbol = false;
                    }
                    number = "";
                } else if (Character.isDigit(c)) {
                    number += c;
                    if (!lineBefore.isEmpty() && lineBefore.charAt(x) != '.' && !Character.isDigit(lineBefore.charAt(x))) {
                        hasadjacentSymbol = true;
                    }
                    if (!lineAfter.isEmpty() && lineAfter.charAt(x) != '.' && !Character.isDigit(lineAfter.charAt(x))) {
                        hasadjacentSymbol = true;
                    }
                } else {
                    hasadjacentSymbol = true;
                    if (!number.isEmpty()) {
                        res += Integer.parseInt(number);
                        number = "";
                    }
                }
            }
            if (!number.isEmpty() && hasadjacentSymbol) {
                res += Integer.parseInt(number);
            }
        }
        return res;
    }

    public long task2() {
        long res = 0;
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            String lineBefore = "";
            String lineAfter = "";
            if (y > 0) {
                lineBefore = lines.get(y - 1);
            }
            if (y < lines.size() - 1) {
                lineAfter = lines.get(y + 1);
            }
            for (int x = 0; x < line.length(); x++) {
                char c = line.charAt(x);
                if (c == '*') {
                    String number1 = "";
                    String number2 = "";
                    if (x > 0 && Character.isDigit(line.charAt(x - 1))) { //Check left of *
                        String[] split = line.substring(0, x).split(".");
                        if (split.length > 0) {
                            if (number1.isEmpty()) {
                                number1 = split[split.length - 1];
                            } else {
                                number2 = split[split.length - 1];
                            }
                        } else {
                            if (number1.isEmpty()) {
                                number1 = line.substring(0, x);
                            } else {
                                number2 = line.substring(0, x);
                            }
                        }
                    }
                    if (x < line.length() - 1 && Character.isDigit(line.charAt(x + 1))) {//Check right of *
                        String[] split = line.substring(x + 1).split(".");
                        if (split.length > 0) {
                            if (number1.isEmpty()) {
                                number1 = split[0];
                            } else {
                                number2 = split[0];
                            }
                        } else {
                            if (number1.isEmpty()) {
                                number1 = line.substring(x + 1);
                            } else {
                                number2 = line.substring(x + 1);
                            }
                        }
                    }
                    //Check line before
                    if (!lineBefore.isEmpty()) {
                        if (Character.isDigit(lineBefore.charAt(x)) || (x > 0 && Character.isDigit(lineBefore.charAt(x - 1))) || (x < line.length() - 1 && Character.isDigit(lineBefore.charAt(x + 1)))) {
                            String n = "";
                            char cBefore;
                            for (int xBefore = 0; xBefore < x; xBefore++) {
                                cBefore = lineBefore.charAt(xBefore);
                                if (Character.isDigit(cBefore)) {
                                    n += lineBefore.charAt(xBefore);
                                }
                                if (cBefore == '.') {
                                    n = "";
                                }
                            }
                            int xBefore = x;
                            cBefore = lineBefore.charAt(xBefore);
                            if (Character.isDigit(cBefore)) {
                                n += cBefore;
                            }
                            xBefore++;
                            cBefore = lineBefore.charAt(xBefore);
                            while (Character.isDigit(cBefore)) {
                                n += cBefore;
                                xBefore++;
                                cBefore = lineBefore.charAt(xBefore);
                            }
                            if (number1.isEmpty()) {
                                number1 = n;
                            } else {
                                number2 = n;
                            }
                        }
                    }
                    //Check line after
                    if (!lineAfter.isEmpty()) {
                        if (Character.isDigit(lineAfter.charAt(x)) || (x > 0 && Character.isDigit(lineAfter.charAt(x - 1))) || (x < line.length() - 1 && Character.isDigit(lineAfter.charAt(x + 1)))) {
                            String n = "";
                            char cAfter;
                            for (int xAfter = 0; xAfter < x; xAfter++) {
                                cAfter = lineAfter.charAt(xAfter);
                                if (Character.isDigit(cAfter)) {
                                    n += lineAfter.charAt(xAfter);
                                }
                                if (cAfter == '.') {
                                    n = "";
                                }
                            }
                            int xAfter = x;
                            cAfter = lineAfter.charAt(xAfter);
                            if (Character.isDigit(cAfter)) {
                                n += cAfter;
                            }
                            xAfter++;
                            cAfter = lineBefore.charAt(xAfter);
                            while (Character.isDigit(cAfter)) {
                                n += cAfter;
                                xAfter++;
                                cAfter = lineAfter.charAt(xAfter);
                            }
                            if (number1.isEmpty()) {
                                number1 = n;
                            } else {
                                number2 = n;
                            }
                        }
                    }
                    if (!number1.isEmpty() && !number2.isEmpty()) {
                        res += (long) Integer.parseInt(number1) * Integer.parseInt(number2);
                    }
                }
            }
        }
        return res;
    }
}
