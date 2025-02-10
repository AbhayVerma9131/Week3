import static org.junit.jupiter.api.Assertions.*;

import javax.swing.text.StringContent;

import org.junit.jupiter.api.Test;
import com.stringbuffer.*;
import com.stringbuffer.compaereconcatination.StringConcatenationComparison;
import com.stringbuffer.stringconcatination.ConcatinateStringEfficiently;
import com.stringbuilder.*;
import com.stringbuilder.removeduplicate.StringManipulator;
import com.stringbuilder.stringreverse.StringReverse;
import com.inputstream.*;
import com.filereader.*;
import com.challangeproblem.*;
public class Testing {
    @Test
    void bufferconcatinate(){
        ConcatinateStringEfficiently cs=new ConcatinateStringEfficiently();
        String[] arr={"Hello","World"};  //array of strings to be concatenated
        String result=cs.concatinate(arr);
        assertEquals("Hello World ",result);
    }
    @Test
    void buffervsbuilderconcatenate(){
        com.stringbuffer.compaereconcatination.StringConcatenationComparison sc=new StringConcatenationComparison();
        assertNotEquals(sc.measureTimeForStringBuffer(4), sc.measureTimeForStringBuilder(4));
    }
    @Test
    void buildereverse(){
        StringReverse sr=new StringReverse();
        assertEquals(sr.reverse("hello"),"olleh");
    }
    @Test
    void builderduplicate(){
        StringManipulator m=new StringManipulator();
        assertEquals("progamin", m.removeDuplicates("programming"));
    }
    




    
}
