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



#include "ComDayCqSecurityACLSetupProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqSecurityACLSetupProperties::ComDayCqSecurityACLSetupProperties()
{
    m_Cq_aclsetup_rulesIsSet = false;
}

ComDayCqSecurityACLSetupProperties::~ComDayCqSecurityACLSetupProperties()
{
}

void ComDayCqSecurityACLSetupProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqSecurityACLSetupProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Cq_aclsetup_rulesIsSet)
    {
        val[utility::conversions::to_string_t("cq.aclsetup.rules")] = ModelBase::toJson(m_Cq_aclsetup_rules);
    }

    return val;
}

void ComDayCqSecurityACLSetupProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("cq.aclsetup.rules")))
    {
        if(!val[utility::conversions::to_string_t("cq.aclsetup.rules")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("cq.aclsetup.rules")]);
            setCqAclsetupRules( newItem );
        }
    }
}

void ComDayCqSecurityACLSetupProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Cq_aclsetup_rulesIsSet)
    {
        if (m_Cq_aclsetup_rules.get())
        {
            m_Cq_aclsetup_rules->toMultipart(multipart, utility::conversions::to_string_t("cq.aclsetup.rules."));
        }
    }
}

void ComDayCqSecurityACLSetupProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("cq.aclsetup.rules")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("cq.aclsetup.rules")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("cq.aclsetup.rules."));
            setCqAclsetupRules( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyArray> ComDayCqSecurityACLSetupProperties::getCqAclsetupRules() const
{
    return m_Cq_aclsetup_rules;
}


void ComDayCqSecurityACLSetupProperties::setCqAclsetupRules(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_Cq_aclsetup_rules = value;
    m_Cq_aclsetup_rulesIsSet = true;
}
bool ComDayCqSecurityACLSetupProperties::cqAclsetupRulesIsSet() const
{
    return m_Cq_aclsetup_rulesIsSet;
}

void ComDayCqSecurityACLSetupProperties::unsetCq_aclsetup_rules()
{
    m_Cq_aclsetup_rulesIsSet = false;
}

}
}
}
}
