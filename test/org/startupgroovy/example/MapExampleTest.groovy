package org.startupgroovy.example;


import org.junit.Test
import org.junit.Before

/**
 * Created by IntelliJ IDEA.
 * User: kyon
 * Date: 12/02/18
 * Time: 6:56
 * To change this template use File | Settings | File Templates.
 */
public class MapExampleTest {

    MapExample mapExample

    @Before
    void setUp(){
        mapExample = new MapExample()
    }

    @Test
    public void test指定されたmapから指定されたkeyでバリューを取得する() throws Exception {
        assert mapExample.指定されたmapから指定されたkeyでバリューを取得する(["key1":"value1","key2":"value2"], "key2") == "value2"
    }

    @Test
    public void test指定されたmapに指定されたkeyとvalueを追加する() throws Exception {
        assert mapExample.指定されたmapに指定されたkeyとvalueを追加する(["k1":"v1","k2":"v2"], "k3", "v3") == ["k1":"v1","k2":"v2","k3":"v3"]
    }

    @Test
    public void test指定されたmapから指定されたkeylistの各要素と適合するキーをもつMapの部分集合を返す() throws Exception {
        assert mapExample.指定されたmapから指定されたkeylistの各要素と適合するキーをもつMapの部分集合を返す(["k1":"v1","k2":"v2","k3":"v3"],["k2","k3"]) == ["k2":"v2","k3":"v3"]
    }

    @Test
    public void test存在しないキーを指定されたときに30を返すMapを指定されたkeyとvalueで作成する() throws Exception {
        assert mapExample.存在しないキーを指定されたときに30を返すMapを指定されたkeyとvalueで作成する("key","value")["non_exist"] == 30
    }
}
