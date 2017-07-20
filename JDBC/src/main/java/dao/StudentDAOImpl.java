package dao;

import daomain.Student;
import util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/07/17.
 */
public class StudentDAOImpl implements StudentDAO{
    private static Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    //增
    public boolean insert(Student entity){
        //声明返回值变量
        boolean flag = false;
        //获取连接对象
        conn = JdbcUtil.getConn();
        //sql语句
        String sql = "insert into businesstable(SName,QQ,Style,Time,School,SNumber,Link,Dream,FBro,YBro,WhereKnow,create_at)" +
                " values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            //由sql语句创建预处理对象
            pstmt = conn.prepareStatement(sql);
            //占位符赋值
            int index = 1;
            pstmt.setObject(index++,entity.getSName());
            pstmt.setObject(index++,entity.getQQ());
            pstmt.setObject(index++,entity.getStyle());
            pstmt.setObject(index++,entity.getTime());
            pstmt.setObject(index++,entity.getSchool());
            pstmt.setObject(index++,entity.getSNumber());
            pstmt.setObject(index++,entity.getLink());
            pstmt.setObject(index++,entity.getDream());
            pstmt.setObject(index++,entity.getFBro());
            pstmt.setObject(index++,entity.getYBro());
            pstmt.setObject(index++,entity.getWhereKnow());
            pstmt.setObject(index++,entity.getCreate_at());
            //执行更新
            int i = pstmt.executeUpdate();
            if(i>0){
                flag = true;
            }
        } catch(SQLException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

        //释放资源
        JdbcUtil.release(rs,pstmt);
        return flag;
    }

    //删

    public boolean deleteById(Integer ID) {
        //声明变量返回
        boolean flag = false;
        //获取连接对象
        conn = JdbcUtil.getConn();
        //sql语句
        String sql = "delete from businesstable where ID = ?";
        try{
            pstmt = conn.prepareStatement(sql);
            int index = 1;
            pstmt.setObject(index++,ID);
            int i = pstmt.executeUpdate();
            if(i>0){
                flag = true;
            }
        } catch(SQLException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

        JdbcUtil.release(rs,pstmt);
        return flag;
    }

    //改
    public boolean updateById(Student entity){
        //声明返回值变量
        boolean flag = false;
        //获取连接对象
        conn = JdbcUtil.getConn();
        //sql语句
        String sql = "update businesstable set SName=?,QQ=?,Style=?,Time=?,School=?,SNumber=?,Link=?,Dream=?," +
                "FBro=?,YBro=?,WhereKnow=?,update_at=? where ID = ?";
        try{
            //由sql语句创建预处理对象
            pstmt = conn.prepareStatement(sql);
            //占位符赋值
            int index = 1;
            pstmt.setObject(index++,entity.getSName());
            pstmt.setObject(index++,entity.getQQ());
            pstmt.setObject(index++,entity.getStyle());
            pstmt.setObject(index++,entity.getTime());
            pstmt.setObject(index++,entity.getSchool());
            pstmt.setObject(index++,entity.getSNumber());
            pstmt.setObject(index++,entity.getLink());
            pstmt.setObject(index++,entity.getDream());
            pstmt.setObject(index++,entity.getFBro());
            pstmt.setObject(index++,entity.getYBro());
            pstmt.setObject(index++,entity.getWhereKnow());
            pstmt.setObject(index++,entity.getUpdate_at());
            //执行更新
            int i = pstmt.executeUpdate();
            if(i>0){
                flag = true;
            }
        } catch(SQLException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

        //释放资源
        JdbcUtil.release(rs,pstmt);
        return flag;
    }

    //查
    public Student selectById(Integer ID){
        //声明返回值变量
        Student entity = new Student();
        //获取连接
        conn = JdbcUtil.getConn();
        //sql语句
        String sql = "select * from businesstable where ID = ?";
        try{
            pstmt = conn.prepareStatement(sql);
            int index = 1;
            pstmt.setObject(index++,ID);
            //执行更新
            rs = pstmt.executeQuery();
            if(rs.next()){
                entity.setSName(rs.getString("SName"));
                entity.setQQ(rs.getInt("QQ"));
                entity.setStyle(rs.getString("Style"));
                entity.setTime(rs.getString("Time"));
                entity.setSchool(rs.getString("School"));
                entity.setSNumber(rs.getInt("SNumber"));
                entity.setLink(rs.getString("Link"));
                entity.setDream(rs.getString("Dream"));
                entity.setFBro(rs.getString("FBro"));
                entity.setYBro(rs.getString("YBro"));
                entity.setWhereKnow(rs.getString("WhereKnow"));
                entity.setID(rs.getInt("ID"));
                entity.setCreate_at(rs.getInt("create_at"));
                entity.setUpdate_at(rs.getInt("update_at"));
            }
        } catch(SQLException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

        JdbcUtil.release(rs,pstmt);
        return entity;
    }

    public Student selectByName(String name){
        //声明返回值变量
        Student entity = new Student();
        //获取连接
        conn = JdbcUtil.getConn();
        //sql语句
        String sql = "select * from businesstable where SName = ?";
        try{
            pstmt = conn.prepareStatement(sql);
            int index = 1;
            pstmt.setObject(index++,name);
            //执行更新
            rs = pstmt.executeQuery();
            while(rs.next()){
                entity.setSName(rs.getString("SName"));
                entity.setQQ(rs.getInt("QQ"));
                entity.setStyle(rs.getString("Style"));
                entity.setTime(rs.getString("Time"));
                entity.setSchool(rs.getString("School"));
                entity.setSNumber(rs.getInt("SNumber"));
                entity.setLink(rs.getString("Link"));
                entity.setDream(rs.getString("Dream"));
                entity.setFBro(rs.getString("FBro"));
                entity.setYBro(rs.getString("YBro"));
                entity.setWhereKnow(rs.getString("WhereKnow"));
                entity.setID(rs.getInt("ID"));
                entity.setCreate_at(rs.getInt("create_at"));
                entity.setUpdate_at(rs.getInt("update_at"));
            }
        } catch(SQLException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }

        JdbcUtil.release(rs,pstmt);
        return entity;
    }
}
