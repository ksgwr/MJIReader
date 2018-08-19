//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2018.08.05 時間 04:07:37 PM JST 
//


package mojikiban.ipa.go.jp.mji;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:mojikiban:ipa:go:jp:mji}MJ文字情報" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{urn:mojikiban:ipa:go:jp:mji}MJ文字情報一覧表バージョン型" />
 *       &lt;attribute name="issued" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mj\u6587\u5b57\u60c5\u5831"
})
@XmlRootElement(name = "MJ\u6587\u5b57\u60c5\u5831\u4e00\u89a7\u8868")
public class MJ文字情報一覧表 {

    @XmlElement(name = "MJ\u6587\u5b57\u60c5\u5831", required = true)
    protected List<MJ文字情報> mj文字情報;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "issued")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issued;

    /**
     * Gets the value of the mj文字情報 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mj文字情報 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMJ文字情報().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MJ文字情報 }
     * 
     * 
     */
    public List<MJ文字情報> getMJ文字情報() {
        if (mj文字情報 == null) {
            mj文字情報 = new ArrayList<MJ文字情報>();
        }
        return this.mj文字情報;
    }

    /**
     * versionプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * versionプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * issuedプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssued() {
        return issued;
    }

    /**
     * issuedプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssued(XMLGregorianCalendar value) {
        this.issued = value;
    }

}
