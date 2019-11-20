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
 * ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties.h
 *
 * 
 */

#ifndef ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_
#define ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_



#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyArray.h"
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
{
public:
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties();
    virtual ~ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getPayloadMoveWhiteList() const;
    void setPayloadMoveWhiteList(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getPayloadMoveHandleFromWorkflowProcess() const;
    void setPayloadMoveHandleFromWorkflowProcess(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyArray> m_Payload_move_white_list;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Payload_move_handle_from_workflow_process;
};

}
}
}
}

#endif /* ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_ */