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
 * ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.h
 *
 * 
 */

#ifndef ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties_H_
#define ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyInteger.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties
    : public ModelBase
{
public:
    ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties();
    virtual ~ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getBatchCommitSize() const;
    void setBatchCommitSize(ConfigNodePropertyInteger const& value);
    bool batchCommitSizeIsSet() const;
    void unsetBatch_commit_size();

protected:
    ConfigNodePropertyInteger m_Batch_commit_size;
    bool m_Batch_commit_sizeIsSet;
};

}
}
}
}

#endif /* ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties_H_ */