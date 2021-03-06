
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>addList complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="addList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addList", propOrder = {
        "arg0",
        "arg1",
        "arg2",
        "arg3",
        "arg4"
})
public class AddList {

    protected String arg0;
    protected String arg1;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arg2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arg3;
    protected String arg4;

    /**
     * 获取arg0属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArg0() {
        return arg0;
    }

    /**
     * 设置arg0属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArg0(String value) {
        this.arg0 = value;
    }

    /**
     * 获取arg1属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * 设置arg1属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

    /**
     * 获取arg2属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getArg2() {
        return arg2;
    }

    /**
     * 设置arg2属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setArg2(XMLGregorianCalendar value) {
        this.arg2 = value;
    }

    /**
     * 获取arg3属性的值。
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getArg3() {
        return arg3;
    }

    /**
     * 设置arg3属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setArg3(XMLGregorianCalendar value) {
        this.arg3 = value;
    }

    /**
     * 获取arg4属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArg4() {
        return arg4;
    }

    /**
     * 设置arg4属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArg4(String value) {
        this.arg4 = value;
    }

}
