/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "OrgApacheSlingTracerInternalLogTracerProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingTracerInternalLogTracerProperties::OrgApacheSlingTracerInternalLogTracerProperties()
{
    m_TracerSetsIsSet = false;
    m_EnabledIsSet = false;
    m_ServletEnabledIsSet = false;
    m_RecordingCacheSizeInMBIsSet = false;
    m_RecordingCacheDurationInSecsIsSet = false;
    m_RecordingCompressionEnabledIsSet = false;
    m_GzipResponseIsSet = false;
    
}

OrgApacheSlingTracerInternalLogTracerProperties::~OrgApacheSlingTracerInternalLogTracerProperties()
{
}

void OrgApacheSlingTracerInternalLogTracerProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheSlingTracerInternalLogTracerProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_TracerSetsIsSet)
    {
        val["tracerSets"] = ModelBase::toJson(m_TracerSets);
    }
    if(m_EnabledIsSet)
    {
        val["enabled"] = ModelBase::toJson(m_Enabled);
    }
    if(m_ServletEnabledIsSet)
    {
        val["servletEnabled"] = ModelBase::toJson(m_ServletEnabled);
    }
    if(m_RecordingCacheSizeInMBIsSet)
    {
        val["recordingCacheSizeInMB"] = ModelBase::toJson(m_RecordingCacheSizeInMB);
    }
    if(m_RecordingCacheDurationInSecsIsSet)
    {
        val["recordingCacheDurationInSecs"] = ModelBase::toJson(m_RecordingCacheDurationInSecs);
    }
    if(m_RecordingCompressionEnabledIsSet)
    {
        val["recordingCompressionEnabled"] = ModelBase::toJson(m_RecordingCompressionEnabled);
    }
    if(m_GzipResponseIsSet)
    {
        val["gzipResponse"] = ModelBase::toJson(m_GzipResponse);
    }
    

    return val;
}

void OrgApacheSlingTracerInternalLogTracerProperties::fromJson(nlohmann::json& val)
{
    if(val.find("tracerSets") != val.end())
    {
        if(!val["tracerSets"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["tracerSets"]);
            setTracerSets( newItem );
        }
        
    }
    if(val.find("enabled") != val.end())
    {
        if(!val["enabled"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["enabled"]);
            setEnabled( newItem );
        }
        
    }
    if(val.find("servletEnabled") != val.end())
    {
        if(!val["servletEnabled"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["servletEnabled"]);
            setServletEnabled( newItem );
        }
        
    }
    if(val.find("recordingCacheSizeInMB") != val.end())
    {
        if(!val["recordingCacheSizeInMB"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["recordingCacheSizeInMB"]);
            setRecordingCacheSizeInMB( newItem );
        }
        
    }
    if(val.find("recordingCacheDurationInSecs") != val.end())
    {
        if(!val["recordingCacheDurationInSecs"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["recordingCacheDurationInSecs"]);
            setRecordingCacheDurationInSecs( newItem );
        }
        
    }
    if(val.find("recordingCompressionEnabled") != val.end())
    {
        if(!val["recordingCompressionEnabled"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["recordingCompressionEnabled"]);
            setRecordingCompressionEnabled( newItem );
        }
        
    }
    if(val.find("gzipResponse") != val.end())
    {
        if(!val["gzipResponse"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["gzipResponse"]);
            setGzipResponse( newItem );
        }
        
    }
    
}


ConfigNodePropertyArray OrgApacheSlingTracerInternalLogTracerProperties::getTracerSets() const
{
    return m_TracerSets;
}
void OrgApacheSlingTracerInternalLogTracerProperties::setTracerSets(ConfigNodePropertyArray const& value)
{
    m_TracerSets = value;
    m_TracerSetsIsSet = true;
}
bool OrgApacheSlingTracerInternalLogTracerProperties::tracerSetsIsSet() const
{
    return m_TracerSetsIsSet;
}
void OrgApacheSlingTracerInternalLogTracerProperties::unsetTracerSets()
{
    m_TracerSetsIsSet = false;
}
ConfigNodePropertyBoolean OrgApacheSlingTracerInternalLogTracerProperties::getEnabled() const
{
    return m_Enabled;
}
void OrgApacheSlingTracerInternalLogTracerProperties::setEnabled(ConfigNodePropertyBoolean const& value)
{
    m_Enabled = value;
    m_EnabledIsSet = true;
}
bool OrgApacheSlingTracerInternalLogTracerProperties::enabledIsSet() const
{
    return m_EnabledIsSet;
}
void OrgApacheSlingTracerInternalLogTracerProperties::unsetEnabled()
{
    m_EnabledIsSet = false;
}
ConfigNodePropertyBoolean OrgApacheSlingTracerInternalLogTracerProperties::getServletEnabled() const
{
    return m_ServletEnabled;
}
void OrgApacheSlingTracerInternalLogTracerProperties::setServletEnabled(ConfigNodePropertyBoolean const& value)
{
    m_ServletEnabled = value;
    m_ServletEnabledIsSet = true;
}
bool OrgApacheSlingTracerInternalLogTracerProperties::servletEnabledIsSet() const
{
    return m_ServletEnabledIsSet;
}
void OrgApacheSlingTracerInternalLogTracerProperties::unsetServletEnabled()
{
    m_ServletEnabledIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingTracerInternalLogTracerProperties::getRecordingCacheSizeInMB() const
{
    return m_RecordingCacheSizeInMB;
}
void OrgApacheSlingTracerInternalLogTracerProperties::setRecordingCacheSizeInMB(ConfigNodePropertyInteger const& value)
{
    m_RecordingCacheSizeInMB = value;
    m_RecordingCacheSizeInMBIsSet = true;
}
bool OrgApacheSlingTracerInternalLogTracerProperties::recordingCacheSizeInMBIsSet() const
{
    return m_RecordingCacheSizeInMBIsSet;
}
void OrgApacheSlingTracerInternalLogTracerProperties::unsetRecordingCacheSizeInMB()
{
    m_RecordingCacheSizeInMBIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingTracerInternalLogTracerProperties::getRecordingCacheDurationInSecs() const
{
    return m_RecordingCacheDurationInSecs;
}
void OrgApacheSlingTracerInternalLogTracerProperties::setRecordingCacheDurationInSecs(ConfigNodePropertyInteger const& value)
{
    m_RecordingCacheDurationInSecs = value;
    m_RecordingCacheDurationInSecsIsSet = true;
}
bool OrgApacheSlingTracerInternalLogTracerProperties::recordingCacheDurationInSecsIsSet() const
{
    return m_RecordingCacheDurationInSecsIsSet;
}
void OrgApacheSlingTracerInternalLogTracerProperties::unsetRecordingCacheDurationInSecs()
{
    m_RecordingCacheDurationInSecsIsSet = false;
}
ConfigNodePropertyBoolean OrgApacheSlingTracerInternalLogTracerProperties::getRecordingCompressionEnabled() const
{
    return m_RecordingCompressionEnabled;
}
void OrgApacheSlingTracerInternalLogTracerProperties::setRecordingCompressionEnabled(ConfigNodePropertyBoolean const& value)
{
    m_RecordingCompressionEnabled = value;
    m_RecordingCompressionEnabledIsSet = true;
}
bool OrgApacheSlingTracerInternalLogTracerProperties::recordingCompressionEnabledIsSet() const
{
    return m_RecordingCompressionEnabledIsSet;
}
void OrgApacheSlingTracerInternalLogTracerProperties::unsetRecordingCompressionEnabled()
{
    m_RecordingCompressionEnabledIsSet = false;
}
ConfigNodePropertyBoolean OrgApacheSlingTracerInternalLogTracerProperties::getGzipResponse() const
{
    return m_GzipResponse;
}
void OrgApacheSlingTracerInternalLogTracerProperties::setGzipResponse(ConfigNodePropertyBoolean const& value)
{
    m_GzipResponse = value;
    m_GzipResponseIsSet = true;
}
bool OrgApacheSlingTracerInternalLogTracerProperties::gzipResponseIsSet() const
{
    return m_GzipResponseIsSet;
}
void OrgApacheSlingTracerInternalLogTracerProperties::unsetGzipResponse()
{
    m_GzipResponseIsSet = false;
}

}
}
}
}
