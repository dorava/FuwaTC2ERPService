package take_number.call_net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import com.teamcenter.clientx.WSconfig;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2017-07-13T09:18:21.663+08:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "CreateItemForSDByCustSV", 
                  wsdlLocation = "http://192.168.2.70/BarCodeWeb/CreateItemForSDByCustSV.asmx?wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class CreateItemForSDByCustSV extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "CreateItemForSDByCustSV");
    public final static QName CreateItemForSDByCustSVSoap12 = new QName("http://tempuri.org/", "CreateItemForSDByCustSVSoap12");
    public final static QName CreateItemForSDByCustSVSoap = new QName("http://tempuri.org/", "CreateItemForSDByCustSVSoap");
    static {
        URL url = null;
        try {
            url = new URL(WSconfig.getUrl()+"BarCodeWeb/CreateItemForSDByCustSV.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CreateItemForSDByCustSV.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.2.70/BarCodeWeb/CreateItemForSDByCustSV.asmx?wsdl");
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WSDL_LOCATION = url;
    }

    public CreateItemForSDByCustSV(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CreateItemForSDByCustSV(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CreateItemForSDByCustSV() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CreateItemForSDByCustSV(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CreateItemForSDByCustSV(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CreateItemForSDByCustSV(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns CreateItemForSDByCustSVSoap
     */
    @WebEndpoint(name = "CreateItemForSDByCustSVSoap12")
    public CreateItemForSDByCustSVSoap getCreateItemForSDByCustSVSoap12() {
        return super.getPort(CreateItemForSDByCustSVSoap12, CreateItemForSDByCustSVSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreateItemForSDByCustSVSoap
     */
    @WebEndpoint(name = "CreateItemForSDByCustSVSoap12")
    public CreateItemForSDByCustSVSoap getCreateItemForSDByCustSVSoap12(WebServiceFeature... features) {
        return super.getPort(CreateItemForSDByCustSVSoap12, CreateItemForSDByCustSVSoap.class, features);
    }
    /**
     *
     * @return
     *     returns CreateItemForSDByCustSVSoap
     */
    @WebEndpoint(name = "CreateItemForSDByCustSVSoap")
    public CreateItemForSDByCustSVSoap getCreateItemForSDByCustSVSoap() {
        return super.getPort(CreateItemForSDByCustSVSoap, CreateItemForSDByCustSVSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreateItemForSDByCustSVSoap
     */
    @WebEndpoint(name = "CreateItemForSDByCustSVSoap")
    public CreateItemForSDByCustSVSoap getCreateItemForSDByCustSVSoap(WebServiceFeature... features) {
        return super.getPort(CreateItemForSDByCustSVSoap, CreateItemForSDByCustSVSoap.class, features);
    }

}
