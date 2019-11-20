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
 * ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties.h
 *
 * 
 */

#ifndef ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties_H_
#define ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
    : public ModelBase
{
public:
    ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties();
    virtual ~ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyDropDown getGraniteWorkflowinboxSortPropertyName() const;
    void setGraniteWorkflowinboxSortPropertyName(ConfigNodePropertyDropDown const& value);
    bool graniteWorkflowinboxSortPropertyNameIsSet() const;
    void unsetGranite_workflowinbox_sort_propertyName();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyString getGraniteWorkflowinboxSortOrder() const;
    void setGraniteWorkflowinboxSortOrder(ConfigNodePropertyString const& value);
    bool graniteWorkflowinboxSortOrderIsSet() const;
    void unsetGranite_workflowinbox_sort_order();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getCqWorkflowJobRetry() const;
    void setCqWorkflowJobRetry(ConfigNodePropertyInteger const& value);
    bool cqWorkflowJobRetryIsSet() const;
    void unsetCq_workflow_job_retry();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyArray getCqWorkflowSuperuser() const;
    void setCqWorkflowSuperuser(ConfigNodePropertyArray const& value);
    bool cqWorkflowSuperuserIsSet() const;
    void unsetCq_workflow_superuser();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getGraniteWorkflowInboxQuerySize() const;
    void setGraniteWorkflowInboxQuerySize(ConfigNodePropertyInteger const& value);
    bool graniteWorkflowInboxQuerySizeIsSet() const;
    void unsetGranite_workflow_inboxQuerySize();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getGraniteWorkflowAdminUserGroupFilter() const;
    void setGraniteWorkflowAdminUserGroupFilter(ConfigNodePropertyBoolean const& value);
    bool graniteWorkflowAdminUserGroupFilterIsSet() const;
    void unsetGranite_workflow_adminUserGroupFilter();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getGraniteWorkflowEnforceWorkitemAssigneePermissions() const;
    void setGraniteWorkflowEnforceWorkitemAssigneePermissions(ConfigNodePropertyBoolean const& value);
    bool graniteWorkflowEnforceWorkitemAssigneePermissionsIsSet() const;
    void unsetGranite_workflow_enforceWorkitemAssigneePermissions();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getGraniteWorkflowEnforceWorkflowInitiatorPermissions() const;
    void setGraniteWorkflowEnforceWorkflowInitiatorPermissions(ConfigNodePropertyBoolean const& value);
    bool graniteWorkflowEnforceWorkflowInitiatorPermissionsIsSet() const;
    void unsetGranite_workflow_enforceWorkflowInitiatorPermissions();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyBoolean getGraniteWorkflowInjectTenantIdInJobTopics() const;
    void setGraniteWorkflowInjectTenantIdInJobTopics(ConfigNodePropertyBoolean const& value);
    bool graniteWorkflowInjectTenantIdInJobTopicsIsSet() const;
    void unsetGranite_workflow_injectTenantIdInJobTopics();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getGraniteWorkflowMaxPurgeSaveThreshold() const;
    void setGraniteWorkflowMaxPurgeSaveThreshold(ConfigNodePropertyInteger const& value);
    bool graniteWorkflowMaxPurgeSaveThresholdIsSet() const;
    void unsetGranite_workflow_maxPurgeSaveThreshold();
    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getGraniteWorkflowMaxPurgeQueryCount() const;
    void setGraniteWorkflowMaxPurgeQueryCount(ConfigNodePropertyInteger const& value);
    bool graniteWorkflowMaxPurgeQueryCountIsSet() const;
    void unsetGranite_workflow_maxPurgeQueryCount();

protected:
    ConfigNodePropertyDropDown m_Granite_workflowinbox_sort_propertyName;
    bool m_Granite_workflowinbox_sort_propertyNameIsSet;
    ConfigNodePropertyString m_Granite_workflowinbox_sort_order;
    bool m_Granite_workflowinbox_sort_orderIsSet;
    ConfigNodePropertyInteger m_Cq_workflow_job_retry;
    bool m_Cq_workflow_job_retryIsSet;
    ConfigNodePropertyArray m_Cq_workflow_superuser;
    bool m_Cq_workflow_superuserIsSet;
    ConfigNodePropertyInteger m_Granite_workflow_inboxQuerySize;
    bool m_Granite_workflow_inboxQuerySizeIsSet;
    ConfigNodePropertyBoolean m_Granite_workflow_adminUserGroupFilter;
    bool m_Granite_workflow_adminUserGroupFilterIsSet;
    ConfigNodePropertyBoolean m_Granite_workflow_enforceWorkitemAssigneePermissions;
    bool m_Granite_workflow_enforceWorkitemAssigneePermissionsIsSet;
    ConfigNodePropertyBoolean m_Granite_workflow_enforceWorkflowInitiatorPermissions;
    bool m_Granite_workflow_enforceWorkflowInitiatorPermissionsIsSet;
    ConfigNodePropertyBoolean m_Granite_workflow_injectTenantIdInJobTopics;
    bool m_Granite_workflow_injectTenantIdInJobTopicsIsSet;
    ConfigNodePropertyInteger m_Granite_workflow_maxPurgeSaveThreshold;
    bool m_Granite_workflow_maxPurgeSaveThresholdIsSet;
    ConfigNodePropertyInteger m_Granite_workflow_maxPurgeQueryCount;
    bool m_Granite_workflow_maxPurgeQueryCountIsSet;
};

}
}
}
}

#endif /* ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties_H_ */