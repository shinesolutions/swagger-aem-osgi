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


#include "OrgApacheSlingModelsImplModelAdapterFactoryProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingModelsImplModelAdapterFactoryProperties::OrgApacheSlingModelsImplModelAdapterFactoryProperties()
{
    m_Osgi_http_whiteboard_listenerIsSet = false;
    m_Osgi_http_whiteboard_context_selectIsSet = false;
    m_Max_recursion_depthIsSet = false;
    m_Cleanup_job_periodIsSet = false;
    
}

OrgApacheSlingModelsImplModelAdapterFactoryProperties::~OrgApacheSlingModelsImplModelAdapterFactoryProperties()
{
}

void OrgApacheSlingModelsImplModelAdapterFactoryProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheSlingModelsImplModelAdapterFactoryProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Osgi_http_whiteboard_listenerIsSet)
    {
        val["osgi.http.whiteboard.listener"] = ModelBase::toJson(m_Osgi_http_whiteboard_listener);
    }
    if(m_Osgi_http_whiteboard_context_selectIsSet)
    {
        val["osgi.http.whiteboard.context.select"] = ModelBase::toJson(m_Osgi_http_whiteboard_context_select);
    }
    if(m_Max_recursion_depthIsSet)
    {
        val["max.recursion.depth"] = ModelBase::toJson(m_Max_recursion_depth);
    }
    if(m_Cleanup_job_periodIsSet)
    {
        val["cleanup.job.period"] = ModelBase::toJson(m_Cleanup_job_period);
    }
    

    return val;
}

void OrgApacheSlingModelsImplModelAdapterFactoryProperties::fromJson(nlohmann::json& val)
{
    if(val.find("osgi.http.whiteboard.listener") != val.end())
    {
        if(!val["osgi.http.whiteboard.listener"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["osgi.http.whiteboard.listener"]);
            setOsgiHttpWhiteboardListener( newItem );
        }
        
    }
    if(val.find("osgi.http.whiteboard.context.select") != val.end())
    {
        if(!val["osgi.http.whiteboard.context.select"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["osgi.http.whiteboard.context.select"]);
            setOsgiHttpWhiteboardContextSelect( newItem );
        }
        
    }
    if(val.find("max.recursion.depth") != val.end())
    {
        if(!val["max.recursion.depth"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["max.recursion.depth"]);
            setMaxRecursionDepth( newItem );
        }
        
    }
    if(val.find("cleanup.job.period") != val.end())
    {
        if(!val["cleanup.job.period"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["cleanup.job.period"]);
            setCleanupJobPeriod( newItem );
        }
        
    }
    
}


ConfigNodePropertyString OrgApacheSlingModelsImplModelAdapterFactoryProperties::getOsgiHttpWhiteboardListener() const
{
    return m_Osgi_http_whiteboard_listener;
}
void OrgApacheSlingModelsImplModelAdapterFactoryProperties::setOsgiHttpWhiteboardListener(ConfigNodePropertyString const& value)
{
    m_Osgi_http_whiteboard_listener = value;
    m_Osgi_http_whiteboard_listenerIsSet = true;
}
bool OrgApacheSlingModelsImplModelAdapterFactoryProperties::osgiHttpWhiteboardListenerIsSet() const
{
    return m_Osgi_http_whiteboard_listenerIsSet;
}
void OrgApacheSlingModelsImplModelAdapterFactoryProperties::unsetOsgi_http_whiteboard_listener()
{
    m_Osgi_http_whiteboard_listenerIsSet = false;
}
ConfigNodePropertyString OrgApacheSlingModelsImplModelAdapterFactoryProperties::getOsgiHttpWhiteboardContextSelect() const
{
    return m_Osgi_http_whiteboard_context_select;
}
void OrgApacheSlingModelsImplModelAdapterFactoryProperties::setOsgiHttpWhiteboardContextSelect(ConfigNodePropertyString const& value)
{
    m_Osgi_http_whiteboard_context_select = value;
    m_Osgi_http_whiteboard_context_selectIsSet = true;
}
bool OrgApacheSlingModelsImplModelAdapterFactoryProperties::osgiHttpWhiteboardContextSelectIsSet() const
{
    return m_Osgi_http_whiteboard_context_selectIsSet;
}
void OrgApacheSlingModelsImplModelAdapterFactoryProperties::unsetOsgi_http_whiteboard_context_select()
{
    m_Osgi_http_whiteboard_context_selectIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingModelsImplModelAdapterFactoryProperties::getMaxRecursionDepth() const
{
    return m_Max_recursion_depth;
}
void OrgApacheSlingModelsImplModelAdapterFactoryProperties::setMaxRecursionDepth(ConfigNodePropertyInteger const& value)
{
    m_Max_recursion_depth = value;
    m_Max_recursion_depthIsSet = true;
}
bool OrgApacheSlingModelsImplModelAdapterFactoryProperties::maxRecursionDepthIsSet() const
{
    return m_Max_recursion_depthIsSet;
}
void OrgApacheSlingModelsImplModelAdapterFactoryProperties::unsetMax_recursion_depth()
{
    m_Max_recursion_depthIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingModelsImplModelAdapterFactoryProperties::getCleanupJobPeriod() const
{
    return m_Cleanup_job_period;
}
void OrgApacheSlingModelsImplModelAdapterFactoryProperties::setCleanupJobPeriod(ConfigNodePropertyInteger const& value)
{
    m_Cleanup_job_period = value;
    m_Cleanup_job_periodIsSet = true;
}
bool OrgApacheSlingModelsImplModelAdapterFactoryProperties::cleanupJobPeriodIsSet() const
{
    return m_Cleanup_job_periodIsSet;
}
void OrgApacheSlingModelsImplModelAdapterFactoryProperties::unsetCleanup_job_period()
{
    m_Cleanup_job_periodIsSet = false;
}

}
}
}
}
