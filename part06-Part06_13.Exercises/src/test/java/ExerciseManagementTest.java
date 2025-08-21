import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ExerciseManagementTest {
    
    private ExerciseManagement management;
    
    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning(){
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne(){
        management.add("Write test");
        assertEquals(1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList(){
        management.add("me");
        assertTrue(management.exerciseList().contains("me"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("new");
        management.markAsCompleted("new");
        assertTrue(management.isCompleted("new"));
    }

}
