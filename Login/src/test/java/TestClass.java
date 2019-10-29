import Services.Elems;
import Services.IService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestClass {
    @Test
    public void test() throws IOException {
        InputStream in = Resources.getResourceAsStream("config.xml");
        SqlSession ss=new SqlSessionFactoryBuilder().build(in).openSession();
        IService iService= ss.getMapper(IService.class);
//        iService.deleteAll();
        /*Elems e=new Elems();
        e.setId(1);
        e.setName("是多少");
        e.setAge(12);
        e.setSex("男");
        e.setBirthday("1234-56-78");
        e.setUsername("123456");
        e.setPassword("123456");
        iService.insert(e);*/
        Elems e1=new Elems();
        e1.setUsername("123456");
        e1.setPassword("1234578");
        Elems is = iService.isUser(e1);
        if (is!=null){
            e1.setPassword("1234343");
            iService.updatePassword(e1);
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
        List<Elems> all = iService.findAll();
        System.out.println(all);
        ss.commit();
    }
}
