package senditem.u9erp;

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
 * This class was generated by Apache CXF 3.1.12
 * 2017-07-18T10:53:32.747+08:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "FuwaItemSendSVStub", 
                  wsdlLocation = "http://192.168.2.70/U9/Services/UFIDA.U9.Cust.Fuwa.PDM.ItemSendSV.IFuwaItemSendSV.svc?wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class FuwaItemSendSVStub extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "FuwaItemSendSVStub");
    public final static QName BasicHttpBindingUFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV = new QName("http://tempuri.org/", "BasicHttpBinding_UFIDA.U9.Cust.Fuwa.PDM.ItemSendSV.IFuwaItemSendSV");
    static {
        URL url = null;
        try {
            url = new URL(WSconfig.getUrl()+"U9/Services/UFIDA.U9.Cust.Fuwa.PDM.ItemSendSV.IFuwaItemSendSV.svc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FuwaItemSendSVStub.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.2.70/U9/Services/UFIDA.U9.Cust.Fuwa.PDM.ItemSendSV.IFuwaItemSendSV.svc?wsdl");
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WSDL_LOCATION = url;
    }

    public FuwaItemSendSVStub(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FuwaItemSendSVStub(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FuwaItemSendSVStub() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public FuwaItemSendSVStub(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public FuwaItemSendSVStub(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public FuwaItemSendSVStub(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV
     */
    @WebEndpoint(name = "BasicHttpBinding_UFIDA.U9.Cust.Fuwa.PDM.ItemSendSV.IFuwaItemSendSV")
    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV getBasicHttpBindingUFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV() {
        return super.getPort(BasicHttpBindingUFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV, UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV
     */
    @WebEndpoint(name = "BasicHttpBinding_UFIDA.U9.Cust.Fuwa.PDM.ItemSendSV.IFuwaItemSendSV")
    public UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV getBasicHttpBindingUFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingUFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV, UFIDAU9CustFuwaPDMItemSendSVIFuwaItemSendSV.class, features);
    }

}
