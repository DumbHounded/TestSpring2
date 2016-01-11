package xyz.incraft.TestSpring2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Михаил on 10.01.2016.
 *
 */
public class BLTestImpl implements BLTest {
    @Autowired
    @Qualifier("list")
    private ArrayList list;

    @Autowired
    @Qualifier("firstValue")
    private int firstValue;

    @Autowired
    @Qualifier("secondValue")
    private int secondValue;

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public void ShowList(){
        System.out.println(GetHeader());
        for (String s : (List<String>)list) {
            System.out.println(" - "+s);
        }
        System.out.println(GetFooter());
    }

    @Override
    public String GetHeader(){
        return String.format("------ %d ------",firstValue);
    }
    @Override
    public String GetFooter(){
        return String.format("++++++ %d ++++++",secondValue);
    }
}
