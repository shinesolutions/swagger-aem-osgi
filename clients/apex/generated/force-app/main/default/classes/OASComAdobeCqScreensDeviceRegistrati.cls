/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

/**
 * OASComAdobeCqScreensDeviceRegistrati
 */
public class OASComAdobeCqScreensDeviceRegistrati {
    /**
     * Get deviceRegistrationTimeout
     * @return deviceRegistrationTimeout
     */
    public OASConfigNodePropertyInteger deviceRegistrationTimeout { get; set; }

    public static OASComAdobeCqScreensDeviceRegistrati getExample() {
        OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties = new OASComAdobeCqScreensDeviceRegistrati();
          comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.deviceRegistrationTimeout = OASConfigNodePropertyInteger.getExample();
        return comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeCqScreensDeviceRegistrati) {           
            OASComAdobeCqScreensDeviceRegistrati comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties = (OASComAdobeCqScreensDeviceRegistrati) obj;
            return this.deviceRegistrationTimeout == comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.deviceRegistrationTimeout;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (deviceRegistrationTimeout == null ? 0 : System.hashCode(deviceRegistrationTimeout));
        return hashCode;
    }
}
