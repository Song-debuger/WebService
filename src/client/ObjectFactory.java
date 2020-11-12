
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ServiceResponse_QNAME = new QName("http://server/", "serviceResponse");
    private final static QName _SearchListResponse_QNAME = new QName("http://server/", "searchListResponse");
    private final static QName _ClearListResponse_QNAME = new QName("http://server/", "clearListResponse");
    private final static QName _SearchList_QNAME = new QName("http://server/", "searchList");
    private final static QName _UserRegisterResponse_QNAME = new QName("http://server/", "userRegisterResponse");
    private final static QName _DeleteListResponse_QNAME = new QName("http://server/", "deleteListResponse");
    private final static QName _DeleteList_QNAME = new QName("http://server/", "deleteList");
    private final static QName _ParseException_QNAME = new QName("http://server/", "ParseException");
    private final static QName _UserRegister_QNAME = new QName("http://server/", "userRegister");
    private final static QName _AddList_QNAME = new QName("http://server/", "addList");
    private final static QName _CheckPasswordResponse_QNAME = new QName("http://server/", "checkPasswordResponse");
    private final static QName _Service_QNAME = new QName("http://server/", "service");
    private final static QName _CheckPassword_QNAME = new QName("http://server/", "checkPassword");
    private final static QName _AddListResponse_QNAME = new QName("http://server/", "addListResponse");
    private final static QName _ClearList_QNAME = new QName("http://server/", "clearList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteList }
     * 
     */
    public DeleteList createDeleteList() {
        return new DeleteList();
    }

    /**
     * Create an instance of {@link DeleteListResponse }
     * 
     */
    public DeleteListResponse createDeleteListResponse() {
        return new DeleteListResponse();
    }

    /**
     * Create an instance of {@link SearchListResponse }
     * 
     */
    public SearchListResponse createSearchListResponse() {
        return new SearchListResponse();
    }

    /**
     * Create an instance of {@link ClearListResponse }
     * 
     */
    public ClearListResponse createClearListResponse() {
        return new ClearListResponse();
    }

    /**
     * Create an instance of {@link SearchList }
     * 
     */
    public SearchList createSearchList() {
        return new SearchList();
    }

    /**
     * Create an instance of {@link UserRegisterResponse }
     * 
     */
    public UserRegisterResponse createUserRegisterResponse() {
        return new UserRegisterResponse();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link AddListResponse }
     * 
     */
    public AddListResponse createAddListResponse() {
        return new AddListResponse();
    }

    /**
     * Create an instance of {@link ClearList }
     * 
     */
    public ClearList createClearList() {
        return new ClearList();
    }

    /**
     * Create an instance of {@link CheckPassword }
     * 
     */
    public CheckPassword createCheckPassword() {
        return new CheckPassword();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link UserRegister }
     * 
     */
    public UserRegister createUserRegister() {
        return new UserRegister();
    }

    /**
     * Create an instance of {@link AddList }
     * 
     */
    public AddList createAddList() {
        return new AddList();
    }

    /**
     * Create an instance of {@link CheckPasswordResponse }
     * 
     */
    public CheckPasswordResponse createCheckPasswordResponse() {
        return new CheckPasswordResponse();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "serviceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "searchListResponse")
    public JAXBElement<SearchListResponse> createSearchListResponse(SearchListResponse value) {
        return new JAXBElement<SearchListResponse>(_SearchListResponse_QNAME, SearchListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "clearListResponse")
    public JAXBElement<ClearListResponse> createClearListResponse(ClearListResponse value) {
        return new JAXBElement<ClearListResponse>(_ClearListResponse_QNAME, ClearListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "searchList")
    public JAXBElement<SearchList> createSearchList(SearchList value) {
        return new JAXBElement<SearchList>(_SearchList_QNAME, SearchList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "userRegisterResponse")
    public JAXBElement<UserRegisterResponse> createUserRegisterResponse(UserRegisterResponse value) {
        return new JAXBElement<UserRegisterResponse>(_UserRegisterResponse_QNAME, UserRegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteListResponse")
    public JAXBElement<DeleteListResponse> createDeleteListResponse(DeleteListResponse value) {
        return new JAXBElement<DeleteListResponse>(_DeleteListResponse_QNAME, DeleteListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteList")
    public JAXBElement<DeleteList> createDeleteList(DeleteList value) {
        return new JAXBElement<DeleteList>(_DeleteList_QNAME, DeleteList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserRegister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "userRegister")
    public JAXBElement<UserRegister> createUserRegister(UserRegister value) {
        return new JAXBElement<UserRegister>(_UserRegister_QNAME, UserRegister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addList")
    public JAXBElement<AddList> createAddList(AddList value) {
        return new JAXBElement<AddList>(_AddList_QNAME, AddList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "checkPasswordResponse")
    public JAXBElement<CheckPasswordResponse> createCheckPasswordResponse(CheckPasswordResponse value) {
        return new JAXBElement<CheckPasswordResponse>(_CheckPasswordResponse_QNAME, CheckPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Service }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "service")
    public JAXBElement<Service> createService(Service value) {
        return new JAXBElement<Service>(_Service_QNAME, Service.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "checkPassword")
    public JAXBElement<CheckPassword> createCheckPassword(CheckPassword value) {
        return new JAXBElement<CheckPassword>(_CheckPassword_QNAME, CheckPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addListResponse")
    public JAXBElement<AddListResponse> createAddListResponse(AddListResponse value) {
        return new JAXBElement<AddListResponse>(_AddListResponse_QNAME, AddListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "clearList")
    public JAXBElement<ClearList> createClearList(ClearList value) {
        return new JAXBElement<ClearList>(_ClearList_QNAME, ClearList.class, null, value);
    }

}
