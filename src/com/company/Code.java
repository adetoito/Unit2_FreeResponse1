package com.company;

public class Code {

    private String myCode;
    public char codeArray[];
    public char xArray[];
    public char tempArray[];

    public String xArrayString = "";
    public String temporary () {
        return xArrayString;
    }

    public Code (String code) {

        myCode = code;
        codeArray = myCode.toCharArray();
        xArray = myCode.toCharArray(); // New
        for (int counter = 0; counter < codeArray.length; counter++) {
            xArray[counter] = 'X';
        }
        tempArray = codeArray;

        xArrayString = xArray.toString();

    }

    public String getCode () {

        return myCode;

    }

    public void hide (int p1, int p2) {

        System.arraycopy(xArray, p1, tempArray, p1, p2);
        myCode = tempArray.toString();

    }

    public void recover (int p1, int p2) {

        System.arraycopy(codeArray, p1, tempArray, p1, p2);
        myCode = tempArray.toString();

    }

}
