package xmu.crms.controller;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import xmu.crms.entity.*;

import java.util.List;

/**
 * @author LuLongfei
 * @date 2017-12-4
 */
@Service
public class Database {

    public UserDO user;

    public SchoolDO school;

    public List<CourseDO> courses;

    public List<ClassDO> classes;

    private List<TopicDO> topics;

}
