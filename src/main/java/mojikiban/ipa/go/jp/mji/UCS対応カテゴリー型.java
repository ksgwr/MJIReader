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
 * <p>UCS対応カテゴリー型のJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * <p>
 * <pre>
 * &lt;simpleType name="UCS対応カテゴリー型">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UCS\u5bfe\u5fdc\u30ab\u30c6\u30b4\u30ea\u30fc\u578b")
@XmlEnum
public enum UCS対応カテゴリー型 {

    A,
    U;

    public String value() {
        return name();
    }

    public static UCS対応カテゴリー型 fromValue(String v) {
        return valueOf(v);
    }

}
