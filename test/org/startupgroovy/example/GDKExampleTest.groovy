package org.startupgroovy.example;


import org.junit.Before
import org.junit.Test

/**
 * Created by IntelliJ IDEA.
 * User: kyon
 * Date: 12/02/18
 * Time: 13:24
 * To change this template use File | Settings | File Templates.
 */
public class GDKExampleTest {

    GDKExample gdkExample

    @Before
    public void setUp() throws Exception {

        gdkExample = new GDKExample()
    }

    @Test
    public void testAnyを使ってhを含んでいたらtrueを返す() throws Exception {
        assert gdkExample.anyを使ってhを含んでいたらtrueを返す("jjjhko")
    }

    @Test
    public void testAnyを使ってnull以外を含んでいたらtrueを返す() throws Exception {
        assert gdkExample.anyを使ってnull以外を含んでいたらtrueを返す([null, "Hoge",null])
    }

    @Test
    public void testEachを使って各要素に3を追加して連結した文字列を返す() throws Exception {
        assert gdkExample.eachを使って各要素に3を追加して連結した文字列を返す("hoge") == "h3o3g3e3"
    }

    @Test
    public void test全ての要素がIntegerであるときにtrueを返す() throws Exception {
        assert gdkExample.全ての要素がIntegerであるときにtrueを返す([1,3,5])
    }

    @Test
    public void testStringの前にハイフンを10個追加() throws Exception {
        assert gdkExample.stringの前にハイフンを追加して合計10文字にする("FUGA") == "------FUGA"
    }

    @Test
    public void test奇数と偶数の数をそれぞれマップにいれて返す() throws Exception {
        assert gdkExample.奇数と偶数の数をそれぞれマップにいれて返す([1,2,3,4,5,6,6,6,7]) == [(false):4, (true):5]
    }

    @Test
    public void test最も長い文字列を返す() throws Exception {
        assert gdkExample.最も長い文字列を返す(["hoge","fugagu","longest_char"]) == "longest_char"
    }
}
