package marco.springboot.mybatisdemo.demo;

public class TestMapperProxyFactory {
    public static void main(String[] args) {
        BlogMapper mapper = (BlogMapper) SqlSession.getMapper(BlogMapper.class);
        mapper.selectBlog(1);
    }
}
