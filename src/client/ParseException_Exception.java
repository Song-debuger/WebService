
package client;

import javax.xml.ws.WebFault;



@SuppressWarnings("serial")
@WebFault(name = "ParseException", targetNamespace = "http://server/")
public class ParseException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ParseException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ParseException_Exception(String message, ParseException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ParseException_Exception(String message, ParseException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: client.ParseException
     */
    public ParseException getFaultInfo() {
        return faultInfo;
    }

}
