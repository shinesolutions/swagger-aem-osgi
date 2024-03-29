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
 * OrgApacheSlingStartupfilterImplStartupFilterImplProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingStartupfilterImplStartupFilterImplProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingStartupfilterImplStartupFilterImplProperties_H_


#include "../ModelBase.h"

#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  OrgApacheSlingStartupfilterImplStartupFilterImplProperties
    : public ModelBase
{
public:
    OrgApacheSlingStartupfilterImplStartupFilterImplProperties();
    virtual ~OrgApacheSlingStartupfilterImplStartupFilterImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrgApacheSlingStartupfilterImplStartupFilterImplProperties members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyBoolean> getActiveByDefault() const;
    bool activeByDefaultIsSet() const;
    void unsetActive_by_default();
    void setActiveByDefault(std::shared_ptr<ConfigNodePropertyBoolean> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ConfigNodePropertyString> getDefaultMessage() const;
    bool defaultMessageIsSet() const;
    void unsetDefault_message();
    void setDefaultMessage(std::shared_ptr<ConfigNodePropertyString> value);

protected:
    std::shared_ptr<ConfigNodePropertyBoolean> m_Active_by_default;
    bool m_Active_by_defaultIsSet;
    std::shared_ptr<ConfigNodePropertyString> m_Default_message;
    bool m_Default_messageIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_OrgApacheSlingStartupfilterImplStartupFilterImplProperties_H_ */
