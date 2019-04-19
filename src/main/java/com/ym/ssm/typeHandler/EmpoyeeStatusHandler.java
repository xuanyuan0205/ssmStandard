package com.ym.ssm.typeHandler;

import com.ym.ssm.pojoex.EmpoyeeStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName: EmpoyeeStatusHandler
 * @Description: 自定义处理器
 * @auther: ym
 * @Date: 2019-4-18 16:42
 */
public class EmpoyeeStatusHandler implements TypeHandler<EmpoyeeStatus> {

    /**
     * 定义当前数据保存到数据库
     * @param ps
     * @param i
     * @param parameter
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setParameter(PreparedStatement ps, int i, EmpoyeeStatus parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i,parameter.getCode().toString());
    }

    @Override
    public EmpoyeeStatus getResult(ResultSet rs, String columnName) throws SQLException {
        int code=rs.getInt(columnName);
        return EmpoyeeStatus.getStatusByCode(code);
    }

    @Override
    public EmpoyeeStatus getResult(ResultSet rs, int columnIndex) throws SQLException {
        int code=rs.getInt(columnIndex);
        return EmpoyeeStatus.getStatusByCode(code);
    }


    @Override
    public EmpoyeeStatus getResult(CallableStatement cs, int columnIndex) throws SQLException {
        int code=cs.getInt(columnIndex);
        return EmpoyeeStatus.getStatusByCode(code);
    }
}
