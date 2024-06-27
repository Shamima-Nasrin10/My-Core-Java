
package entity;

public class Teacher {
    
    private int teaid;
    private String name;
    private String email;
    private String address;
    private String cellno;

    public Teacher() {
    }

    public Teacher(int teaid, String name, String email, String address, String cellno) {
        this.teaid = teaid;
        this.name = name;
        this.email = email;
        this.address = address;
        this.cellno = cellno;
    }

    public Teacher(String name, String email, String address, String cellno) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.cellno = cellno;
    }

    public int getTeaid() {
        return teaid;
    }

    public void setTeaid(int teaid) {
        this.teaid = teaid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellno() {
        return cellno;
    }

    public void setCellno(String cellno) {
        this.cellno = cellno;
    }

    @Override
    public String toString() {
        return "Teacher{" + "teaid=" + teaid + ", name=" + name + ", email=" + email + ", address=" + address + ", cellno=" + cellno + '}';
    }
    
    
    
}
