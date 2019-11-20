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
 * ComAdobeCqProjectsPurgeSchedulerProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqProjectsPurgeSchedulerProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqProjectsPurgeSchedulerProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqProjectsPurgeSchedulerProperties
    : public ModelBase
{
public:
    ComAdobeCqProjectsPurgeSchedulerProperties();
    virtual ~ComAdobeCqProjectsPurgeSchedulerProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeCqProjectsPurgeSchedulerProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getScheduledpurgeName() const;
    bool scheduledpurgeNameIsSet() const;
    void unsetScheduledpurge_name();
    void setScheduledpurgeName(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getScheduledpurgePurgeActive() const;
    bool scheduledpurgePurgeActiveIsSet() const;
    void unsetScheduledpurge_purgeActive();
    void setScheduledpurgePurgeActive(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getScheduledpurgeTemplates() const;
    bool scheduledpurgeTemplatesIsSet() const;
    void unsetScheduledpurge_templates();
    void setScheduledpurgeTemplates(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getScheduledpurgePurgeGroups() const;
    bool scheduledpurgePurgeGroupsIsSet() const;
    void unsetScheduledpurge_purgeGroups();
    void setScheduledpurgePurgeGroups(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getScheduledpurgePurgeAssets() const;
    bool scheduledpurgePurgeAssetsIsSet() const;
    void unsetScheduledpurge_purgeAssets();
    void setScheduledpurgePurgeAssets(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getScheduledpurgeTerminateRunningWorkflows() const;
    bool scheduledpurgeTerminateRunningWorkflowsIsSet() const;
    void unsetScheduledpurge_terminateRunningWorkflows();
    void setScheduledpurgeTerminateRunningWorkflows(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getScheduledpurgeDaysold() const;
    bool scheduledpurgeDaysoldIsSet() const;
    void unsetScheduledpurge_daysold();
    void setScheduledpurgeDaysold(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getScheduledpurgeSaveThreshold() const;
    bool scheduledpurgeSaveThresholdIsSet() const;
    void unsetScheduledpurge_saveThreshold();
    void setScheduledpurgeSaveThreshold(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Scheduledpurge_name;
    bool m_Scheduledpurge_nameIsSet;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Scheduledpurge_purgeActive;
    bool m_Scheduledpurge_purgeActiveIsSet;
    std::shared_ptr<ConfigNodePropertyArray> m_Scheduledpurge_templates;
    bool m_Scheduledpurge_templatesIsSet;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Scheduledpurge_purgeGroups;
    bool m_Scheduledpurge_purgeGroupsIsSet;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Scheduledpurge_purgeAssets;
    bool m_Scheduledpurge_purgeAssetsIsSet;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Scheduledpurge_terminateRunningWorkflows;
    bool m_Scheduledpurge_terminateRunningWorkflowsIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Scheduledpurge_daysold;
    bool m_Scheduledpurge_daysoldIsSet;
    std::shared_ptr<ConfigNodePropertyInteger> m_Scheduledpurge_saveThreshold;
    bool m_Scheduledpurge_saveThresholdIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeCqProjectsPurgeSchedulerProperties_H_ */