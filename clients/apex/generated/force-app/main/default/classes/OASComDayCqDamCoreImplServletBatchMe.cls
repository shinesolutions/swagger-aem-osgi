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
 * OASComDayCqDamCoreImplServletBatchMe
 */
public class OASComDayCqDamCoreImplServletBatchMe implements OAS.MappedProperties {
    /**
     * Get cqDamBatchMetadataAssetDefault
     * @return cqDamBatchMetadataAssetDefault
     */
    public OASConfigNodePropertyArray cqDamBatchMetadataAssetDefault { get; set; }

    /**
     * Get cqDamBatchMetadataCollectionDefault
     * @return cqDamBatchMetadataCollectionDefault
     */
    public OASConfigNodePropertyArray cqDamBatchMetadataCollectionDefault { get; set; }

    /**
     * Get cqDamBatchMetadataMaxresources
     * @return cqDamBatchMetadataMaxresources
     */
    public OASConfigNodePropertyInteger cqDamBatchMetadataMaxresources { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'cq.dam.batch.metadata.asset.default' => 'cqDamBatchMetadataAssetDefault',
        'cq.dam.batch.metadata.collection.default' => 'cqDamBatchMetadataCollectionDefault',
        'cq.dam.batch.metadata.maxresources' => 'cqDamBatchMetadataMaxresources'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASComDayCqDamCoreImplServletBatchMe getExample() {
        OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties = new OASComDayCqDamCoreImplServletBatchMe();
          comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataAssetDefault = OASConfigNodePropertyArray.getExample();
          comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataCollectionDefault = OASConfigNodePropertyArray.getExample();
          comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataMaxresources = OASConfigNodePropertyInteger.getExample();
        return comDayCqDamCoreImplServletBatchMetadataServletProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqDamCoreImplServletBatchMe) {           
            OASComDayCqDamCoreImplServletBatchMe comDayCqDamCoreImplServletBatchMetadataServletProperties = (OASComDayCqDamCoreImplServletBatchMe) obj;
            return this.cqDamBatchMetadataAssetDefault == comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataAssetDefault
                && this.cqDamBatchMetadataCollectionDefault == comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataCollectionDefault
                && this.cqDamBatchMetadataMaxresources == comDayCqDamCoreImplServletBatchMetadataServletProperties.cqDamBatchMetadataMaxresources;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (cqDamBatchMetadataAssetDefault == null ? 0 : System.hashCode(cqDamBatchMetadataAssetDefault));
        hashCode = (17 * hashCode) + (cqDamBatchMetadataCollectionDefault == null ? 0 : System.hashCode(cqDamBatchMetadataCollectionDefault));
        hashCode = (17 * hashCode) + (cqDamBatchMetadataMaxresources == null ? 0 : System.hashCode(cqDamBatchMetadataMaxresources));
        return hashCode;
    }
}
