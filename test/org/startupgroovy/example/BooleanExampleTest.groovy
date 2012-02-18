package org.startupgroovy.example;


import org.junit.Test
import org.junit.Before

/**
 * Created by IntelliJ IDEA.
 * User: kyon
 * Date: 12/02/18
 * Time: 5:30
 * To change this template use File | Settings | File Templates.
 */
public class BooleanExampleTest {
    BooleanExample booleanExample
    @Before
    public void setUp() throws Exception {

        booleanExample = new BooleanExample()
    }
    @Test
    public void test整数を真偽判定に使ってtrueに判定される() throws Exception {
        assert booleanExample.整数を真偽判定に使う(1)
    }
    @Test
    public void test整数を真偽判定に使ってfalseに判定される() throws Exception {
        assert !booleanExample.整数を真偽判定に使う(0)
    }

    @Test
    public void test文字列を真偽判定に使ってtrueに判定される(){
        assert booleanExample.文字列を真偽判定に使う("string")
    }
    @Test
    public void test文字列を真偽判定に使ってfalseに判定される(){
        assert !booleanExample.文字列を真偽判定に使う("")
    }

    @Test
    public void testオブジェクトを真偽判定に使ってfalseに判定される(){
        assert !booleanExample.オブジェクトを真偽判定に使う(null)
    }

    @Test
    public void testオブジェクトを真偽判定に使ってtrueに判定される(){
        assert booleanExample.オブジェクトを真偽判定に使う(new Object())
    }

    @Test
    public void testマップを真偽判定に使ってfalseに判定される(){
        assert !booleanExample.マップを真偽判定に使う([:])
    }

    @Test
    public void testマップを真偽判定に使ってtrueに判定される(){
        assert booleanExample.マップを真偽判定に使う(["key":"value"])
    }

    @Test
    public void testリストを真偽判定に使ってfalseに判定される(){
        assert !booleanExample.リストを真偽判定に使う([])
    }

    @Test
    public void testリストを真偽判定に使ってtrueに判定される(){
        assert booleanExample.リストを真偽判定に使う([1,2,3])
    }

}
