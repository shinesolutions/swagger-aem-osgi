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
 * OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyInteger.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties
    : public ModelBase
{
public:
    OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties();
    virtual ~OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyInteger> getPort() const;
    bool portIsSet() const;
    void unsetPort();
    void setPort(std::shared_ptr<ConfigNodePropertyInteger> value);

protected:
    std::shared_ptr<ConfigNodePropertyInteger> m_Port;
    bool m_PortIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties_H_ */