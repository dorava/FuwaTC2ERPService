package alterbom.org.tempuri;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

import com.teamcenter.clientx.WSconfig;

import alterbom.org.ufida.UFIDAU9ISVMFGBOMIImportBOMSv;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-07-25T17:19:22.218+08:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "ImportBOMSvStub", 
                  wsdlLocation = "http://192.168.2.70/U9/Services/UFIDA.U9.ISV.MFG.BOM.IImportBOMSv.svc?wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class ImportBOMSvStub extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "ImportBOMSvStub");
    public final static QName BasicHttpBindingUFIDAU9ISVMFGBOMIImportBOMSv = new QName("http://tempuri.org/", "BasicHttpBinding_UFIDA.U9.ISV.MFG.BOM.IImportBOMSv");
    static {
        URL url = null;
        try {
            url = new URL(WSconfig.getUrl() + "U9/Services/UFIDA.U9.ISV.MFG.BOM.IImportBOMSv.svc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ImportBOMSvStub.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.2.70/U9/Services/UFIDA.U9.ISV.MFG.BOM.IImportBOMSv.svc?wsdl");
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WSDL_LOCATION = url;
    }

    public ImportBOMSvStub(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ImportBOMSvStub(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImportBOMSvStub() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ImportBOMSvStub(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ImportBOMSvStub(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ImportBOMSvStub(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UFIDAU9ISVMFGBOMIImportBOMSv
     */
    @WebEndpoint(name = "BasicHttpBinding_UFIDA.U9.ISV.MFG.BOM.IImportBOMSv")
    public UFIDAU9ISVMFGBOMIImportBOMSv getBasicHttpBindingUFIDAU9ISVMFGBOMIImportBOMSv() {
        return super.getPort(BasicHttpBindingUFIDAU9ISVMFGBOMIImportBOMSv, UFIDAU9ISVMFGBOMIImportBOMSv.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UFIDAU9ISVMFGBOMIImportBOMSv
     */
    @WebEndpoint(name = "BasicHttpBinding_UFIDA.U9.ISV.MFG.BOM.IImportBOMSv")
    public UFIDAU9ISVMFGBOMIImportBOMSv getBasicHttpBindingUFIDAU9ISVMFGBOMIImportBOMSv(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingUFIDAU9ISVMFGBOMIImportBOMSv, UFIDAU9ISVMFGBOMIImportBOMSv.class, features);
    }

}
