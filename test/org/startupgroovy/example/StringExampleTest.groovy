package org.startupgroovy.example;


import org.junit.Before
import org.junit.Test

/**
 * Created by IntelliJ IDEA.
 * User: kyon
 * Date: 12/02/18
 * Time: 3:15
 * To change this template use File | Settings | File Templates.
 */
public class StringExampleTest {

    StringExample stringExample
    @Before
    public void setUp() throws Exception {

        stringExample = new StringExample()
    }

    @Test
    public void testHoge引数fugaをプラスを使わずにリテラルで表現する() throws Exception {
        assert "hogeStartupfuga" == stringExample.hoge引数fugaをプラスを使わずにリテラルで表現する("Startup")
    }

    @Test
    public void test文字列リテラルで改行コードを埋め込まずに改行を表現する() throws Exception {
        assert """hoge\nfuga\npiyo""" == stringExample.文字列リテラルで改行コードを埋め込まずに改行を表現する()

    }

    @Test
    public void testAをcharとして表現する() throws Exception {

        assert stringExample.aをcharとして表現する().class == java.lang.Character
    }

    @Test
    public void test指定されたstringのsrcをrepで置換する(){
        assert stringExample.指定されたstringのsrcをrepで置換する("ABCDEF", "BC", "XY") == "AXYDEF"
    }
    @Test
    public void test指定されたstringのsrcをrepで置換するときに範囲で指定する(){
        assert stringExample.指定されたstringのsrcをrepで置換する("ABCDEF", "C-E", "c-e") == "ABcdeF"
    }
}
