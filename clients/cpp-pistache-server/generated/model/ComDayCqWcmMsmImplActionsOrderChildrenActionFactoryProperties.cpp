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


#include "ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties()
{
    m_Cq_wcm_msm_action_excludednodetypesIsSet = false;
    m_Cq_wcm_msm_action_excludedparagraphitemsIsSet = false;
    m_Cq_wcm_msm_action_excludedpropsIsSet = false;
    
}

ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::~ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties()
{
}

void ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Cq_wcm_msm_action_excludednodetypesIsSet)
    {
        val["cq.wcm.msm.action.excludednodetypes"] = ModelBase::toJson(m_Cq_wcm_msm_action_excludednodetypes);
    }
    if(m_Cq_wcm_msm_action_excludedparagraphitemsIsSet)
    {
        val["cq.wcm.msm.action.excludedparagraphitems"] = ModelBase::toJson(m_Cq_wcm_msm_action_excludedparagraphitems);
    }
    if(m_Cq_wcm_msm_action_excludedpropsIsSet)
    {
        val["cq.wcm.msm.action.excludedprops"] = ModelBase::toJson(m_Cq_wcm_msm_action_excludedprops);
    }
    

    return val;
}

void ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::fromJson(nlohmann::json& val)
{
    if(val.find("cq.wcm.msm.action.excludednodetypes") != val.end())
    {
        if(!val["cq.wcm.msm.action.excludednodetypes"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["cq.wcm.msm.action.excludednodetypes"]);
            setCqWcmMsmActionExcludednodetypes( newItem );
        }
        
    }
    if(val.find("cq.wcm.msm.action.excludedparagraphitems") != val.end())
    {
        if(!val["cq.wcm.msm.action.excludedparagraphitems"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["cq.wcm.msm.action.excludedparagraphitems"]);
            setCqWcmMsmActionExcludedparagraphitems( newItem );
        }
        
    }
    if(val.find("cq.wcm.msm.action.excludedprops") != val.end())
    {
        if(!val["cq.wcm.msm.action.excludedprops"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["cq.wcm.msm.action.excludedprops"]);
            setCqWcmMsmActionExcludedprops( newItem );
        }
        
    }
    
}


ConfigNodePropertyArray ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::getCqWcmMsmActionExcludednodetypes() const
{
    return m_Cq_wcm_msm_action_excludednodetypes;
}
void ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray const& value)
{
    m_Cq_wcm_msm_action_excludednodetypes = value;
    m_Cq_wcm_msm_action_excludednodetypesIsSet = true;
}
bool ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::cqWcmMsmActionExcludednodetypesIsSet() const
{
    return m_Cq_wcm_msm_action_excludednodetypesIsSet;
}
void ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::unsetCq_wcm_msm_action_excludednodetypes()
{
    m_Cq_wcm_msm_action_excludednodetypesIsSet = false;
}
ConfigNodePropertyArray ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::getCqWcmMsmActionExcludedparagraphitems() const
{
    return m_Cq_wcm_msm_action_excludedparagraphitems;
}
void ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray const& value)
{
    m_Cq_wcm_msm_action_excludedparagraphitems = value;
    m_Cq_wcm_msm_action_excludedparagraphitemsIsSet = true;
}
bool ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::cqWcmMsmActionExcludedparagraphitemsIsSet() const
{
    return m_Cq_wcm_msm_action_excludedparagraphitemsIsSet;
}
void ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::unsetCq_wcm_msm_action_excludedparagraphitems()
{
    m_Cq_wcm_msm_action_excludedparagraphitemsIsSet = false;
}
ConfigNodePropertyArray ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::getCqWcmMsmActionExcludedprops() const
{
    return m_Cq_wcm_msm_action_excludedprops;
}
void ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray const& value)
{
    m_Cq_wcm_msm_action_excludedprops = value;
    m_Cq_wcm_msm_action_excludedpropsIsSet = true;
}
bool ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::cqWcmMsmActionExcludedpropsIsSet() const
{
    return m_Cq_wcm_msm_action_excludedpropsIsSet;
}
void ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties::unsetCq_wcm_msm_action_excludedprops()
{
    m_Cq_wcm_msm_action_excludedpropsIsSet = false;
}

}
}
}
}
