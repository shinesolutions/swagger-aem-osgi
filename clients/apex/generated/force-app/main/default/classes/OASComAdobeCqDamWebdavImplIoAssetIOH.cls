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
 * OASComAdobeCqDamWebdavImplIoAssetIOH
 */
public class OASComAdobeCqDamWebdavImplIoAssetIOH implements OAS.MappedProperties {
    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public OASConfigNodePropertyInteger serviceRanking { get; set; }

    /**
     * Get pathPrefix
     * @return pathPrefix
     */
    public OASConfigNodePropertyString pathPrefix { get; set; }

    /**
     * Get createVersion
     * @return createVersion
     */
    public OASConfigNodePropertyBoolean createVersion { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'service.ranking' => 'serviceRanking'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComAdobeCqDamWebdavImplIoAssetIOH getExample() {
        OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties = new OASComAdobeCqDamWebdavImplIoAssetIOH();
          comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.serviceRanking = OASConfigNodePropertyInteger.getExample();
          comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.pathPrefix = OASConfigNodePropertyString.getExample();
          comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.createVersion = OASConfigNodePropertyBoolean.getExample();
        return comAdobeCqDamWebdavImplIoAssetIOHandlerProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComAdobeCqDamWebdavImplIoAssetIOH) {           
            OASComAdobeCqDamWebdavImplIoAssetIOH comAdobeCqDamWebdavImplIoAssetIOHandlerProperties = (OASComAdobeCqDamWebdavImplIoAssetIOH) obj;
            return this.serviceRanking == comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.serviceRanking
                && this.pathPrefix == comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.pathPrefix
                && this.createVersion == comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.createVersion;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (serviceRanking == null ? 0 : System.hashCode(serviceRanking));
        hashCode = (17 * hashCode) + (pathPrefix == null ? 0 : System.hashCode(pathPrefix));
        hashCode = (17 * hashCode) + (createVersion == null ? 0 : System.hashCode(createVersion));
        return hashCode;
    }
}
