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



#include "ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo()
{
    m_Pid = utility::conversions::to_string_t("");
    m_PidIsSet = false;
    m_Title = utility::conversions::to_string_t("");
    m_TitleIsSet = false;
    m_Description = utility::conversions::to_string_t("");
    m_DescriptionIsSet = false;
    m_PropertiesIsSet = false;
    m_Bundle_location = utility::conversions::to_string_t("");
    m_Bundle_locationIsSet = false;
    m_Service_location = utility::conversions::to_string_t("");
    m_Service_locationIsSet = false;
}

ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::~ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo()
{
}

void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::validate()
{
    // TODO: implement validation
}

web::json::value ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_PidIsSet)
    {
        val[utility::conversions::to_string_t("pid")] = ModelBase::toJson(m_Pid);
    }
    if(m_TitleIsSet)
    {
        val[utility::conversions::to_string_t("title")] = ModelBase::toJson(m_Title);
    }
    if(m_DescriptionIsSet)
    {
        val[utility::conversions::to_string_t("description")] = ModelBase::toJson(m_Description);
    }
    if(m_PropertiesIsSet)
    {
        val[utility::conversions::to_string_t("properties")] = ModelBase::toJson(m_Properties);
    }
    if(m_Bundle_locationIsSet)
    {
        val[utility::conversions::to_string_t("bundle_location")] = ModelBase::toJson(m_Bundle_location);
    }
    if(m_Service_locationIsSet)
    {
        val[utility::conversions::to_string_t("service_location")] = ModelBase::toJson(m_Service_location);
    }

    return val;
}

void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("pid")))
    {
        setPid(ModelBase::stringFromJson(val[utility::conversions::to_string_t("pid")]));
    }
    if(val.has_field(utility::conversions::to_string_t("title")))
    {
        setTitle(ModelBase::stringFromJson(val[utility::conversions::to_string_t("title")]));
    }
    if(val.has_field(utility::conversions::to_string_t("description")))
    {
        setDescription(ModelBase::stringFromJson(val[utility::conversions::to_string_t("description")]));
    }
    if(val.has_field(utility::conversions::to_string_t("properties")))
    {
        if(!val[utility::conversions::to_string_t("properties")].is_null())
        {
            std::shared_ptr<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties> newItem(new ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties());
            newItem->fromJson(val[utility::conversions::to_string_t("properties")]);
            setProperties( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("bundle_location")))
    {
        setBundleLocation(ModelBase::stringFromJson(val[utility::conversions::to_string_t("bundle_location")]));
    }
    if(val.has_field(utility::conversions::to_string_t("service_location")))
    {
        setServiceLocation(ModelBase::stringFromJson(val[utility::conversions::to_string_t("service_location")]));
    }
}

void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_PidIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("pid"), m_Pid));
    }
    if(m_TitleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("title"), m_Title));
    }
    if(m_DescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("description"), m_Description));
    }
    if(m_PropertiesIsSet)
    {
        if (m_Properties.get())
        {
            m_Properties->toMultipart(multipart, utility::conversions::to_string_t("properties."));
        }
    }
    if(m_Bundle_locationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("bundle_location"), m_Bundle_location));
    }
    if(m_Service_locationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("service_location"), m_Service_location));
    }
}

void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("pid")))
    {
        setPid(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("pid"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("title")))
    {
        setTitle(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("title"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("description")))
    {
        setDescription(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("description"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("properties")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("properties")))
        {
            std::shared_ptr<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties> newItem(new ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("properties."));
            setProperties( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("bundle_location")))
    {
        setBundleLocation(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("bundle_location"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("service_location")))
    {
        setServiceLocation(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("service_location"))));
    }
}

utility::string_t ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::getPid() const
{
    return m_Pid;
}


void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::setPid(utility::string_t value)
{
    m_Pid = value;
    m_PidIsSet = true;
}
bool ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::pidIsSet() const
{
    return m_PidIsSet;
}

void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::unsetPid()
{
    m_PidIsSet = false;
}

utility::string_t ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::getTitle() const
{
    return m_Title;
}


void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::setTitle(utility::string_t value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::titleIsSet() const
{
    return m_TitleIsSet;
}

void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::unsetTitle()
{
    m_TitleIsSet = false;
}

utility::string_t ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::getDescription() const
{
    return m_Description;
}


void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::setDescription(utility::string_t value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}

void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::unsetDescription()
{
    m_DescriptionIsSet = false;
}

std::shared_ptr<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties> ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::getProperties() const
{
    return m_Properties;
}


void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::setProperties(std::shared_ptr<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties> value)
{
    m_Properties = value;
    m_PropertiesIsSet = true;
}
bool ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::propertiesIsSet() const
{
    return m_PropertiesIsSet;
}

void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::unsetProperties()
{
    m_PropertiesIsSet = false;
}

utility::string_t ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::getBundleLocation() const
{
    return m_Bundle_location;
}


void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::setBundleLocation(utility::string_t value)
{
    m_Bundle_location = value;
    m_Bundle_locationIsSet = true;
}
bool ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::bundleLocationIsSet() const
{
    return m_Bundle_locationIsSet;
}

void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::unsetBundle_location()
{
    m_Bundle_locationIsSet = false;
}

utility::string_t ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::getServiceLocation() const
{
    return m_Service_location;
}


void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::setServiceLocation(utility::string_t value)
{
    m_Service_location = value;
    m_Service_locationIsSet = true;
}
bool ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::serviceLocationIsSet() const
{
    return m_Service_locationIsSet;
}

void ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo::unsetService_location()
{
    m_Service_locationIsSet = false;
}

}
}
}
}
