package util;

import java.sql.*;

/**
 * Created by Administrator on 2017/07/17.
 */
public class JdbcUtil {
    //定义数据库URL语句
    private static final String url = "jdbc:mysql://www.motherfucker.com:3306/mission1?" +
            "user=root&password=yubotao9527&useUnicode=true&characterEncoding=UTF8";
    //利用单例模式创建Connection对象
    private static Connection conn = null;
    //加载驱动
    public static Connection getConn(){
        if(conn == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(url);
            } catch(ClassNotFoundException e){
                //TODO Auto-generated catch block
                e.printStackTrace();
            } catch(SQLException e){
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return conn;
    }

    //释放资源方法
    public static void release(ResultSet rs, PreparedStatement pstmt){
        if(rs!=null){
            try{
                rs.close();
            } catch(SQLException e){
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(pstmt!=null){
            try{
                pstmt.close();
            } catch(SQLException e){
                //TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
