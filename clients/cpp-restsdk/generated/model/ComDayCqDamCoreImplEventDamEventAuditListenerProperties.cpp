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



#include "ComDayCqDamCoreImplEventDamEventAuditListenerProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ComDayCqDamCoreImplEventDamEventAuditListenerProperties::ComDayCqDamCoreImplEventDamEventAuditListenerProperties()
{
    m_Event_filterIsSet = false;
    m_EnabledIsSet = false;
}

ComDayCqDamCoreImplEventDamEventAuditListenerProperties::~ComDayCqDamCoreImplEventDamEventAuditListenerProperties()
{
}

void ComDayCqDamCoreImplEventDamEventAuditListenerProperties::validate()
{
    // TODO: implement validation
}

web::json::value ComDayCqDamCoreImplEventDamEventAuditListenerProperties::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_Event_filterIsSet)
    {
        val[utility::conversions::to_string_t("event.filter")] = ModelBase::toJson(m_Event_filter);
    }
    if(m_EnabledIsSet)
    {
        val[utility::conversions::to_string_t("enabled")] = ModelBase::toJson(m_Enabled);
    }

    return val;
}

void ComDayCqDamCoreImplEventDamEventAuditListenerProperties::fromJson(web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("event.filter")))
    {
        if(!val[utility::conversions::to_string_t("event.filter")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromJson(val[utility::conversions::to_string_t("event.filter")]);
            setEventFilter( newItem );
        }
    }
    if(val.has_field(utility::conversions::to_string_t("enabled")))
    {
        if(!val[utility::conversions::to_string_t("enabled")].is_null())
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromJson(val[utility::conversions::to_string_t("enabled")]);
            setEnabled( newItem );
        }
    }
}

void ComDayCqDamCoreImplEventDamEventAuditListenerProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_Event_filterIsSet)
    {
        if (m_Event_filter.get())
        {
            m_Event_filter->toMultipart(multipart, utility::conversions::to_string_t("event.filter."));
        }
    }
    if(m_EnabledIsSet)
    {
        if (m_Enabled.get())
        {
            m_Enabled->toMultipart(multipart, utility::conversions::to_string_t("enabled."));
        }
    }
}

void ComDayCqDamCoreImplEventDamEventAuditListenerProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("event.filter")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("event.filter")))
        {
            std::shared_ptr<ConfigNodePropertyString> newItem(new ConfigNodePropertyString());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("event.filter."));
            setEventFilter( newItem );
        }
    }
    if(multipart->hasContent(utility::conversions::to_string_t("enabled")))
    {
        if(multipart->hasContent(utility::conversions::to_string_t("enabled")))
        {
            std::shared_ptr<ConfigNodePropertyBoolean> newItem(new ConfigNodePropertyBoolean());
            newItem->fromMultiPart(multipart, utility::conversions::to_string_t("enabled."));
            setEnabled( newItem );
        }
    }
}

std::shared_ptr<ConfigNodePropertyString> ComDayCqDamCoreImplEventDamEventAuditListenerProperties::getEventFilter() const
{
    return m_Event_filter;
}


void ComDayCqDamCoreImplEventDamEventAuditListenerProperties::setEventFilter(std::shared_ptr<ConfigNodePropertyString> value)
{
    m_Event_filter = value;
    m_Event_filterIsSet = true;
}
bool ComDayCqDamCoreImplEventDamEventAuditListenerProperties::eventFilterIsSet() const
{
    return m_Event_filterIsSet;
}

void ComDayCqDamCoreImplEventDamEventAuditListenerProperties::unsetEvent_filter()
{
    m_Event_filterIsSet = false;
}

std::shared_ptr<ConfigNodePropertyBoolean> ComDayCqDamCoreImplEventDamEventAuditListenerProperties::getEnabled() const
{
    return m_Enabled;
}


void ComDayCqDamCoreImplEventDamEventAuditListenerProperties::setEnabled(std::shared_ptr<ConfigNodePropertyBoolean> value)
{
    m_Enabled = value;
    m_EnabledIsSet = true;
}
bool ComDayCqDamCoreImplEventDamEventAuditListenerProperties::enabledIsSet() const
{
    return m_EnabledIsSet;
}

void ComDayCqDamCoreImplEventDamEventAuditListenerProperties::unsetEnabled()
{
    m_EnabledIsSet = false;
}

}
}
}
}
