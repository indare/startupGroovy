package org.startupgroovy.example

import com.sun.deploy.config.MacOSXProperties

/**
 * Created by IntelliJ IDEA.
 * User: kyon
 * Date: 12/02/18
 * Time: 7:05
 * To change this template use File | Settings | File Templates.
 */
class GDKExample {

    public boolean anyを使ってhを含んでいたらtrueを返す(Object object){
        object.any{it=~"h"}
    }

    public boolean anyを使ってnull以外を含んでいたらtrueを返す(Object object){
        object.any{it== null}
    }

    public String eachを使って各要素に3を追加して連結した文字列を返す(Object object){
        def s = ""
        object.each{s += it+"3"}
        s

    }

    public boolean 全ての要素がIntegerであるときにtrueを返す(Object object){
        object.every{it.class==java.lang.Integer}
    }

    public String stringの前にハイフンを追加して合計10文字にする(String string){
        return "${string.padLeft(10,"-")}"
    }

    public Map 奇数と偶数の数をそれぞれマップにいれて返す(List list){
        
        Map m = list.countBy{it%2==0}
        return m

    }

    public String 最も長い文字列を返す(List list){
        def s
        s = list.max{it.size()}
        s
    }

}
