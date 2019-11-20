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

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_


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
class  ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
    : public ModelBase
{
public:
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties();
    virtual ~ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyArray> getPayloadMoveWhiteList() const;
    bool payloadMoveWhiteListIsSet() const;
    void unsetPayload_move_white_list();
    void setPayloadMoveWhiteList(std::shared_ptr<ConfigNodePropertyArray> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getPayloadMoveHandleFromWorkflowProcess() const;
    bool payloadMoveHandleFromWorkflowProcessIsSet() const;
    void unsetPayload_move_handle_from_workflow_process();
    void setPayloadMoveHandleFromWorkflowProcess(std::shared_ptr<ConfigNodePropertyBoolean> value);

protected:
    std::shared_ptr<ConfigNodePropertyArray> m_Payload_move_white_list;
    bool m_Payload_move_white_listIsSet;
    std::shared_ptr<ConfigNodePropertyBoolean> m_Payload_move_handle_from_workflow_process;
    bool m_Payload_move_handle_from_workflow_processIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties_H_ */