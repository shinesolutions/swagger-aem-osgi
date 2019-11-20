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



#include "OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties()
{
    m_PackageRootsIsSet = false;
}

OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::~OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties()
{
}

void OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::validate()
{
    // TODO: implement validation
}

web::json::value OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_PackageRootsIsSet)
    {
        val[utility::conversions::to_string_t("packageRoots")] = ModelBase::toJson(m_PackageRoots);
    }

    return val;
}

void OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("packageRoots")))
    {
        if(!val[utility::conversions::to_string_t("packageRoots")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromJson(val[utility::conversions::to_string_t("packageRoots")]);
            setPackageRoots( newItem );
        }
    }
}

void OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_PackageRootsIsSet)
    {
        if (m_PackageRoots.get())
        {
            m_PackageRoots->toMultipart(multipart, utility::conversions::to_string_t("packageRoots."));
        }
    }
}

void OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("packageRoots")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("packageRoots")))
        {
            std::shared_ptr<ConfigNodePropertyArray> newItem(new ConfigNodePropertyArray());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("packageRoots."));
            setPackageRoots( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyArray> OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::getPackageRoots() const
{
    return m_PackageRoots;
}


void OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::setPackageRoots(std::shared_ptr<ConfigNodePropertyArray> value)
{
    m_PackageRoots = value;
    m_PackageRootsIsSet = true;
}
bool OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::packageRootsIsSet() const
{
    return m_PackageRootsIsSet;
}

void OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties::unsetPackageRoots()
{
    m_PackageRootsIsSet = false;
}

}
}
}
}
