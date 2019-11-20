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
 * ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.h
 *
 * 
 */

#ifndef ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties_H_
#define ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
{
public:
    ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties();
    virtual ~ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getEventFilter() const;
    void setEventFilter(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getMinThreadPoolSize() const;
    void setMinThreadPoolSize(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getMaxThreadPoolSize() const;
    void setMaxThreadPoolSize(std::shared_ptr<ConfigNodePropertyInteger> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getCqWcmWorkflowTerminateOnActivate() const;
    void setCqWcmWorkflowTerminateOnActivate(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getCqWcmWorklfowTerminateExclusionList() const;
    void setCqWcmWorklfowTerminateExclusionList(std::shared_ptr<ConfigNodePropertyArray> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Event_filter;
    std::shared_ptr<ConfigNodePropertyInteger> m_MinThreadPoolSize;
    std::shared_ptr<ConfigNodePropertyInteger> m_MaxThreadPoolSize;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Cq_wcm_workflow_terminate_on_activate;
    std::shared_ptr<ConfigNodePropertyArray> m_Cq_wcm_worklfow_terminate_exclusion_list;
};

}
}
}
}

#endif /* ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties_H_ */