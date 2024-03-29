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



#include "ComAdobeCqProjectsImplServletProjectImageServletProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComAdobeCqProjectsImplServletProjectImageServletProperties::ComAdobeCqProjectsImplServletProjectImageServletProperties()
{
    m_Image_qualityIsSet = false;
    m_Image_supported_resolutionsIsSet = false;
}

ComAdobeCqProjectsImplServletProjectImageServletProperties::~ComAdobeCqProjectsImplServletProjectImageServletProperties()
{
}

void ComAdobeCqProjectsImplServletProjectImageServletProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComAdobeCqProjectsImplServletProjectImageServletProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Image_qualityIsSet)
    {
        val[utility::conversions::to_string_t("image.quality")] = ModelBase::toJson(m_Image_quality);
    }
    if(m_Image_supported_resolutionsIsSet)
    {
        val[utility::conversions::to_string_t("image.supported.resolutions")] = ModelBase::toJson(m_Image_supported_resolutions);
    }

    return val;
}

void ComAdobeCqProjectsImplServletProjectImageServletProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("image.quality")))
    {
        if(!val[utility::conversions::to_string_t("image.quality")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("image.quality")]);
            setImageQuality( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("image.supported.resolutions")))
    {
        if(!val[utility::conversions::to_string_t("image.supported.resolutions")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("image.supported.resolutions")]);
            setImageSupportedResolutions( newItem );
        }
    }
}

void ComAdobeCqProjectsImplServletProjectImageServletProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Image_qualityIsSet)
    {
        if (m_Image_quality.get())
        {
            m_Image_quality->toMultipart(multipart, utility::conversions::to_string_t("image.quality."));
        }
    }
    if(m_Image_supported_resolutionsIsSet)
    {
        if (m_Image_supported_resolutions.get())
        {
            m_Image_supported_resolutions->toMultipart(multipart, utility::conversions::to_string_t("image.supported.resolutions."));
        }
    }
}

void ComAdobeCqProjectsImplServletProjectImageServletProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("image.quality")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("image.quality")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("image.quality."));
            setImageQuality( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("image.supported.resolutions")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("image.supported.resolutions")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("image.supported.resolutions."));
            setImageSupportedResolutions( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyString> ComAdobeCqProjectsImplServletProjectImageServletProperties::getImageQuality() const
{
    return m_Image_quality;
}


void ComAdobeCqProjectsImplServletProjectImageServletProperties::setImageQuality(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Image_quality = value;
    m_Image_qualityIsSet = true;
}
bool ComAdobeCqProjectsImplServletProjectImageServletProperties::imageQualityIsSet() const
{
    return m_Image_qualityIsSet;
}

void ComAdobeCqProjectsImplServletProjectImageServletProperties::unsetImage_quality()
{
    m_Image_qualityIsSet = false;
}

std::shared_ptr<ConfigNodePropertyString> ComAdobeCqProjectsImplServletProjectImageServletProperties::getImageSupportedResolutions() const
{
    return m_Image_supported_resolutions;
}


void ComAdobeCqProjectsImplServletProjectImageServletProperties::setImageSupportedResolutions(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Image_supported_resolutions = value;
    m_Image_supported_resolutionsIsSet = true;
}
bool ComAdobeCqProjectsImplServletProjectImageServletProperties::imageSupportedResolutionsIsSet() const
{
    return m_Image_supported_resolutionsIsSet;
}

void ComAdobeCqProjectsImplServletProjectImageServletProperties::unsetImage_supported_resolutions()
{
    m_Image_supported_resolutionsIsSet = false;
}

}
}
}
}

