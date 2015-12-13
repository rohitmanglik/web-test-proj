package com.rohit;

/**
 * Created by PPP on 1/25/2015.
 */
public class MyModal {
    int empId;
    String empName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyModal myModal = (MyModal) o;

        if (empId != myModal.empId) return false;
        if (empName != null ? !empName.equals(myModal.empName) : myModal.empName != null) return false;

        return true;
    }

    private void method1() {
        System.out.println();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public MyModal(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
}


class testing extends MyModal{

    public testing(int empId, String empName) {
        super(empId, empName);
    }

    @Override
    public void method1(){

    }
}
