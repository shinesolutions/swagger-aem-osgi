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


#include "OrgApacheSlingEngineImplSlingMainServletProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingEngineImplSlingMainServletProperties::OrgApacheSlingEngineImplSlingMainServletProperties()
{
    m_Sling_max_callsIsSet = false;
    m_Sling_max_inclusionsIsSet = false;
    m_Sling_trace_allowIsSet = false;
    m_Sling_max_record_requestsIsSet = false;
    m_Sling_store_pattern_requestsIsSet = false;
    m_Sling_serverinfoIsSet = false;
    m_Sling_additional_response_headersIsSet = false;
    
}

OrgApacheSlingEngineImplSlingMainServletProperties::~OrgApacheSlingEngineImplSlingMainServletProperties()
{
}

void OrgApacheSlingEngineImplSlingMainServletProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheSlingEngineImplSlingMainServletProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Sling_max_callsIsSet)
    {
        val["sling.max.calls"] = ModelBase::toJson(m_Sling_max_calls);
    }
    if(m_Sling_max_inclusionsIsSet)
    {
        val["sling.max.inclusions"] = ModelBase::toJson(m_Sling_max_inclusions);
    }
    if(m_Sling_trace_allowIsSet)
    {
        val["sling.trace.allow"] = ModelBase::toJson(m_Sling_trace_allow);
    }
    if(m_Sling_max_record_requestsIsSet)
    {
        val["sling.max.record.requests"] = ModelBase::toJson(m_Sling_max_record_requests);
    }
    if(m_Sling_store_pattern_requestsIsSet)
    {
        val["sling.store.pattern.requests"] = ModelBase::toJson(m_Sling_store_pattern_requests);
    }
    if(m_Sling_serverinfoIsSet)
    {
        val["sling.serverinfo"] = ModelBase::toJson(m_Sling_serverinfo);
    }
    if(m_Sling_additional_response_headersIsSet)
    {
        val["sling.additional.response.headers"] = ModelBase::toJson(m_Sling_additional_response_headers);
    }
    

    return val;
}

void OrgApacheSlingEngineImplSlingMainServletProperties::fromJson(nlohmann::json& val)
{
    if(val.find("sling.max.calls") != val.end())
    {
        if(!val["sling.max.calls"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["sling.max.calls"]);
            setSlingMaxCalls( newItem );
        }
        
    }
    if(val.find("sling.max.inclusions") != val.end())
    {
        if(!val["sling.max.inclusions"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["sling.max.inclusions"]);
            setSlingMaxInclusions( newItem );
        }
        
    }
    if(val.find("sling.trace.allow") != val.end())
    {
        if(!val["sling.trace.allow"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["sling.trace.allow"]);
            setSlingTraceAllow( newItem );
        }
        
    }
    if(val.find("sling.max.record.requests") != val.end())
    {
        if(!val["sling.max.record.requests"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["sling.max.record.requests"]);
            setSlingMaxRecordRequests( newItem );
        }
        
    }
    if(val.find("sling.store.pattern.requests") != val.end())
    {
        if(!val["sling.store.pattern.requests"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["sling.store.pattern.requests"]);
            setSlingStorePatternRequests( newItem );
        }
        
    }
    if(val.find("sling.serverinfo") != val.end())
    {
        if(!val["sling.serverinfo"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["sling.serverinfo"]);
            setSlingServerinfo( newItem );
        }
        
    }
    if(val.find("sling.additional.response.headers") != val.end())
    {
        if(!val["sling.additional.response.headers"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["sling.additional.response.headers"]);
            setSlingAdditionalResponseHeaders( newItem );
        }
        
    }
    
}


ConfigNodePropertyInteger OrgApacheSlingEngineImplSlingMainServletProperties::getSlingMaxCalls() const
{
    return m_Sling_max_calls;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::setSlingMaxCalls(ConfigNodePropertyInteger const& value)
{
    m_Sling_max_calls = value;
    m_Sling_max_callsIsSet = true;
}
bool OrgApacheSlingEngineImplSlingMainServletProperties::slingMaxCallsIsSet() const
{
    return m_Sling_max_callsIsSet;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::unsetSling_max_calls()
{
    m_Sling_max_callsIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingEngineImplSlingMainServletProperties::getSlingMaxInclusions() const
{
    return m_Sling_max_inclusions;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::setSlingMaxInclusions(ConfigNodePropertyInteger const& value)
{
    m_Sling_max_inclusions = value;
    m_Sling_max_inclusionsIsSet = true;
}
bool OrgApacheSlingEngineImplSlingMainServletProperties::slingMaxInclusionsIsSet() const
{
    return m_Sling_max_inclusionsIsSet;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::unsetSling_max_inclusions()
{
    m_Sling_max_inclusionsIsSet = false;
}
ConfigNodePropertyBoolean OrgApacheSlingEngineImplSlingMainServletProperties::getSlingTraceAllow() const
{
    return m_Sling_trace_allow;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::setSlingTraceAllow(ConfigNodePropertyBoolean const& value)
{
    m_Sling_trace_allow = value;
    m_Sling_trace_allowIsSet = true;
}
bool OrgApacheSlingEngineImplSlingMainServletProperties::slingTraceAllowIsSet() const
{
    return m_Sling_trace_allowIsSet;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::unsetSling_trace_allow()
{
    m_Sling_trace_allowIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingEngineImplSlingMainServletProperties::getSlingMaxRecordRequests() const
{
    return m_Sling_max_record_requests;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::setSlingMaxRecordRequests(ConfigNodePropertyInteger const& value)
{
    m_Sling_max_record_requests = value;
    m_Sling_max_record_requestsIsSet = true;
}
bool OrgApacheSlingEngineImplSlingMainServletProperties::slingMaxRecordRequestsIsSet() const
{
    return m_Sling_max_record_requestsIsSet;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::unsetSling_max_record_requests()
{
    m_Sling_max_record_requestsIsSet = false;
}
ConfigNodePropertyArray OrgApacheSlingEngineImplSlingMainServletProperties::getSlingStorePatternRequests() const
{
    return m_Sling_store_pattern_requests;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::setSlingStorePatternRequests(ConfigNodePropertyArray const& value)
{
    m_Sling_store_pattern_requests = value;
    m_Sling_store_pattern_requestsIsSet = true;
}
bool OrgApacheSlingEngineImplSlingMainServletProperties::slingStorePatternRequestsIsSet() const
{
    return m_Sling_store_pattern_requestsIsSet;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::unsetSling_store_pattern_requests()
{
    m_Sling_store_pattern_requestsIsSet = false;
}
ConfigNodePropertyString OrgApacheSlingEngineImplSlingMainServletProperties::getSlingServerinfo() const
{
    return m_Sling_serverinfo;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::setSlingServerinfo(ConfigNodePropertyString const& value)
{
    m_Sling_serverinfo = value;
    m_Sling_serverinfoIsSet = true;
}
bool OrgApacheSlingEngineImplSlingMainServletProperties::slingServerinfoIsSet() const
{
    return m_Sling_serverinfoIsSet;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::unsetSling_serverinfo()
{
    m_Sling_serverinfoIsSet = false;
}
ConfigNodePropertyArray OrgApacheSlingEngineImplSlingMainServletProperties::getSlingAdditionalResponseHeaders() const
{
    return m_Sling_additional_response_headers;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::setSlingAdditionalResponseHeaders(ConfigNodePropertyArray const& value)
{
    m_Sling_additional_response_headers = value;
    m_Sling_additional_response_headersIsSet = true;
}
bool OrgApacheSlingEngineImplSlingMainServletProperties::slingAdditionalResponseHeadersIsSet() const
{
    return m_Sling_additional_response_headersIsSet;
}
void OrgApacheSlingEngineImplSlingMainServletProperties::unsetSling_additional_response_headers()
{
    m_Sling_additional_response_headersIsSet = false;
}

}
}
}
}
