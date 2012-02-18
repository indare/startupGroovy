package org.startupgroovy.example

class StringExample {

    public String hoge引数fugaをプラスを使わずにリテラルで表現する(String string){
        return "hoge${string}fuga";
    }

    public String 文字列リテラルで改行コードを埋め込まずに改行を表現する(){
'''hoge
fuga
piyo'''
    }

    public Object aをcharとして表現する(){
        return 'c' as char
    }

    public String 指定されたstringのsrcをrepで置換する(String string, String src, String rep){
        return string.tr(src,rep)
    }

}
