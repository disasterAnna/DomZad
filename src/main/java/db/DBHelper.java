package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBHelper {

    static String url = "jdbc:mysql://db4free.net:3306/testdatabase9290";
    static String username = "testdatabase9290";
    static String password = "123qweASD";

    static Connection con;
    static Statement st;

    public static Connection init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static ArrayList<HashMap<String, Object>> getSqlResult(final String sql) {

        ResultSet rs = null;
        init();
        ArrayList<HashMap<String, Object>> sqlResult = new ArrayList<>();
        HashMap<String, Object> map;

        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);

            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()) {
                map = new HashMap<>(rsmd.getColumnCount());
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    if (rs.getObject(i) == null) {
                        map.put(rsmd.getColumnName(i), "");
                    } else {
                        map.put(rsmd.getColumnName(i), rs.getObject(i));
                    }
                }

                sqlResult.add(map);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                st.close();
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                con.close();
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return sqlResult;
    }

    public static Map<String, Object> getRow(String sql, int row) {
        return getSqlResult(sql).get(row);
    }

    public static Object getRowColumn(String sql, int row, String column) {
        return getRow(sql, row).get(column);
    }

    public static int executeUpdate(String sql) {
        init();
        try {
            st = con.createStatement();
            return st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
                if (st != null) {
                    st.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                con.close();
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
}
