package org.startupgroovy.example;


import org.junit.Before
import org.junit.Test

public class ListExampleTest {

    ListExample listExample

    @Before
    public void setUp() throws Exception {
       listExample = new ListExample()
    }

    @Test
    public void testリストの指定されたインデックスの値をgetメソッドを使わずに返す() throws Exception {
       assert listExample.リストの指定されたインデックスの値をgetメソッドを使わずに返す(["a","b","c"], 1) == "b"
    }

    @Test
    public void test引数のlist1の後ろにlist2を追加する() throws Exception {
       assert listExample.引数のlist1の後ろにlist2を追加する([1,2,3],[7,8,9]) == [1,2,3,7,8,9]
    }

    @Test
    public void test引数のlist1からlist2と被る要素を削除する() throws Exception {
       assert listExample.引数のlist1からlist2と被る要素を削除する([4,5,6,0],[5,0]) == [4,6]
    }

    @Test
    public void test引数のlistを順に並べる() throws Exception {
       assert listExample.引数のlistを順に並べる([7,5,8,2,9,0]) == [0,2,5,7,8,9]
    }

    @Test
    public void test引数のlistを逆順にする() throws Exception {
       assert listExample.引数のlistを逆順にする([7,5,8,2,9,0]) == [0,9,2,8,5,7]
    }

    @Test
    public void test引数のlistからnullを除く() throws Exception {
       assert listExample.引数のlistからnullを除く(["a",null,"b",null,"c"]) == ["a","b","c"]
    }

    @Test
    public void test引数のlistの合計値を返す() throws Exception {
       assert listExample.引数のlistの合計値を返す([10,20,3]) == 33
    }

    @Test
    public void test引数のlistの最大値を返す() throws Exception {
       assert listExample.引数のlistの最大値を返す([3,4,6,9,30]) == 30
    }

    @Test
    public void test引数のlistで最初の奇数を返す() throws Exception {
       assert listExample.引数のlistで最初の奇数を返す([0,0,3,2,4]) == 3
    }

    @Test
    public void test引数のlistから偶数のみを持つlistを返す() throws Exception {
       assert listExample.引数のlistから偶数のみを持つlistを返す([1,2,3,7,0,2]) == [2,0,2]
    }

    @Test
    public void test引数のlist1とlist2の重複部分のListを返す() throws Exception {
       assert listExample.引数のlist1とlist2の重複部分のListを返す(["a,","b","v","e"],["b","e","c"]) == ["b", "e"]
    }

    @Test
    public void test引数のlistにaが出現する回数を返す() throws Exception {
       assert listExample.引数のlistにaが出現する回数を返す(["v","hoge","abc","a","r","nna"]) == 1
    }

    @Test
    public void test引数のlistから重複を削除したListを返す() throws Exception {
       assert listExample.引数のlistから重複を削除したListを返す([1,2,1,6,4,3,2,1]) == [1,2,6,4,3]
    }

    @Test
    public void test引数のlistの各要素の間にアンダースコアを追加して文字列として返す() throws Exception {
        assert "a_b_c" == listExample.引数のlistの各要素の間にアンダースコアを追加して文字列として返す(["a","b","c"])
    }
}
