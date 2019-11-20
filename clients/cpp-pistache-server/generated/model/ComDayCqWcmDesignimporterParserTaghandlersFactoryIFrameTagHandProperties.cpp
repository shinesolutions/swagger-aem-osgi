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


#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties()
{
    m_Service_rankingIsSet = false;
    m_TagpatternIsSet = false;
    
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::~ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties()
{
}

void ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Service_rankingIsSet)
    {
        val["service.ranking"] = ModelBase::toJson(m_Service_ranking);
    }
    if(m_TagpatternIsSet)
    {
        val["tagpattern"] = ModelBase::toJson(m_Tagpattern);
    }
    

    return val;
}

void ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::fromJson(nlohmann::json& val)
{
    if(val.find("service.ranking") != val.end())
    {
        if(!val["service.ranking"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["service.ranking"]);
            setServiceRanking( newItem );
        }
        
    }
    if(val.find("tagpattern") != val.end())
    {
        if(!val["tagpattern"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["tagpattern"]);
            setTagpattern( newItem );
        }
        
    }
    
}


ConfigNodePropertyInteger ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::getServiceRanking() const
{
    return m_Service_ranking;
}
void ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::setServiceRanking(ConfigNodePropertyInteger const& value)
{
    m_Service_ranking = value;
    m_Service_rankingIsSet = true;
}
bool ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::serviceRankingIsSet() const
{
    return m_Service_rankingIsSet;
}
void ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::unsetService_ranking()
{
    m_Service_rankingIsSet = false;
}
ConfigNodePropertyString ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::getTagpattern() const
{
    return m_Tagpattern;
}
void ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::setTagpattern(ConfigNodePropertyString const& value)
{
    m_Tagpattern = value;
    m_TagpatternIsSet = true;
}
bool ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::tagpatternIsSet() const
{
    return m_TagpatternIsSet;
}
void ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties::unsetTagpattern()
{
    m_TagpatternIsSet = false;
}

}
}
}
}
