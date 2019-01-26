package com.zhy.dao;

import com.zhy.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2019/1/25.
 */
public interface StudentDao {
    List<Student> selectAll(Integer id);
}
