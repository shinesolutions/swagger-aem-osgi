

#include "ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo.h"

using namespace Tiny;

ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties();
}

ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::~ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo()
{

}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::getPid()
{
	return pid;
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::getTitle()
{
	return title;
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::getDescription()
{
	return description;
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::getProperties()
{
	return properties;
}

void
ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo::setProperties(ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties properties)
{
	this->properties = properties;
}



