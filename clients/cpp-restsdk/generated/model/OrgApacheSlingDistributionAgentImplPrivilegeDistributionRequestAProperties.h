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
 * OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties
    : public ModelBase
{
public:
    OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties();
    virtual ~OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getName() const;
    bool nameIsSet() const;
    void unsetName();
    void setName(std::shared_ptr<ConfigNodePropertyString> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getJcrPrivilege() const;
    bool jcrPrivilegeIsSet() const;
    void unsetJcrPrivilege();
    void setJcrPrivilege(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyString> m_Name;
    bool m_NameIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_JcrPrivilege;
    bool m_JcrPrivilegeIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties_H_ */