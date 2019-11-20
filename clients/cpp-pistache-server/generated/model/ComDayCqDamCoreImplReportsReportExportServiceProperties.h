/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ComDayCqDamCoreImplReportsReportExportServiceProperties.h
 *
 * 
 */

#ifndef ComDayCqDamCoreImplReportsReportExportServiceProperties_H_
#define ComDayCqDamCoreImplReportsReportExportServiceProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyInteger.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamCoreImplReportsReportExportServiceProperties
    : public ModelBase
{
public:
    ComDayCqDamCoreImplReportsReportExportServiceProperties();
    virtual ~ComDayCqDamCoreImplReportsReportExportServiceProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqDamCoreImplReportsReportExportServiceProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getQueryBatchSize() const;
    void setQueryBatchSize(ConfigNodePropertyInteger const& value);
    bool queryBatchSizeIsSet() const;
    void unsetQueryBatchSize();

protected:
    ConfigNodePropertyInteger m_QueryBatchSize;
    bool m_QueryBatchSizeIsSet;
};

}
}
}
}

#endif /* ComDayCqDamCoreImplReportsReportExportServiceProperties_H_ */