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


#include "OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties()
{
    m_DatasourcesIsSet = false;
    m_StepIsSet = false;
    m_ArchivesIsSet = false;
    m_PathIsSet = false;
    
}

OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::~OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties()
{
}

void OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_DatasourcesIsSet)
    {
        val["datasources"] = ModelBase::toJson(m_Datasources);
    }
    if(m_StepIsSet)
    {
        val["step"] = ModelBase::toJson(m_Step);
    }
    if(m_ArchivesIsSet)
    {
        val["archives"] = ModelBase::toJson(m_Archives);
    }
    if(m_PathIsSet)
    {
        val["path"] = ModelBase::toJson(m_Path);
    }
    

    return val;
}

void OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::fromJson(nlohmann::json& val)
{
    if(val.find("datasources") != val.end())
    {
        if(!val["datasources"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["datasources"]);
            setDatasources( newItem );
        }
        
    }
    if(val.find("step") != val.end())
    {
        if(!val["step"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["step"]);
            setStep( newItem );
        }
        
    }
    if(val.find("archives") != val.end())
    {
        if(!val["archives"].is_null())
        {
            ConfigNodePropertyArray newItem;
            newItem.fromJson(val["archives"]);
            setArchives( newItem );
        }
        
    }
    if(val.find("path") != val.end())
    {
        if(!val["path"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["path"]);
            setPath( newItem );
        }
        
    }
    
}


ConfigNodePropertyArray OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getDatasources() const
{
    return m_Datasources;
}
void OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setDatasources(ConfigNodePropertyArray const& value)
{
    m_Datasources = value;
    m_DatasourcesIsSet = true;
}
bool OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::datasourcesIsSet() const
{
    return m_DatasourcesIsSet;
}
void OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::unsetDatasources()
{
    m_DatasourcesIsSet = false;
}
ConfigNodePropertyInteger OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getStep() const
{
    return m_Step;
}
void OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setStep(ConfigNodePropertyInteger const& value)
{
    m_Step = value;
    m_StepIsSet = true;
}
bool OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::stepIsSet() const
{
    return m_StepIsSet;
}
void OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::unsetStep()
{
    m_StepIsSet = false;
}
ConfigNodePropertyArray OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getArchives() const
{
    return m_Archives;
}
void OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setArchives(ConfigNodePropertyArray const& value)
{
    m_Archives = value;
    m_ArchivesIsSet = true;
}
bool OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::archivesIsSet() const
{
    return m_ArchivesIsSet;
}
void OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::unsetArchives()
{
    m_ArchivesIsSet = false;
}
ConfigNodePropertyString OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::getPath() const
{
    return m_Path;
}
void OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::setPath(ConfigNodePropertyString const& value)
{
    m_Path = value;
    m_PathIsSet = true;
}
bool OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::pathIsSet() const
{
    return m_PathIsSet;
}
void OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties::unsetPath()
{
    m_PathIsSet = false;
}

}
}
}
}
