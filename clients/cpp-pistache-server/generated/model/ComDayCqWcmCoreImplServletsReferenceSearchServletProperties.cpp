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


#include "ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::ComDayCqWcmCoreImplServletsReferenceSearchServletProperties()
{
    m_Referencesearchservlet_maxReferencesPerPageIsSet = false;
    m_Referencesearchservlet_maxPagesIsSet = false;
    
}

ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::~ComDayCqWcmCoreImplServletsReferenceSearchServletProperties()
{
}

void ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Referencesearchservlet_maxReferencesPerPageIsSet)
    {
        val["referencesearchservlet.maxReferencesPerPage"] = ModelBase::toJson(m_Referencesearchservlet_maxReferencesPerPage);
    }
    if(m_Referencesearchservlet_maxPagesIsSet)
    {
        val["referencesearchservlet.maxPages"] = ModelBase::toJson(m_Referencesearchservlet_maxPages);
    }
    

    return val;
}

void ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::fromJson(nlohmann::json& val)
{
    if(val.find("referencesearchservlet.maxReferencesPerPage") != val.end())
    {
        if(!val["referencesearchservlet.maxReferencesPerPage"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["referencesearchservlet.maxReferencesPerPage"]);
            setReferencesearchservletMaxReferencesPerPage( newItem );
        }
        
    }
    if(val.find("referencesearchservlet.maxPages") != val.end())
    {
        if(!val["referencesearchservlet.maxPages"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["referencesearchservlet.maxPages"]);
            setReferencesearchservletMaxPages( newItem );
        }
        
    }
    
}


ConfigNodePropertyInteger ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::getReferencesearchservletMaxReferencesPerPage() const
{
    return m_Referencesearchservlet_maxReferencesPerPage;
}
void ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::setReferencesearchservletMaxReferencesPerPage(ConfigNodePropertyInteger const& value)
{
    m_Referencesearchservlet_maxReferencesPerPage = value;
    m_Referencesearchservlet_maxReferencesPerPageIsSet = true;
}
bool ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::referencesearchservletMaxReferencesPerPageIsSet() const
{
    return m_Referencesearchservlet_maxReferencesPerPageIsSet;
}
void ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::unsetReferencesearchservlet_maxReferencesPerPage()
{
    m_Referencesearchservlet_maxReferencesPerPageIsSet = false;
}
ConfigNodePropertyInteger ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::getReferencesearchservletMaxPages() const
{
    return m_Referencesearchservlet_maxPages;
}
void ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::setReferencesearchservletMaxPages(ConfigNodePropertyInteger const& value)
{
    m_Referencesearchservlet_maxPages = value;
    m_Referencesearchservlet_maxPagesIsSet = true;
}
bool ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::referencesearchservletMaxPagesIsSet() const
{
    return m_Referencesearchservlet_maxPagesIsSet;
}
void ComDayCqWcmCoreImplServletsReferenceSearchServletProperties::unsetReferencesearchservlet_maxPages()
{
    m_Referencesearchservlet_maxPagesIsSet = false;
}

}
}
}
}
