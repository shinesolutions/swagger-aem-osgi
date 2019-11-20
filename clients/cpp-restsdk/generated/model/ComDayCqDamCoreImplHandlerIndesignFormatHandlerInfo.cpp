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



#include "ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo()
{
    m_Pid = utility::conversions::to_string_t("");
    m_PidIsSet = false;
    m_Title = utility::conversions::to_string_t("");
    m_TitleIsSet = false;
    m_Description = utility::conversions::to_string_t("");
    m_DescriptionIsSet = false;
    m_PropertiesIsSet = false;
}

ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::~ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo()
{
}

void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::toJson() const
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

    return val;
}

void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::fromJson(web::json::value& val)
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
            std::shared_ptr<ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties> newItem(new ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties());
            newItem->fromJson(val[utility::conversions::to_string_t("properties")]);
            setProperties( newItem );
        }
    }
}

void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
}

void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
            std::shared_ptr<ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties> newItem(new ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("properties."));
            setProperties( newItem );
        }
    }
}

utility::string_t ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::getPid() const
{
    return m_Pid;
}


void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::setPid(utility::string_t value)
{
    m_Pid = value;
    m_PidIsSet = true;
}
bool ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::pidIsSet() const
{
    return m_PidIsSet;
}

void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::unsetPid()
{
    m_PidIsSet = false;
}

utility::string_t ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::getTitle() const
{
    return m_Title;
}


void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::setTitle(utility::string_t value)
{
    m_Title = value;
    m_TitleIsSet = true;
}
bool ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::titleIsSet() const
{
    return m_TitleIsSet;
}

void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::unsetTitle()
{
    m_TitleIsSet = false;
}

utility::string_t ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::getDescription() const
{
    return m_Description;
}


void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::setDescription(utility::string_t value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}

void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::unsetDescription()
{
    m_DescriptionIsSet = false;
}

std::shared_ptr<ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties> ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::getProperties() const
{
    return m_Properties;
}


void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::setProperties(std::shared_ptr<ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties> value)
{
    m_Properties = value;
    m_PropertiesIsSet = true;
}
bool ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::propertiesIsSet() const
{
    return m_PropertiesIsSet;
}

void ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo::unsetProperties()
{
    m_PropertiesIsSet = false;
}

}
}
}
}
