package org.startupgroovy.example

/**
 * Created by IntelliJ IDEA.
 * User: kyon
 * Date: 12/02/18
 * Time: 5:44
 * To change this template use File | Settings | File Templates.
 */
class ListExample {

    public Object リストの指定されたインデックスの値をgetメソッドを使わずに返す(List list, int index){
        return list[index]
    }

    public List 引数のlist1の後ろにlist2を追加する(List list1, List list2){
        return list1 + list2
    }

    public List 引数のlist1からlist2と被る要素を削除する(List list1, List list2){
        return list1 - list2
    }

    public List 引数のlistを順に並べる(List list){
        return list.sort()
    }

    public List 引数のlistを逆順にする(List list){
        return list.reverse()
    }

    public List 引数のlistからnullを除く(List list){
        return list.findAll {it != null}
    }

    public int 引数のlistの合計値を返す(List list){
        return list.sum()
    }

    public int 引数のlistの最大値を返す(List list){
        return list.max()
    }

    public int 引数のlistで最初の奇数を返す(List list){
        return list.find{it %2==1}

    }

    public List 引数のlistから偶数のみを持つlistを返す(List list){
        return list.findAll {it %2 == 0}
    }

    public List 引数のlist1とlist2の重複部分のListを返す(List list1, List list2){
        return list1.intersect(list2)
    }

    public int 引数のlistにaが出現する回数を返す(List list){
        return list.count("a")
    }

    public List 引数のlistから重複を削除したListを返す(List list){
        return list.unique()
    }

    public String 引数のlistの各要素の間にアンダースコアを追加して文字列として返す(List list) {
        return list.join("_")
    }


}
