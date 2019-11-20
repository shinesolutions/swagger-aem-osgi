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
 * ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteWorkflowCoreWorkflowConfigProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteWorkflowCoreWorkflowConfigProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyArray.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeGraniteWorkflowCoreWorkflowConfigProperties
    : public ModelBase
{
public:
    ComAdobeGraniteWorkflowCoreWorkflowConfigProperties();
    virtual ~ComAdobeGraniteWorkflowCoreWorkflowConfigProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeGraniteWorkflowCoreWorkflowConfigProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getCqWorkflowConfigWorkflowPackagesRootPath() const;
    bool cqWorkflowConfigWorkflowPackagesRootPathIsSet() const;
    void unsetCq_workflow_config_workflow_packages_root_path();
    void setCqWorkflowConfigWorkflowPackagesRootPath(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getCqWorkflowConfigWorkflowProcessLegacyMode() const;
    bool cqWorkflowConfigWorkflowProcessLegacyModeIsSet() const;
    void unsetCq_workflow_config_workflow_process_legacy_mode();
    void setCqWorkflowConfigWorkflowProcessLegacyMode(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getCqWorkflowConfigAllowLocking() const;
    bool cqWorkflowConfigAllowLockingIsSet() const;
    void unsetCq_workflow_config_allow_locking();
    void setCqWorkflowConfigAllowLocking(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyArray> m_Cq_workflow_config_workflow_packages_root_path;
    bool m_Cq_workflow_config_workflow_packages_root_pathIsSet;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Cq_workflow_config_workflow_process_legacy_mode;
    bool m_Cq_workflow_config_workflow_process_legacy_modeIsSet;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Cq_workflow_config_allow_locking;
    bool m_Cq_workflow_config_allow_lockingIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteWorkflowCoreWorkflowConfigProperties_H_ */