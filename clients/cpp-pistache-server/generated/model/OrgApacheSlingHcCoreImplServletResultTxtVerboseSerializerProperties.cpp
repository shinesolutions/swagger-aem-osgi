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


#include "OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties()
{
    m_TotalWidthIsSet = false;
    m_ColWidthNameIsSet = false;
    m_ColWidthResultIsSet = false;
    m_ColWidthTimingIsSet = false;
    
}

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::~OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties()
{
}

void OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_TotalWidthIsSet)
    {
        val["totalWidth"] = ModelBase::toJson(m_TotalWidth);
    }
    if(m_ColWidthNameIsSet)
    {
        val["colWidthName"] = ModelBase::toJson(m_ColWidthName);
    }
    if(m_ColWidthResultIsSet)
    {
        val["colWidthResult"] = ModelBase::toJson(m_ColWidthResult);
    }
    if(m_ColWidthTimingIsSet)
    {
        val["colWidthTiming"] = ModelBase::toJson(m_ColWidthTiming);
    }
    

    return val;
}

void OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::fromJson(nlohmann::json& val)
{
    if(val.find("totalWidth") != val.end())
    {
        if(!val["totalWidth"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["totalWidth"]);
            setTotalWidth( newItem );
        }
        
    }
    if(val.find("colWidthName") != val.end())
    {
        if(!val["colWidthName"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["colWidthName"]);
            setColWidthName( newItem );
        }
        
    }
    if(val.find("colWidthResult") != val.end())
    {
        if(!val["colWidthResult"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["colWidthResult"]);
            setColWidthResult( newItem );
        }
        
    }
    if(val.find("colWidthTiming") != val.end())
    {
        if(!val["colWidthTiming"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["colWidthTiming"]);
            setColWidthTiming( newItem );
        }
        
    }
    
}


ConfigNodePropertyInteger OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getTotalWidth() const
{
    return m_TotalWidth;
}
void OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setTotalWidth(ConfigNodePropertyInteger const& value)
{
    m_TotalWidth = value;
    m_TotalWidthIsSet = true;
}
bool OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::totalWidthIsSet() const
{
    return m_TotalWidthIsSet;
}
void OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::unsetTotalWidth()
{
    m_TotalWidthIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getColWidthName() const
{
    return m_ColWidthName;
}
void OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setColWidthName(ConfigNodePropertyInteger const& value)
{
    m_ColWidthName = value;
    m_ColWidthNameIsSet = true;
}
bool OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::colWidthNameIsSet() const
{
    return m_ColWidthNameIsSet;
}
void OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::unsetColWidthName()
{
    m_ColWidthNameIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getColWidthResult() const
{
    return m_ColWidthResult;
}
void OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setColWidthResult(ConfigNodePropertyInteger const& value)
{
    m_ColWidthResult = value;
    m_ColWidthResultIsSet = true;
}
bool OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::colWidthResultIsSet() const
{
    return m_ColWidthResultIsSet;
}
void OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::unsetColWidthResult()
{
    m_ColWidthResultIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::getColWidthTiming() const
{
    return m_ColWidthTiming;
}
void OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::setColWidthTiming(ConfigNodePropertyInteger const& value)
{
    m_ColWidthTiming = value;
    m_ColWidthTimingIsSet = true;
}
bool OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::colWidthTimingIsSet() const
{
    return m_ColWidthTimingIsSet;
}
void OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties::unsetColWidthTiming()
{
    m_ColWidthTimingIsSet = false;
}

}
}
}
}
