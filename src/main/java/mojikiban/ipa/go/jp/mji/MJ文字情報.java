//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.8-b130911.1802によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2018.08.05 時間 04:07:37 PM JST 
//


package mojikiban.ipa.go.jp.mji;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element name="MJ文字図形名" type="{urn:mojikiban:ipa:go:jp:mji}MJ文字図形名型"/>
 *         &lt;element name="戸籍統一文字番号">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {urn:mojikiban:ipa:go:jp:mji}戸籍統一文字番号型 {urn:mojikiban:ipa:go:jp:mji}空型">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="住基ネット統一文字コード">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {urn:mojikiban:ipa:go:jp:mji}住基ネット統一文字コード型 {urn:mojikiban:ipa:go:jp:mji}空型">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="入管正字コード">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {urn:mojikiban:ipa:go:jp:mji}入管正字コード型 {urn:mojikiban:ipa:go:jp:mji}空型">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="入管外字コード">
 *           &lt;simpleType>
 *             &lt;union memberTypes=" {urn:mojikiban:ipa:go:jp:mji}入管外字コード型 {urn:mojikiban:ipa:go:jp:mji}空型">
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="漢字施策">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="常用漢字" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="人名用漢字" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="JISX0213" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="面区点位置">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;urn:mojikiban:ipa:go:jp:mji>JISX0213型">
 *                           &lt;attribute name="水準" type="{urn:mojikiban:ipa:go:jp:mji}JISX0213水準型" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="包摂連番" type="{urn:mojikiban:ipa:go:jp:mji}JISX0213包摂連番型" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="包摂区分" type="{urn:mojikiban:ipa:go:jp:mji}JISX0213包摂区分型" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="JISX0212" type="{urn:mojikiban:ipa:go:jp:mji}JISX0212型" minOccurs="0"/>
 *         &lt;element name="UCS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="対応するUCS" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;urn:mojikiban:ipa:go:jp:mji>対応するUCS値型">
 *                           &lt;attribute name="対応カテゴリー" use="required" type="{urn:mojikiban:ipa:go:jp:mji}UCS対応カテゴリー型" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="対応する互換漢字" type="{urn:mojikiban:ipa:go:jp:mji}UCS型" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IPAmj明朝フォント実装" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="実装したUCS" type="{urn:mojikiban:ipa:go:jp:mji}UCS型" minOccurs="0"/>
 *                   &lt;element name="実装したSVS" type="{urn:mojikiban:ipa:go:jp:mji}SVS型" minOccurs="0"/>
 *                   &lt;element name="実装したMoji_JohoIVS" type="{urn:mojikiban:ipa:go:jp:mji}IVS型" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="フォントバージョン" use="required" type="{urn:mojikiban:ipa:go:jp:mji}IPAmj明朝フォントバージョン型" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MJ文字図形">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                 &lt;attribute name="MJ文字図形バージョン" use="required" type="{urn:mojikiban:ipa:go:jp:mji}MJ文字図形バージョン型" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="登記統一文字番号" type="{urn:mojikiban:ipa:go:jp:mji}登記統一文字番号型" minOccurs="0"/>
 *         &lt;element name="部首内画数" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="部首" use="required" type="{urn:mojikiban:ipa:go:jp:mji}康煕部首型" />
 *                 &lt;attribute name="内画数" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="総画数" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="読み" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="音読み" type="{urn:mojikiban:ipa:go:jp:mji}カタカナ" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="訓読み" type="{urn:mojikiban:ipa:go:jp:mji}ひらがな" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="大漢和" type="{urn:mojikiban:ipa:go:jp:mji}大漢和検字番号型" minOccurs="0"/>
 *         &lt;element name="日本語漢字辞典" type="{urn:mojikiban:ipa:go:jp:mji}日本語漢字辞典検字番号型" minOccurs="0"/>
 *         &lt;element name="新大字典" type="{urn:mojikiban:ipa:go:jp:mji}新大字典検字番号型" minOccurs="0"/>
 *         &lt;element name="大字源" type="{urn:mojikiban:ipa:go:jp:mji}大字源検字番号型" minOccurs="0"/>
 *         &lt;element name="大漢語林" type="{urn:mojikiban:ipa:go:jp:mji}大漢語林検字番号型" minOccurs="0"/>
 *         &lt;element name="更新履歴" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="更新情報" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="バージョン" use="required" type="{urn:mojikiban:ipa:go:jp:mji}MJ文字情報一覧表バージョン型" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="備考" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mj\u6587\u5b57\u56f3\u5f62\u540d",
    "\u6238\u7c4d\u7d71\u4e00\u6587\u5b57\u756a\u53f7",
    "\u4f4f\u57fa\u30cd\u30c3\u30c8\u7d71\u4e00\u6587\u5b57\u30b3\u30fc\u30c9",
    "\u5165\u7ba1\u6b63\u5b57\u30b3\u30fc\u30c9",
    "\u5165\u7ba1\u5916\u5b57\u30b3\u30fc\u30c9",
    "\u6f22\u5b57\u65bd\u7b56",
    "jisx0213",
    "jisx0212",
    "ucs",
    "ipAmj\u660e\u671d\u30d5\u30a9\u30f3\u30c8\u5b9f\u88c5",
    "mj\u6587\u5b57\u56f3\u5f62",
    "\u767b\u8a18\u7d71\u4e00\u6587\u5b57\u756a\u53f7",
    "\u90e8\u9996\u5185\u753b\u6570",
    "\u7dcf\u753b\u6570",
    "\u8aad\u307f",
    "\u5927\u6f22\u548c",
    "\u65e5\u672c\u8a9e\u6f22\u5b57\u8f9e\u5178",
    "\u65b0\u5927\u5b57\u5178",
    "\u5927\u5b57\u6e90",
    "\u5927\u6f22\u8a9e\u6797",
    "\u66f4\u65b0\u5c65\u6b74",
    "\u5099\u8003"
})
@XmlRootElement(name = "MJ\u6587\u5b57\u60c5\u5831")
public class MJ文字情報 {

    @XmlElement(name = "MJ\u6587\u5b57\u56f3\u5f62\u540d", required = true)
    protected String mj文字図形名;
    @XmlElement(required = true)
    protected String 戸籍統一文字番号;
    @XmlElement(required = true)
    protected String 住基ネット統一文字コード;
    @XmlElement(required = true)
    protected String 入管正字コード;
    @XmlElement(required = true)
    protected String 入管外字コード;
    @XmlElement(required = true)
    protected MJ文字情報.漢字施策 漢字施策;
    @XmlElement(name = "JISX0213")
    protected MJ文字情報.JISX0213 jisx0213;
    @XmlElement(name = "JISX0212")
    protected String jisx0212;
    @XmlElement(name = "UCS", required = true)
    protected MJ文字情報.UCS ucs;
    @XmlElement(name = "IPAmj\u660e\u671d\u30d5\u30a9\u30f3\u30c8\u5b9f\u88c5")
    protected MJ文字情報.IPAmj明朝フォント実装 ipAmj明朝フォント実装;
    @XmlElement(name = "MJ\u6587\u5b57\u56f3\u5f62", required = true)
    protected MJ文字情報.MJ文字図形 mj文字図形;
    protected String 登記統一文字番号;
    @XmlElement(required = true)
    protected List<MJ文字情報.部首内画数> 部首内画数;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger 総画数;
    protected MJ文字情報.読み 読み;
    protected String 大漢和;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger 日本語漢字辞典;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger 新大字典;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger 大字源;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger 大漢語林;
    protected MJ文字情報.更新履歴 更新履歴;
    protected String 備考;

    /**
     * mj文字図形名プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMJ文字図形名() {
        return mj文字図形名;
    }

    /**
     * mj文字図形名プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMJ文字図形名(String value) {
        this.mj文字図形名 = value;
    }

    /**
     * 戸籍統一文字番号プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get戸籍統一文字番号() {
        return 戸籍統一文字番号;
    }

    /**
     * 戸籍統一文字番号プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set戸籍統一文字番号(String value) {
        this.戸籍統一文字番号 = value;
    }

    /**
     * 住基ネット統一文字コードプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get住基ネット統一文字コード() {
        return 住基ネット統一文字コード;
    }

    /**
     * 住基ネット統一文字コードプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set住基ネット統一文字コード(String value) {
        this.住基ネット統一文字コード = value;
    }

    /**
     * 入管正字コードプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get入管正字コード() {
        return 入管正字コード;
    }

    /**
     * 入管正字コードプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set入管正字コード(String value) {
        this.入管正字コード = value;
    }

    /**
     * 入管外字コードプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get入管外字コード() {
        return 入管外字コード;
    }

    /**
     * 入管外字コードプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set入管外字コード(String value) {
        this.入管外字コード = value;
    }

    /**
     * 漢字施策プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link MJ文字情報.漢字施策 }
     *     
     */
    public MJ文字情報.漢字施策 get漢字施策() {
        return 漢字施策;
    }

    /**
     * 漢字施策プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link MJ文字情報.漢字施策 }
     *     
     */
    public void set漢字施策(MJ文字情報.漢字施策 value) {
        this.漢字施策 = value;
    }

    /**
     * jisx0213プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link MJ文字情報.JISX0213 }
     *     
     */
    public MJ文字情報.JISX0213 getJISX0213() {
        return jisx0213;
    }

    /**
     * jisx0213プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link MJ文字情報.JISX0213 }
     *     
     */
    public void setJISX0213(MJ文字情報.JISX0213 value) {
        this.jisx0213 = value;
    }

    /**
     * jisx0212プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJISX0212() {
        return jisx0212;
    }

    /**
     * jisx0212プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJISX0212(String value) {
        this.jisx0212 = value;
    }

    /**
     * ucsプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link MJ文字情報.UCS }
     *     
     */
    public MJ文字情報.UCS getUCS() {
        return ucs;
    }

    /**
     * ucsプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link MJ文字情報.UCS }
     *     
     */
    public void setUCS(MJ文字情報.UCS value) {
        this.ucs = value;
    }

    /**
     * ipAmj明朝フォント実装プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link MJ文字情報.IPAmj明朝フォント実装 }
     *     
     */
    public MJ文字情報.IPAmj明朝フォント実装 getIPAmj明朝フォント実装() {
        return ipAmj明朝フォント実装;
    }

    /**
     * ipAmj明朝フォント実装プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link MJ文字情報.IPAmj明朝フォント実装 }
     *     
     */
    public void setIPAmj明朝フォント実装(MJ文字情報.IPAmj明朝フォント実装 value) {
        this.ipAmj明朝フォント実装 = value;
    }

    /**
     * mj文字図形プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link MJ文字情報.MJ文字図形 }
     *     
     */
    public MJ文字情報.MJ文字図形 getMJ文字図形() {
        return mj文字図形;
    }

    /**
     * mj文字図形プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link MJ文字情報.MJ文字図形 }
     *     
     */
    public void setMJ文字図形(MJ文字情報.MJ文字図形 value) {
        this.mj文字図形 = value;
    }

    /**
     * 登記統一文字番号プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get登記統一文字番号() {
        return 登記統一文字番号;
    }

    /**
     * 登記統一文字番号プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set登記統一文字番号(String value) {
        this.登記統一文字番号 = value;
    }

    /**
     * Gets the value of the 部首内画数 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the 部首内画数 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    get部首内画数().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MJ文字情報.部首内画数 }
     * 
     * 
     */
    public List<MJ文字情報.部首内画数> get部首内画数() {
        if (部首内画数 == null) {
            部首内画数 = new ArrayList<MJ文字情報.部首内画数>();
        }
        return this.部首内画数;
    }

    /**
     * 総画数プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger get総画数() {
        return 総画数;
    }

    /**
     * 総画数プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void set総画数(BigInteger value) {
        this.総画数 = value;
    }

    /**
     * 読みプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link MJ文字情報.読み }
     *     
     */
    public MJ文字情報.読み get読み() {
        return 読み;
    }

    /**
     * 読みプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link MJ文字情報.読み }
     *     
     */
    public void set読み(MJ文字情報.読み value) {
        this.読み = value;
    }

    /**
     * 大漢和プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get大漢和() {
        return 大漢和;
    }

    /**
     * 大漢和プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set大漢和(String value) {
        this.大漢和 = value;
    }

    /**
     * 日本語漢字辞典プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger get日本語漢字辞典() {
        return 日本語漢字辞典;
    }

    /**
     * 日本語漢字辞典プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void set日本語漢字辞典(BigInteger value) {
        this.日本語漢字辞典 = value;
    }

    /**
     * 新大字典プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger get新大字典() {
        return 新大字典;
    }

    /**
     * 新大字典プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void set新大字典(BigInteger value) {
        this.新大字典 = value;
    }

    /**
     * 大字源プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger get大字源() {
        return 大字源;
    }

    /**
     * 大字源プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void set大字源(BigInteger value) {
        this.大字源 = value;
    }

    /**
     * 大漢語林プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger get大漢語林() {
        return 大漢語林;
    }

    /**
     * 大漢語林プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void set大漢語林(BigInteger value) {
        this.大漢語林 = value;
    }

    /**
     * 更新履歴プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link MJ文字情報.更新履歴 }
     *     
     */
    public MJ文字情報.更新履歴 get更新履歴() {
        return 更新履歴;
    }

    /**
     * 更新履歴プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link MJ文字情報.更新履歴 }
     *     
     */
    public void set更新履歴(MJ文字情報.更新履歴 value) {
        this.更新履歴 = value;
    }

    /**
     * 備考プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String get備考() {
        return 備考;
    }

    /**
     * 備考プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void set備考(String value) {
        this.備考 = value;
    }


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
     *         &lt;element name="実装したUCS" type="{urn:mojikiban:ipa:go:jp:mji}UCS型" minOccurs="0"/>
     *         &lt;element name="実装したSVS" type="{urn:mojikiban:ipa:go:jp:mji}SVS型" minOccurs="0"/>
     *         &lt;element name="実装したMoji_JohoIVS" type="{urn:mojikiban:ipa:go:jp:mji}IVS型" maxOccurs="2" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="フォントバージョン" use="required" type="{urn:mojikiban:ipa:go:jp:mji}IPAmj明朝フォントバージョン型" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u5b9f\u88c5\u3057\u305fUCS",
        "\u5b9f\u88c5\u3057\u305fSVS",
        "\u5b9f\u88c5\u3057\u305fMojiJohoIVS"
    })
    public static class IPAmj明朝フォント実装 {

        protected String 実装したUCS;
        protected String 実装したSVS;
        @XmlElement(name = "\u5b9f\u88c5\u3057\u305fMoji_JohoIVS")
        protected List<String> 実装したMojiJohoIVS;
        @XmlAttribute(required = true)
        protected String フォントバージョン;

        /**
         * 実装したUCSプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get実装したUCS() {
            return 実装したUCS;
        }

        /**
         * 実装したUCSプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set実装したUCS(String value) {
            this.実装したUCS = value;
        }

        /**
         * 実装したSVSプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get実装したSVS() {
            return 実装したSVS;
        }

        /**
         * 実装したSVSプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set実装したSVS(String value) {
            this.実装したSVS = value;
        }

        /**
         * Gets the value of the 実装したMojiJohoIVS property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the 実装したMojiJohoIVS property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    get実装したMojiJohoIVS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> get実装したMojiJohoIVS() {
            if (実装したMojiJohoIVS == null) {
                実装したMojiJohoIVS = new ArrayList<String>();
            }
            return this.実装したMojiJohoIVS;
        }

        /**
         * フォントバージョンプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getフォントバージョン() {
            return フォントバージョン;
        }

        /**
         * フォントバージョンプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setフォントバージョン(String value) {
            this.フォントバージョン = value;
        }

    }


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
     *         &lt;element name="面区点位置">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;urn:mojikiban:ipa:go:jp:mji>JISX0213型">
     *                 &lt;attribute name="水準" type="{urn:mojikiban:ipa:go:jp:mji}JISX0213水準型" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="包摂連番" type="{urn:mojikiban:ipa:go:jp:mji}JISX0213包摂連番型" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="包摂区分" type="{urn:mojikiban:ipa:go:jp:mji}JISX0213包摂区分型" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u9762\u533a\u70b9\u4f4d\u7f6e",
        "\u5305\u6442\u9023\u756a"
    })
    public static class JISX0213 {

        @XmlElement(required = true)
        protected MJ文字情報.JISX0213 .面区点位置 面区点位置;
        protected List<String> 包摂連番;
        @XmlAttribute
        protected String 包摂区分;

        /**
         * 面区点位置プロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link MJ文字情報.JISX0213 .面区点位置 }
         *     
         */
        public MJ文字情報.JISX0213 .面区点位置 get面区点位置() {
            return 面区点位置;
        }

        /**
         * 面区点位置プロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link MJ文字情報.JISX0213 .面区点位置 }
         *     
         */
        public void set面区点位置(MJ文字情報.JISX0213 .面区点位置 value) {
            this.面区点位置 = value;
        }

        /**
         * Gets the value of the 包摂連番 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the 包摂連番 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    get包摂連番().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> get包摂連番() {
            if (包摂連番 == null) {
                包摂連番 = new ArrayList<String>();
            }
            return this.包摂連番;
        }

        /**
         * 包摂区分プロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get包摂区分() {
            return 包摂区分;
        }

        /**
         * 包摂区分プロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set包摂区分(String value) {
            this.包摂区分 = value;
        }


        /**
         * <p>anonymous complex typeのJavaクラス。
         * 
         * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;urn:mojikiban:ipa:go:jp:mji>JISX0213型">
         *       &lt;attribute name="水準" type="{urn:mojikiban:ipa:go:jp:mji}JISX0213水準型" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class 面区点位置 {

            @XmlValue
            protected String value;
            @XmlAttribute
            protected String 水準;

            /**
             * JIS X 0213:2012に定義された面区点コード
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * valueプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * 水準プロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String get水準() {
                return 水準;
            }

            /**
             * 水準プロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void set水準(String value) {
                this.水準 = value;
            }

        }

    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *       &lt;attribute name="MJ文字図形バージョン" use="required" type="{urn:mojikiban:ipa:go:jp:mji}MJ文字図形バージョン型" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class MJ文字図形 {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAttribute(name = "MJ\u6587\u5b57\u56f3\u5f62\u30d0\u30fc\u30b8\u30e7\u30f3", required = true)
        protected String mj文字図形バージョン;

        /**
         * valueプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * valueプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * mj文字図形バージョンプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMJ文字図形バージョン() {
            return mj文字図形バージョン;
        }

        /**
         * mj文字図形バージョンプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMJ文字図形バージョン(String value) {
            this.mj文字図形バージョン = value;
        }

    }


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
     *         &lt;element name="対応するUCS" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;urn:mojikiban:ipa:go:jp:mji>対応するUCS値型">
     *                 &lt;attribute name="対応カテゴリー" use="required" type="{urn:mojikiban:ipa:go:jp:mji}UCS対応カテゴリー型" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="対応する互換漢字" type="{urn:mojikiban:ipa:go:jp:mji}UCS型" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u5bfe\u5fdc\u3059\u308bUCS",
        "\u5bfe\u5fdc\u3059\u308b\u4e92\u63db\u6f22\u5b57"
    })
    public static class UCS {

        protected MJ文字情報.UCS.対応するUCS 対応するUCS;
        protected String 対応する互換漢字;

        /**
         * 対応するUCSプロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link MJ文字情報.UCS.対応するUCS }
         *     
         */
        public MJ文字情報.UCS.対応するUCS get対応するUCS() {
            return 対応するUCS;
        }

        /**
         * 対応するUCSプロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link MJ文字情報.UCS.対応するUCS }
         *     
         */
        public void set対応するUCS(MJ文字情報.UCS.対応するUCS value) {
            this.対応するUCS = value;
        }

        /**
         * 対応する互換漢字プロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String get対応する互換漢字() {
            return 対応する互換漢字;
        }

        /**
         * 対応する互換漢字プロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void set対応する互換漢字(String value) {
            this.対応する互換漢字 = value;
        }


        /**
         * <p>anonymous complex typeのJavaクラス。
         * 
         * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;urn:mojikiban:ipa:go:jp:mji>対応するUCS値型">
         *       &lt;attribute name="対応カテゴリー" use="required" type="{urn:mojikiban:ipa:go:jp:mji}UCS対応カテゴリー型" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class 対応するUCS {

            @XmlValue
            protected String value;
            @XmlAttribute(required = true)
            protected UCS対応カテゴリー型 対応カテゴリー;

            /**
             * valueプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * valueプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * 対応カテゴリープロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link UCS対応カテゴリー型 }
             *     
             */
            public UCS対応カテゴリー型 get対応カテゴリー() {
                return 対応カテゴリー;
            }

            /**
             * 対応カテゴリープロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link UCS対応カテゴリー型 }
             *     
             */
            public void set対応カテゴリー(UCS対応カテゴリー型 value) {
                this.対応カテゴリー = value;
            }

        }

    }


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
     *         &lt;element name="更新情報" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="バージョン" use="required" type="{urn:mojikiban:ipa:go:jp:mji}MJ文字情報一覧表バージョン型" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u66f4\u65b0\u60c5\u5831"
    })
    public static class 更新履歴 {

        @XmlElement(required = true)
        protected List<MJ文字情報.更新履歴.更新情報> 更新情報;

        /**
         * Gets the value of the 更新情報 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the 更新情報 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    get更新情報().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MJ文字情報.更新履歴.更新情報 }
         * 
         * 
         */
        public List<MJ文字情報.更新履歴.更新情報> get更新情報() {
            if (更新情報 == null) {
                更新情報 = new ArrayList<MJ文字情報.更新履歴.更新情報>();
            }
            return this.更新情報;
        }


        /**
         * <p>anonymous complex typeのJavaクラス。
         * 
         * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="バージョン" use="required" type="{urn:mojikiban:ipa:go:jp:mji}MJ文字情報一覧表バージョン型" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class 更新情報 {

            @XmlValue
            protected String value;
            @XmlAttribute(required = true)
            protected String バージョン;

            /**
             * valueプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * valueプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * バージョンプロパティの値を取得します。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getバージョン() {
                return バージョン;
            }

            /**
             * バージョンプロパティの値を設定します。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setバージョン(String value) {
                this.バージョン = value;
            }

        }

    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="常用漢字" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="人名用漢字" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class 漢字施策 {

        @XmlAttribute(required = true)
        protected boolean 常用漢字;
        @XmlAttribute(required = true)
        protected boolean 人名用漢字;

        /**
         * 常用漢字プロパティの値を取得します。
         * 
         */
        public boolean is常用漢字() {
            return 常用漢字;
        }

        /**
         * 常用漢字プロパティの値を設定します。
         * 
         */
        public void set常用漢字(boolean value) {
            this.常用漢字 = value;
        }

        /**
         * 人名用漢字プロパティの値を取得します。
         * 
         */
        public boolean is人名用漢字() {
            return 人名用漢字;
        }

        /**
         * 人名用漢字プロパティの値を設定します。
         * 
         */
        public void set人名用漢字(boolean value) {
            this.人名用漢字 = value;
        }

    }


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
     *         &lt;element name="音読み" type="{urn:mojikiban:ipa:go:jp:mji}カタカナ" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="訓読み" type="{urn:mojikiban:ipa:go:jp:mji}ひらがな" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u97f3\u8aad\u307f",
        "\u8a13\u8aad\u307f"
    })
    public static class 読み {

        protected List<String> 音読み;
        protected List<String> 訓読み;

        /**
         * Gets the value of the 音読み property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the 音読み property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    get音読み().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> get音読み() {
            if (音読み == null) {
                音読み = new ArrayList<String>();
            }
            return this.音読み;
        }

        /**
         * Gets the value of the 訓読み property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the 訓読み property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    get訓読み().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> get訓読み() {
            if (訓読み == null) {
                訓読み = new ArrayList<String>();
            }
            return this.訓読み;
        }

    }


    /**
     * <p>anonymous complex typeのJavaクラス。
     * 
     * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="部首" use="required" type="{urn:mojikiban:ipa:go:jp:mji}康煕部首型" />
     *       &lt;attribute name="内画数" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class 部首内画数 {

        @XmlAttribute(required = true)
        protected int 部首;
        @XmlAttribute
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger 内画数;

        /**
         * 部首プロパティの値を取得します。
         * 
         */
        public int get部首() {
            return 部首;
        }

        /**
         * 部首プロパティの値を設定します。
         * 
         */
        public void set部首(int value) {
            this.部首 = value;
        }

        /**
         * 内画数プロパティの値を取得します。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger get内画数() {
            return 内画数;
        }

        /**
         * 内画数プロパティの値を設定します。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void set内画数(BigInteger value) {
            this.内画数 = value;
        }

    }

}
