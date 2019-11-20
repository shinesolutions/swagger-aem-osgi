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


#include "ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties()
{
    m_Cq_wcm_msm_action_excludednodetypesIsSet = false;
    m_Cq_wcm_msm_action_excludedparagraphitemsIsSet = false;
    m_Cq_wcm_msm_action_excludedpropsIsSet = false;
    m_Cq_wcm_msm_impl_action_referencesupdate_prop_updateNestedIsSet = false;
    
}

ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::~ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties()
{
}

void ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::toJson() const
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
    if(m_Cq_wcm_msm_impl_action_referencesupdate_prop_updateNestedIsSet)
    {
        val["cq.wcm.msm.impl.action.referencesupdate.prop_updateNested"] = ModelBase::toJson(m_Cq_wcm_msm_impl_action_referencesupdate_prop_updateNested);
    }
    

    return val;
}

void ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::fromJson(nlohmann::json& val)
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
    if(val.find("cq.wcm.msm.impl.action.referencesupdate.prop_updateNested") != val.end())
    {
        if(!val["cq.wcm.msm.impl.action.referencesupdate.prop_updateNested"].is_null())
        {
            ConfigNodePropertyBoolean newItem;
            newItem.fromJson(val["cq.wcm.msm.impl.action.referencesupdate.prop_updateNested"]);
            setCqWcmMsmImplActionReferencesupdatePropUpdateNested( newItem );
        }
        
    }
    
}


ConfigNodePropertyArray ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::getCqWcmMsmActionExcludednodetypes() const
{
    return m_Cq_wcm_msm_action_excludednodetypes;
}
void ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray const& value)
{
    m_Cq_wcm_msm_action_excludednodetypes = value;
    m_Cq_wcm_msm_action_excludednodetypesIsSet = true;
}
bool ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::cqWcmMsmActionExcludednodetypesIsSet() const
{
    return m_Cq_wcm_msm_action_excludednodetypesIsSet;
}
void ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::unsetCq_wcm_msm_action_excludednodetypes()
{
    m_Cq_wcm_msm_action_excludednodetypesIsSet = false;
}
ConfigNodePropertyArray ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::getCqWcmMsmActionExcludedparagraphitems() const
{
    return m_Cq_wcm_msm_action_excludedparagraphitems;
}
void ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray const& value)
{
    m_Cq_wcm_msm_action_excludedparagraphitems = value;
    m_Cq_wcm_msm_action_excludedparagraphitemsIsSet = true;
}
bool ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::cqWcmMsmActionExcludedparagraphitemsIsSet() const
{
    return m_Cq_wcm_msm_action_excludedparagraphitemsIsSet;
}
void ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::unsetCq_wcm_msm_action_excludedparagraphitems()
{
    m_Cq_wcm_msm_action_excludedparagraphitemsIsSet = false;
}
ConfigNodePropertyArray ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::getCqWcmMsmActionExcludedprops() const
{
    return m_Cq_wcm_msm_action_excludedprops;
}
void ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray const& value)
{
    m_Cq_wcm_msm_action_excludedprops = value;
    m_Cq_wcm_msm_action_excludedpropsIsSet = true;
}
bool ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::cqWcmMsmActionExcludedpropsIsSet() const
{
    return m_Cq_wcm_msm_action_excludedpropsIsSet;
}
void ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::unsetCq_wcm_msm_action_excludedprops()
{
    m_Cq_wcm_msm_action_excludedpropsIsSet = false;
}
ConfigNodePropertyBoolean ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::getCqWcmMsmImplActionReferencesupdatePropUpdateNested() const
{
    return m_Cq_wcm_msm_impl_action_referencesupdate_prop_updateNested;
}
void ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::setCqWcmMsmImplActionReferencesupdatePropUpdateNested(ConfigNodePropertyBoolean const& value)
{
    m_Cq_wcm_msm_impl_action_referencesupdate_prop_updateNested = value;
    m_Cq_wcm_msm_impl_action_referencesupdate_prop_updateNestedIsSet = true;
}
bool ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::cqWcmMsmImplActionReferencesupdatePropUpdateNestedIsSet() const
{
    return m_Cq_wcm_msm_impl_action_referencesupdate_prop_updateNestedIsSet;
}
void ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties::unsetCq_wcm_msm_impl_action_referencesupdate_prop_updateNested()
{
    m_Cq_wcm_msm_impl_action_referencesupdate_prop_updateNestedIsSet = false;
}

}
}
}
}
