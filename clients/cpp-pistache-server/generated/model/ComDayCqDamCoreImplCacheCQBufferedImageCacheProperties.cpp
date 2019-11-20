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


#include "ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties()
{
    m_Cq_dam_image_cache_max_memoryIsSet = false;
    m_Cq_dam_image_cache_max_ageIsSet = false;
    m_Cq_dam_image_cache_max_dimensionIsSet = false;
    
}

ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::~ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties()
{
}

void ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::validate()
{
    // TODO: implement validation
}

nlohmann::json ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_Cq_dam_image_cache_max_memoryIsSet)
    {
        val["cq.dam.image.cache.max.memory"] = ModelBase::toJson(m_Cq_dam_image_cache_max_memory);
    }
    if(m_Cq_dam_image_cache_max_ageIsSet)
    {
        val["cq.dam.image.cache.max.age"] = ModelBase::toJson(m_Cq_dam_image_cache_max_age);
    }
    if(m_Cq_dam_image_cache_max_dimensionIsSet)
    {
        val["cq.dam.image.cache.max.dimension"] = ModelBase::toJson(m_Cq_dam_image_cache_max_dimension);
    }
    

    return val;
}

void ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::fromJson(nlohmann::json& val)
{
    if(val.find("cq.dam.image.cache.max.memory") != val.end())
    {
        if(!val["cq.dam.image.cache.max.memory"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["cq.dam.image.cache.max.memory"]);
            setCqDamImageCacheMaxMemory( newItem );
        }
        
    }
    if(val.find("cq.dam.image.cache.max.age") != val.end())
    {
        if(!val["cq.dam.image.cache.max.age"].is_null())
        {
            ConfigNodePropertyInteger newItem;
            newItem.fromJson(val["cq.dam.image.cache.max.age"]);
            setCqDamImageCacheMaxAge( newItem );
        }
        
    }
    if(val.find("cq.dam.image.cache.max.dimension") != val.end())
    {
        if(!val["cq.dam.image.cache.max.dimension"].is_null())
        {
            ConfigNodePropertyString newItem;
            newItem.fromJson(val["cq.dam.image.cache.max.dimension"]);
            setCqDamImageCacheMaxDimension( newItem );
        }
        
    }
    
}


ConfigNodePropertyInteger ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::getCqDamImageCacheMaxMemory() const
{
    return m_Cq_dam_image_cache_max_memory;
}
void ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::setCqDamImageCacheMaxMemory(ConfigNodePropertyInteger const& value)
{
    m_Cq_dam_image_cache_max_memory = value;
    m_Cq_dam_image_cache_max_memoryIsSet = true;
}
bool ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::cqDamImageCacheMaxMemoryIsSet() const
{
    return m_Cq_dam_image_cache_max_memoryIsSet;
}
void ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::unsetCq_dam_image_cache_max_memory()
{
    m_Cq_dam_image_cache_max_memoryIsSet = false;
}
ConfigNodePropertyInteger ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::getCqDamImageCacheMaxAge() const
{
    return m_Cq_dam_image_cache_max_age;
}
void ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::setCqDamImageCacheMaxAge(ConfigNodePropertyInteger const& value)
{
    m_Cq_dam_image_cache_max_age = value;
    m_Cq_dam_image_cache_max_ageIsSet = true;
}
bool ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::cqDamImageCacheMaxAgeIsSet() const
{
    return m_Cq_dam_image_cache_max_ageIsSet;
}
void ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::unsetCq_dam_image_cache_max_age()
{
    m_Cq_dam_image_cache_max_ageIsSet = false;
}
ConfigNodePropertyString ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::getCqDamImageCacheMaxDimension() const
{
    return m_Cq_dam_image_cache_max_dimension;
}
void ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::setCqDamImageCacheMaxDimension(ConfigNodePropertyString const& value)
{
    m_Cq_dam_image_cache_max_dimension = value;
    m_Cq_dam_image_cache_max_dimensionIsSet = true;
}
bool ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::cqDamImageCacheMaxDimensionIsSet() const
{
    return m_Cq_dam_image_cache_max_dimensionIsSet;
}
void ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties::unsetCq_dam_image_cache_max_dimension()
{
    m_Cq_dam_image_cache_max_dimensionIsSet = false;
}

}
}
}
}
