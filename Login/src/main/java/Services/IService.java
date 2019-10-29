package Services;

import java.util.List;

public interface IService {
    /*查询*/
    public List<Elems> findAll();
    public Elems findById(int id);
    public Elems findByUsername(String username);
    public List<Elems> findByName(String name);
    public List<Elems> findByAge(int age);
    public List<Elems> findBySex(String sex);
    public Elems isUser(Elems e);
    /*添加*/
    public void insert(Elems e);
    /*删除*/
    public void deleteAll();
    public void deleteById(int id);
    public void deleteByName(String name);
    public void deleteByAge(int age);
    public void deleteBySex(String sex);
    /*修改*/
    public void update(Elems e);
    public void updatePassword(Elems e);
}
