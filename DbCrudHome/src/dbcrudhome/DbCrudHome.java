package dbcrudhome;

import entity.Teacher;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class DbCrudHome {

    static DbUtil db = new DbUtil();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql = "";

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        
        List<Teacher> teacherList=getById(4);
        
        teacher.setName(teacherList.get(0).getName());
        teacher.setEmail(teacherList.get(0).getEmail());
        teacher.setAddress("Rajshahi");
        teacher.setCellno(teacherList.get(0).getCellno());
        teacher.setTeaid(teacherList.get(0).getTeaid());
//        saveData();
//        System.out.println("Before Update");
//        showData();
//        deleteData(3);
//        deleteData(5);
//        showData();
//        teacher.setName("Dipu");
//        teacher.setEmail("samma@gmail.com");
//        teacher.setAddress("Chattogram");
//        teacher.setCellno("01838020");
//        teacher.setTeaid(4);
        editData(teacher);
        System.out.println("After Update");
        showData();

    }

    public static void saveData() {

        sql = "insert into teacher(name, email, address, cellno) values(?,?,?,?)";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, "Sabiha");
            ps.setString(2, "sabiha@gmail.com");
            ps.setString(3, "USA");
            ps.setString(4, "01521499");

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DbCrudHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showData() {
        sql = "select * from teacher";

        try {
            ps = db.getCon().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                int teaid = rs.getInt("teaid");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cellno = rs.getString("cellno");

                System.out.printf("Id:-%d \tName:%s \tEmail:%s \tAddress:%s \tCell No:%s\n", teaid, name, email, address, cellno);
            }

            ps.close();
            rs.close();
            db.getCon().close();

        } catch (SQLException ex) {
            Logger.getLogger(DbCrudHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void editData(Teacher t) {

        sql = "update teacher set name=?, email=?, address=?, cellno=? where teaid=?";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setString(1, t.getName());
            ps.setString(2, t.getEmail());
            ps.setString(3, t.getAddress());
            ps.setString(4, t.getCellno());

            ps.setInt(5, t.getTeaid());

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

            System.out.println("Edit Successfull!");

        } catch (SQLException ex) {
            Logger.getLogger(DbCrudHome.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static List<Teacher> getById(int teaid) {

        List<Teacher> teacherList = new ArrayList<>();

        sql = "select * from teacher where teaid=?";

        try {
            ps = db.getCon().prepareStatement(sql);
            ps.setInt(1, teaid);

            rs = ps.executeQuery();

            while (rs.next()) {
                Teacher t = new Teacher(
                        rs.getInt("teaid"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("cellno")
                );
                teacherList.add(t);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DbCrudHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teacherList;
    }

    public static void deleteData(int teaid) {
        sql = "delete from teacher where teaid=?";

        try {
            ps = db.getCon().prepareStatement(sql);

            ps.setInt(1, teaid);

            ps.executeUpdate();
            ps.close();
            db.getCon().close();

            System.out.println("Data deleted");
        } catch (SQLException ex) {
            Logger.getLogger(DbCrudHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
