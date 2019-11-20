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
 * OASComDayCqDamCoreImplReportsReportE
 */
public class OASComDayCqDamCoreImplReportsReportE {
    /**
     * Get queryBatchSize
     * @return queryBatchSize
     */
    public OASConfigNodePropertyInteger queryBatchSize { get; set; }

    public static OASComDayCqDamCoreImplReportsReportE getExample() {
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties = new OASComDayCqDamCoreImplReportsReportE();
          comDayCqDamCoreImplReportsReportExportServiceProperties.queryBatchSize = OASConfigNodePropertyInteger.getExample();
        return comDayCqDamCoreImplReportsReportExportServiceProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASComDayCqDamCoreImplReportsReportE) {           
            OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties = (OASComDayCqDamCoreImplReportsReportE) obj;
            return this.queryBatchSize == comDayCqDamCoreImplReportsReportExportServiceProperties.queryBatchSize;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (queryBatchSize == null ? 0 : System.hashCode(queryBatchSize));
        return hashCode;
    }
}
