//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2018.08.05 時間 04:07:37 PM JST 
//


package mojikiban.ipa.go.jp.mji;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>漢字施策型のJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="漢字施策型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="常用漢字"/>
 *     &lt;enumeration value="人名用漢字"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "\u6f22\u5b57\u65bd\u7b56\u578b")
@XmlEnum
public enum 漢字施策型 {

    常用漢字,
    人名用漢字;

    public String value() {
        return name();
    }

    public static 漢字施策型 fromValue(String v) {
        return valueOf(v);
    }

}
