# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-spring-mvc-template-engines)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-security)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-email)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)


JdbcTemplate – querying

query()
Most of the cases JdbcTemplate query() is used to run the sql query and get multiple rows results from database. To run query() we need to follow 3 steps.

Provide a Sql query.
Provide parameters values and types if the query has arguments.
Extract the results.

Providing Sql Query : Provide Sql query using String object OR PreparedStatementCreator.

Providing Parameters : Provide arguments using Object[] OR using PreparedStatementSetter if query has parameters.

Extract Results : Results can be extracted using callback handler interfaces. Spring JDBC provide 3 callback handler interfaces RowMapper , ResultSetExtractor , RowCallbackHandler for extracting results.

Let’s have a look into some examples to understand when to choose String or PreparedStatementCreator to provide sql query, and when to choose Object[] or PreparedStatementSetter to provide arguments and when to choose RowMapper OR ResultSetExtractor OR RowCallbackHandler to get results.

RowMapper
UserMapper :

To create a custom RowMapper class, have to implements RowMapper callback interface and have to provide implementation for mapRow().

Creating custom RowMapper :

public class UserMapper implements RowMapper<User>{
  @Override
  public User mapRow(ResultSet rs, int rowNum) throws SQLException {
    User user = new User();
    user.setId(rs.getLong("ID"));
    user.setUserName(rs.getString("USERNAME"));
    user.setPassword(rs.getString("PASSWORD"));
    user.setCreatedTime(rs.getDate("CREATEDTIME"));
    user.setUpdatedTime(rs.getDate("UPDATEDTIME"));
    user.setUserType(UserType.valueOf(rs.getString("USERTYPE")));
    user.setDateofBirth(rs.getDate("DATEOFBIRTH"));
    return user;
  }
}



2.1.1. A basic query example using RowMapper with no arguments.

  @Autowired
  private JdbcTemplate jdbcTemplate;
  
  @Test
  @DisplayName("find-all-users-test")
  void findAllUsersTest() {
    String sql = "SELECT * FROM USER";
    List<User> users = jdbcTemplate.query(sql, new UserMapper());
    assertTrue(users.size() == 12);
    users.forEach(System.err::println); // just to print  in red color
  }


2.1.2. A basic query example using RowMapper with parameters and providing types for arguments.

Providing types is optional, if you wants to convert provided parameter value java to SQL type, we need to provide SQL types.

  @DisplayName("find-users-by-type-test")
  @ParameterizedTest
  @EnumSource(value = UserType.class)
  void findUsersByTypeTest(UserType userType) {
    String sql = "SELECT * FROM USER WHERE USERTYPE = ?";
    List<User> users = jdbcTemplate.query(sql,
        new Object[] { userType },
        new int[] { Types.VARCHAR },
        new UserMapper());
    if (userType.equals(UserType.STUDENT))
      assertTrue(users.size() == 4);
    else
      assertTrue(users.size() == 8);
    
    System.err.println(users);
  }

