/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.2.1-SNAPSHOT.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
    : public ModelBase
{
public:
    ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties();
    virtual ~ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getWorkflowpackageinfoproviderFilter() const;
    bool workflowpackageinfoproviderFilterIsSet() const;
    void unsetWorkflowpackageinfoprovider_filter();
    void setWorkflowpackageinfoproviderFilter(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getWorkflowpackageinfoproviderFilterRootpath() const;
    bool workflowpackageinfoproviderFilterRootpathIsSet() const;
    void unsetWorkflowpackageinfoprovider_filter_rootpath();
    void setWorkflowpackageinfoproviderFilterRootpath(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyArray> m_Workflowpackageinfoprovider_filter;
    bool m_Workflowpackageinfoprovider_filterIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Workflowpackageinfoprovider_filter_rootpath;
    bool m_Workflowpackageinfoprovider_filter_rootpathIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties_H_ */