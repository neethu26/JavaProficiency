package Assignment_4_2;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;
public class JunitAnnotationsTest {
    private ArrayList<String> testList;
    @BeforeClass
    public static void onceExecutedBeforeAll() { 
     System.out.println("@BeforeClass: onceExecutedBeforeAll");
    }
    @Before
    public void executedBeforeEach() {
        testList = new ArrayList<String>();
        System.out.println("@Before: executedBeforeEach");
    }
    @AfterClass
    public static void onceExecutedAfterAll() {
     System.out.println("@AfterClass: onceExecutedAfterAll");
    }
    @After
    public void executedAfterEach() {
        testList.clear();
        System.out.println("@After: executedAfterEach");
    }
    @Test
    public void EmptyCollection() {
    //Insert code to test whether list is empty 
        System.out.println("@Test: EmptyArrayList");

    }
    @Test
    public void OneItemCollection() {
        testList.add("oneItem");
    //Insert code to test whether list size is 1
       System.out.println("@Test: OneItemArrayList");
    }
    @Ignore
   public void executionIgnored() {
      System.out.println("@Ignore: This execution is ignored");
   }
}