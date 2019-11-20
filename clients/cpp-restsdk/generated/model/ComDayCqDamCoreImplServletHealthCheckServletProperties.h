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
 * ComDayCqDamCoreImplServletHealthCheckServletProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqDamCoreImplServletHealthCheckServletProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqDamCoreImplServletHealthCheckServletProperties_H_


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
class  ComDayCqDamCoreImplServletHealthCheckServletProperties
    : public ModelBase
{
public:
    ComDayCqDamCoreImplServletHealthCheckServletProperties();
    virtual ~ComDayCqDamCoreImplServletHealthCheckServletProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComDayCqDamCoreImplServletHealthCheckServletProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getCqDamSyncWorkflowId() const;
    bool cqDamSyncWorkflowIdIsSet() const;
    void unsetCq_dam_sync_workflow_id();
    void setCqDamSyncWorkflowId(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getCqDamSyncFolderTypes() const;
    bool cqDamSyncFolderTypesIsSet() const;
    void unsetCq_dam_sync_folder_types();
    void setCqDamSyncFolderTypes(std::shared_ptr<ConfigNodePropertyArray> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Cq_dam_sync_workflow_id;
    bool m_Cq_dam_sync_workflow_idIsSet;
    std::shared_ptr<ConfigNodePropertyArray> m_Cq_dam_sync_folder_types;
    bool m_Cq_dam_sync_folder_typesIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComDayCqDamCoreImplServletHealthCheckServletProperties_H_ */